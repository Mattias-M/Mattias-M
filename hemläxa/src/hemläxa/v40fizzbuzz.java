package hemläxa;

import java.util.Scanner;

public class v40fizzbuzz {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("skriv 3 tal");
		int X = scan.nextInt();
		int Y = scan.nextInt();
		int N = scan.nextInt();
		
		for (int i=1; i<=N; i++ ) {
			if (i % X == 0 && i % Y == 0) {
				System.out.println("FizzBuzz");
			}
			else if( i % X ==0 ) {
				System.out.println("Fizz");
			}
			else if( i % Y ==0 ) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
		
		

	}

	}
}
