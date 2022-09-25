package com.upskill.java_6;

public class Singleton {

	// Singleton is class that can have only one object.
	
	// Private constructor, it prevents any other class from initiating
	private Singleton(){
		
	}
	
	// Private static object of the class
	public static Singleton SingletonObj = new Singleton();				
				
	// Static instance method
	public static Singleton getInstance(){
		return	SingletonObj;
	
}
	protected static void upskill(){
		System.out.println("UpSkill method from Singletone Class");
	}
	
}
