/*
    02/09/2024
    Move the zeros to the left of the array
*/
class ShiftZero {
    public static void main(String[] args) {
        int i,j;
        int arr[]={2,3,4,0,5,0,6};
        for( i=0 ; i<arr.length ; i++ ){
            if(arr[i]==0){
                for( j=i-1 ; j>=0 ; j-- ){
                    arr[j+1] = arr[j];
                }
                arr[0] = 0 ;
            }
        }
        for( i=0 ; i<arr.length ; i++ ) System.out.print(arr[i]+"  ");
    }
}