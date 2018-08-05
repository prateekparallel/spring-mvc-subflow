package com.webflow2book;

public class UserServiceImpl implements UserService {

   
    @Override
    public User getUserByUsername(String username) {
    	User user  = new User();
    	user.setId(2);
    	user.setLastLogin(new java.util.Date());
    	user.setPassword("ddd");
    	user.setUsername("sss");
    	return user;
    }

}
