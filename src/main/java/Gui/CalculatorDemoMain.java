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
public class CalculatorDemoMain {

	public static void main(String[] args) {
		JFrame frame = new JFrame("°è»ê±â");
		frame.setPreferredSize(new Dimension(400, 100));
		frame.setLocation(500, 100);
		Container contentpane = frame.getContentPane();
		JPanel panel1 = new JPanel();
		JTextField text1 = new JTextField(10);
		JLabel label1 =new JLabel("+");
		JTextField text2 = new JTextField(10);
		JLabel label2 =new JLabel("=");
		JLabel label3 =new JLabel();
		panel1.add(text1);
		panel1.add(label1);
		panel1.add(text2);
		panel1.add(label2);
		panel1.add(label3);
		JPanel panel2 = new JPanel();
		JButton button1 = new JButton("+");
		JButton button2 = new JButton("-");
		JButton button3 = new JButton("*");
		JButton button4 = new JButton("/");
		JButton button5 = new JButton("C");
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		
		contentpane.add(panel1, BorderLayout.CENTER);
		contentpane.add(panel2, BorderLayout.SOUTH);
		ActionListener listener = new CalcalatorClickListener(frame,text1,text2,button1,button2,button3,button4,button5,label1,label2,label3);
		button1.addActionListener(listener);
		button2.addActionListener(listener);
		button3.addActionListener(listener);
		button4.addActionListener(listener);
		button5.addActionListener(listener);
		frame.pack();
		frame.setVisible(true);
	}

}