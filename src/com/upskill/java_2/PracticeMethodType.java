package com.upskill.java_2;

public class PracticeMethodType {

	/* Types of Methods
	 1. Void Method
	 2. Static Method
	 3. Return Type Method   */

	public static int hourlyIncome = 40;
	
	public static void main(String[] args) {
		PracticeMethodType obj = new PracticeMethodType();
		obj.annualIncomeVoid();
		weeklyIncomeStatic();
		System.out.println("My Monthly Income = "+ obj.monthlyIncomeReturn());
		}
	
	//void method
	public void annualIncomeVoid(){
		int annualIncome = hourlyIncome * 2080;
		System.out.println("My Annual Income = " + annualIncome );
	}
	
	//Static method
	public static void weeklyIncomeStatic(){
		int weeklyIncome = hourlyIncome * 40;
		System.out.println("My Weekly Income = " + weeklyIncome);
	}
	
	//Return Type Method
	public int monthlyIncomeReturn(){
		int monthlyIncome = hourlyIncome * 180;
		return monthlyIncome;
	}
}
