package com.upskill.java_2;

public class MethodType {
	
	/* Types of Method
	 1. Void Method
	 2. Static Method
	 3. Return Type Method */
	
	public static int hourlyIncome =65;
	
	public static void main(String[] args) {
		MethodType obj = new MethodType();	//className obj = new className();   >>>>>>creating class object
		obj.annualIncomeVoid();				//obj.methodName();					 >>>>>>calling void method
		weeklyIncomeStatic();				//methodName();						 >>>>>>calling static method
		System.out.println("My Monthly Income = " + obj.monthlyIncomeReturn());  //>>>>>>calling return type method
	
	}
	
	//void method
	public void annualIncomeVoid(){				//to create void method - public(modifier) void methodName(){--------}
		int annualIncome = hourlyIncome * 2000;  // 2000 total hours of year
		System.out.println("My Annual Income = "+ annualIncome);
	}
	
	//static method
		public static void weeklyIncomeStatic(){					//to create static method - public(modifier) void static methodName(){--------}
			int weeklyIncome = hourlyIncome * 40;  					// 40 total hours of the week
			System.out.println("My Weekly Income = "+ weeklyIncome);
		}
			
			//Return Type Method
			public int monthlyIncomeReturn(){						//to create return type method - public int(dataType) methodName(){--------}
				int monthlyIncome = hourlyIncome * 180;				//180 total hours of the month
				return monthlyIncome;
		// for return type method you can not print under the method (return type method). You have to print it under main method.
	}

}