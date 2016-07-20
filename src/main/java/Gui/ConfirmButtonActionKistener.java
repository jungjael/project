package Gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ConfirmButtonActionKistener implements ActionListener {
	JTextField text;
	JLabel label;
	ConfirmButtonActionKistener(JTextField text,JLabel label){
		this.text = text;
		this.label = label;
	}
	public void actionPerformed(ActionEvent e){
		String name = text.getText();
		label.setText("Hello "+name);
	}

}
