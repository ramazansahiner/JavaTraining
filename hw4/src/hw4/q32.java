package hw4;

import java.util.Arrays;

public class q32 {

	public static void main(String[] args) {
		
		String one = args[0];
		Arrays.sort(args);
		int result = Arrays.binarySearch(args, one);
		System.out.println(result);


	}

}
