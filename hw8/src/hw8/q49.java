package hw8;

import java.io.FileNotFoundException;
import java.io.IOException;

public class q49 {

	public void performBackup() {
		try {
		throw new IOException("Disk not found");
		} catch (Exception e) {
		try {
		throw new FileNotFoundException("File not found");
		} catch (FileNotFoundException ex) { // z1
		System.out.print("Failed");
		}
		}
		}
		public static void main(String... files) {
		new q49().performBackup(); // z2
		}


}
