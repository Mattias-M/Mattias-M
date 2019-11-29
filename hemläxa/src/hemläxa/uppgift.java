package hemläxa;
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
		
		System.out.println(u7(1, 12 ,0.5));
		
		
		
		/**
		 * räkna ut  kineticEneregi på en sten som väger 5kg som flyger med en hasstighet på 50 m/s
		 */
		
		System.out.println( kineticEnergy(5, 50));
		
		/**
		 * Räkna ut fjärderkonstanten om man har en vikt som väger 5kg och fjärden dras ut med från 5.0 m till 5.5 
		 */
		System.out.println(HookesLag(force(5),delta(5, 5.5)));
		/**
		 * hur snabbt åker en sten om man släpper den vid 50 meters höjd
		 */
		System.out.println(fallSpeed(50));
		
	}
	/**
	 * gör fahrenheit till Celsius
	 * @param fahrenheit värdet för tempraturen i fahrenheit
	 * @return sickar tillbaka tempraturen i celsius
	 */
	public static double fahrenheitToCelsius(double fahrenheit) {

		double celsius = ((fahrenheit - 32)*5)/9;
		
		return celsius;
	}
	/**
	 * ändrar tempratur från kelvin till celsius
	 * @param kelvin värdet i tempraturen i kelvin.
	 * @return
	 */
	public static double kelvinToCelsius(double kelvin) {
		double celsius = (kelvin - 273.15);
		
		return celsius;
	}
	/**
	 * räknar ut trycket under flytande ämne.
	 * @param fluid vilken vätska
	 * @param deep hur långt ner i vätska.
	 * @return trycket
	 */
	public static double fluidPressure(FluidTable fluid, double deep) {

		double thePressure = 0;
		thePressure = fluid.density*g_swe*deep;
		
		return thePressure;
		
	}
	/**
	 * räknar ut trycket under vatten vid en viss djup.
	 * @param deep djupet under vattnet
	 * @return trycket
	 */
	public static double pressureUnderWater(double deep) {
		double thePressure1 = FluidTable.WATER.density * g_swe * deep;
		
		return thePressure1;
	}
	/**
	 *räknar ut kinetiskenergi  
	 * @param mass massan på obejektet
	 * @param velocity hasstigeheten
	 * @return kinetiscenegin.
	 */
	public static double kineticEnergy(double mass, double velocity) {
		double KE = 0.5 * mass * Math.pow(velocity, 2);
		return KE;
		
	}
	/**
	 * räknar ut potensielenergi
	 * @param mass massa på obejektet
	 * @param height höjden 
	 * @return potensielenegi
	 */
	public static double potentialEnergy(double mass, double height) {
		
		double ep = g_swe * mass * height;
		return ep;
		
	}
	/**
	 * räknar ut hastigheten på obejekt när man släppps i fritt fall
	 * @param height höjden som den släpps från i meter
	 * @return vilken hastighet obejektet har i m/s
	 */
	public static double fallSpeed(double height) {
		
		double hastighet = Math.sqrt(2*g_swe*height);
		return hastighet;
		
	}
	/**
	 * räknar ut deltan(skillnaden) på två tal
	 * @param first första talet
	 * @param last andra talet
	 * @return
	 */
	public static double delta(double first, double last) {
		double delta = last - first;
		return delta;
	}
	/**
	 * volymen till vikt
	 * @param fluid hämtar densitet på något flytande ämne.
	 * @param volume volumen på ämnet.
	 * @return massan på ämnet
	 */
	public static double volumeToMass(FluidTable fluid, double volume) {
		double mass = fluid.density * volume;
		return mass;
	}
	/**
	 * volymen till vikt
	 * @param gas hämtar densitet på något ämne i gasform
	 * @param volume volumen på ämnet.
	 * @return massan på ämnet
	 */
	public static double volumeToMassGas (GasTable gas, double volume) {
		double mass = gas.density * volume;
		return mass;
	}
	/**
	 * volymen till vikt
	 * @param solid hämtar densitet på något ämne i fastform
	 * @param volume volumen på ämnet
	 * @return massan på ämnet
	 */
	public static double volumeToMassSolid (SolidTable solid, double volume) {
		double mass = solid.density * volume;
		return mass;
	}
	/**
	 * räknar ut hastigheten
	 * @param distance lägnden i m
	 * @param time tiden i sekunder
	 * @return hastigheten i m/s
	 */
	public static double svtVelocity(double distance, double time) {
		return distance/time;
	}
	/**
	 * räknar ut lägnden
	 * @param velocity hastighet i m/s
	 * @param time tiden i s
	 * @return lägnd i m
	 */
	public static double svtDistance(double velocity, double time) {
		return velocity * time;
	}
	/**
	 *  räknar ut tiden 
	 * @param distance lägnden i m
	 * @param velocity hastighet i m/S
	 * @return tiden i m/s
	 */
	public static double svtTime(double distance, double velocity) {
		return distance/velocity;
	}
	/**
	 * räknar ut arbete
	 * @param force kraften som obijektet ufsättsför 
	 * @param distance längden i m
	 * @return arbete i nm
	 */
	public static double work(double force, double distance) {
		return distance * force;
	}
	/**
	 * 
	 * @param work
	 * @param time
	 * @return
	 */
	public static double power(double work, double time) {
		return work/time;
	}
	/**
	 * En metod för att räkna fram hur mycket energi behövs för att värma ett visst material till angivet antal grader.
	 * @param solid matiralet som ska värmas upp.
	 * @param mass massan på matiralet
	 * @param deltaT tiden som man värmer upp
	 * @return
	 */
	public static double heatSolid(SolidTable solid, double mass, double deltaT) {
		return solid.heatCapacity * mass * deltaT;
	}
	/**
	 * En metod för att räkna fram hur mycket energi behövs för att värma ett visst material till angivet antal grader.
	 * @param solid matiralet som ska värmas upp.
	 * @param mass massan på matiralet
	 * @param deltaT tiden som man värmer upp
	 * @return
	 */
	public static double heatFluid(FluidTable fluid, double mass, double deltaT) {
		double heat = fluid.heatCapacity * mass * deltaT;
		return heat;
	}
	/**
	 * En metod för att räkna fram hur mycket energi behövs för att värma ett visst material till angivet antal grader.
	 * @param solid matiralet som ska värmas upp.
	 * @param mass massan på matiralet
	 * @param deltaT tiden som man värmer upp
	 * @return
	 */
	public static double heatGas(GasTable gas, double mass, double deltaT) {
		return gas.heatCapacity * mass * deltaT;
	}
	
	/**
	 * räknar ut hastighet till höjd när man kasar uppåt på planeten jorden
	 * @param velocity hastigheten
	 * @returnhöjden
	 */
	public static double velocityToHeight(double velocity) {
		return Math.pow(velocity, 2)/ (2*g_swe);
	}
	/**
	 * räknar ut fjärderkonstanten
	 * @param Kraft kraften man lägger på fjärden
	 * @param deltaL lägden fjärden dras ut
	 * @return
	 */
	public static double HookesLag (double Kraft, double deltaL) {
		return Kraft*deltaL;
	}
	
	/**
	 * räknar ut kraften
	 * @param mass massan
	 * @return kraft
	 */
	public static double force (double mass) {
		return mass*g_swe;
	}
	/**
	 * metoden till uppgift 7
	 * @param mass massan på studsbollen
	 * @param h höjden den släpps från
	 * @param mH lägsta höjden
	 * @return hur många gånger den stutsar
	 */
	public static int u7 (double mass, double h,double mH){
		int studs = 0;
		
		
		
		while ( h > mH) {
		
		double E = mass* g_swe*h;
		E = E * 0.99;
		h = E/(mass * g_swe);
		studs++;
		
	}
return studs;
	}
	
}
