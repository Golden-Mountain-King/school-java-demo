import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ClickedMe implements ActionListener {
	Button b =new Button("ClickMe");
	public void creatNewClick() {
		
		Frame f = new Frame("ClickMe–°≥Ã–Ú");
		f.setVisible(true);
		f.setSize(400, 400);
		f.add(b);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if(b.getLabel()=="ClickMe") {
			b.setLabel("ClickMe Again");
		}
		else {
			b.setLabel("ClickMe");
		}
		
	}
}
