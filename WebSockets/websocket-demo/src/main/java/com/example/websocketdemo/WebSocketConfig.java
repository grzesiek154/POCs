package com.example.websocketdemo;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;


@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {


    //In the first method, we register a websocket endpoint that the clients will use to connect to our websocket server.
    //STOMP stands for Simple Text Oriented Messaging Protocol. It is a messaging protocol that defines the format and rules for data exchange.
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws").withSockJS();
        // SockJS is used to enable fallback options for browsers that don’t support websocket.
    }

    //In the second method, we’re configuring a message broker that will be used to route messages from one client to another.
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.setApplicationDestinationPrefixes("/app");//The first line defines that the messages whose destination starts with “/app” should be routed to message-handling methods
        registry.enableSimpleBroker("/topic"); //the second line defines that the messages whose destination starts with “/topic” should be routed to the message broker
    }

}
