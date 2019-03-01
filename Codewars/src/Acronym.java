import java.util.Scanner;
public class Acronym {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while( 1 != 0) {//runs program until user terminates program
			System.out.println("Enter an acronym, enter END to exit");
			String input = scan.nextLine();
			
			if (input.equals("END")) {//termination
				System.out.println("Exiting...");
				System.exit(0);
			}		
			String[] acro = input.split(" ");//split the string into an array of words using the spaces
			
			for (int i = 0; i < acro.length; i++) {//goes through each word inside the array
				String temp = acro[i];
				temp = temp.toUpperCase();//changes the entire word to 
				System.out.print(temp.charAt(0));//find the character at the beginning of each word of the array
			
			}
			String lastWord = input.substring(input.lastIndexOf(" ")+1);//finds the last word of the string 
			lastWord = lastWord.toLowerCase();//lower case the entire word
			System.out.println(" " + lastWord);
		}
			
		
	}
}
