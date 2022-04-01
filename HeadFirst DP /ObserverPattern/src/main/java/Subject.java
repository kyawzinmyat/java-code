public interface Subject {
	void registerObserver(Observers new_observer);
	void removeObserver(Observers observer);
	void notifyObservers();
}