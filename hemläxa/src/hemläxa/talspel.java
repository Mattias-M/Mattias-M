package heml�xa;

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
		System.out.println("Hej och v�lkomen till Talspelet! skriv in ditt namn.");
		Nickname = scan.nextLine();
		Intro();
		
	}
	public static void Intro() {
		System.out.println("Hej " + Nickname + " v�lkomen till Talspelaet. I det spelet s� kommer du f�rs�ka gissa p� ett tal som du inte vet vad det �r. N�r du har gissat s� kommer d� f� ledtr�dar om du gissa f�r h�gt eller f�r l�gt. Lycka till! ");
		ChoseGuesses();
	}
	public static void ChoseGuesses() {
		System.out.println("Nu ska du v�lja hur mycket gissnigar du har p� dig att gissa talet. SKriv hur m�nga gissnigar du vill ha.");
		guesses = scan.nextInt();
		ChoseNumber();
	}
	public static void ChoseNumber() {
		System.out.println("Nu ska du v�lja hur stort talet som du ska gissa p� ska vara. Det minsta kommer alltid vara 0. S� om du skriver 100 s� kommer talet vara n�gonstans emellan 0 til 99");
		System.out.println("skriv det h�gsta talet " + Nickname);
		int maxNumber = scan.nextInt();
		secretnumber = rand.nextInt(maxNumber);
		Guess();
		
	}
	public static void Guess() {
		System.out.println("nu �r det dax att giss!");
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
		System.out.println("Din gissnig var f�r h�g");
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
		System.out.println("Din gissnig var f�r l�gt");
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
			System.out.println("rackans j�rnspikar, slut p� gissnigar. Tv�rr s� har du f�rlorat."); 
		}
		else {
			System.out.println("Grattis du van!!");
		}
	}
	
}
