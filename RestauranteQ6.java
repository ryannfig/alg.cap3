package restaurante;
import javax.swing.JOptionPane;
public class Restaurante {


    public static void main(String[] args) {
        double valor;
        double preço = 12.00;
        String svalor = JOptionPane.showInputDialog(null, "Por cada quilo de comida, cobramos R$12,00."
                                                    + " Pese seu prato para saber o valor a pagar: ");
        valor = Double.parseDouble(svalor);
        
        double res = valor*preço;
        
        JOptionPane.showMessageDialog(null, "O peso do seu prato de comida:"+valor+"Kg."
                + " O valor do mesmo: "+res+"R$");
        
    }
    
}
