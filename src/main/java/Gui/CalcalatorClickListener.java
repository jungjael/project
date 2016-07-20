package Gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CalcalatorClickListener implements ActionListener {
	JTextField text1;
	JTextField text2;
	JTextField text3;
	JButton button1;
	JButton button2; 
	JButton button3;
	JButton button4;
	JButton button5;
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JFrame frame;

	CalcalatorClickListener(JFrame frame, JTextField text1, JTextField text2,JButton button1, JButton button2, JButton button3, 
			JButton button4, JButton button5, JLabel label1, JLabel label2,JLabel label3){
		this.text1 = text1;
		this.text2 = text2;
		this.button1 = button1;
		this.button2 = button2;
		this.button3 = button3;
		this.button4 = button4;
		this.button5 = button5;
		this.label1 = label1;
		this.label2 = label2;
		this.label3 = label3;
		this.frame = frame;
	
		}



	@Override
	public void actionPerformed(ActionEvent e) {
	
	
		String gettext = e.getActionCommand();
		boolean intchk = chkNumber(text1.getText());
		if(!intchk){
			JOptionPane.showMessageDialog(text1, "숫자를 입력하시오");
			return ;
		}
		intchk = chkNumber(text2.getText());
		if(!intchk){
			JOptionPane.showMessageDialog(text1, "숫자를 입력하시오");
			return ;
		}
		int a = Integer.parseInt(text1.getText());
		int b = Integer.parseInt(text2.getText());
		
		if(gettext.equals("/")&&(b== 0)){
			JOptionPane.showMessageDialog(text1, "0으로 나눌수 없습니다.");
			return;
		}
	
		int result =0 ;
		if(gettext.equals("+")){
			 result = a+b;
			label1.setText(gettext);
		}
		if(gettext.equals("-")){
			result = a-b;
			label1.setText(gettext);
		}
		if(gettext.equals("*")){
			result = a*b;
			label1.setText(gettext);
		}
		if(gettext.equals("/")){
			result = a/b;
			label1.setText(gettext);
		}
		if(gettext.equals("C")){
			text1.setText("");
			text2.setText("");
		}
		
		String res = String.valueOf(result); 
		label3.setText(res);
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

