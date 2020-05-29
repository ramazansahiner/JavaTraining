package hw7;

public class q14 implements Run, Jog{

	public void walk() {
		System.out.print("Sprinting!");
		}
		public static void main() {
		new q14().walk();
		}


}

interface Run {
default void walk() {
System.out.print("Walking and running!");
}
}
interface Jog {
default void walk() {
System.out.print("Walking and jogging!");
}
}
