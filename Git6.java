/*
	30/07/2024
	DISPLAY GRADES
*/

import java.util.Scanner;
class Git6
{
	public static void main(String[] args) 
	{
		int n;
		System.out.print("Enter your percentage :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n>100)
			System.out.println("Invalid statement");
		else if(n>90)
				System.out.println("A");
        else if(n>80)
					System.out.println("B");
        else if(n>=60)
		    System.out.println("C");
		else if(n<60)
			System.out.println("D");
		else
		    System.out.println("ERROR!!!!!");		
	}
}