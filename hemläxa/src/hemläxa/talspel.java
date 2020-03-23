package hemläxa;

import java.util.Scanner;

public class talspel {
	static Scanner scan = new Scanner(System.in);
	static String Nickname;
	public static void main(String[] args) {
		
		
		ChoseName();
		Intro();

	}
	
	public static void ChoseName() {
		System.out.println("Hej och välkomen till Talspelet! skriv in ditt namn.");
		Nickname = scan.nextLine();
		
	}
	public static void Intro() {
		System.out.println("Hej " + Nickname + " välkomen till Talspelaet. I det spelet så kommer du försöka gissa på ett tal som du inte vet vad det är. När du har gissat så kommer då få ledtrådar om du gissa för högt eller för lågt. Lycka till! ");
	}
	

}
