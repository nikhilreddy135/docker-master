package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

public class HelloWorldBean {

	private String message;

	public HelloWorldBean(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return String.format("HelloWorldBean [message=%s]", message);
	}

	private void myMethod(){
		System.out.println("this is my method");
	}

	private void thisIsMasterMethod(){
		System.out.println("this is master branch");
	}

	private void thisIsDevelopment(){
		System.out.println("this is developement feature changes");
	}

}
