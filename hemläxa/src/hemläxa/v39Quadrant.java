package hemläxa;

import java.util.Scanner;

public class v39Quadrant {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("skriv in två tal");
		int X = scan.nextInt();
		int Y = scan.nextInt();
		
		if( X>=1 && Y>=1) { System.out.println(1);}
		
		else if( X>=1 && Y<=1) {System.out.println(4);}
		
		else if( X<=1 && Y<=1) {System.out.println(3);}
		
		else if( X<=1 && Y>=1) {System.out.println(2);}
		

	}

}
