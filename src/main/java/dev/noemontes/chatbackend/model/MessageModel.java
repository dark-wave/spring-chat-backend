package dev.noemontes.chatbackend.model;

public class MessageModel {
	private String messageContent;
	
	public MessageModel() {}

	public MessageModel(String messageContent) {
		this.messageContent = messageContent;
	}

	/** Getter y Setter */
	public String getMessageContent() {
		return messageContent;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
}
