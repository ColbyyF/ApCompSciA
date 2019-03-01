import java.util.Scanner;
public class Checkerboard {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int range;
		
		while (1 != 0) {
			
				System.out.println("Enter a positive integer that is less than or equal to 9, enter 0 to exit");
				range = scan.nextInt();
				if(range == 0) {
					System.out.println("Bye");
					System.exit(0);
				}
				else if (range < 10) {
					//print board
					for (int l = 0; l < 4; l++) { //prints first two layers 3 more times
						for (int k = 0; k < range; k++) { //repeats the line of #'s and .'s vertically "range" amount of times
							for (int j = 0; j < 4; j++) {//takes the first 4 #'s and 4 .'s and repeats it 3 more times horizontally
								for (int i = 0; i < range; i++) {//prints # 4 times
									System.out.print("#");
								}
								for (int i = 0; i < range; i++) {//prints . 4 times
									System.out.print(".");
								}
							}
							System.out.println("");//starts the next layer
									
								}
						for (int k = 0; k < range; k++) {//essentially the same as above but switches the # and . that the layer starts with a . box rather than a # box creating the second layer
							for (int j = 0; j < 4; j++) {
								for (int i = 0; i < range; i++) {
									System.out.print(".");
								}
								for (int i = 0; i < range; i++) {
									System.out.print("#");
								}
							}
							System.out.println("");
								
						}
					}
					
				}
				System.out.println("");
			}
		
		}
			
	}

	
		


