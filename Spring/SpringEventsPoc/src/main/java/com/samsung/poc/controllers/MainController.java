package com.samsung.poc.controllers;


import com.samsung.poc.domain.User;
import com.samsung.poc.events.UserEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public MainController(ApplicationEventPublisher applicationEventPublisher) {

        this.applicationEventPublisher = applicationEventPublisher;
    }

    @RequestMapping(value = "/user/{name}/admin/{role}")
    public void  userLogin(@PathVariable("name") String name, @PathVariable("role") boolean isAdmin) {


            User user = new User();
            user.setUsername(name);
            user.setAdmin(isAdmin);
            user.setStatus("ACTIVE");

            UserEvent userEvent = new UserEvent(this, user);

            applicationEventPublisher.publishEvent(userEvent);


    }
}
