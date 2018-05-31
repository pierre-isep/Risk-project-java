package riskIsepJava;

public class Territoire {
	 private int idTerritoire;
	 private String nomTerritoire;
	 private int regionTerritoire;
	 private int adjacentsTerritoire[];
	 private int limitesTerritoire[];
	
	 public Territoire(int idTerritoire, String nomTerritoire, int regionTerritoire, int[] adjacentsTerritoire,
			int[] limitesTerritoire) {
		super();
		this.idTerritoire = idTerritoire;
		this.nomTerritoire = nomTerritoire;
		this.regionTerritoire = regionTerritoire;
		this.adjacentsTerritoire = adjacentsTerritoire;
		this.limitesTerritoire = limitesTerritoire;
	}

	public int getIdTerritoire() {
		return idTerritoire;
	}

	public String getNomTerritoire() {
		return nomTerritoire;
	}

	public int getRegionTerritoire() {
		return regionTerritoire;
	}

	public int[] getAdjacentsTerritoire() {
		return adjacentsTerritoire;
	}

	public int[] getLimitesTerritoire() {
		return limitesTerritoire;
	}
	 
	 
	 
	 
	  

}
