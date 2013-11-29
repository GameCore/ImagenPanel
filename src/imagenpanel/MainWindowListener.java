package imagenpanel;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class MainWindowListener extends WindowAdapter{
	public void windowClosing(WindowEvent e)
		{
			System.exit(0);
			}
}
