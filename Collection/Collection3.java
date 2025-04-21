/*
    09/10/2024
    Collection iterator
*/
import java.util.ArrayList;
import java.util.Iterator;
class Collection3 {
   public static void main(String[] args) {
        ArrayList colour = new ArrayList<>();
        colour.add("Red");
        colour.add("Blue");
        colour.add("Black");
        colour.add("White");
        colour.add("Yellow");
        colour.add("Gray");

        Iterator itr = colour.iterator();

        while( itr.hasNext() ){
            System.out.println(itr.next());
        }
   }
}
