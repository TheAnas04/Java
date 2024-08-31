/*
    31/08/2024
    Exception handeling & use of try catach block.
*/
public class Excp1 {
    public static void main(String args[]){
        int a=4,b=0,c=0;
        try{
            c = a/b ;
        }
        catch (Exception e){
            System.out.println("Exception occured !!!");
        }
        System.out.print("Thank You");
    }
}