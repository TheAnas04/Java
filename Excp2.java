class Excp2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        try{
            System.out.println("8th value : "+arr[7]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("This index of array is not available !!!!");
        }
        finally{
            System.out.println("Finally is executed in almost every condition");
        }
        System.out.println("Flow is maintained");
    }
}
