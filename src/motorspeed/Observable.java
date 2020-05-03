package motorspeed;

import java.util.ArrayList;

public class Observable {
	
	private ArrayList<Observer> observers;
	
	public Observable() {
		observers = new ArrayList<Observer>();
	}
	
	public void addObserver(Observer o) {
		observers.add(o);
	}
	
	public void deleteObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i>=0) {
			observers.remove(i);
		}
	}
	
	public void setChanged() {
		notifyObservers();
	}
	
	public void notifyObservers() {
        for(int i=0; i<observers.size(); i++){
            Observer observer = (Observer)observers.get(i);
            observer.update((Speedometer) this);
        }
	}
}
