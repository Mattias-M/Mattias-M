package heml�xa;

import java.util.Scanner;

public class talspel {
	static Scanner scan = new Scanner(System.in);
	static String Nickname;
	public static void main(String[] args) {
		
		
		ChoseName();
		Intro();

	}
	
	public static void ChoseName() {
		System.out.println("Hej och v�lkomen till Talspelet! skriv in ditt namn.");
		Nickname = scan.nextLine();
		
	}
	public static void Intro() {
		System.out.println("Hej " + Nickname + " v�lkomen till Talspelaet. I det spelet s� kommer du f�rs�ka gissa p� ett tal som du inte vet vad det �r. N�r du har gissat s� kommer d� f� ledtr�dar om du gissa f�r h�gt eller f�r l�gt. Lycka till! ");
	}
	

}
