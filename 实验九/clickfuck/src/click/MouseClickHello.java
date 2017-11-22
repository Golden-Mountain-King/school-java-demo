package click;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MouseClickHello extends Applet implements MouseListener

{	
	public void init() {
		this.addMouseListener(this);
	}
	public void paint(Graphics g) {
		if(clicked == true) {
			g.drawString("Hello!", x, y);
		}
		
	}
	boolean clicked = false;
	int x = 0,y = 0;
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		clicked = true;
		x = arg0.getX();
		y = arg0.getY();
		Graphics g = getGraphics() ;
		update(g);
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("enter");
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("exit");
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
