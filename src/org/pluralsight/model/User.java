package org.pluralsight.model;

public class User {
	
	private String name;
	private int aga;
	

	public int getAga() {
		return aga;
	}

	public void setAga(int aga) {
		this.aga = aga;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}
	
	
	
}
