package heml�xa;



public class fr�gor {

	public static void main(String[] args) {
	
		System.out.println("60 dm^3 j�rn v�ger " + uppgift.volumeToMassSolid(SolidTable.IRON, 30));
		
		System.out.println("Tomas l�per " + uppgift.svtDistance(2.7, 3000)+"m");
		
		System.out.println("det tar " + uppgift.heatFluid(FluidTable.WATER, 4, FluidTable.WATER.boilPoint ));

	}

}
