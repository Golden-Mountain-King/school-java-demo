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
	JLabel l = new JLabel("hello");//新建一个标签
	JTextField t = new JTextField();//新建一个文本行
	JButton b = new JButton("Copy");//新建一个按钮
	
	Ctfb(){
		npaper.setLayout(null);
		npaper.add(l);l.setBounds(150, 50, 60, 60);
		npaper.add(t);t.setBounds(50, 50, 200, 20);
		npaper.add(b);b.setBounds(250, 50, 100, 20);
		b.setFont(new Font("Dialog",0,10));
		b.addActionListener(this);
		paper.setVisible(true);
		paper.setLocation(860,540);//设计窗口的位置
		paper.setSize(500, 500);//设计窗口的大小
		paper.addWindowListener(new WindowAdapter() {//添加点击监听事件，在退出程序后连同控制台一起关闭
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
