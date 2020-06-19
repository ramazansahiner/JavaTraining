package hw10;

public class q11 {

	public static void main(String[] args) {
		
	String race = "";
	outer:
	do {
	inner:
	do {
	race += "x";
	} while (race.length() <= 3);
	} while (race.length() < 3);
	System.out.println(race);

	}

}
