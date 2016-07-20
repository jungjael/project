package Gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TorMain implements ActionListener{
	static JButton button;
	static JTextField num1;
	static JTextField num2;
	static ArrayList<String> intlist;
 	static boolean firchk=true;
	public static void main(String[] args) {
		intlist =new ArrayList<String>();
		JFrame frame = new JFrame("hello java");
		frame.setBackground(Color.gray); 
		frame.setLocation(500, 400);
		frame.setPreferredSize(new Dimension(450,600));
		Container contentPane = frame.getContentPane();
		contentPane.setBackground(Color.gray); 
		Font font = new Font("����ü", Font.BOLD, 25);
		JPanel panel = new JPanel();
		panel.setLayout( new GridLayout( 4 , 4 , 5, 5) );
		contentPane.add(panel, BorderLayout.CENTER);
		num1 = new JTextField(20);
		num2 = new JTextField(20);
		num1.setHorizontalAlignment(num1.RIGHT);
		num2.setHorizontalAlignment(num2.RIGHT);
		num1.setFont(font);
		num2.setFont(font);
		num1.setText("0");
		num2.setText("0");
		num1.setEditable(false); 	
		num2.setEditable(false); 	
		JPanel panel1 = new JPanel();
		BoxLayout boxlayout = new BoxLayout(panel1, BoxLayout.Y_AXIS);
		panel1.setLayout(boxlayout);
		panel1.add(num1);
		panel1.add(num2);
		contentPane.add(panel1, BorderLayout.NORTH);
		
		String btnarr[] = {"1","2","3","+","4","5","6","-","7","8","9","*","C","0","=","/"};
		for( int i = 0 ; i < btnarr.length ; i++) {
			button = new JButton( btnarr[i]);
			button.setFont(font);
			panel.add( button );
			ActionListener listener = new TorMain();
			button.addActionListener(listener);
		}
		frame.setResizable(false);
		frame.pack();
		frame.setVisible( true );
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		if ( e.getActionCommand().equals("C")) {
			num1.setText("");
			num2.setText("");
			intlist = new ArrayList<String>();
			return;
		}
		if ( firchk ) {
			num1.setText("");
			num2.setText("");
			intlist = new ArrayList<String>();
		}
		String getbtn = e.getActionCommand();
		boolean intchk = chkNumber( getbtn );
		if ( intchk ) {
			intlist.add( getbtn );
			listView( intlist );
			firchk = false;
		}
		if ( (!intchk) && (!getbtn.equals("="))) {
			String finalnum1 = num2.getText();
			num1.setText(finalnum1 +getbtn);
			num2.setText("0");
			intlist = new ArrayList<String>();
		}
		if ( (!intchk) && (getbtn.equals("="))) {
			char op = num1.getText().charAt(num1.getText().length() - 1);
			int intnum1 =Integer.parseInt(num1.getText().substring(0, num1.getText().length() - 1));
			int intnum2 = Integer.parseInt( num2.getText() );
			System.out.println("op:"+op+" int1:"+intnum1);
			if (op == '/' && intnum2 == 0) {
				JOptionPane.showMessageDialog(num1, "0 ���� ���� �� �����ϴ�.");
				return;
			}
			int result = 0;
			switch (op) {
			case '+':
				result = intnum1 + intnum2;
				break;
			case '-':
				result = intnum1 - intnum2;
				break;
			case '*':
				result = intnum1 * intnum2;
				break;
			case '/':
				result = intnum1 / intnum2;
				break;

			default:
				break;
			}
			num1.setText("");
			num2.setText( result + "");
			firchk = true;
		}
	}
	void listView( ArrayList<String> intlist) {
		String strnum = "";
		for ( String intlist1 : intlist ) {
			strnum += intlist1;
		}
		num2.setText( strnum );
	}
	
	boolean chkNumber( String str ) {
		boolean intchk = false;
		try {
			Integer.parseInt( str );
			intchk = true;
		} catch (Exception e) {
		}
		return intchk;
	}
	
}