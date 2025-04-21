/*
    13/08/2024
    Reverse an array 
    ex. I/p = [8,4,6,5,1,6]
        O/p = [6,1,5,6,4,8]
*/
class Array2 {
    public static void main(String[] args) {
        int i, arr[]={ 8,4,6,5,1,6};

        System.out.print("Array before reversing : ");
        for( i=0 ; i<arr.length ; i++ ){
            System.out.print(arr[i]+"   ");
        }
        
        for( i=0 ; i<arr.length/2 ; i++ ){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1] ;
            arr[arr.length-i-1] = temp;
        }
        
        System.out.print("\nArray after reversing  : ");
        for( i=0 ; i<arr.length ; i++ ){
            System.out.print(arr[i]+"   ");
        }
    }
}
