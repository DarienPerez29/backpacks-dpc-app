
package backpacks;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import backpacks.interfaces.MainView;

/**
 *
 * @author dapec
 */
public class BackpacksDPC {

    public static void main(String[] args) {
        try{
           UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
           new MainView().setVisible(true);
        }//End try
        catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar el programa...","ERROR DE EJECUCIÓN", JOptionPane.ERROR_MESSAGE);
        }//End catch navegador  
    }//end main
    
}//end main class
