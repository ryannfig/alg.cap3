package camisetas;
import javax.swing.JOptionPane;
public class Camisetas {
    public static void main(String[] args) {
  
        double precoPequena = 10.0;
        double precoMedia = 12.0;
        double precoGrande = 15.0;

        String sPequena = JOptionPane.showInputDialog("Digite a quantidade de camisetas pequenas:");
        int quantidadePequenas = Integer.parseInt(sPequena);

        String sMedia = JOptionPane.showInputDialog("Digite a quantidade de camisetas médias:");
        int quantidadeMedias = Integer.parseInt(sMedia);

        String sGrande = JOptionPane.showInputDialog("Digite a quantidade de camisetas grandes:");
        int quantidadeGrandes = Integer.parseInt(sGrande);

        double valorTotal =           ((quantidadePequenas * precoPequena) +
                                      (quantidadeMedias * precoMedia) +
                                      (quantidadeGrandes * precoGrande));

        JOptionPane.showMessageDialog( null, "O valor total arrecadado é: R$"+valorTotal);
                
    


    }
    
}
