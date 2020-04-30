package hw3;

public class q42 {

	public String runTest(boolean spinner, boolean roller) {
		if(spinner = roller) return "up";
		else return roller ? "down" : "middle";
		}

	
	public static final void main(String pieces[]) {
		final q42 tester = new q42();
		System.out.println(tester.runTest(false,true));
		}


}
