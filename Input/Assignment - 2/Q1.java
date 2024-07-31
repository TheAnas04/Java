/*
	28/07/2024
		Q. Write a program to check entered properties defines a Square of Rectange.
*/
import java.util.Scanner;
class Q1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int length, breadth;
		System.out.print("Enter Length : ");
		length = sc.nextInt();

		System.out.print("Enter breadth :");
		breadth = sc.nextInt();

		if (length==breadth)
			System.out.println("It is a Square");
		else 
			System.out.println("It is a Rectangle");

		sc.close();
	}
}