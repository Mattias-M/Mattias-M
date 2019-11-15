package hemläxa;
import java.util.Scanner;

public class uppgift {
	
	static double g_swe = 9.82;

	public static void main(String[] args) {
		
		
		System.out.println(fluidPressure(FluidTable.WATER, 10));
		

	}

	public static double fahrenheitToCelsius(double fahrenheit) {
		double celsius = ((fahrenheit - 32)*5)/9;
		
		return celsius;
	}
	public static double kelvinToCelsius(double kelvin) {
		double celsius = (kelvin - 273.15);
		
		return celsius;
	}
	
	public static double fluidPressure(FluidTable fluid, double deep) {
		double thePressure = 0;
		thePressure = fluid.density*g_swe*deep;
		
		return thePressure;
	}
}
