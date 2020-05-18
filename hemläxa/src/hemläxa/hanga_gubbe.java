package hemläxa;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class hanga_gubbe {

	static Scanner scan = new Scanner(System.in);
	static int difficulty;
	static int playerLife;
	static int ItIsInt;
	static char charInWord;
	static String guess;
	static String theSecretWord;
	public static String[] easyWords = { "JAVA", "HEJ", "ARE", "KATT", "MAMMA" };
	public static String[] hardWords = { "HEJSAN", "CITERA", "MYNDIG", "DIAFRAGMA", "REGRESS" };
	public static ArrayList<Character> theSecretWordBut_ = new ArrayList<Character>();

// metoden startar spelet.
	public static void main(String[] args) {
		welcome();
	}

	/**
	 * välkomnar spelaren och förklarar reglerna, sedan startar nästa metod
	 */
	static void welcome() {
		System.out.println("Hej, och välkomen till hänga gubbespelet.");
		System.out.println("I Detta spelet ska du gissa vilka bokstäver ditt finn i ett ord.");
		System.out.println("Om ordet är HEJ så kommer det stå _ _ _. Om du giisar på H så kommer det ädras till H _ _");
		choseDeifficulty();
	}

	/**
	 * här så väljer spelaren vilken svårighetsgrad. om spelaren ska skriv 1 eller 2
	 * beroend vilken svårighetsgran spelaren vill ha. finn också en try-chatch om
	 * spelaren inte skriver sifror.
	 */
	static void choseDeifficulty() {
		System.out.println("Nu ska du välja svårighetsgrad, skriv 1 om du vill ha lätta ord, eller 2 för svåra ord.");
		int hardOrEasy = IntChecker();
		if (hardOrEasy == 1) {
			difficulty = 1;
			System.out.println("du har valt svårighetsgrad " + difficulty);
		} else if (hardOrEasy == 2) {
			difficulty = 2;
			System.out.println("du har valt svårighetsgrad " + difficulty);
		} else {
			System.out.println("Du måste skriva 1 eller 2 inget annat.");
			choseDeifficulty();
		}
		randomizer();
	}

	/**
	 * denna metoden tar slumpmässigt ord från arryen easywords om spelaren vade
	 * difficulty easy. Sedan startar den metoden maketheSecretWordBut_
	 */
	static void randomizer() {
		Random random = new Random();

		if (difficulty == 1) {
			theSecretWord = easyWords[random.nextInt(easyWords.length)];
		} else {
			theSecretWord = hardWords[random.nextInt(hardWords.length)];
		}

		makeTheSecretWordBut_();

	}

	/**
	 * metoden lägger till så många undetsträck i arrryListan theSecretWordBut_ som
	 * theSecretWord är långt.
	 */
	static void makeTheSecretWordBut_() {
		for (int i = 0; i < theSecretWord.length(); i++) {
			theSecretWordBut_.add('_');
		}
		theGame();
	}

	/*
	 * dena metoden sätter spelarens liv till 9 och startar grahic
	 */
	static void theGame() {
		playerLife = 9;

		graphic();

	}

	/**
	 * här så visas theSecretWordBut_ och hur många liv spelaren har
	 */
	static void graphic() {

		System.out.println(theSecretWordBut_);

		System.out.println("du har " + playerLife + " liv kvar.");

		guess();

	}

	/**
	 * först så berättar spelet att spelaren ska gissa. När spelaren gissar så är
	 * det en string, gör denna string till storabokstöver med tuUpperCase. sedan så
	 * delar metoden upp gissnigen till chars i en array. sedan kollar den upp
	 * bokstav för bokstav om bokstaven är i ordet. Om bokstaven är i ordet så
	 * startaren den metoden checkWhereCharIsInString om bokstaven inte är i ordet
	 * så tar den bort ett liv från spelaren och statar metoden checkIfPlayerDead()
	 * sedan när allt är klart så startr metode graphic.
	 */
	static void guess() {
		System.out.println("Nu är det dax att gissa på bokstäver. Du kan gissa på hur många bokstäver du vill.");
		String guess = scan.nextLine();
		guess = guess.toUpperCase();

		char[] charArray = guess.toCharArray();

		for (char i : charArray) {

			if (theSecretWord.indexOf(i) != -1) {
				charInWord = i;
				System.out.println(charInWord + " är i ordet");
				checkWhereCharIsInString();

			} else {
				System.out.println(i + " är inte i ordet.");
				playerLife--;
				checkIfPlayerDead();
			}

		}
		graphic();
	}

	/**
	 * här så kollar om spelaren är död, om den är det så startar metoden end annar
	 * så händer inget.
	 */
	static void checkIfPlayerDead() {
		if (playerLife == 0) {
			end();
		} else {

		}
	}

	/**
	 * denna metoden kollar vart bokstaven som spelaren gissa på är i ordet. Sedan så lägges bokstaven i theSecretWordBut_ där den ska vara.
	 */
	static void checkWhereCharIsInString() {
		for (int i = 0; i < theSecretWord.length(); i++) {

			if (charInWord == theSecretWord.charAt(i)) {

				theSecretWordBut_.set(i, charInWord);

				System.out.println(theSecretWordBut_);

				checkIfWordIsDon();
			}

		}
	}
/**
 * denna metoden ser om det finns några _ i theSecretWordBut_, om det finns några så gör den inget. Om det inte finns några understräck så har spelaren klara spelet och starta metoden end
 */
	static void checkIfWordIsDon() {

		if (theSecretWordBut_.indexOf('_') != -1) {

		} else {
			System.out.println("Grattis, du klarade det!!");
			end();
		}

	}
/**
 * denna metoden frågar spelaren om spelaren vill spela igen eller inte. 
 * Om spelaren väljer att spela igen så startas metoden choseDeifficulty.
 * Om spelaren inte vill spela igen så stängs spelet ner.
 * anväder en try-catch så spelet inte krachar om spelaren skriver in en bokstav. 
 */
	static void end() {
		System.out.println("vill du spela ingen? skriv 1 annars skriv 2");
		int YesOrNo = IntChecker();
		if (YesOrNo == 1) {
			choseDeifficulty();
		} else {
			System.exit(0);
		}

	}

	/**
	 * Denna metod är en try chatch som har en scanner. om man har skrivit en int så gör det inget. 
	 * Om man inte har skrivit en inte så säjer den till och får försöka ingen. 
	 * @return int som man har skrivit.
	 */
	public static int IntChecker() {
		while (true) {
			try {
				ItIsInt = scan.nextInt();
				scan.nextLine();
				break;

			} catch (Exception InputMismatchException) {

				System.out.println("Du måste skriva in heltal, försökt ingen!");
				scan.next();
			}
		}
		return ItIsInt;
	}

}
