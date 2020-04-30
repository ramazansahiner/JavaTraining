package hw3;

public class q2 {

	public static void main(String[] args) {
		
		int meal=5;
		int tip=2;
		int total = meal + ( meal>6 ? ++tip : --tip);
		System.out.println(total); //Soruda eksikti eklendi. 

	}

}
