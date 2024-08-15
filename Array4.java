/*
    15/08/2024
    Search an element in an Unsorted Array 
*/
class Array4 {
    public static void main(String[] args) {
        int n=40;
        int arr[] = { 8,65,1,32,40};
        boolean flag = false ;
        for ( int element : arr ){
            if( element==n ){
                flag = true ;
            }
        }
        if( flag ){
            System.out.println("Element found");
        }
        else { 
            System.out.println("Element NOT found");
        }
    }
}