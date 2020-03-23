package hemläxa;

import java.util.Random;
import java.util.Scanner;

public class talspel {
	static Random rand = new Random();
	static Scanner scan = new Scanner(System.in);
	static String Nickname;
	static int guesses;
	static int secretnumber;
	static int guess;
	public static void main(String[] args) {
		
		ChoseName();
	}
	
	public static void ChoseName() {
		System.out.println("Hej och välkomen till Talspelet! skriv in ditt namn.");
		Nickname = scan.nextLine();
		Intro();
		
	}
	public static void Intro() {
		System.out.println("Hej " + Nickname + " välkomen till Talspelaet. I det spelet så kommer du försöka gissa på ett tal som du inte vet vad det är. När du har gissat så kommer då få ledtrådar om du gissa för högt eller för lågt. Lycka till! ");
		ChoseGuesses();
	}
	public static void ChoseGuesses() {
		System.out.println("Nu ska du välja hur mycket gissnigar du har på dig att gissa talet. SKriv hur många gissnigar du vill ha.");
		guesses = scan.nextInt();
		ChoseNumber();
	}
	public static void ChoseNumber() {
		System.out.println("Nu ska du välja hur stort talet som du ska gissa på ska vara. Det minsta kommer alltid vara 0. Så om du skriver 100 så kommer talet vara någonstans emellan 0 til 99");
		System.out.println("skriv det högsta talet " + Nickname);
		int maxNumber = scan.nextInt();
		secretnumber = rand.nextInt(maxNumber);
		Guess();
		
	}
	public static void Guess() {
		System.out.println("nu är det dax att giss!");
		guess = scan.nextInt();
		
		if(guess == secretnumber) {
			End();
		}
		else if(guess > secretnumber) {
			ToBig();
		}
		else if(guess < secretnumber){
			ToSmal();
		}
	}
	
	public static void ToBig(){
		System.out.println("Din gissnig var för hög");
		guess --;
		if (guess == 0) {
			End();
		}
		else {
			System.out.println("du har " + guess + " gissnigar kvar"); 
			Guess();
		}
	}
	
	public static void ToSmal() {
		System.out.println("Din gissnig var för lågt");
		guess --;
		if (guess == 0) {
			End();
		}
		else {
			System.out.println("du har " + guess + " gissnigar kvar"); 
			Guess();
		}	
		
		
	}
	
	public static void End() {
		if (guess == 0) {
			System.out.println("rackans järnspikar, slut på gissnigar. Tvärr så har du förlorat."); 
		}
		else {
			System.out.println("Grattis du van!!");
		}
	}
	
}
