package jean.cesar.fastock;

import gui.Loginn;
import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Loginn loggin = new Loginn();
        loggin.setVisible(true);
        loggin.setLocationRelativeTo(null);
        JOptionPane.showMessageDialog(loggin, args);
    }
}
