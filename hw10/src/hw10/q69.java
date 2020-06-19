package hw10;

interface MakesNoise {}
abstract class Instrument implements MakesNoise {
public Instrument(int beats) {}
public void play() {}
}
/*

public class q69 extends Instrument{

	public void play(int count) {}
	public void concert() {
	super.play(5);
	}
	public static void main(String[] beats) {
	MakesNoise mn = new Drum();
	mn.concert();
	}


}
*/