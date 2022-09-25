/* Problem 5: Write a java program which will display name and guestimated age of every
students in your class.
(Write separate method for every student).  */

package Assignment_1;

public class Problem_5 {

	public static void main(String[] args) {
		Problem_5 myObject = new Problem_5();
		myObject.myMethod51();
		
		myMethod52();
		
		int a = myMethod53();
		System.out.println("Age of z is"+a);
	}
	public void myMethod51(){
		int a = 24;
		System.out.println("Age of X is"+a);
	}
	public static void myMethod52(){
		int a = 25;
		System.out.println("Age of Y is"+a);
	}
	public static int myMethod53(){
		int a = 26;
		return a;
		
	}

}

