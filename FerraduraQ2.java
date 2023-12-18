package ferraduras;
import javax.swing.JOptionPane;
public class Ferraduras {

  
    public static void main(String[] args) {
       int C, fer;
       String sfer, sC;
       sC = JOptionPane.showInputDialog(null, "Quantos cavalos foram comprados?");
       
       C = Integer.parseInt(sC);
       fer = C*4;
       
       JOptionPane.showMessageDialog(null,"Com "+C+" cavalos comprados,"
               + " serão necessárias "+fer+" ferraduras.");
    }
    
}
