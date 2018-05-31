package riskIsepJava;

import java.awt.FlowLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.Box;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test extends JDialog implements ActionListener {
    Jeu jeu;
    JButton valider = new JButton("Valider");
    JButton annuler = new JButton("Annuler");
    JTextField champNom = new JTextField(10);
    JCheckBox choixAide = new JCheckBox("choix de l'aide");
    public Test(Jeu jeu) {
	this.jeu = jeu;
	JPanel panneau ;
	
	Box boite = Box.createVerticalBox();
	setModal(true);
	setTitle("Choix");
	
	panneau = new JPanel();
	panneau.add(new JLabel("nom du joueur : "));
	panneau.add(champNom);
	boite.add(panneau);
	
	panneau = new JPanel();
	panneau.add(choixAide);
	boite.add(panneau);
	
	panneau = new JPanel();
	panneau.add(valider);
	panneau.add(annuler);
	boite.add(panneau);
	
	add(boite) ;
	
	valider.addActionListener(this);
	annuler.addActionListener(this);
	pack();
	setLocation(400, 200);
	setVisible(true);
    }
    
    public void actionPerformed(ActionEvent evt) {
	Object source = evt.getSource();
	if (source == valider) {
	    jeu.nom = champNom.getText();
	    jeu.aide = choixAide.isSelected();
	    dispose();
	}
	else if (source == annuler) {		
	    dispose();
	}
    }
}

class Jeu extends JFrame implements ActionListener {
    String nom;
    boolean aide;
    JTextArea texte = new JTextArea(2, 20);
    Jeu(String titre) {
	super(titre);
	JButton choix = new JButton("choix");
	
	setLayout(new FlowLayout());
	texte.setEditable(false);
	add(choix);
	add(texte);
	choix.addActionListener(this);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	setLocation(100, 200);
	setVisible(true);
	pack();
    }
    
    public void actionPerformed(ActionEvent evt) {
	Test dialogue = new Test(this);
	if (nom != null) {
	    texte.setText("le nom est " + nom);
	    if (aide) texte.append("\n" + nom + " joue avec l'aide");
	    else texte.append("\n" + nom + " joue sans l'aide");
	}
    }
}

class EssaiDialogue6 {
    public static void main(String[] arg) {
	new Jeu("Jeu");
    }
}
     