package hw7;

public class q21 extends Book{

	public static String material = "cellulose";
	public q21() {super();}
	public String getMaterial() {return super.material;}
	public static void main(String[] pages) {
	System.out.print(new q21().getMaterial());
	}

}

abstract class Book {
protected static String material = "papyrus";
public Book() {}
public Book(String material) {this.material = material;}
}
