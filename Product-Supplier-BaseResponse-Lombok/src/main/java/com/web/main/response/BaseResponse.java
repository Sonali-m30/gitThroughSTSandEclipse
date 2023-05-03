package com.web.main.response;

import java.util.Date;

public class BaseResponse<T> {

	private int ResponseStatus;
	private Date date=new Date();
	private String responseMessage;
	private T body;
	
	public BaseResponse(int responseStatus, String responseMessage, T body) {
		super();
		ResponseStatus = responseStatus;
		this.responseMessage = responseMessage;
		this.body = body;
	}
	public int getResponseStatus() {
		return ResponseStatus;
	}
	public void setResponseStatus(int responseStatus) {
		ResponseStatus = responseStatus;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	public T getBody() {
		return body;
	}
	public void setBody(T body) {
		this.body = body;
	}
	public BaseResponse() {
		
	}
}
