package heml�xa;

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
	 * v�lkomnar spelaren och f�rklarar reglerna, sedan startar n�sta metod
	 */
	static void welcome() {
		System.out.println("Hej, och v�lkomen till h�nga gubbespelet.");
		System.out.println("I Detta spelet ska du gissa vilka bokst�ver ditt finn i ett ord.");
		System.out.println("Om ordet �r HEJ s� kommer det st� _ _ _. Om du giisar p� H s� kommer det �dras till H _ _");
		choseDeifficulty();
	}

	/**
	 * h�r s� v�ljer spelaren vilken sv�righetsgrad. om spelaren ska skriv 1 eller 2
	 * beroend vilken sv�righetsgran spelaren vill ha. finn ocks� en try-chatch om
	 * spelaren inte skriver sifror.
	 */
	static void choseDeifficulty() {
		System.out.println("Nu ska du v�lja sv�righetsgrad, skriv 1 om du vill ha l�tta ord, eller 2 f�r sv�ra ord.");
		int hardOrEasy = IntChecker();
		if (hardOrEasy == 1) {
			difficulty = 1;
			System.out.println("du har valt sv�righetsgrad " + difficulty);
		} else if (hardOrEasy == 2) {
			difficulty = 2;
			System.out.println("du har valt sv�righetsgrad " + difficulty);
		} else {
			System.out.println("Du m�ste skriva 1 eller 2 inget annat.");
			choseDeifficulty();
		}
		randomizer();
	}

	/**
	 * denna metoden tar slumpm�ssigt ord fr�n arryen easywords om spelaren vade
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
	 * metoden l�gger till s� m�nga undetstr�ck i arrryListan theSecretWordBut_ som
	 * theSecretWord �r l�ngt.
	 */
	static void makeTheSecretWordBut_() {
		for (int i = 0; i < theSecretWord.length(); i++) {
			theSecretWordBut_.add('_');
		}
		theGame();
	}

	/*
	 * dena metoden s�tter spelarens liv till 9 och startar grahic
	 */
	static void theGame() {
		playerLife = 9;

		graphic();

	}

	/**
	 * h�r s� visas theSecretWordBut_ och hur m�nga liv spelaren har
	 */
	static void graphic() {

		System.out.println(theSecretWordBut_);

		System.out.println("du har " + playerLife + " liv kvar.");

		guess();

	}

	/**
	 * f�rst s� ber�ttar spelet att spelaren ska gissa. N�r spelaren gissar s� �r
	 * det en string, g�r denna string till storabokst�ver med tuUpperCase. sedan s�
	 * delar metoden upp gissnigen till chars i en array. sedan kollar den upp
	 * bokstav f�r bokstav om bokstaven �r i ordet. Om bokstaven �r i ordet s�
	 * startaren den metoden checkWhereCharIsInString om bokstaven inte �r i ordet
	 * s� tar den bort ett liv fr�n spelaren och statar metoden checkIfPlayerDead()
	 * sedan n�r allt �r klart s� startr metode graphic.
	 */
	static void guess() {
		System.out.println("Nu �r det dax att gissa p� bokst�ver. Du kan gissa p� hur m�nga bokst�ver du vill.");
		String guess = scan.nextLine();
		guess = guess.toUpperCase();

		char[] charArray = guess.toCharArray();

		for (char i : charArray) {

			if (theSecretWord.indexOf(i) != -1) {
				charInWord = i;
				System.out.println(charInWord + " �r i ordet");
				checkWhereCharIsInString();

			} else {
				System.out.println(i + " �r inte i ordet.");
				playerLife--;
				checkIfPlayerDead();
			}

		}
		graphic();
	}

	/**
	 * h�r s� kollar om spelaren �r d�d, om den �r det s� startar metoden end annar
	 * s� h�nder inget.
	 */
	static void checkIfPlayerDead() {
		if (playerLife == 0) {
			end();
		} else {

		}
	}

	/**
	 * denna metoden kollar vart bokstaven som spelaren gissa p� �r i ordet. Sedan s� l�gges bokstaven i theSecretWordBut_ d�r den ska vara.
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
 * denna metoden ser om det finns n�gra _ i theSecretWordBut_, om det finns n�gra s� g�r den inget. Om det inte finns n�gra understr�ck s� har spelaren klara spelet och starta metoden end
 */
	static void checkIfWordIsDon() {

		if (theSecretWordBut_.indexOf('_') != -1) {

		} else {
			System.out.println("Grattis, du klarade det!!");
			end();
		}

	}
/**
 * denna metoden fr�gar spelaren om spelaren vill spela igen eller inte. 
 * Om spelaren v�ljer att spela igen s� startas metoden choseDeifficulty.
 * Om spelaren inte vill spela igen s� st�ngs spelet ner.
 * anv�der en try-catch s� spelet inte krachar om spelaren skriver in en bokstav. 
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
	 * Denna metod �r en try chatch som har en scanner. om man har skrivit en int s� g�r det inget. 
	 * Om man inte har skrivit en inte s� s�jer den till och f�r f�rs�ka ingen. 
	 * @return int som man har skrivit.
	 */
	public static int IntChecker() {
		while (true) {
			try {
				ItIsInt = scan.nextInt();
				scan.nextLine();
				break;

			} catch (Exception InputMismatchException) {

				System.out.println("Du m�ste skriva in heltal, f�rs�kt ingen!");
				scan.next();
			}
		}
		return ItIsInt;
	}

}
