package hw3;

public class q9 {

	
	public void calculateResult(Integer candidateA, Integer candidateB) {
		boolean process = candidateA == null || candidateA.intValue()<10;
		//boolean value= candidateA && candidateB; Hatalý kod satýrý.
		//System.out.println(process || value);
	}
	
	public static void main(String[] args) {
		
		new q9().calculateResult(null, 203);

	}

}
