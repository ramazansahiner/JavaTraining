package hw7;

public class q42 {

	Canine animal;
	public final void setAnimal(Dog animal) { this.animal = animal; }
	public static void main(String[] furryFriends) {
	new q42().setAnimal(null);
	}

public class Canine {}
public class Dog extends Canine {}
public class Wolf extends Canine {}
public final class Husky extends Dog {}

}

