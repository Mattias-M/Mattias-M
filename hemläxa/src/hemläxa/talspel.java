package hemläxa;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class talspel {
	// detta är alla variablar jag anväder mig av som ska vara i flrér eän en metod.
	static Random rand = new Random();
	static Scanner scan = new Scanner(System.in);
	static String Nickname;
	static int guesses;
	static int secretnumber;
	static int guess;
	static int ItIsInt;
	public static void main(String[] args) {
		
		ChoseName();
	}
	/**
	 * Denna metoden gjör så man kan välja namn och startar intro
	 */
	public static void ChoseName() {
		System.out.println("Hej och välkomen till Talspelet! skriv in ditt namn.");
		Nickname = scan.nextLine();
		Intro();
	/**
	 * Metoden berättar hur spelet funkar med en sysout. Den startar näsra metod som är ChoseGuesses 
	 */
	}
	public static void Intro() {
		System.out.println("Hej " + Nickname + " välkomen till Talspelaet. I det spelet så kommer du försöka gissa på ett tal som du inte vet vad det är. När du har gissat så kommer då få ledtrådar om du gissa för högt eller för lågt. Lycka till! ");
		ChoseGuesses();
	/**
	 * MEtoden gör så man får bestämma hur många gissningar man har på sig.
	 * guesses är antal gissnigar man har.
	 * Sen startar den nästa metod som är ChoseNumber.
	 */
	}
	public static void ChoseGuesses() {
		System.out.println("Nu ska du välja hur mycket gissnigar du har på dig att gissa talet. Skriv hur många gissnigar du vill ha.");
		guesses = IntChecker();
		ChoseNumber();
	/**
	 *
	 * Denna metoden gör så man kan bestämma hur hög det högsta tillet kan bli.
	 * anväder mig av packaget Random för att slumpmässigt ta ett tal. Så det packaget har jag inportart.
	 * rand.nextInt(maxNumber) välger slupmsägt tal mellan 0-maxNumber
	 * till slut så startar den nästa metod Guess
	 */
	}
	public static void ChoseNumber() {
		System.out.println("Nu ska du välja hur stort talet som du ska gissa på ska vara. Det minsta kommer alltid vara 0. Så om du skriver 100 så kommer talet vara någonstans emellan 0 til 99");
		System.out.println("skriv det högsta talet " + Nickname);
		int maxNumber = IntChecker();
		secretnumber = rand.nextInt(maxNumber);
		Guess();
	/**
	 * Metoden gör så att spelaren kan gissa på talet.
	 * Om spelaren gissar rätt så böjar den metoden End()
	 * Om spelaren gissar för högt så böjar den metoden ToBig()
	 * Om spelaren gissar för lågt böjar den metoden ToSmal()
	 */
	}
	public static void Guess() {
		System.out.println("nu är det dax att giss!");
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
	/*
	 * Metoden skriver att spelaren gissar för högt
	 * tar 1 minus från guesses och kollar om guesse är 0. Om guesses är noll så böjar den metoden End()
	 * annars så skriver den ut hur många gissnigar man har kvar och spelaren för gissa igen.
	 */
	public static void ToBig(){
		System.out.println("Din gissnig var för hög");
		guesses --;
		if (guesses == 0) {
			End();
		}
		else {
			System.out.println("du har " + guesses + " gissnigar kvar"); 
			Guess();
		}
	}
	/**
	 * Metoden skriver att spelaren gissar för lågt
	 * tar 1 minus från guesses och kollar om guesse är 0. Om guesses är noll så böjar den metoden End()
	 * annars så skriver den ut hur många gissnigar man har kvar och spelaren för gissa igen.
	 */
	public static void ToSmal() {
		System.out.println("Din gissnig var för lågt");
		guesses --;
		if (guesses == 0) {
			End();
		}
		else {
			System.out.println("du har " + guesses + " gissnigar kvar"); 
			Guess();
		}	
		
		
	}
	/**
	 * Metoden kollar om man har 0 guesse om man har det så skriver den ut det och böjar metoden restart()
	 * annars så skriver den "Grattis" och startar Metoden reset()
	 */
	public static void End() {
		if (guesses == 0) {
			System.out.println("rackans järnspikar, slut på gissnigar. Tvärr så har du förlorat."); 
			restart();
		}
		else {
			System.out.println("Grattis du van!!");
			restart();
		}
	}
	/**
	 * Denna metod är en try chatch som för har en scanner. om man har skrivit en int så gör det inget. 
	 * Om man inte har skrivit en inte så säjer den till och får försöka ingen. 
	 * @return int som man har skrivit.
	 */
	public static int IntChecker() {
        while (true) {
            try {
                ItIsInt = scan.nextInt();
                break;

            } catch (Exception InputMismatchException) {

                System.out.println("Du måste skriva in heltal, försökt ingen!");
                scan.next();
            }
        }
        return ItIsInt;
        
        /**
         * Metoden gör så man får välja om man vill spela igen ell inte.
         * Om man väljer att man ska pela ingen så böjar den på metodenIntro()(så man  inte behöver skriva sitt namn igen.)
         * annars så stänger den ner programet.
         */
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
	static void MakeWordToArrayList() {
		ArrayList<Character> chars = new ArrayList <Character>();
		for (char c: theSecretWord.toCharArray()) {
			chars.add(c);
		}
		System.out.println(chars);
	
}
