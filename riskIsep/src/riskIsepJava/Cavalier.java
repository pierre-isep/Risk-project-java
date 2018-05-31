package riskIsepJava;

public class Cavalier extends Unites{
	
	public static int coutUnite = 3;
	public static int puissanceUniteMin = 2;
	public static int puissanceUniteMax = 7;
	public static int prioAttUnite = 1;
	public static int prioDefUnite = 3;
	public static int mvtTourUnite = 3;

	public Cavalier(int idUnite, int coutUnite, int puissanceUniteMin, int puissanceUniteMax, int prioAttUnite, int prioDefUnite,
			int mvtTourUnite, int endroitUnite, int mvtRestantUnite) {
		super(idUnite, coutUnite, puissanceUniteMin, puissanceUniteMax, prioAttUnite, prioDefUnite, mvtTourUnite, endroitUnite, mvtRestantUnite);
	}


}
