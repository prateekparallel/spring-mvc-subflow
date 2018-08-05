package com.webflow2book;

public interface UserService {

    /**
     * Returns the user with the given username.
     * @param username The username of the user to return
     * @return The user with the given username
     */
    User getUserByUsername(String username);

}
