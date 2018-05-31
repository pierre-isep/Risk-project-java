package riskIsepJava;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import edu.princeton.cs.introcs.StdDraw;

public class Partie {
	private int nbJoueurs;

	public Partie(int nbJoueurs) {
		super();
		this.nbJoueurs = nbJoueurs;
	}

	public int getNbJoueurs() {
		return nbJoueurs;
	}

	public void setNbJoueurs(int nbJoueurs) {
		this.nbJoueurs = nbJoueurs;
	}
	
	public static void repartirTerritoires (int nombreJoueurs) {
		int compteur = 1;
		ArrayList repartition = new ArrayList();
		for (int i=1; i<=42; i++) {
			repartition.add(i);
		}
		
		ArrayList J1territoires = new ArrayList();
		ArrayList J1armee = new ArrayList();
		Joueur J1 = new Joueur (1,J1armee,J1territoires,0);
		
		ArrayList J2territoires = new ArrayList();
		ArrayList J2armee = new ArrayList();
		Joueur J2 = new Joueur (2,J2armee,J2territoires,0);
		
		ArrayList J3territoires = new ArrayList();
		ArrayList J3armee = new ArrayList();
		Joueur J3 = new Joueur (3,J3armee,J3territoires,0);
		
		ArrayList J4territoires = new ArrayList();
		ArrayList J4armee = new ArrayList();
		Joueur J4 = new Joueur (4,J4armee,J4territoires,0);
		
		ArrayList J5territoires = new ArrayList();
		ArrayList J5armee = new ArrayList();
		Joueur J5 = new Joueur (5,J5armee,J5territoires,0);
		
		ArrayList J6territoires = new ArrayList();
		ArrayList J6armee = new ArrayList();
		Joueur J6 = new Joueur (6,J6armee,J6territoires,0);
		
		switch (nombreJoueurs) {
		case 2 :
			for (int k =1; k<=42; k++) {
				int numAleatoire = ThreadLocalRandom.current().nextInt(0,repartition.size());
				if (compteur%2==1) {
					J1territoires.add(repartition.get(numAleatoire));
				}
				else {
					J2territoires.add(repartition.get(numAleatoire));
				}
				repartition.remove(numAleatoire);
				System.out.println(numAleatoire + "    " + repartition);
				System.out.println("J1territoires" + J1territoires);
				System.out.println("J2territoires" + J2territoires);
				compteur ++;
			}
			break;
		case 3 :
			for (int k =1; k<=42; k++) {
				int numAleatoire = ThreadLocalRandom.current().nextInt(0,repartition.size());
				if (compteur==1) {
					J1territoires.add(repartition.get(numAleatoire));
					compteur++;
				}
				else if (compteur==2) {
					J2territoires.add(repartition.get(numAleatoire));
					compteur++;
				}
				else {
					J3territoires.add(repartition.get(numAleatoire));
					compteur=1;
				}
				repartition.remove(numAleatoire);
				System.out.println(numAleatoire + "    " + repartition);
				System.out.println("J1territoires" + J1territoires);
				System.out.println("J2territoires" + J2territoires);
				System.out.println("J3territoires" + J3territoires);
			}
			break;
		
		case 4 :
			for (int k =1; k<=42; k++) {
				int numAleatoire = ThreadLocalRandom.current().nextInt(0,repartition.size());
				if (compteur==1) {
					J1territoires.add(repartition.get(numAleatoire));
					compteur++;
				}
				else if (compteur==2) {
					J2territoires.add(repartition.get(numAleatoire));
					compteur++;
				}
				else if (compteur==3) {
					J3territoires.add(repartition.get(numAleatoire));
					compteur++;
				}
				else {
					J4territoires.add(repartition.get(numAleatoire));
					compteur=1;
				}
				repartition.remove(numAleatoire);
				System.out.println(numAleatoire + "    " + repartition);
				System.out.println("J1territoires" + J1territoires);
				System.out.println("J2territoires" + J2territoires);
				System.out.println("J3territoires" + J3territoires);
				System.out.println("J4territoires" + J4territoires);
			}
			break;
		
		case 5 :
			for (int k =1; k<=42; k++) {
				int numAleatoire = ThreadLocalRandom.current().nextInt(0,repartition.size());
				if (compteur==1) {
					J1territoires.add(repartition.get(numAleatoire));
					compteur++;
				}
				else if (compteur==2) {
					J2territoires.add(repartition.get(numAleatoire));
					compteur++;
				}
				else if (compteur==3) {
					J3territoires.add(repartition.get(numAleatoire));
					compteur++;
				}
				else if (compteur==4) {
					J4territoires.add(repartition.get(numAleatoire));
					compteur++;
				}
				else {
					J5territoires.add(repartition.get(numAleatoire));
					compteur=1;
				}
				repartition.remove(numAleatoire);
				System.out.println(numAleatoire + "    " + repartition);
				System.out.println("J1territoires" + J1territoires);
				System.out.println("J2territoires" + J2territoires);
				System.out.println("J3territoires" + J3territoires);
				System.out.println("J4territoires" + J4territoires);
				System.out.println("J5territoires" + J5territoires);
			}
			break;
		
		case 6 :
			for (int k =1; k<=42; k++) {
				int numAleatoire = ThreadLocalRandom.current().nextInt(0,repartition.size());
				if (compteur==1) {
					J1territoires.add(repartition.get(numAleatoire));
					compteur++;
				}
				else if (compteur==2) {
					J2territoires.add(repartition.get(numAleatoire));
					compteur++;
				}
				else if (compteur==3) {
					J3territoires.add(repartition.get(numAleatoire));
					compteur++;
				}
				else if (compteur==4) {
					J4territoires.add(repartition.get(numAleatoire));
					compteur++;
				}
				else if (compteur==5) {
					J5territoires.add(repartition.get(numAleatoire));
					compteur++;
				}
				else {
					J6territoires.add(repartition.get(numAleatoire));
					compteur=1;
				}
				repartition.remove(numAleatoire);
				System.out.println(numAleatoire + "    " + repartition);
				System.out.println("J1territoires" + J1territoires);
				System.out.println("J2territoires" + J2territoires);
				System.out.println("J3territoires" + J3territoires);
				System.out.println("J4territoires" + J4territoires);
				System.out.println("J5territoires" + J5territoires);
				System.out.println("J6territoires" + J6territoires);
			}
			break;
			
		default :
			System.out.println("Erreur");
			break;
	
	}
		
		System.out.println("Au final on a :");
		System.out.println(J1.getTerritoiresControlesJoueur());
		System.out.println(J2.getTerritoiresControlesJoueur());
		if(nombreJoueurs>=3) {
			System.out.println(J3.getTerritoiresControlesJoueur());
		}
		if(nombreJoueurs>=4) {
			System.out.println(J4.getTerritoiresControlesJoueur());
		}
		if(nombreJoueurs>=5) {
			System.out.println(J5.getTerritoiresControlesJoueur());
		}
		if(nombreJoueurs>=6) {
			System.out.println(J6.getTerritoiresControlesJoueur());
		}
				
		
		
	}
	
	public static void afficherRenforts (Joueur J) {
		J.calculRenforts(J);
		//J2.calculRenforts(J2);
	}
	

}
