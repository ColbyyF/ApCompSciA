import java.util.Random;

public class Dice
{

	public static void main(String args [] )
	{

	double rollone = Math.round(Math.random()*6 + 1);
	double rolltwo = Math.round(Math.random()*6 + 1)  ; 
	double sum ;
	
	sum = rollone + rolltwo ;
	System.out.println ("The first roll = " + rollone) ;
	System.out.println ("The second roll =  " + rolltwo) ;
	System.out.println ("The sum of the both rolls =  " + sum) ;
	System.out.println ("He thrusts his fists \n\tagainst" +
			 "the post\nand still insists\n\the sees the \"ghost\"");
}
}