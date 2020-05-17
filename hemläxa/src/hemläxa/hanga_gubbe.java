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
	public static String[] easyWords = {"JAVA", "HEJ", "ARE", "KATT", "MAMMA" };
	public static String[] hardWords = { "HEJSAN", "CITERA", "MYNDIG", "DIAFRAGMA", "REGRESS" };
	public static char[] charArray = {};
	public static ArrayList<Character> theSecretWordBut_ = new ArrayList<Character>();

	public static void main(String[] args) {
		welcome();
	}

	static void welcome() {
		System.out.println("Hej, och v�lkomen till h�nga gubbespelet.");
		System.out.println("I Detta spelet ska du gissa vilka bokst�ver ditt finn i ett ord.");
		System.out.println("Om ordet �r HEJ s� kommer det st� _ _ _. Om du giisar p� H s� kommer det �dras till H _ _");
		choseDeifficulty();
	}

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
		scannerListToArrayList();
	}

	static void scannerListToArrayList() {

		randomizer();

	}


	static void randomizer() {
		Random random = new Random();

		if (difficulty == 1) {
			theSecretWord = easyWords[random.nextInt(easyWords.length)];
		} else {
			theSecretWord = hardWords[random.nextInt(hardWords.length)];
		}

		maketheSecretWordBut_();

	}
	
	static void maketheSecretWordBut_() {
		for (int i= 0; i < theSecretWord.length(); i++) {
			theSecretWordBut_.add('_');
		}
		theGame();
	}

	static void theGame() {
		playerLife = 9;
		
		graphic();
		
	}

	static void graphic() {
	
		
		
		System.out.println(theSecretWordBut_);
		
		System.out.println("du har " + playerLife + " liv kvar.");
		
		guess();

	}

	static void guess() {
		System.out.println("Nu �r det dax att gissa p� bokst�ver. Du kan gissa p� hur m�nga bokst�ver du vill.");
		String guess = scan.nextLine();
		guess = guess.toUpperCase();

		char[] charArray = guess.toCharArray();


		for (char i : charArray) {

			if (theSecretWord.indexOf(i) != -1) {
				charInWord = i;
				System.out.println(charInWord +" �r i ordet");
				checkWhereCharIsInString();

			} else {
				System.out.println(i + " �r inte i ordet.");
				playerLife--;
				checkIfPlayerDead();
			}

		}
		graphic();
	}

	static void checkIfPlayerDead() {
		if (playerLife == 0) {
			end();
		} else {
			
		}
	}

	static void checkWhereCharIsInString() {
		for (int i = 0; i < theSecretWord.length(); i++) {
			
			if(charInWord == theSecretWord.charAt(i)) {
				
				theSecretWordBut_.set(i, charInWord);
								
				System.out.println(theSecretWordBut_);
				
				checkIfWordIsDon();
			}
			
			
			
			
			//charInWord = theSecretWord.charAt(i);
			// se om charInWord = f�rst char i ordet theSecretWord
			// om det �r s� byt ut f�rsta _ i variablen the_word
			// om inte s� se om charInWord = andra char i ordet theSecretWord
			// om det �r s� byt ut andra _ i variablen the_word.
			// h�ller p� s� tills man har kolla igenom alla char i theSecretWord

		}
	}

	static void checkIfWordIsDon() {

		if (theSecretWordBut_.indexOf('_') != -1) {
			
		} else {
			System.out.println("Grattis, du klarade det!!");
			end();
		}

	}

	static void end() {
		System.out.println("vill du spela ingen? skriv 1 annars skriv 2");
		int YesOrNo = IntChecker();
		if(YesOrNo == 1) {
			choseDeifficulty();
		}
		else {
			System.exit(0);
		}

	}

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
