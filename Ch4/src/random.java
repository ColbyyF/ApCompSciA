
public class random {

    public static void main(String[] args) { 
    	final int FLIPS = 100;
        // Math.random() returns a value between 0.0 and 1.0
        // so it is heads or tails 50% of the time
    	for (int i = 0; i < FLIPS; i++)
    	{
        if (Math.random() < 0.5) System.out.println("Heads");
        else                     System.out.println("Tails");
        
    	}
    }
}
