package hw9;

import java.util.ArrayList;
import java.util.List;

public class q48 {

	public static void main(String[] args) {
		
		List<String> magazines = new ArrayList();
		magazines.add("Readers Digest");
		magazines.add("People");
		magazines.clear();
		magazines.add("The Economist");
		magazines.remove(1);
		System.out.println(magazines.size());


	}

}
