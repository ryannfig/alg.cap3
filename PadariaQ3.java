package padaria;
import javax.swing.JOptionPane;
public class Padaria {

    public static void main(String[] args) {
        double pao, broa, res, poupança;
        String spao, sbroa, sres, spoupança;
        
        spao = JOptionPane.showInputDialog(null,"Digite a quantidade de pães vendidos no dia: ");
        sbroa = JOptionPane.showInputDialog(null,"Digite a quantidade de broas vendidos no dia: ");
        
        pao = Double.parseDouble(spao);
        broa = Double.parseDouble(sbroa);
        
        res = (pao*0.12)+(broa*1.50);
        poupança = 0.10*res;
        
        JOptionPane.showMessageDialog(null, "O valor total arrecadado no dia foi de R$"+res+
                ". Os 10% retirados para a polpança é igual a R$"+poupança+".");
    }
    
}
