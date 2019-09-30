package hemläxa;

import java.util.Scanner;

public class v39_R2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("skriv två tal");
		int R1 = scan.nextInt();
		int S = scan.nextInt();
				
		int R2 = 2*S-R1;
		System.out.println(R2);
			
		

	}

}
