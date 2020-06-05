package hw8;

public class q47 implements Source{

	public void flipSwitch() {
		try {
		throw new RuntimeException("Circuit Break!");
		} finally {
		System.out.print("Flipped!");
		}
		}
		public static void main(String... electricity) throws Throwable {
		final Source bulb = new q47();
		bulb.flipSwitch();
		}


}

interface Source {
void flipSwitch() throws Exception;
}

