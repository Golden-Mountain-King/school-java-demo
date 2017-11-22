package imageapplet;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

//@SuppressWarnings("serial")
public class MyImageApplet extends Applet{
	Image img;
	int i = 0;
	public void paint(Graphics g) {
		img = getImage(getCodeBase(),"ThisWarofMine"+i+".jpg");
		g.drawImage(img,0,0,200,200,this);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		i++;
		if(i==6) {
			i=0;
		}
		update(g);
	}
}
