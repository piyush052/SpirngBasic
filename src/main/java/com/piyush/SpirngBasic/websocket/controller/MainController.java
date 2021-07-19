package com.piyush.SpirngBasic.websocket.controller;

import com.piyush.SpirngBasic.websocket.data.Greetings;
import com.piyush.SpirngBasic.websocket.data.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {

    @MessageMapping("/hello")
    @SendTo("topic/greetings")
    public Greetings greeting(HelloMessage helloMessage){
        return new Greetings("Hello "+ helloMessage.getName());
    }
}
