import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Collections;
class Test{
	public static void main(String args[]){
		ArrayList <Integer> l1 = new ArrayList <Integer>();
		ArrayList <Integer> l2 = new ArrayList <Integer>();
		ArrayList <Integer> ans = new ArrayList <Integer>();
		
		l1.add(24); l2.add(23);
		l1.add(2); l2.add(5);
		l1.add(43); l2.add(35);
		l1.add(64); l2.add(23);
		l1.add(23); l2.add(33);
		
		Collections.sort(l1);
		Collections.sort(l2);
		
		int p1=0, p2=0 ;
		
		for(int i=0 ; i<l1.size()+l2.size() ; i++ ){
			if((p1<l1.size()&& p2<l2.size())){
				if( l1.get(p1)<l2.get(p2) ){
					ans.add(l1.get(p1));
					p1++;
				}
				else {
					ans.add(l2.get(p2));
					p2++;
				}
			}
			else if(l1.size()>p1){
				ans.add(l1.get(p1));
				p1++;
			}
			else {
				ans.add(l2.get(p2));
				p2++;
			}
		}
		
		System.out.println(ans);
		System.out.println(l1);
		System.out.println(l2);
	}
}