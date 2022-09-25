package com.upskill.java_1;

public class Variable {
	
	// Variable in Java
	
	public String country ="USA"; //Instance or Global variable declared in the class level, outside of method
	
	public static String region= "America";  /* Static variable - The variable which has static key-word,
												variable belong to class and don't required creating object */

	public static void main(String[] args) {
		
		String city = "NYC";  /*Local variable - inside method if you have variable is called local variable,
								this variable declared in method */
	}
	public void myMethod (String county){
		
		String myCounty=  county;  /*Method Parameter - if you have variable inside parentheses in the 
									parameter is called method parameter */
		
		
		

	}

}
