package com.samsung.poc.events;

import org.springframework.context.ApplicationListener;



public class UserEventListener implements ApplicationListener<UserEvent> {


    @Override
    public void onApplicationEvent(UserEvent event) {
        System.out.println(event.getUser().getUsername());
    }
}
