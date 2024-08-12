/*
    12/08/2024
    Syntax of defining an Array
*/
import java.util.Scanner;
class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array 1
        int arr1[] = new int[5];
        for( int i=0 ; i<arr1.length ; i++ ){
            System.out.print("Enter element no. "+(i+1)+": ");
            arr1[i] = sc.nextInt();
        }
        // Traversing array 1
        System.out.print("Array 1 : ");
        for( int i=0 ; i<arr1.length ; i++ ){
            System.out.print(arr1[i]+"   ");
        }


        // Array 2
        int arr2[] = {2,4,7,8,6};
        // Traversing array 2
        System.out.print("\nArray 2 : ");
        for( int i=0 ; i<arr1.length ; i++ ){
            System.out.print(arr2[i]+"   ");
        }
        sc.close();
    }
}
