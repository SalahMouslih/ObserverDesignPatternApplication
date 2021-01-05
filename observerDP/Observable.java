package observerDP;

public interface Observable {
	
	public void ajtObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();

}
