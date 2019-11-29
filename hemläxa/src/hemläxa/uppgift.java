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
		
		System.out.println(u7(1, 12 ,0.5));
		
		
		
		/**
		 * r�kna ut  kineticEneregi p� en sten som v�ger 5kg som flyger med en hasstighet p� 50 m/s
		 */
		
		System.out.println( kineticEnergy(5, 50));
		
		/**
		 * R�kna ut fj�rderkonstanten om man har en vikt som v�ger 5kg och fj�rden dras ut med fr�n 5.0 m till 5.5 
		 */
		System.out.println(HookesLag(force(5),delta(5, 5.5)));
		/**
		 * hur snabbt �ker en sten om man sl�pper den vid 50 meters h�jd
		 */
		System.out.println(fallSpeed(50));
		
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
	 * @param height h�jden som den sl�pps fr�n i meter
	 * @return vilken hastighet obejektet har i m/s
	 */
	public static double fallSpeed(double height) {
		
		double hastighet = Math.sqrt(2*g_swe*height);
		return hastighet;
		
	}
	/**
	 * r�knar ut deltan(skillnaden) p� tv� tal
	 * @param first f�rsta talet
	 * @param last andra talet
	 * @return
	 */
	public static double delta(double first, double last) {
		double delta = last - first;
		return delta;
	}
	/**
	 * volymen till vikt
	 * @param fluid h�mtar densitet p� n�got flytande �mne.
	 * @param volume volumen p� �mnet.
	 * @return massan p� �mnet
	 */
	public static double volumeToMass(FluidTable fluid, double volume) {
		double mass = fluid.density * volume;
		return mass;
	}
	/**
	 * volymen till vikt
	 * @param gas h�mtar densitet p� n�got �mne i gasform
	 * @param volume volumen p� �mnet.
	 * @return massan p� �mnet
	 */
	public static double volumeToMassGas (GasTable gas, double volume) {
		double mass = gas.density * volume;
		return mass;
	}
	/**
	 * volymen till vikt
	 * @param solid h�mtar densitet p� n�got �mne i fastform
	 * @param volume volumen p� �mnet
	 * @return massan p� �mnet
	 */
	public static double volumeToMassSolid (SolidTable solid, double volume) {
		double mass = solid.density * volume;
		return mass;
	}
	/**
	 * r�knar ut hastigheten
	 * @param distance l�gnden i m
	 * @param time tiden i sekunder
	 * @return hastigheten i m/s
	 */
	public static double svtVelocity(double distance, double time) {
		return distance/time;
	}
	/**
	 * r�knar ut l�gnden
	 * @param velocity hastighet i m/s
	 * @param time tiden i s
	 * @return l�gnd i m
	 */
	public static double svtDistance(double velocity, double time) {
		return velocity * time;
	}
	/**
	 *  r�knar ut tiden 
	 * @param distance l�gnden i m
	 * @param velocity hastighet i m/S
	 * @return tiden i m/s
	 */
	public static double svtTime(double distance, double velocity) {
		return distance/velocity;
	}
	/**
	 * r�knar ut arbete
	 * @param force kraften som obijektet ufs�ttsf�r 
	 * @param distance l�ngden i m
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
	 * En metod f�r att r�kna fram hur mycket energi beh�vs f�r att v�rma ett visst material till angivet antal grader.
	 * @param solid matiralet som ska v�rmas upp.
	 * @param mass massan p� matiralet
	 * @param deltaT tiden som man v�rmer upp
	 * @return
	 */
	public static double heatSolid(SolidTable solid, double mass, double deltaT) {
		return solid.heatCapacity * mass * deltaT;
	}
	/**
	 * En metod f�r att r�kna fram hur mycket energi beh�vs f�r att v�rma ett visst material till angivet antal grader.
	 * @param solid matiralet som ska v�rmas upp.
	 * @param mass massan p� matiralet
	 * @param deltaT tiden som man v�rmer upp
	 * @return
	 */
	public static double heatFluid(FluidTable fluid, double mass, double deltaT) {
		double heat = fluid.heatCapacity * mass * deltaT;
		return heat;
	}
	/**
	 * En metod f�r att r�kna fram hur mycket energi beh�vs f�r att v�rma ett visst material till angivet antal grader.
	 * @param solid matiralet som ska v�rmas upp.
	 * @param mass massan p� matiralet
	 * @param deltaT tiden som man v�rmer upp
	 * @return
	 */
	public static double heatGas(GasTable gas, double mass, double deltaT) {
		return gas.heatCapacity * mass * deltaT;
	}
	
	/**
	 * r�knar ut hastighet till h�jd n�r man kasar upp�t p� planeten jorden
	 * @param velocity hastigheten
	 * @returnh�jden
	 */
	public static double velocityToHeight(double velocity) {
		return Math.pow(velocity, 2)/ (2*g_swe);
	}
	/**
	 * r�knar ut fj�rderkonstanten
	 * @param Kraft kraften man l�gger p� fj�rden
	 * @param deltaL l�gden fj�rden dras ut
	 * @return
	 */
	public static double HookesLag (double Kraft, double deltaL) {
		return Kraft*deltaL;
	}
	
	/**
	 * r�knar ut kraften
	 * @param mass massan
	 * @return kraft
	 */
	public static double force (double mass) {
		return mass*g_swe;
	}
	/**
	 * metoden till uppgift 7
	 * @param mass massan p� studsbollen
	 * @param h h�jden den sl�pps fr�n
	 * @param mH l�gsta h�jden
	 * @return hur m�nga g�nger den stutsar
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
