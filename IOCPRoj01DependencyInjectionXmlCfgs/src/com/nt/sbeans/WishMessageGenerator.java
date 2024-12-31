package com.nt.sbeans;

import java.time.LocalTime;

public class WishMessageGenerator {
	private LocalTime lt; //HAS-A property

	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:: 0-param constructor");
	}

	//setter method for setter injection(alt+shift+s,r)
	public void setLt(LocalTime lt) {
		System.out.println("WishMessageGenerator.setLt()");
		this.lt = lt;
	}
	//b.method
	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage()");
		//get current hour of a day
		int hour = lt.getHour(); //In 24 hours format 
		if(hour<12)
			return "Good Morning: "+user;
		else if(hour<16)
			return "Good Afternoon: "+user;
		else if(hour<20)
			return "Good Evening: "+user;
		else 
			return "Good Neight: "+user;
	}
}

