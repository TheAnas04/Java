/*
    03/08/2024
    Print Table
*/
import java.util.Scanner;
class Loop2 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter any number to print table : ");
        int i, num = sc.nextInt();
        for( i=1 ; i<=10 ; i++ ){
            System.out.println(num*i);
        }
    }
}
