package hw6;

public class q39 {

	private int size;
	public q39(int size) {this.size=size;}
	public static void sendHome(q39 p, int newSize) {
	p = new q39(newSize);
	p.size = 4;
	}
	
	public static void main(String[] args) {
		
		final q39 phone = new q39(3);
		sendHome(phone,7);
		System.out.print(phone.size);

	}

}
