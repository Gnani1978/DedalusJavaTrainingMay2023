package com.gstock.strategy;

public class Strategies {
	private String Sname;

	public String getSname() {
		return Sname;
	}

	public void setSname(String sname) {
		Sname = sname;
	}

	@Override
	public String toString() {
		return "Strategies [Sname=" + Sname + "]";
	}
}
