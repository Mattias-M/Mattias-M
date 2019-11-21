package hemläxa;
import java.util.Scanner;

public class uppgift {
	
	static double g_swe = 9.82;
	static double G = 6.67408*Math.pow(10, -11);
	static double R = 8.3144621;
	static double p_0 = 1000;
	static double c = 299792458;

	public static void main(String[] args) {
		
		System.out.println(fallSpeed(2.5));
		
		System.out.println(fluidPressure(FluidTable.WATER, 10));
		
		System.out.println(pressureUnderWater(10));
		
		System.out.println(kineticEnergy(2,2));
		
		System.out.println(potentialEnergy(2,5));
		
		System.out.println(fallSpeed(2.5));
		
		System.out.println(delta(5,1));

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
	
	public static double pressureUnderWater(double deep) {
		double thePressure1 = FluidTable.WATER.density * g_swe * deep;
		
		return thePressure1;
	}
	
	public static double kineticEnergy(double mass, double velocity) {
		Math math;
		double ek = 0.5 * mass * Math.pow(velocity, 2);
		return ek;
		
	}
	public static double potentialEnergy(double mass, double height) {
		
		double ep = g_swe * mass * height;
		return ep;
		
	}
	
	public static double fallSpeed(double height) {
		
		double hastighet = Math.sqrt(2*g_swe*height);
		return hastighet;
		
	}
	
	public static double delta(double first, double last) {
		double delta = last - first;
		return delta;
	}
	
	
	
}
