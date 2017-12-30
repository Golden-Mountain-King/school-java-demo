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
			j.setLocation(860,540);//设计窗口的位置
			j.setSize(500, 500);//设计窗口的大小
			j.setVisible(true);//窗口可见
			j.addWindowListener(new WindowAdapter() {//添加点击监听事件，在退出程序后连同控制台一起关闭
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			Container c = j.getContentPane();
			c.setLayout(null);
			
			//标签
			l.setBounds(100,0, 100, 100);
			c.add(l);
			
			
			//列表
			c.add(l1);
			l1.setBounds(200, 0, 100, 100);
			
			//给list添加监听事件
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
