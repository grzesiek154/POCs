package com.samsung.poc.events;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class UserEventListenerAnnotation {


//    @Async
//    @EventListener(condition = "@userEvent.admin")
    @EventListener
    public void handleEvent(UserEvent event) {

//        if(event.getUser() == null) {
//            System.out.println("null object");
//        }
        System.out.println(event.getUser().getStatus() + " annotation event listener");
    }

}
