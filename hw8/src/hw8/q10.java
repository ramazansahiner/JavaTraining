package hw8;

public class q10 {

	public void openDrawbridge() throws Exception { // p1
		try {
		throw new Exception("Circle");
		} catch (Exception e) {
		System.out.print("Opening!");
		} finally {
		System.out.print("Walls"); // p2
		}
		}

	
	public static void main(String[] moat) throws Exception {
		new q10().openDrawbridge(); // p3
		}

}
