package hw9;

import java.util.function.Predicate;

public class q34 {

	public static void main(String[] args) {
		
		Predicate clear = c -> c.equals("clear");
		System.out.println(clear.test("pink"));


	}

}
