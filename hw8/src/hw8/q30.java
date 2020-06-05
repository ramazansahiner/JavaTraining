package hw8;

public class q30 extends Duck{

	private int age;
	public q30(int age) { this.age = age; }
	public int getDuckies() { return this.age/count; }
	public static void main(String[] pondInfo) {
	Duck itQuacks = new q30(5);
	System.out.print(itQuacks.getDuckies());
	}


}

abstract class Duck {
protected int count;
public abstract int getDuckies();
}