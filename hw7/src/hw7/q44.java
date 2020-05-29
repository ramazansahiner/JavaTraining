package hw7;

abstract public class q44 extends House{

	protected abstract Object getSpace();
	public static void main(String[] squareFootage) {
	System.out.print("Let's start the party!");
	}


}
abstract class House {
protected abstract Object getSpace();
}
abstract class Room extends House {
abstract Object getSpace(Object list);
}
