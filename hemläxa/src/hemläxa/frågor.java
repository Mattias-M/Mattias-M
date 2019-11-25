package hemläxa;



public class frågor {

	public static void main(String[] args) {
	
		System.out.println("60 dm^3 järn väger " + uppgift.volumeToMassSolid(SolidTable.IRON, 30));
		
		System.out.println("Tomas löper " + uppgift.svtDistance(2.7, 3000)+"m");
		
		System.out.println("det tar " + uppgift.heatFluid(FluidTable.WATER, 4, FluidTable.WATER.boilPoint ));

	}

}
