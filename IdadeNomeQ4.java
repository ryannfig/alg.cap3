package nomeeidade;
import javax.swing.JOptionPane;
public class NomeEIdade {

    
    public static void main(String[] args) {
       
       int  idade, calculo;
       String scalculo;
       
       String nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
       
       String sidade = JOptionPane.showInputDialog(null, "Digite sua idade: ");
       idade = Integer.parseInt(sidade);
       
       calculo = idade*365;
       
       JOptionPane.showMessageDialog(null, nome+", Você já viveu "
               + "aproximadamente "+calculo+" dias.");
       
    }
    
}
