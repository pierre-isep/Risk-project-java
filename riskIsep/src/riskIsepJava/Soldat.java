package riskIsepJava;

public class Soldat extends Unites {
	
	public static int coutUnite = 1;
	public static int puissanceUniteMin = 1;
	public static int puissanceUniteMax = 6;
	public static int prioAttUnite = 2;
	public static int prioDefUnite = 1;
	public static int mvtTourUnite = 2;

	public Soldat(int idUnite, int coutUnite, int puissanceUniteMin, int puissanceUniteMax, int prioAttUnite, int prioDefUnite,
			int mvtTourUnite, int endroitUnite, int mvtRestantUnite) {
		super(idUnite, coutUnite, puissanceUniteMin, puissanceUniteMax, prioAttUnite, prioDefUnite, mvtTourUnite, endroitUnite, mvtRestantUnite);

	}

}
