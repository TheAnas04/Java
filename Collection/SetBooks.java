import java.util.Set;
import java.util.Collections;
import java.util.HashSet;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Predicate;
class Test{
	public static void main(String args[]){
		Set<Book> books = new HashSet<>();
		books.add(new Book(1, "Book One", "Author A", "Fiction", 2005));
		books.add(new Book(2, "Book Two", "Author B", "Science", 2010));
		books.add(new Book(3, "Book Three", "Author A", "Fiction", 2005));
		books.add(new Book(4, "Book Four", "Author C", "Fiction", 2005));
		books.add(new Book(4, "Book Four", "Author C", "Fiction", 2015));
		
		Set<Book> unique = new TreeSet<Book>(); // for natural sorting 
		//Set<Book> unique = new TreeSet<Book>(new Book()); // for customized sorting
		unique.addAll(books);
		//System.out.println(unique);
		//Collections.sort(books);
		//System.out.println(books);
		
		Predicate p = str -> str.equals("Fiction");
		
		TreeSet<Integer> byGenre = new TreeSet<Integer>();
		
		for( Book b : unique){
			System.out.println(b);
			//Book b = (Book)unique.get(i);
			if( p.test(b.getGenre()) ) byGenre.add(b.getId());
		}
		
		System.out.println(byGenre);
	}
}

class Book implements Comparable<Book>,Comparator<Book>{
	private int bookId;
	private String title;
	private String auther;
	private String genre;
	private int yearPublished;
	
	public Book(){}
	
	public Book(int bookId, String title, String auther, String genre, int yearPublished){
		this.bookId = bookId ;
		this.title = title;
		this.auther = auther;
		this.genre = genre ;
		this.yearPublished = yearPublished;
	}
	
	public int compareTo(Book b){
		if( this.getId()>b.getId() ) return +1;
		else if( this.getId()<b.getId() ) return -1;
		else return 0;
	}
	
	public int compare(Book b1, Book b2){
		if( b1.getYearPublish()>b2.getYearPublish() ) return +1;
		else if ( b1.getYearPublish()<b2.getYearPublish() ) return -1;
		else {
			if( b1.getId()>b2.getId() ) return +1;
			else if( b1.getId()<b2.getId() ) return -1;
			return 0;
		}
	}
	
	public String toString(){
		return this.getId()+"\t"+this.getTitle()+"\t"+this.getAuther()+"\t"+this.getGenre()+"\t"+this.getYearPublish()+"\n";
	}
	
	public int getId(){
		return this.bookId;
	}
	public String getTitle(){
		return this.title;
	}
	public String getAuther(){
		return this.auther;
	}
	public String getGenre(){
		return this.genre;
	}
	public int getYearPublish(){
		return this.yearPublished;
	}
}