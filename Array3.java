/*
    14/08/2024
    Sort an array
*/
class Array3 {
    public static void main(String[] args) {
        int i,j,arr[]={1,6,4,5,8,4,1};
        System.out.print("Array before sorting : ");
        for( i=0 ; i<arr.length ; i++ ){
            System.out.print(arr[i]+"  ");
        }
        for( i=0 ; i<arr.length ; i++ ){
            for( j=i+1 ; j<arr.length ; j++ ){
                if( arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("\nArray after sorting : ");
        for( i=0 ; i<arr.length ; i++ ){
            System.out.print(arr[i]+"  ");
        }
    }
}
