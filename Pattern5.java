/*
    DATE : 13/09/2024
    * * * * * 
     * * * * 
      * * * 
       * * 
        *

*/

import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {    
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the nunber of row : ");
        int i,k,j,row = sc.nextInt();
        
        for( i=0 ; i<row ; i++ )
        {
            for( j=0 ; j<i ; j++ )
                System.out.print(" ");
            for( k=0 ; k<row-i ; k++ )
                System.out.print("* ");
            System.out.println();
        }
    }
}