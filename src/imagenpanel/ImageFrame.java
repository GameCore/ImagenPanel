
package imagenpanel;

import java.awt.Container;
import javax.swing.JFrame;
import java.awt.event.*;

public class ImageFrame extends JFrame{
    
    public ImageFrame()
            {
            setTitle("Calabacita");
            setSize(400,400);
            addWindowListener(new MainWindowListener());
            Container contenido = getContentPane();
            
            
            }
    
    
}
