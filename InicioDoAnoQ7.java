package diames;
import javax.swing.JOptionPane;
public class DiaMes {

    public static void main(String[] args) {
   
        int Mes = 30;

        String sdia = JOptionPane.showInputDialog("Digite o dia da data:");
        int dia = Integer.parseInt(sdia);

        String smes = JOptionPane.showInputDialog("Digite o mês da data:");
        int mes = Integer.parseInt(smes);

        int InicioDoAno = (mes - 1) * Mes + dia;

        JOptionPane.showMessageDialog(null, "Desde o primeiro dia do ano até a data informada, passaram-se "+InicioDoAno+" dias.");
            
       
    }
}


  
