/*
    DATE : 17/09/2024

Given an unsorted array arr[] of size N having both negative and positive integers. The task is place all negative element at the end of array without changing the order of positive element and negative element.

Example 1:
Input :                  
N = 8
arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
Output : 
1  3  2  11  6  -1  -7  -5

Example 2:
Input : 
N=8
arr[] = {-5, 7, -3, -4, 9, 10, -1, 11}
Output :
7  9  10  11  -5  -3  -4  -1
*/

import java.util.Scanner;

class ArrProblem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int i, j = 0, temp, arr[] = new int[n];

        System.out.println("Enter the elememts of array : ");
        for (i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        System.out.println("Array : ");
        for (i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "\t");

        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length - 1; j++) {
                if (arr[j] < 0)
                    if (arr[j + 1] >= 0) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
            }
        }
        System.out.println("Array after placing all negative element at the end : ");
        for (i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "\t");
    }
}