package imageapplet;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

//@SuppressWarnings("serial")
public class MyImageApplet extends Applet implements Runnable {
	Image img0,img1,img2,img3,img4,img5,img6;
	Thread t;
	public void init() {
		img0 = getImage(getCodeBase(),"ThisWarofMine0.jpg");
		img1 = getImage(getCodeBase(),"ThisWarofMine1.jpg");
		img2 = getImage(getCodeBase(),"ThisWarofMine2.jpg");
		img3 = getImage(getCodeBase(),"ThisWarofMine3.jpg");
		img4 = getImage(getCodeBase(),"ThisWarofMine4.jpg"); 
		img5 = getImage(getCodeBase(),"ThisWarofMine5.jpg");
		img6 = getImage(getCodeBase(),"ThisWarofMine6.jpg");
	}
	public void run() {
		
	}
	
	public void paint(Graphics g) {
		for(;;) {
			g.drawImage(img0,0,0,200,200,this);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			g.drawImage(img1,0,0,200,200,this);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			g.drawImage(img2,0,0,200,200,this);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			g.drawImage(img3,0,0,200,200,this);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			g.drawImage(img4,0,0,200,200,this);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			g.drawImage(img5,0,0,200,200,this);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			g.drawImage(img6,0,0,200,200,this);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
