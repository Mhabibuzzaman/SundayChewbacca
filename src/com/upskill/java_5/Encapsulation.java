package com.upskill.java_5;

public class Encapsulation {
	
	//Encapsulation is a process to hide the data using setter and getter method.
	
	private String name = "abc";				//write & read
	private int ssn = 123457890;					//write only
	private String username = "Upskill";				//read only
	
	// Setter Method -name
	public void setName(String value){				//set the data, write
		name = value;
	}
	
	//Getter Method - name
	public String getName(){						//get the data, read
		return name;
		}
	
	// Setter Method -ssn
		public void setSSN(int value){				//Setter Method is for set the data, it is write only, setter method will be always void method.
			ssn = value;
		}
		
		//Getter Method - username
		public String getUsername(){				//Getter Method is for get the data, it is read only, getter method will be always return type method.
			return username;
			}
		
	
	
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();	//className obj = new className(); for create obj
		obj.setName("Habib");						//obj.methodName();
		System.out.println(obj.getName());
		obj.setSSN(45213523);
		System.out.println(obj.getUsername());
		
			
		}

}
