package heml�xa;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class hanga_gubbe {

	static Scanner scan = new Scanner(System.in);
	static int difficulty;
	static String theSecretWord;
	static boolean done;
	public static String[] easyWords = { "HEJ", "TJO", "JAVA" };
	public static String[] hardWords = { "HEJSAN", "PROGRAMERA" };

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
		int hardOrEasy = scan.nextInt();
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

	}
	
	static void theGame() {
		done = false;
		while(done=false) {
			graphic();
			guess();
			checkIfRigtOrWrong();
			checkIfPlayerDead();
			checkIfWordIsDon();
		}
		end();
	}
	
	static void graphic() {
		
	}
	
	static void guess() {
		
	}
	
	static void checkIfRigtOrWrong() {
		
	}
	
	static void checkIfPlayerDead() {
		
	}
	
	static void checkIfWordIsDon() {
		
	}
	static void end() {
		
	}

}
