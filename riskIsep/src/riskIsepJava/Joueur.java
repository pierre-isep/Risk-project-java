package riskIsepJava;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Joueur {
	private int numJoueur;
	private ArrayList armeeJoueur;
	private ArrayList territoiresControlesJoueur;
	private int nbTerritoiresCapturesJoueurs;
	
	
	public Joueur(int numJoueur, ArrayList armeeJoueur, ArrayList territoiresControlesJoueur, int nbTerritoiresCapturesJoueurs) {
		super();
		this.numJoueur = numJoueur;
		this.armeeJoueur = armeeJoueur;
		this.territoiresControlesJoueur = territoiresControlesJoueur;
		this.nbTerritoiresCapturesJoueurs = nbTerritoiresCapturesJoueurs;
	}


	public int getNbTerritoiresCapturesJoueurs() {
		return nbTerritoiresCapturesJoueurs;
	}


	public void setNbTerritoiresCapturesJoueurs(int nbTerritoiresCapturesJoueurs) {
		this.nbTerritoiresCapturesJoueurs = nbTerritoiresCapturesJoueurs;
	}


	public int getNumJoueur() {
		return numJoueur;
	}


	public void setNumJoueur(int numJoueur) {
		this.numJoueur = numJoueur;
	}





	public ArrayList getArmeeJoueur() {
		return armeeJoueur;
	}


	public void setArmeeJoueur(ArrayList armeeJoueur) {
		this.armeeJoueur = armeeJoueur;
	}


	public ArrayList getTerritoiresControlesJoueur() {
		return territoiresControlesJoueur;
	}


	public void setTerritoiresControlesJoueur(ArrayList territoiresControlesJoueur) {
		this.territoiresControlesJoueur = territoiresControlesJoueur;
	}
	
	public static void calculRenforts (Joueur J) {
		//Renforts
		//controle de territores
			int nbTerritoiresJ = J.getTerritoiresControlesJoueur().size();
			J.setNbTerritoiresCapturesJoueurs(5);
			int renfortCapture = 0;
			int renfortRegion = 0;
			
			//Renforts lies au nombre de territoires captures au tour precedent
			for (int i=0; i<J.getNbTerritoiresCapturesJoueurs(); i++) {
				int numAleatoire = ThreadLocalRandom.current().nextInt(0,2);
				if (numAleatoire==1) {
					renfortCapture += 1;
				}
			}
			
			//Renforts lies au controle d'une region
			//Amerique du nord
			int compteurTerritoiresR1 = 0;
			for (int k=1; k<=9; k++) {
				if(J.getTerritoiresControlesJoueur().contains(k)==true) {
					compteurTerritoiresR1 +=1;
				}	
			}
			
			if (compteurTerritoiresR1==9) {
				System.out.println("J" + J.getNumJoueur() + " possede l'Amerique du Nord");
				renfortRegion +=4;
			}
			
			//Amerique du sud
			int compteurTerritoiresR2 = 0;
			for (int k=10; k<=13; k++) {
				if(J.getTerritoiresControlesJoueur().contains(k)==true) {
					compteurTerritoiresR2 +=1;
				}		
			}
			
			if (compteurTerritoiresR2==4) {
				System.out.println("J" + J.getNumJoueur() + " possede l'Amerique du Sud");
				renfortRegion +=2;
			}
			
			
			//Europe
			int compteurTerritoiresR3 = 0;
			for (int k=14; k<=20; k++) {
				if(J.getTerritoiresControlesJoueur().contains(k)==true) {
					compteurTerritoiresR3 +=1;
				}		
			}
			if (compteurTerritoiresR3==7) {
				System.out.println("J" + J.getNumJoueur() + " possede l'Europe");
				renfortRegion +=3;
			}
			
			//Afrique
			int compteurTerritoiresR4 = 0;
			for (int k=21; k<=26; k++) {
				if(J.getTerritoiresControlesJoueur().contains(k)==true) {
					compteurTerritoiresR4 +=1;
				}		
			}
			if (compteurTerritoiresR4==6) {
				System.out.println("J" + J.getNumJoueur() + " possede l'Afrique");
				renfortRegion +=3;
			}
			
			//Asie
			int compteurTerritoiresR5 = 0;
			for (int k=27; k<=38; k++) {
				if(J.getTerritoiresControlesJoueur().contains(k)==true) {
					compteurTerritoiresR5 +=1;
				}		
			}
			if (compteurTerritoiresR5==12) {
				System.out.println("J" + J.getNumJoueur() + " possede l'Asie");
				renfortRegion +=6;
			}
			
			//Oceanie
			int compteurTerritoiresR6 = 0;
			for (int k=39; k<=42; k++) {
				if(J.getTerritoiresControlesJoueur().contains(k)==true) {
					compteurTerritoiresR6 +=1;
				}		
			}
			if (compteurTerritoiresR6==4) {
				System.out.println("J" + J.getNumJoueur() + " possede l'Oceanie");
				renfortRegion +=2;
			}
			
			
			System.out.println(nbTerritoiresJ/3); //Nombre de territoires que possede le joueur
			System.out.println(renfortRegion); //Renforts lies au controle d'une region
			System.out.println(renfortCapture); //Renforts lies au nombre de territoires captures au tour precedent
			int renfortJ = (nbTerritoiresJ/3) + renfortCapture + renfortRegion; //Renforts
			System.out.println(renfortJ);
		
	}
	
	
	
	public static void deplacer () {
		
	}
	
	
	

}
