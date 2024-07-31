/*
    31/07/2024
    Q. Check whether the entered number is even or odd using SWITCH CASE 
*/
import java.util.Scanner;
class Switch1 {
    public static void main(String args[])
	{
		int choice,num;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any numer to check even/odd : ");
		num = sc.nextInt();
		choice = num%2 ;
		switch(choice)
		{
			case 0 : System.out.println("Even");break;
            case -1 : 
			case 1 : System.out.println("Odd"); break;
			default : System.out.println("INVALID CHOICE ");
		}
	}
}
