package observerDP;

public class SubscriberType1 implements Observer{

	String name;
	
	public SubscriberType1(String name) {
		this.name=name;
	}
	@Override
	public void update(Observable o) {
		
		System.out.println("Hello Mr. "+ name + ", You might be interested in our new edition : " + ((Magasine) o).getInfo());
		
	}
	

}
