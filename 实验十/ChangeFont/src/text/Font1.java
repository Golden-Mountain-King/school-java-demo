package text;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Font1 implements ListSelectionListener{
	String item[] = {"Dialog","Monospaced","SansSerif","Serif"};
	JList<String> l1 = new JList<String>(item);
	JLabel l = new JLabel("hello");
		Font1() {
			JFrame j = new JFrame();
			j.setLocation(860,540);//��ƴ��ڵ�λ��
			j.setSize(500, 500);//��ƴ��ڵĴ�С
			j.setVisible(true);//���ڿɼ�
			j.addWindowListener(new WindowAdapter() {//��ӵ�������¼������˳��������ͬ����̨һ��ر�
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			Container c = j.getContentPane();
			c.setLayout(null);
			
			//��ǩ
			l.setBounds(100,0, 100, 100);
			c.add(l);
			
			
			//�б�
			c.add(l1);
			l1.setBounds(200, 0, 100, 100);
			
			//��list��Ӽ����¼�
			l1.addListSelectionListener(this);
		}

		@Override
		public void valueChanged(ListSelectionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == l1) {
				l.setFont(new Font((String)l1.getSelectedValue(),0,20));
				l.setText((String)l1.getSelectedValue());
			}
		}
}
