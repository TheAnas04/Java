/*
	DATE  29/07/2024
	CASE CHECK
*/

import java.util.Scanner;
class Case_Check
{
	public static void main(String args[])
	{
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any alphabet: ");
		ch = sc.next().charAt(0);
		if(ch >='a' && ch <='z')
			System.out.println("lower case");
		else
		{
			if(ch >='A' && ch <='Z')
				System.out.println("UPPER CASE");
			else
				System.out.println("Invalid choice");
		}
        sc.close();
	}
}