package com.niit.mks.controller;

import java.util.Date;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.niit.mks.model.Message;
import com.niit.mks.model.OutputMessage;

@Controller
public class EventController {

	public EventController() {
		System.out.println("Instantiating EventController");
	}

	@MessageMapping("/chat")
	@SendTo("/topic/message")
	public OutputMessage sendMessage(Message message) {
		System.out.println(message.getMessage());
		return new OutputMessage(message, new Date());
	}

	// allows us to broadcast a message to /topic/message when a message enters
	// the message broker /app/chat

}
