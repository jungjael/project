package Gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WindowHelloMain {
	public static void main(String [] args){
		JFrame frame = new JFrame("Hello Java");
		frame.setLocation(500,400);
		frame.setPreferredSize(new Dimension(700,120));;
		Container contentpane = frame.getContentPane();
		JTextField text = new JTextField();
		JPanel panel = new JPanel();
		JButton button1 = new JButton("button1");
		JButton button2 = new JButton("button2");
		panel.add(button1);
		panel.add(button2);
		//JButton button = new JButton("»Æ¿Œ");
		JLabel label = new JLabel("Hello");
		contentpane.add(text,BorderLayout.CENTER);
		contentpane.add(panel,BorderLayout.EAST);
		contentpane.add(label,BorderLayout.SOUTH);
		ActionListener listener = new WindowHelloClickListener();
		button1.addActionListener(listener);
		ActionListener listener1 = new WindowHelloClickListener1();
		button2.addActionListener(listener1);
		frame.pack();
		frame.setVisible(true);
		
	}

}
