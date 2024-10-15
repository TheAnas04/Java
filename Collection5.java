import java.util.HashSet;
import java.util.Iterator;
class Collection5 {
    public static void main(String[] args) {
        HashSet day = new HashSet<>();

        day.add("Monday");
        day.add("Tuesday");
        day.add("Wednesday");
        day.add("Thrusday");
        day.add("Friday");
        day.add("Saturday");
        day.add("Sunday");

        Iterator itr = day.iterator();

        while( itr.hasNext() ){
            System.out.println(itr.next());
        }
    }
}
