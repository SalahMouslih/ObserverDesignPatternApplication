package observerDP;

import java.util.ArrayList;
import java.util.List;

public class Magasine implements Observable {

	private List<Observer> subscribers = new ArrayList<Observer>();

	private int editionNumber;
	
	private int editionDate;
	

	 public String getInfo() {
	      return " number:" + editionNumber + ", date : " + editionDate;
	   }

	   public void setInfo(int editionNumber,int editionDate ) {
	      this.editionNumber = editionNumber;
	      this.editionDate= editionDate;
	      notifyObservers();
	   }
	
	@Override
	public void ajtObserver(Observer o) {
		subscribers.add(o);
		System.out.print("Subscriber added");
	}

	@Override
	public void removeObserver(Observer o) {
		subscribers.remove(o);
		System.out.print("Subscriber removed");

	}

	public void removeObserver(String name) {
		
		
		Observer sub = null;			

		
		for (Observer subscriber : subscribers) {
			
			
			try {
				if (((SubscriberType1)subscriber).name.equals(name) ) {
					sub = subscriber;
					
		
				}
			}
			catch(Exception e) {}
			
			try {
				if (((SubscriberType2)subscriber).name.equals(name) ) {
					sub = subscriber;

		
				}
			}
			catch(Exception e) {}
		}
		if (sub != null) {
			
			subscribers.remove(sub);
			System.out.print("Subscriber removed");
		}
		else {System.out.print("Subscriber doesn't exist");}
	}
	
	@Override
	public void notifyObservers() {
		for (Observer subscriber : subscribers) {
			subscriber.update(this);
	      }
		
	}
	
	

}
