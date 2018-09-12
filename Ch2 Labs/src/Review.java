import java.util.Scanner;
public class Review {
 public static void main(String args[]) {

	 // This Code Creates a String 
	String NameInput = new String("This Is a Test") ;
	String NameInput2 = "Test2" ;
	System.out.print(NameInput2);
	
	// This Code is User Input
	Scanner test1 = new Scanner(System.in);
	Double carvalue, percent ;
	System.out.println("\nplease put the car's value");
	carvalue = test1.nextDouble();
	System.out.println("Please enter the % off in decimal form6");
	percent = test1.nextDouble();
	Double discount ;
	discount = carvalue * percent ;
	System.out.println("The amount off is " + discount + " dollars");
	 
	 
}
}
