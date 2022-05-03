package dev.noemontes.chatbackend.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

import dev.noemontes.chatbackend.model.MessageModel;
import dev.noemontes.chatbackend.model.ResponseModel;

@RestController
public class MessageController {
	
	@MessageMapping("/message")
	@SendTo("/topic/messages")
	  public ResponseModel greeting(MessageModel message) throws Exception {
		ResponseModel response = new ResponseModel();	
		
		System.out.println("Mensaje recibido: " + message.getMessageContent());
		
		//Simulamos un retardo en el servidor
	    Thread.sleep(1000);
	    response.setContent("Hola " + message.getMessageContent());
	    System.out.println("Respuesta: " + response.toString());
	    
	    return response;
	  }
}
