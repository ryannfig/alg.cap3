package distanciadoispontos;
import javax.swing.JOptionPane;
public class DistanciaDoisPontos {

    public static void main(String[] args) {

        String sx1 = JOptionPane.showInputDialog("Digite a coordenada x do primeiro ponto:");
        double x1 = Double.parseDouble(sx1);

        String sy1 = JOptionPane.showInputDialog("Digite a coordenada y do primeiro ponto:");
        double y1 = Double.parseDouble(sy1);

        String sx2 = JOptionPane.showInputDialog("Digite a coordenada x do segundo ponto:");
        double x2 = Double.parseDouble(sx2);

        String sy2 = JOptionPane.showInputDialog("Digite a coordenada y do segundo ponto:");
        double y2 = Double.parseDouble(sy2);

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        JOptionPane.showMessageDialog(null,"O resultado do cálculo é: "+distancia);
             
    
    }
    
}
