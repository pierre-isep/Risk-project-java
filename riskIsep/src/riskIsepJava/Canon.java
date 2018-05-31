package riskIsepJava;

public class Canon extends Unites {
	
	public static int coutUnite = 7;
	public static int puissanceUniteMin = 4;
	public static int puissanceUniteMax = 9;
	public static int prioAttUnite = 3;
	public static int prioDefUnite = 2;
	public static int mvtTourUnite = 1;

	public Canon(int idUnite, int coutUnite, int puissanceUniteMin, int puissanceUniteMax, int prioAttUnite, int prioDefUnite, int mvtTourUnite,
			int endroitUnite, int mvtRestantUnite) {
		super(idUnite, coutUnite, puissanceUniteMin, puissanceUniteMax, prioAttUnite, prioDefUnite, mvtTourUnite, endroitUnite, mvtRestantUnite);

	}

}
