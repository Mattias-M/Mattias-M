package heml�xa;

import java.util.Random;
import java.util.Scanner;


public class talspel {
	// detta �r alla variablar jag anv�der mig av som ska vara i flr�r e�n en metod.
	static Random rand = new Random();
	static Scanner scan = new Scanner(System.in);
	static String Nickname;
	static int guesses;
	static int secretnumber;
	static int guess;
	static int IsItInt;
	public static void main(String[] args) {
		
		ChoseName();
	}
	/**
	 * Denna metoden gj�r s� man kan v�lja namn och startar intro
	 */
	public static void ChoseName() {
		System.out.println("Hej och v�lkomen till Talspelet! skriv in ditt namn.");
		Nickname = scan.nextLine();
		Intro();
	/**
	 * Metoden ber�ttar hur spelet funkar med en sysout. Den startar n�sra metod som �r ChoseGuesses 
	 */
	}
	public static void Intro() {
		System.out.println("Hej " + Nickname + " v�lkomen till Talspelaet. I det spelet s� kommer du f�rs�ka gissa p� ett tal som du inte vet vad det �r. N�r du har gissat s� kommer d� f� ledtr�dar om du gissa f�r h�gt eller f�r l�gt. Lycka till! ");
		ChoseGuesses();
	/**
	 * MEtoden g�r s� man f�r best�mma hur m�nga gissningar man har p� sig.
	 * guesses �r antal gissnigar man har.
	 * Sen startar den n�sta metod som �r ChoseNumber.
	 */
	}
	public static void ChoseGuesses() {
		System.out.println("Nu ska du v�lja hur mycket gissnigar du har p� dig att gissa talet. Skriv hur m�nga gissnigar du vill ha.");
		guesses = IntChecker();
		ChoseNumber();
	/**
	 *
	 * Denna metoden g�r s� man kan best�mma hur h�g det h�gsta tillet kan bli.
	 * anv�der mig av packaget Random f�r att slumpm�ssigt ta ett tal. S� det packaget har jag inportart.
	 * rand.nextInt(maxNumber) v�lger slupms�gt tal mellan 0-maxNumber
	 * till slut s� startar den n�sta metod Guess
	 */
	}
	public static void ChoseNumber() {
		System.out.println("Nu ska du v�lja hur stort talet som du ska gissa p� ska vara. Det minsta kommer alltid vara 0. S� om du skriver 100 s� kommer talet vara n�gonstans emellan 0 til 99");
		System.out.println("skriv det h�gsta talet " + Nickname);
		int maxNumber = IntChecker();
		secretnumber = rand.nextInt(maxNumber);
		Guess();
	/**
	 * Metoden g�r s� att spelaren kan gissa p� talet.
	 * Om spelaren gissar f�r h�gt s� 
	 */
	}
	public static void Guess() {
		System.out.println("nu �r det dax att giss!");
		guess = IntChecker();
		
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
		guesses --;
		if (guesses == 0) {
			End();
		}
		else {
			System.out.println("du har " + guesses + " gissnigar kvar"); 
			Guess();
		}
	}
	
	public static void ToSmal() {
		System.out.println("Din gissnig var f�r l�gt");
		guesses --;
		if (guesses == 0) {
			End();
		}
		else {
			System.out.println("du har " + guesses + " gissnigar kvar"); 
			Guess();
		}	
		
		
	}
	
	public static void End() {
		if (guesses == 0) {
			System.out.println("rackans j�rnspikar, slut p� gissnigar. Tv�rr s� har du f�rlorat."); 
			restart();
		}
		else {
			System.out.println("Grattis du van!!");
			restart();
		}
	}
	
	public static int IntChecker() {
        while (true) {
            try {
                IsItInt = scan.nextInt();
                break;

            } catch (Exception InputMismatchException) {

                System.out.println("Du m�ste skriva in heltal, f�rs�kt ingen!");
                scan.next();
            }
        }
        return IsItInt;
    }
	public static void restart() {
		System.out.println("vill du spela ingen? skriv 1 annars skriv 2");
		int YesOrNo = IntChecker();
		if(YesOrNo == 1) {
			Intro();
		}
		else {
			System.exit(0);
		}
	}
	
	
}
