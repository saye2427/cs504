public class SpeakerTest {
	
	public static void main(String[] args) {
		
		//Demonstrate the different implementations of Speaker interface, using the same string in announce()
		Baby b = new Baby();
		b.speak();
		b.announce("I've had enough."); //will always print "goo-goo ga-ga" no matter what string is passed in
		System.out.println("");
		
		Adult a = new Adult();
		a.speak();
		a.announce("I've had enough."); //will return same string that is passed in as argument
		System.out.println("");
		
		AngryAdult m = new AngryAdult();
		m.speak();
		m.announce("I've had enough."); //will return string passed in, but in ALL CAPS
		
	}
	
}