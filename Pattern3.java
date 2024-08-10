/*
    10/08/2024
    
    *****
    ****
    ***
    **
    *
*/
class Pattern3 {
    public static void main(String[] args) {
        int i,j;

        for( i=1 ; i<=5 ; i++ ){
            for( j=0 ; j<=5-i ; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
