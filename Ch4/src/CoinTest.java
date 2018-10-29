
public class CoinTest
{
    public static void main (String[] args)
    {
	final int FLIPS = 100; 
	
	int heads = 0, tails = 0;

	int currentRun = 0; 
	int maxRun = 0;     

	// Create a coin object
Coin coin = new Coin() ;


	// Flip the coin FLIPS times
	for (int i = 0; i < FLIPS; i++)
	    {
		
		coin.flip();
		
		if (coin.isHeads())
			currentRun++;
		else 
			currentRun = 0;
		
		if (currentRun > maxRun)
			maxRun = currentRun;
		
		System.out.println(coin);

	    }

	System.out.println("The Maximum number of " + coin + " was " + maxRun 
			);

    }
}
