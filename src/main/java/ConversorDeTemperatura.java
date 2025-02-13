
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.PopupMenu;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



/**
 *
 * @author Larissa Fossato
 */
public class ConversorDeTemperatura {
    public static void criarTela(PopupMenu converteButton) {
        JFrame tela = new JFrame ("Conversor de Temperatura");
        
        JTextField celsiusTextField = new JTextField(10);
        JLabel celsiusLabel = new JLabel ("\u00B0C");
        JButton celsiusButton = new JButton ("Converter");
        JLabel fahrenheitLabel = new JLabel ("");
        
        Container painelDeConteudo = tela.getContentPane();
        painelDeConteudo.setLayout(new GridLayout (2, 4, 2, 4));
        painelDeConteudo.add(celsiusTextField);
        painelDeConteudo.add(celsiusLabel);
        painelDeConteudo.add(converteButton);
        painelDeConteudo.add(fahrenheitLabel);
        
        converteButton.addActionListener ((e) -> {
            //capturamos o texto que o usuário digitou e convertemos para double
            double celsius = Double.parseDouble(celsiusTextField.getText());
            //processamento converter para Fahrenheit
            double fahrenheit = celsius / 5 * 9 + 32;
            //saída = exibir o valor convertido no fahrenheitLabel
            fahrenheitLabel.setText(String.format("%.2f\u00B0F", fahrenheit));
        });
        
        //ajusta o tamanho
        tela.pack();
        //centralizar
        tela.setLocationRelativeTo(null);
        //ajusta o botão fechado
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //deixa a tela visivel
        tela.setVisible(true);
    }

    static void criarTela() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
