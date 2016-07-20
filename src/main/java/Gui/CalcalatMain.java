package Gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class CalcalatMain  {
	
	public static void main(String[] args) {
	
	JFrame frame = new JFrame("계산기"); 
	frame.setLocation(400, 200);
	
	JTextField textfieldNorth = new JTextField();
	JTextField textField = new JTextField();
	JPanel panel1 = new JPanel(); 
	JPanel panelNorth = new JPanel(); 
	GridLayout grid;
//	JButton JBu = new JButton();
	textField.setHorizontalAlignment(JTextField.RIGHT);  
	textField.setEditable(false); 		
	
	textfieldNorth.setHorizontalAlignment(JTextField.RIGHT); 
	textfieldNorth.setEditable(false); 	
	
	panelNorth.setLayout(new BorderLayout());    		
	panelNorth.add(BorderLayout.NORTH,textfieldNorth);  
	panelNorth.add(BorderLayout.CENTER,textField);
	
	panel1.setLayout(new GridLayout(4,3,6,6)); 
	
	String[] strGrid={"1","2","3","+",
					  "4","5","6","-",
					  "7","8","9","*",
					  "C","0","=","/" };
	
	for(int i=0; i<strGrid.length; i++){
		JButton JBu=new JButton(strGrid[i]);  				
		ActionListener listener = new Calcalat(textfieldNorth,textField);
		JBu.addActionListener(listener );	 			// 각 버튼마다 리스너 붙이기
		JBu.setBackground(new Color( 241,244,249));    // 버튼 집어넣기
		panel1.add(JBu); 							
	}
	
	frame.add(BorderLayout.NORTH,panelNorth); 
	frame.add(BorderLayout.CENTER,panel1); 		 
		
	frame.setResizable(false);                                  
	frame.setSize(300,300);                                     
	frame.setVisible(true);                                  
	
}
	
}