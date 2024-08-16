/*
    16/08/2024
    Print your name and hobby using String class
*/
import java.util.Scanner;
class Str1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = new String(); // String object
        String hobby = "Drawing"; // String literal

        System.out.print("Enter your name : ");
        name = sc.nextLine();

        System.out.println(name);
        System.out.println(hobby);
    }
}
