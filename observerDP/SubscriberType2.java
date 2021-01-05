package observerDP;

public class SubscriberType2 implements Observer{

	String name;
	
	public SubscriberType2(String name) {
		this.name=name;
	}
	@Override
	public void update(Observable o) {
		
		System.out.println("Hello Mr."+ name + ", a new edition " + ((Magasine) o).getInfo() + " just appeared!");
		
	}

	
	

}