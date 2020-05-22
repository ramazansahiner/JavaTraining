package hw6;

public class q4 {

	public void nested() { nested(2,true); } // g1
	public int nested(int level, boolean height) { return nested(level); }
	public int nested(int level) { return level+1; }; // g2
	
	public static void main(String[] args) {
		//System.out.println(new q4().nested());


	}

}
