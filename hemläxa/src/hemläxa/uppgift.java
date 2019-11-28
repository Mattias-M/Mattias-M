package heml�xa;
import java.util.Scanner;

public class uppgift {
	
	static double g_swe = 9.82;
	static double G = 6.67408*Math.pow(10, -11);
	static double R = 8.3144621;
	static double p_0 = 1000;
	static double c = 299792458;

	public static void main(String[] args) {
		
		System.out.println(volumeToMassSolid(SolidTable.IRON, 0.06));
		
		System.out.println(svtDistance(2.7, 3000));
		
		System.out.println(heatFluid(FluidTable.WATER, 4, FluidTable.WATER.boilPoint));

		System.out.println(pressureUnderWater(75));
		
		System.out.println(velocityToHeight(16.667));
		
		System.out.println(power(work(force(735),(100/3.6 * 4.8)),4.8));
		
		
	}
	/**
	 * g�r fahrenheit till Celsius
	 * @param fahrenheit v�rdet f�r tempraturen i fahrenheit
	 * @return sickar tillbaka tempraturen i celsius
	 */
	public static double fahrenheitToCelsius(double fahrenheit) {

		double celsius = ((fahrenheit - 32)*5)/9;
		
		return celsius;
	}
	/**
	 * �ndrar tempratur fr�n kelvin till celsius
	 * @param kelvin v�rdet i tempraturen i kelvin.
	 * @return
	 */
	public static double kelvinToCelsius(double kelvin) {
		double celsius = (kelvin - 273.15);
		
		return celsius;
	}
	/**
	 * r�knar ut trycket under flytande �mne.
	 * @param fluid vilken v�tska
	 * @param deep hur l�ngt ner i v�tska.
	 * @return trycket
	 */
	public static double fluidPressure(FluidTable fluid, double deep) {

		double thePressure = 0;
		thePressure = fluid.density*g_swe*deep;
		
		return thePressure;
		
	}
	/**
	 * r�knar ut trycket under vatten vid en viss djup.
	 * @param deep djupet under vattnet
	 * @return trycket
	 */
	public static double pressureUnderWater(double deep) {
		double thePressure1 = FluidTable.WATER.density * g_swe * deep;
		
		return thePressure1;
	}
	/**
	 *r�knar ut kinetiskenergi  
	 * @param mass massan p� obejektet
	 * @param velocity hasstigeheten
	 * @return kinetiscenegin.
	 */
	public static double kineticEnergy(double mass, double velocity) {
		double KE = 0.5 * mass * Math.pow(velocity, 2);
		return KE;
		
	}
	/**
	 * r�knar ut potensielenergi
	 * @param mass massa p� obejektet
	 * @param height h�jden 
	 * @return potensielenegi
	 */
	public static double potentialEnergy(double mass, double height) {
		
		double ep = g_swe * mass * height;
		return ep;
		
	}
	/**
	 * r�knar ut hastigheten p� obejekt n�r man sl�ppps i fritt fall
	 * @param height h�jden som den sl�pps fr�n.
	 * @return
	 */
	public static double fallSpeed(double height) {
		
		double hastighet = Math.sqrt(2*g_swe*height);
		return hastighet;
		
	}
	
	public static double delta(double first, double last) {
		double delta = last - first;
		return delta;
	}
	
	public static double volumeToMass(FluidTable fluid, double volume) {
		double mass = fluid.density * volume;
		return mass;
	}
	
	public static double volumeToMassGas (GasTable gas, double volume) {
		double mass = gas.density * volume;
		return mass;
	}
	public static double volumeToMassSolid (SolidTable solid, double volume) {
		double mass = solid.density * volume;
		return mass;
	}
	
	public static double svtVelocity(double distance, double time) {
		return distance/time;
	}
	
	public static double svtDistance(double velocity, double time) {
		return velocity * time;
	}
	
	public static double svtTime(double distance, double velocity) {
		return distance/velocity;
	}
	public static double work(double force, double distance) {
		return distance * force;
	}
	
	public static double power(double work, double time) {
		return work/time;
	}
	
	public static double heatSolid(SolidTable solid, double mass, double deltaT) {
		return solid.heatCapacity * mass * deltaT;
	}
	
	public static double heatFluid(FluidTable fluid, double mass, double deltaT) {
		double heat = fluid.heatCapacity * mass * deltaT;
		return heat;
	}
	
	public static double heatGas(GasTable gas, double mass, double deltaT) {
		return gas.heatCapacity * mass * deltaT;
	}
	
	public static double velocityToHeight(double velocity) {
		return Math.pow(velocity, 2)/ (2*g_swe);
	}
	
	public static double HookesLag (double k, double deltaL) {
		return k*deltaL;
	}
	
	public static double ljudintensitenten (double effekt, double area) {
		return effekt/area;
	}
	
	public static double force (double mass) {
		return mass*g_swe;
	}

	
}
