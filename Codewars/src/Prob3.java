import java.util.*;
public class Prob3 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
		
	while( 1 != 0) {
		Boolean isBlack = true;
		int num = sc.nextInt();
		if (num > 9) {
			System.out.print("For the love of god enter a reasonable number you faggot");
		}
		else if(num == 0){
			System.exit(0);
		}
	
		if(num < 9) {
			for(int i = 0; i < 8; i++) {
				for(int z = 0; z < num; z++) {
					for(int q = 0; q < 4; q++) {
						if(isBlack = true){
						for(int e = 0; e < num; e++) {
							System.out.print("#");
						}
						for(int r = 0; r < num; r++) {
							System.out.print(".");
							isBlack = false;
						}
						}
						else {
							for(int r = 0; r < num; r++) {
								System.out.print(".");
							}
							for(int e = 0; e < num; e++) {
								System.out.print("#");
								isBlack = true;
							}
						}
					}
					
				}
			}
			
		 
		}

		
}			
}
}
