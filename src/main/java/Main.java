
import javax.swing.SwingUtilities;



/**
 *
 * @author Larissa Fossato
 */
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ConversorDeTemperatura.criarTela();
        });
    }
}
