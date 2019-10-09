package com.example.demo.model;

public class ChatMsg {

	private String sender;
	private String msg;
	private msgType type;
	
	public enum msgType{
		JOIN,CHAT,LEAVE
	}
	
	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public msgType getType() {
		return type;
	}

	public void setType(msgType type) {
		this.type = type;
	}


}
