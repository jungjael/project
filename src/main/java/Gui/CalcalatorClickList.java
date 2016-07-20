package Gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CalcalatorClickList implements ActionListener {

    JTextField text1;
	JTextField text2;
	JButton button1;
	JButton button2; 
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton button10;
	JButton button11;
	JButton button12;
	JButton button13;
	JButton button14;
	JButton button15;
	JButton button16;
	
	CalcalatorClickList(JFrame frame, JTextField text1,JTextField text2,JButton button1,
			JButton button2, JButton button3, JButton button4,
			JButton button5, JButton button6, JButton button7, 
			JButton button8, JButton button9, JButton button10,
			JButton button11, JButton button12, JButton button13, 
			JButton button14, JButton button15, JButton button16){
		this.text1 = text1;
		this.text1 = text2;
		this.button1 = button1;
		this.button2 = button2;
		this.button3 = button3;
		this.button4 = button4;
		this.button5 = button5;
		this.button6 = button6;
		this.button7 = button7;
		this.button8 = button8;
		this.button9 = button9;
		this.button10 = button10;
		this.button11 = button11;
		this.button12 = button12;
		this.button13 = button13;
		this.button14 = button14;
		this.button15 = button15;
		this.button16 = button16;
		
	
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String gettext = e.getActionCommand();
		boolean intchk = chkNumber(text1.getText());
		
		 if (button1.getText().equals("1")){
			 text1.setText("1");
		 }else if(button2.getText().equals("2")){
			 text1.setText("2");
		 }else if(button3.getText().equals("3")){
			 text1.setText("3");
		 }else if(button4.getText().equals("+")){
			 text1.setText("+");
		 }else if(button5.getText().equals("4")){
			 text1.setText("4");
		 }else if(button6.getText().equals("5")){
			 text1.setText("5");
		 }else if(button7.getText().equals("6")){
			 text1.setText("6");
		 }else if(button8.getText().equals("-")){
			 text1.setText("-");
		 }else if(button9.getText().equals("7")){
			 text1.setText("7");
		 }else if(button10.getText().equals("8")){
			 text1.setText("8");
		 }else if(button11.getText().equals("9")){
			 text1.setText("9");
		 }else if(button12.getText().equals("*")){
			 text1.setText("*");
		 }else if(button13.getText().equals("C")){
			 text1.setText("C");
		 }else if(button14.getText().equals("0")){
			 text1.setText("0");
		 }else if(button15.getText().equals("=")){
			 text1.setText("=");
		 }else if(button16.getText().equals("/")){
			 text1.setText("/");
		 }
	}
	boolean chkNumber (String str){
		boolean intchk = false;
		try{
			Integer.parseInt(str);
			intchk = true;
		} catch (Exception e) {
		}
		return intchk;
	
	
}
}
