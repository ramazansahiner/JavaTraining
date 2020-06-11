package hw9;

public class q11 {

	public static void main(String[] args) {
		StringBuilder line = new StringBuilder("-");
		 StringBuilder anotherLine = line.append("-");
		System.out.print(line == anotherLine);
		System.out.print(" ");
		System.out.print(line.length());

	}

}
