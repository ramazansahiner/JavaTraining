package hw10;
/*
public class q26 implements Plant, Living{

	public String grow(int height) { return "Super Growing!"; }
	public static void main(String[] leaves) {
	Plant p = new q26(); // m2
	System.out.print(((Living)p).grow()); // m3
	}


}
*/
interface Plant {
default String grow() { return "Grow!"; }
}
interface Living {
public default String grow() { return "Growing!"; }
}