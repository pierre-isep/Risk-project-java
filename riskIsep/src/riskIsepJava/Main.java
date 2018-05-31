package riskIsepJava;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import edu.princeton.cs.introcs.StdDraw;
import javax.swing.JOptionPane;


import javax.swing.*;


public class Main {

	public static void main(String[] args) {
		Fenetre fen = new Fenetre();
		
		Partie risk = new Partie(0);
		
		//ArrayList A1 = new ArrayList (); //AJouter des armées
		//A1.add(5);
		//A1.add(7);
		//J1.setArmeeJoueur(A1);
		//System.out.println(J1.getArmeeJoueur());
		//A1.remove(1);
		//System.out.println(J1.getArmeeJoueur());
		
		//String[] choix = {"1", "2", "3", "4", "5", "6"};
	    //JOptionPane jop = new JOptionPane(), jop2 = new JOptionPane();
	    //String nbJoueurs = (String)jop.showInputDialog(null, "Veuillez indiquer le nombre de joueurs :","Nombre de Joueurs",JOptionPane.QUESTION_MESSAGE,null,choix,choix[0]);
	    //jop2.showMessageDialog(null, "Vous avez choisi le mode à " + nbJoueurs + " joueur(s)", "Nombre de Joueurs", JOptionPane.INFORMATION_MESSAGE);
	    //risk.setNbJoueurs(nbJoueurs);
		
		System.out.println("Entrez le nombre de joueurs :");
		Scanner scan = new Scanner(System.in);
		int nombreJoueurs=scan.nextInt();
		risk.setNbJoueurs(nombreJoueurs);
		risk.repartirTerritoires(nombreJoueurs);
		//risk.afficherRenforts(J1);

		
	}
			
		
	}