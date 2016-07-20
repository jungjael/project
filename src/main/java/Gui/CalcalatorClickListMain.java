package Gui;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class CalcalatorClickListMain {
	public static void main(String[] args) {
		JFrame frame = new JFrame("°è»ê±â");
		frame.setPreferredSize(new Dimension(300, 300));
		frame.setLocation(500,100);
		Container contentpane = frame.getContentPane();		
		JPanel panel = new JPanel();
		JPanel panel1 = new JPanel();
		JPanel panel3 = new JPanel();
		
		panel.setLayout(new GridLayout(4,4,5,5));
		contentpane.add(panel,BorderLayout.CENTER);
		
		JTextField text1 = new JTextField(15);
		panel1.add(text1);
		text1.setHorizontalAlignment(text1.RIGHT);
		text1.setEditable(false);
		text1 =new JTextField("0"); 		
		
		
		JTextField text2 = new JTextField(15);
		panel3.add(text2);
		text2.setHorizontalAlignment(text1.RIGHT);
		text2.setEditable(false);
		text2 =new JTextField("0");
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(4, 4));
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("+");
		JButton button5 = new JButton("4");
		JButton button6 = new JButton("5");
		JButton button7 = new JButton("6");
		JButton button8 = new JButton("-");
		JButton button9 = new JButton("7");
		JButton button10 = new JButton("8");
		JButton button11 = new JButton("9");
		JButton button12 = new JButton("*");
		JButton button13 = new JButton("C");
		JButton button14 = new JButton("0");
		JButton button15 = new JButton("=");
		JButton button16 = new JButton("/");
		
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		panel2.add(button6);
		panel2.add(button7);
		panel2.add(button8);
		panel2.add(button9);
		panel2.add(button10);
		panel2.add(button11);
		panel2.add(button12);
		panel2.add(button13);
		panel2.add(button14);
		panel2.add(button15);
		panel2.add(button16);
				
		
		ActionListener listener = null;
		button1.addActionListener(listener);
		button2.addActionListener(listener);
		button3.addActionListener(listener);
		button4.addActionListener(listener);
		button5.addActionListener(listener);
		button6.addActionListener(listener);
		button7.addActionListener(listener);
		button8.addActionListener(listener);
		button9.addActionListener(listener);
		button10.addActionListener(listener);
		button11.addActionListener(listener);
		button12.addActionListener(listener);
		button13.addActionListener(listener);
		button14.addActionListener(listener);
		button15.addActionListener(listener);
		button16.addActionListener(listener);
		
		frame.pack();
		frame.setVisible(true);
	}

}