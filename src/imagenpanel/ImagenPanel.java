
package imagenpanel;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class ImagenPanel extends JPanel {

    Image img;
    
    public ImagenPanel()
    {
    img = Toolkit.getDefaultToolkit().getImage("java.jpg");
    }
    public void paint(Graphics g)
    {
        super.paintComponent(g);
    if(img != null)
        g.drawImage(img, 0, 0, this);
    }
    }
  
