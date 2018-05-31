package riskIsepJava;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
 
public class Panneau extends JPanel {
  public void paintComponent(Graphics g){
    try {
      Image img = ImageIO.read(new File("C:\\Users\\jeffr\\eclipse-workspace\\riskIsepJava\\src\\riskIsepJava\\Risk_game_map.png"));
      g.drawImage(img, 0, 0, 1600, 800, this);
    } catch (IOException e) {
      e.printStackTrace();
    }                
  }               
}

