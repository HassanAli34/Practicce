package observer_Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Subject subject = new Subject();

	      new HexaObserver(subject);
	      new OctalObserver(subject);
	      new BinaryObserver(subject);

	      System.out.println("First state change: 15");	
	      subject.setState(15);
	      System.out.println("Second statechange: 10");	
	      subject.setState(10);
	}

}
