package com.upskill.java_3;

/*Costructor is, instance of class, method same as class name, java will execute constructor first
 - Constructor cannot be static or override nor void or return type.
 - Default Constructor : No constructor is initialized
 - Parameterized Constructor : Add different signature 
 - Constructor overloading : Different signature
 */




public class Practice_Constructor {
	
	String studentName;
	int studentAge;
	
	public Practice_Constructor(String name, int age){
		
		studentName = name;
		studentAge = age;
			
		
		
	}
	
	

	public static void main(String[] args) {
		Practice_Constructor obj = new Practice_Constructor("Alex", 25);
		System.out.println(obj.studentName);
		System.out.println(obj.studentAge);
		

	}

}
