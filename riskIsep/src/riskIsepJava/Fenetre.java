package riskIsepJava;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;


// Constructeur 
public class Fenetre extends JFrame {
	private JPanel container = new JPanel();
	 private JComboBox combo = new JComboBox();
	 private JLabel label = new JLabel("Une ComboBox");
	 
	
	public Fenetre(){
		this.setTitle("Risk Game");
		this.setSize(1600, 800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Instanciation de panneau
		
		this.setContentPane(new Panneau());
		this.setBackground(Color.white);
		
		// Création d'un bouton
		
		JButton bouton = new JButton("Fin de tour");
		
		// Ajout du bouton au content pane
		this.add(bouton);
	    this.setVisible(true);
		
	    
	    
	    //this.setTitle("Animation");
	    //this.setSize(300, 300);
	    //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    //this.setLocationRelativeTo(null);
	    //container.setBackground(Color.white);
	    //container.setLayout(new BorderLayout());
	    //combo.setPreferredSize(new Dimension(100, 20));
	    //combo.addItem(1);
	    //combo.addItem("Option 2");
	    //combo.addItem("Option 3");
	    //combo.addItem("Option 4");

	   // JPanel top = new JPanel();
	   // top.add(label);
	   // top.add(combo);
	   // container.add(top, BorderLayout.NORTH);
	    //this.setContentPane(container);
	   // this.setVisible(true);     
	    
	    
	    
	}
	


//public static void main (String[] args) {
	
//	Fenetre fen = new Fenetre();
//}


}

/*

// AMERIQUE DU NORD 
Territoire alaska = new Territoire(1,"Alaska",1,{6,2,31},null);
Territoire alberia = new Territoire(2,"Alberia",1,{1,6,7,9},null);
Territoire amerique_centrale = new Territoire(3,"Amerique centrale",1,{4,9,13},null);
Territoire etat_de_lest = new Territoire(4,"Etat de l'Est",1,{2,3,7,8},null);
Territoire groenland = new Territoire(5,"Groënland",1,{6,7,8,15},null);
Territoire nord_ouest = new Territoire(6,"Nord-Ouest",1,{1,2,5,7},null);
Territoire ontario = new Territoire(7,"Ontario",1,{2,4,5,6,8,9},null);
Territoire quebec = new Territoire(8,"Quebec",1,{4,5,7},null);
Territoire etat_ouest = new Territoire(9,"Etat de l'ouest",1,{2,3,4},null);

// AMERIQUE DU SUD 
Territoire argentine = new Territoire(10,"Argentine",2,{11,12},null);
Territoire bresil = new Territoire(11,"Brésil",2,{10,12,13,25},null);
Territoire perou = new Territoire(12,"Pérou",2,{10,11,13},null);
Territoire venezuela = new Territoire(13,"Vénézuela",2,{11,12,3},null);

//EUROPE
Territoire grande_bretagne = new Territoire(14,"Grande-Bretagne",3,{15,16,17,7},null);
Territoire islande = new Territoire(15,"Islande",3,{14,17,5},null);
Territoire europe_nord = new Territoire(16,"Europe du Nord",3,{14,17,18,19,20},null);
Territoire scandinavie = new Territoire(17,"Scandinavie",3,{14,15,16,19},null);
Territoire europe_sud = new Territoire(18,"Europe du Sud",3,{16,19,20,23,33},null);
Territoire ukraine = new Territoire(19,"Ukraine",3,{16,17,18,27,33,37},null);
Territoire europe_ouest = new Territoire(20,"Europe de l'Ouest",3,{25,14,16,18},null);

// AFRIQUE
Territoire congo = new Territoire(21,"Congo",4,{22,25,26},null);
Territoire afrique_est = new Territoire(22,"Afrique de l'Est",4,{21,23,24,25,33},null);
Territoire egypte = new Territoire(23,"Egypte",4,{22,25,18,33},null);
Territoire madagascar = new Territoire(24,"Madagascar",4,{22,26},null);
Territoire afrique_nord = new Territoire(25,"Afrique du Nord",4,{23,21,22,10,20},null);
Territoire afrique_sud = new Territoire(26,"Afrique du Sud",4,{21,22,24},null);

// ASIE
Territoire afghanistan = new Territoire(27,"Afghanistan",5,{19,28,29,33,37},null);
Territoire chine = new Territoire(28,"Chine",5,{27,29,30,34,35,36,37},null);
Territoire inde = new Territoire(29,"Inde",5,{27,28,33,35},null);
Territoire tchita = new Territoire(30,"Tchita",5,{32,34,36,38,28},null);
Territoire japon = new Territoire(31,"Japon",5,{32,34},null);
Territoire kamtchatka = new Territoire(32,"Kamtchatka",5,{1,30,31,34,38},null);
Territoire moyen_orient = new Territoire(33,"Moyen Orient",5,{27,29,19,22,23},null);
Territoire mongolie = new Territoire(34,"Mongolie",5,{31,32,28,30,36},null);
Territoire siam = new Territoire(35,"Siam",5,{40,28,29},null);
Territoire siberie = new Territoire(36,"Sibérie",5,{37,38,30,34,28},null);
Territoire oural = new Territoire(37,"Oural",5,{36,28,27,19},null);
Territoire yakoutie = new Territoire(38,"Yakoutie",5,{30,32,34},null);

// OCEANIE
Territoire australie_est = new Territoire(39,"Australie de l'Est",6,{42,41},null);
Territoire indonesie = new Territoire(40,"Indonésie",6,{35,41,42},null);
Territoire nouvelle_guinee = new Territoire(41,"Nouvelle Guinée",6,{40,39,42},null);
Territoire australie_ouest = new Territoire(42,"Australie de l'Ouest",6,{39,40,41},null);


*/
















