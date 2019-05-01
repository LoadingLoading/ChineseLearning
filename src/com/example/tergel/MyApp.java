package com.example.tergel;



import android.app.Application;

public class MyApp extends Application{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
	
}
