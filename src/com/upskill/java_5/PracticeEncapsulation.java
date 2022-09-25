package com.upskill.java_5;

public class PracticeEncapsulation {
	
	//Encapsulation is a process to hide the data using setter and getter method
	
	private String name = "upskill";			//write & read
	private int ssn = 123456789;				//write only
	private String username = "habibuzzaman";	//read only
	
	//Setter Method -name					
	public void setName(String value){		
		name = value;
	//Setter method is for set the data, always will be void method and do have a parameter. It is write only.  
		
	}
	
	//Getter Method - name
	public String getName(){
		return name;
	//Getter Method name is for get the data, always will be return type method. It is read only.
		
	}
	
	//Setter Method -name					
		public void setSSN(int value){		
			ssn = value;
		//Setter method is for set the data, always will be void method and do have a parameter. It is write only.  
			
		}
		
		//Getter Method - name
		public String getUsername(){
			return username;
		//Getter Method name is for get the data, always will be return type method. It is read only.
			
		}

	
	public static void main(String[] args) {
		PracticeEncapsulation obj = new PracticeEncapsulation();
		obj.setName("Habib");
		System.out.println(obj.getName());
		obj.setSSN(123456789);
		System.out.println(obj.getUsername());
	}

}
