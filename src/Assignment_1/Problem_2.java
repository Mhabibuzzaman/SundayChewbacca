/*Problem 02: A rectangle width and length are : 9 and 13 inches.
Write a method to display the perimeter of rectangle in console
output. */


package Assignment_1;

public class Problem_2 {

	public static void main(String[] args) {

		rectanglePerimeter();
	}
	public static void rectanglePerimeter(){
		int a = 9;
		int b = 13;
		int c = 2*(a+b);
		System.out.println("The perimeter of the rectangle with arm 9 and 13 is" +c);
	}

}
