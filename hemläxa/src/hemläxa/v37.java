package heml�xa;

import java.util.Scanner;

public class v37 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("vad �r ditt namn?");
		String namn = scan.next();
	
		
		System.out.print("Hur gammal �r du?");
		int �lder = scan.nextInt();
		
		System.out.println("Vad �r din adress?");
		String adress = scan.next();
		
		System.out.println("Vad �r ditt postnumer?");
		String postnummer = scan.next();
		
		System.out.println("Vilken stad kommer du i fr�n?");
		String stad = scan.next();
		
		System.out.println("Telefonnummer?");
		String tel = scan.next();
		
		System.out.println("Tack " + namn + " Du �r " + �lder + " och bor i " + adress + ". Ditt postnummer �r " + postnummer + ".");
		System.out.println("Du kommer fr�n " + stad + " och ditt telefonnummer �r " + tel);
		
		
		
		
		
	}

}
