package hw8;

public class q32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class BigCat {
void roar(int level) throws RuntimeException { // m1
if(level<3) throw new IllegalArgumentException("Incomplete");
System.out.print("Roar!");
}
}