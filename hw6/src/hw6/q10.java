package hw6;

public class q10 {

	private int rope = 1;
	protected boolean outside;
	public q10() {
	// p1
	outside = true;
	}
	public q10(int rope) {
	this.rope = outside ? rope : rope+1;
	}

	
	public static void main(String[] args) {
		
		System.out.print(new q10().rope);

	}

}
