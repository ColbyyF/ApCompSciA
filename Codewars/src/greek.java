import java.util.Scanner;
public class greek {
	public static void main (String[] args) {

		Scanner scan = new Scanner(System.in);
		String suffix2 = "";
		
		String input = scan.nextLine();
		
		//termination
		if (input.contentEquals("END")) {
			System.out.println("Exiting...");
			System.exit(0);
		}
		
		int dash = input.indexOf("-");
		System.out.println(dash);
		
		char root = input.charAt(dash - 1);
		System.out.println(root);
		
		char suffix = input.charAt(dash + 1);
		System.out.println(suffix);
		
		if (input.substring((dash + 1), (dash + 3)).equals( "ou")){
			suffix2 =  input.substring((dash + 1), (dash + 3));
			String tempInput = input.substring((dash - 1),(dash + 3));
			
			//System.out.println(tempInput);			
			//System.out.print(suffix2);			
		}
		
		//StringBuilder myInput = new StringBuilder(input);
		//myInput.setCharAt(dash - 1, "");
		/*else {
			
			String tempInput = input.substring((dash - 1),(dash + 2));
			StringBuilder myInput = new StringBuilder(tempInput);
			myInput.setCharAt(0, 'a');
			System.out.println(myInput);
			String tempString = myInput.toString();
			input = myInput.tempString("a", "");
		}
		*/
		

		
		
		//root = a
		if (root == 'a' && suffix == 'a') {
			input = input.replaceAll("-", "a");
		}
		else if (root == 'a' && suffix == 'e') {
			input = input.replaceAll("-", "a");
		}
		else if (root == 'a' && suffix == 'i') {
			input = input.replaceAll("-", "ai");
		}
		else if (root == 'a' && suffix == 'y') {
			input = input.replaceAll("-", "a");
		}
		else if (root == 'a' && suffix2.equals("ou")) {
			//System.out.println("Works again");
			input = input.replaceAll("-", "w");
		}
		else if (root == 'a' && suffix == 'o') {
			input = input.replaceAll("-", "w");
		}
		else if (root == 'a' && suffix == 'w') {
			input = input.replaceAll("-", "w");
		}
		
		
		//root = e
		else if (root == 'e' && suffix == 'a') {
			input = input.replaceAll("-", "y");
		}
		else if (root == 'e' && suffix == 'e') {
			input = input.replaceAll("-", "ei");
		}
		else if (root == 'e' && suffix == 'i') {
			input = input.replaceAll("-", "ei");
		}
		else if (root == 'e' && suffix == 'y') {
			input = input.replaceAll("-", "y");
		}
		else if (root == 'e' && suffix2.equals("ou")) {
			input = input.replaceAll("-", "ou");
		}
		else if (root == 'e' && suffix == 'o') {
			input = input.replaceAll("-", "ou");
		}
		else if (root == 'e' && suffix == 'w') {
			input = input.replaceAll("-", "w");
		}
		
		
		//root = o
		else if (root == 'o' && suffix == 'a') {
			input = input.replaceAll("-", "w");
		}
		else if (root == 'o' && suffix == 'e') {
			input = input.replaceAll("-", "ou");
		}
		else if (root == 'o' && suffix == 'i') {
			input = input.replaceAll("-", "oi");
		}
		else if (root == 'o' && suffix == 'y') {
			input = input.replaceAll("-", "w");
		}
		else if (root == 'o' && suffix2.equals("ou")) {
			input = input.replaceAll("-", "ou");
		}
		else if (root == 'o' && suffix == 'o') {
			input = input.replaceAll("-", "ou");
		}
		else if (root == 'o' && suffix == 'w') {
			input = input.replaceAll("-", "w");
		}
		
		
		System.out.println(input);
		
		
	}
}
