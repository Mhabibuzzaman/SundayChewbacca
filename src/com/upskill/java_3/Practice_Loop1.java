package com.upskill.java_3;

public class Practice_Loop1 {
	
	/* 
	 Type of Loops
	 1. For Loop
	 2. While Loop
	 3. Do While Loop
	 4. Infinite Loop
	  
	 */
	public static void main(String[] args) {
		 //practiceForLoop();
		 //practiceWhileLoop();
		 //practiceDoWhileLoop();
		 //practiceInfiniteLoop();
		 practiceNestedLoop();
	}
	
		

	public static void practiceForLoop(){					//For Loop- Do again and again upto upper limit
		int i;												//Declaring the variable
		for (i = 1; i <= 10; i++){							//Setting lower limit, upper limit, Increment or decrement
			System.out.println("For Loops Number = " + i);	//Statement
		}
	}
	public static void practiceWhileLoop(){					//While Loop - Do again and again upto condition match
		int i = 1;											//Initialization variables
		while(i<=10){										//Setting condition
			System.out.println("While Loops Number = " + i);//Statement
			i++;											//Increment or decrement
		}
	
	}
	public static void practiceDoWhileLoop(){				//Do While Loop - Do action then match condition 
		int i = 1;											//Initialize the variable
		do{													
			System.out.println("Do While Loop Number = " +i);//Statement
			i++;											//Increment or decrement
		} while (i<=10);									//Checking Condition
		
		}
	
	public static void practiceInfiniteLoop(){				//Infinite Loop - Never ending loop
		int i;												//Initialize the variable 
		for (i = 1; ; i++){									//Setting No Upper limit
			System.out.println("For Loops Number = " +i);	//Statement
		}
		
	}
		
	
	public static void practiceNestedLoop(){		  //Nested Loop - loop inside another loop
		int i;										  //Initialize variable i
		int j;										  //Initialize variable j
		for (i = 1; i <=10; i++){					  //First loop for i
		for (j = 1; j <=10; j++){					  //First loop for j
			int multipicationTable = i*j;			  
			System.out.print(multipicationTable+ " ");//Statement for j loop
						
		}
			System.out.println(" ");				   //Statement for i loop
			
		}
		}
			
	}
	
	

