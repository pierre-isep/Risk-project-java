package riskIsepJava;


import java.util.*;


abstract public class Unites {

  private int idUnite;
  private int coutUnite;
  private int puissanceUniteMin;
  private int puissanceUniteMax;
  private int prioAttUnite;
  private int prioDefUnite;
  private int mvtTourUnite;
  private int endroitUnite;
  private int mvtRestantUnite;
  

  public Unites(int idUnite, int coutUnite, int puissanceUniteMin, int puissanceUniteMax, int prioAttUnite, int prioDefUnite, int mvtTourUnite,
	int endroitUnite, int mvtRestantUnite) {
	super();
	this.idUnite = idUnite;
	this.coutUnite = coutUnite;
	this.puissanceUniteMin = puissanceUniteMin;
	this.puissanceUniteMax = puissanceUniteMax;
	this.prioAttUnite = prioAttUnite;
	this.prioDefUnite = prioDefUnite;
	this.mvtTourUnite = mvtTourUnite;
	this.endroitUnite = endroitUnite;
	this.mvtRestantUnite = mvtRestantUnite;
  }
  
  public Unites (int idUnite) {
	  this.idUnite = idUnite;
  }

public int getIdUnite() {
	return idUnite;
}

public int getCoutUnite() {
	return coutUnite;
}

public int getPuissanceUniteMin() {
	return puissanceUniteMin;
}

public int getPuissanceUniteMax() {
	return puissanceUniteMax;
}

public int getPrioAttUnite() {
	return prioAttUnite;
}

public int getPrioDefUnite() {
	return prioDefUnite;
}

public int getMvtTourUnite() {
	return mvtTourUnite;
}

public int getEndroitUnite() {
	return endroitUnite;
}

public void setEndroitUnite(int endroitUnite) {
	this.endroitUnite = endroitUnite;
}

public int getMvtRestantUnite() {
	return mvtRestantUnite;
}

public void setMvtTourUnite(int mvtTourUnite) {
	this.mvtTourUnite = mvtTourUnite;
}


}
