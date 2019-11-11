package hemläxa;
import java.util.Scanner;

public class uppgift {

	public static void main(String[] args) {
		
		System.out.println(fahrenheitToCelsius(50.0));

	}

	public static double fahrenheitToCelsius(double fahrenheit) {
		double celsius = ((fahrenheit - 32)*5)/9;
		
		return celsius;
	}
	public static double kelvinToCelsius(double kelvin) {
		double celsius = (kelvin - 273.15);
		
		return celsius;
	}
	
	
}
