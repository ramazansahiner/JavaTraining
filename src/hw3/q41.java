package hw3;

public class q41 {

	public static int getResult(int threshold) {
		return threshold > 5 ? 1 : 0;
	}

	public static void main(String[] args) {

		System.out.print(getResult(5) + getResult(1) + getResult(0) + getResult(2) + "");
	}

}
