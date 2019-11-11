package hemläxa;

import java.util.Scanner;

public class v43 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double radius = scan.nextInt();
		
		String str = scan.toString();
		
		double vol = volume(radius);
		System.out.println(vol);
		
		String rev = str(reverse);
		
	}
	
	public static double volume(double radius) {
		
		double volum = (4*Math.PI*Math.pow(radius, 3))/3;
		
		return volum;	
	}
	
	public static void reverse(String strtingToReverse) {
		
		
			
		
	}
	
}
