
public abstract class Animal {
	public String Name;
	public int Age;
	public Boolean isAlive = true;
	

	public Animal(String name) {
		
	} // Ends Constructor Name
	
	public Animal(int Age) {
		
	} // Ends Constructor Age
	
	

public void hasDied() {
	isAlive = false;
} // Ends hasDied Method
	
	
public void incAge() {
	Age++;
} // Ends incAge Method



} // Ends abstract Class Animal
