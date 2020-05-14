package hemläxa;

import java.util.Scanner;

public class rep {

	public static void main(String[] args) {
		
			
			Scanner scan = new Scanner(System.in);
			int number = scan.nextInt();
			
			for(int i = 0; i >1000; i ++) {
				
				if(number / i == 0) {
					System.out.println(number);
				}
			}
			
		}

	}

