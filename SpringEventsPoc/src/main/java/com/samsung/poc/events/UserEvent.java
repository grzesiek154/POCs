package com.samsung.poc.events;

import com.samsung.poc.domain.User;
import org.springframework.context.ApplicationEvent;



public class UserEvent extends ApplicationEvent {

    private User user;
    //private final boolean isAdmin;

    public UserEvent(Object source, User user) {
        super(source);
        this.user = user;

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

//    public boolean isAdmin() {
//        return isAdmin;
//    }

}
