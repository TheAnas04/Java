
/*
    05/08/2024
    Print the multiple of a number till n;
*/
import java.util.Scanner;

class While2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to get the multiple : ");
        int n = sc.nextInt();
        System.out.print("Enter the limit of multiple : ");
        int limit = sc.nextInt();
        int mul = n, i = 2;
        while (mul <= limit) {
            System.out.print(mul + "  ");
            mul = n * i;
            i++;
        }
        sc.close();
    }
}
