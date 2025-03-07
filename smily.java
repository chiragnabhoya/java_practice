import java.applet.*;
import java.awt.*;

//<applet code="smily" height="400" width="400"></applet>

public class smily extends Applet 
{
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.drawOval(80,70,150,150);
		g.setColor(Color.red);
		g.fillOval(120,120,15,15);
		g.fillOval(170,120,15,15);
		g.drawArc(130,180,50,20,180,180);

	}
}