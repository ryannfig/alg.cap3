package areaterreno;
import javax.swing.JOptionPane;
public class AreaTerreno {

    public static void main(String[] args) {
       double ladom, ladon, area;
       
       String sladom, sladon;
       
      sladom = JOptionPane.showInputDialog(null, "Quanto mede o maior lado do formato do terreno: ");
      sladon = JOptionPane.showInputDialog(null, "Digite o lado menor do terreno: ");
      
      ladom = Double.parseDouble(sladom);
      ladon = Double.parseDouble(sladon);
      area = ladom * ladon;
      JOptionPane.showMessageDialog(null, "O maior lado do terreno mede "+ladom+"metros. O menor"
              + "lado mede "+ladon+". A area do terreno é : "+area+"metros.");
    }
    
}
