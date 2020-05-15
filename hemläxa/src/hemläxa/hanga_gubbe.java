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
	static String guess;
	static String theSecretWord;
	static boolean done;
	static String the_word;
	public static String[] easyWords = { "HEJ", "TJO", "JAVA" };
	public static String[] hardWords = { "HEJSAN", "PROGRAMERA", "BANAN" };
	public static char[] charArray = {};
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

	/**
	 * Scanner scanList = new Scanner(new
	 * File("C:\Users\mattias.martensson\Desktop\Mattias-M\ord.txt"));
	 * ArrayList<String> list = new ArrayList<String>(); while(scanList.hasNext()) {
	 * list.add(scanList.next()); }
	 * 
	 * scanList.close(); System.out.println(list); }
	 */

	static void randomizer() {
		Random random = new Random();

		if (difficulty == 1) {
			theSecretWord = easyWords[random.nextInt(easyWords.length)];
		} else {
			theSecretWord = hardWords[random.nextInt(hardWords.length)];
		}
		
		theGame();
		
	}
	
	static void theGame() {
		done = false;
		playerLife = 9;
		//while(done=true) {
			graphic();
			guess();
			//checkIfRigtOrWrong();
			checkIfPlayerDead();
			checkIfWordIsDon();
		//}
		end();
	}
	
	static void graphic() {
		the_word = new String(new char[theSecretWord.length()]).replace("\0", "_");
		for (char ch : the_word.toCharArray()) {
			System.out.print(ch);
			System.out.print(" ");
		}
		System.out.println(the_word);
		System.out.println("du har " + playerLife + "liv kvar.");
		
		
	}
	

	
	static void guess() {
		System.out.println("Nu �r det dax att gissa p� bokst�ver. Du kan gissa p� hur m�nga bokst�ver du vill.");
		String guess = scan.nextLine();
		guess = guess.toUpperCase();
		
		char[] charArray = guess.toCharArray();
	
	
	//static void checkIfRigtOrWrong() {
		
		for (char i :charArray ) {
			
			if(theSecretWord.indexOf(i)!=-1) {
				System.out.println("ja");
				
			}
			else {
				System.out.println("nej");
				playerLife --;
				checkIfPlayerDead();
			}
			
		}
	}
	
	static void checkIfPlayerDead() {
		if(playerLife == 0) {
			end();
		}
		else {
			
		}
	}
	
	static void checkIfWordIsDon() {
		
	}
	static void end() {
		
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
