package dev.noemontes.chatbackend.model;

public class ResponseModel {
	private String content;

	public ResponseModel() {}

	public ResponseModel(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
