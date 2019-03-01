import java.util.Scanner;
public class Prob06 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		String perl = scan.nextLine();
		
		//System.out.println(perl.indexOf(")"));
		int split = perl.indexOf(")");//find the index of the closing parentheses of the if statement
		String conditional = perl.substring(0, (split + 1));//assign the if statement to a variable
		//System.out.println(conditional);
		String rest = perl.substring((split + 2), perl.length());//assign the rest of the statement to a variable
		rest = rest.replaceAll(";", " " );//replace the ; with a space
		//System.out.println(rest);
		
		System.out.println ( rest + conditional + ";");
		scan.close();
	}
}
