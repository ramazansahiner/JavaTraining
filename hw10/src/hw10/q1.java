package hw10;

public class q1 {

	public static void main(String... books) {
		StringBuilder sb = new StringBuilder();
		for (String book : books)
		sb.insert(sb.indexOf("c"), book);
		System.out.println(sb);

	}

}
