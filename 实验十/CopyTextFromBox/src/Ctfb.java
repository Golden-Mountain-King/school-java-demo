import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;


public class Ctfb implements ActionListener{
	JFrame paper = new JFrame();
	Container npaper = paper.getContentPane();
	JLabel l = new JLabel("hello");//�½�һ����ǩ
	JTextField t = new JTextField();//�½�һ���ı���
	JButton b = new JButton("Copy");//�½�һ����ť
	
	Ctfb(){
		npaper.setLayout(null);
		npaper.add(l);l.setBounds(150, 50, 60, 60);
		npaper.add(t);t.setBounds(50, 50, 200, 20);
		npaper.add(b);b.setBounds(250, 50, 100, 20);
		b.setFont(new Font("Dialog",0,10));
		b.addActionListener(this);
		paper.setVisible(true);
		paper.setLocation(860,540);//��ƴ��ڵ�λ��
		paper.setSize(500, 500);//��ƴ��ڵĴ�С
		paper.addWindowListener(new WindowAdapter() {//��ӵ�������¼������˳��������ͬ����̨һ��ر�
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s = t.getText();
		l.setText(s);
	}
}
