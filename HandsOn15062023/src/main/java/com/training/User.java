package com.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class User {
	@Value("Gnani")
	private String username;
	@Autowired
	private Car car;
	private Car2 car2;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", car=" + car + ", car2=" + car2 + "]";
	}
	public Car2 getCar2() {
		return car2;
	}
	public void setCar2(Car2 car2) {
		this.car2 = car2;
	}
	
	

}
