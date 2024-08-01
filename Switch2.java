/*
	DATE 01/08/2024	
	Check given character is vowel or not using switch case 
*/
import java.util.Scanner;
class Switch2 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the letter to check :");
		char ch = sc.next().charAt(0);

		switch(ch)
		{
			case 'a' : 
			case 'A' :    
			case 'E' :
			case 'e' : 
			case 'I' :
			case 'i' :     
			case 'O' :
			case 'o' :       
			case 'U' :
			case 'u' : System.out.println("VOWEL");break;
			default: System.out.println("NOT Vowel");
		}
	}
} 