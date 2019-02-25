  import java.util.Scanner;
  
public class Prob1 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x = sc.nextLine();
		String y = x;
		String z = "";
		
		x = x.toLowerCase();
		z = z.toLowerCase();
		String tempString;
		String finalString = "";
		for	(int i = 0; i < x.length() ; i++) {
			tempString = x.substring(i, i + 1);
			if(tempString.equals(" ") || tempString.equals(",") || tempString.equals(".") || tempString.equals("'"))	{
			} else {
				z += tempString;
			}
		}
		
		for (int i = z.length(); i > 0; i--) {
			finalString += z.substring(i - 1,i);
		}
		System.out.println(z);
		System.out.println(finalString);

		if(finalString.equals(z)) {
			System.out.print("It is a palindrome");
		}
		
		else {
			System.out.print("It is not a palindrome");
		}
	}	
		
	}

