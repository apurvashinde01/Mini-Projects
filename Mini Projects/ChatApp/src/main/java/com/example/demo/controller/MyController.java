package com.example.demo.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

import com.example.demo.model.ChatMsg;

@Controller
public class MyController {
	
	@MessageMapping("/chat.register")
    @SendTo("/topic/public")
	public ChatMsg register(@Payload ChatMsg msgobj, SimpMessageHeaderAccessor headerAccessor) {
		headerAccessor.getSessionAttributes().put("username", msgobj.getSender());
		return msgobj;
	}
	
	@MessageMapping("/chat.send")
    @SendTo("/topic/public")
    public ChatMsg sendMessage(@Payload ChatMsg msgobj) {
        return msgobj;
    }
}
