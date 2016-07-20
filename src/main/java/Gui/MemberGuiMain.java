package Gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MemberGuiMain {
	public static void main(String [] args){
		JFrame frame = new JFrame("Hello Java Program");
		frame.setLocation(300,300);
		frame.setPreferredSize(new Dimension(300,200));;
		Container contentpane = frame.getContentPane();
		
		JButton button1 = new JButton("button1");
		JButton button2 = new JButton("button2");
		JButton button3 = new JButton("button3");
		
		JLabel label1 = new JLabel("label1");
		JLabel label2 = new JLabel("label2");
		JLabel label3 = new JLabel("label3");
		JLabel label4 = new JLabel("label4");
		
		JPanel panel1 = new JPanel();
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		
		JPanel panel2 = new JPanel();
		panel2.add(label1);
		panel2.add(label2);
		panel2.add(label3);
		panel2.add(label4);
		
		contentpane.add(panel1,BorderLayout.CENTER);
		contentpane.add(panel2,BorderLayout.SOUTH);
		
//		JTextField text = new JTextField();
//		JButton button = new JButton("»Æ¿Œ");
//		JLabel label = new JLabel("Hello, Java",SwingConstants.CENTER);
//		contentpane.add(text,BorderLayout.CENTER);
//		contentpane.add(button,BorderLayout.EAST);
//		contentpane.add(label,BorderLayout.SOUTH);
//		ActionListener listener = new ConfirmButtonActionKistener(text,label);
//		button.addActionListener(listener);
//		contentpane.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.pack();
		
		frame.setVisible(true);
		
		
	}

}
