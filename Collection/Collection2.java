/*
    08/10/2024
    Collection
*/
import java.util.ArrayList;
class Collection2 {
    public static void main(String[] args) {
        ArrayList count = new ArrayList<>();
        count.add("Two");
        count.add("Three");
        count.add("Four");

        System.out.println(count);

        count.addFirst("One");
        count.addLast("Infinity");

        System.out.println(count);
    }
}
