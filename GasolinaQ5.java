package gasolina;
import javax.swing.JOptionPane;
public class Gasolina {

    public static void main(String[] args) {
        double valor, res;
        
        String svalor = JOptionPane.showInputDialog(null, "O valor da gasolina"
                + " é de R$5,83 o litro. Quantos litros deseja colocar?");
        valor = Double.parseDouble(svalor);
        
        res = valor*5.83;
        
        JOptionPane.showMessageDialog(null, "Foram colocados "+valor+" litros,"
                + " dando um valor de "+res+"R$");
        
    }
    
}
