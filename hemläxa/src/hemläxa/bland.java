package hemläxa;

import java.util.Scanner;

public class bland {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		int Y = scan.nextInt();
		
		if(X < Y)System.out.println(X);
		else System.out.println(Y);
	

	}

}
