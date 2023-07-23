
package za.ac.tut.ui;
import java.awt.*;
import javax.swing.*;

/**
 * @author Olama
 */
public class MyFirstFrame extends JFrame {
    
    public MyFirstFrame(){
        
        setTitle("My First GUI ");
        setSize(500,350);
        setDefaultLookAndFeelDecorated(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setForeground(Color.BLUE);
        setVisible(true);
    }
       
    
}
