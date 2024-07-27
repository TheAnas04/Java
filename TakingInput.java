/*
    27/07/2024
        Q.   Write a program to multiply two number.
        -> Taking input from user.
        -> Use of Scanner class.
*/
import java.util.Scanner;
class TakingInput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a, b, c ;
        System.out.println("Enter 1st number : ");
        a = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        b = sc.nextInt();
        
        c = a*b;

        System.out.println("Ans : "+c);
        sc.close();
    }
}
