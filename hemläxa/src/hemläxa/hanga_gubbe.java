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
		System.out.println("Hej, och välkomen till hänga gubbespelet.");
		System.out.println("I Detta spelet ska du gissa vilka bokstäver ditt finn i ett ord.");
		System.out.println("Om ordet är HEJ så kommer det stå _ _ _. Om du giisar på H så kommer det ädras till H _ _");
		choseDeifficulty();
	}

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
		System.out.println("Nu är det dax att gissa på bokstäver. Du kan gissa på hur många bokstäver du vill.");
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

                System.out.println("Du måste skriva in heltal, försökt ingen!");
                scan.next();
            }
        }
        return ItIsInt;
	}

}
