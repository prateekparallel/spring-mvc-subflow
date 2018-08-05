package com.webflow2book;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class User implements Serializable {

    private static Log logger = LogFactory.getLog(User.class);
    /**
     * Serial Version UID
     */
    private static final long serialVersionUID = -717231727047674159L;
    private int id;
    private String username;
    private String password;
    private Date lastLogin;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        logger.debug("getUsername() called");
        return username;
    }

    public void setUsername(String username) {
        logger.debug("setUsername() called");
        this.username = username;
    }

    public String getPassword() {
        logger.debug("getPassword() called");
        return password;
    }

    public void setPassword(String password) {
        logger.debug("setPassword() called");
        this.password = password;
    }

    public Date getLastLogin() {
        logger.debug("getLastLogin() called");
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        logger.debug("setLastLogin() called");
        this.lastLogin = lastLogin;
    }
}
