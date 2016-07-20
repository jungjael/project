package Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.TitledBorder;

public class Calculator extends JFrame implements ActionListener {
	
   
	private static final long serialVersionUID = 1L;
	private JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
	private JButton bp, bm, bmulti, bd, bc,bx, bequal;
	private JTextField jtf1;
	private JTextField jtf;
   
   // ���⿡�� ����� ��ư�� �ؽ�Ʈ �ʵ� ��ü ����
   private String operand, operator;
   // ù��° ���۶��� ���� ������ operand�� ���۷����͸� ������ operator ����
   GridBagConstraints cc;
   Container ct;
   JPanel jp1;
   
  public Calculator() {
   GridBagLayout gridbag = new GridBagLayout();
   cc = new GridBagConstraints();
   cc.weightx = 1.0;
   cc.weighty = 1.0;
   cc.fill = GridBagConstraints.BOTH;
   b0 = new JButton("0");
   b1 = new JButton("1");
   b2 = new JButton("2");
   b3 = new JButton("3");
   b4 = new JButton("4");
   b5 = new JButton("5");
   b6 = new JButton("6");
   b7 = new JButton("7");
   b8 = new JButton("8");
   b9 = new JButton("9");
   bp = new JButton("+");
   bm = new JButton("-");
   bmulti = new JButton("*");
   bd = new JButton("/");
   bequal = new JButton("=");
   bc = new JButton("C");
   jp1 = new JPanel();
   jp1.setLayout(gridbag);
   layout(b1,0,0,1,1);
   layout(b2,1,0,1,1);
   layout(b3,2,0,1,1);
   layout(bp,3,0,1,1);
   layout(b4,0,1,1,1);
   layout(b5,1,1,1,1);
   layout(b6,2,1,1,1);
   layout(bm,3,1,1,1);
   layout(b7,0,2,1,1);
   layout(b8,1,2,1,1);
   layout(b9,2,2,1,1);
   layout(bmulti,3,2,1,1);
   layout(bc,0,3,1,1);
   layout(b0,1,3,1,1);
   layout(bequal,2,3,1,1);
   layout(bd,3,3,1,1);
 
   JPanel jp3 = new JPanel();
   jtf = new JTextField(15);
   jtf1 = new JTextField(15);
 
   jp3.setLayout(new GridLayout(2,1,5,5));
   jp3.add(jtf);
   jp3.add(jtf1);
   jtf.setHorizontalAlignment(JTextField.RIGHT);
   jtf1.setHorizontalAlignment(JTextField.RIGHT);
 
   jtf.setEditable(false);
   jtf1.setEditable(false);
  
   jp3.setBorder(new TitledBorder(""));
   
   ct = getContentPane();
   ct.setLayout(new BorderLayout(10,10));
   ct.add(jp3, BorderLayout.NORTH);
   ct.add(jp1, BorderLayout.SOUTH);
   b0.addActionListener(this);
   b1.addActionListener(this);
   b2.addActionListener(this);
   b3.addActionListener(this);
   b4.addActionListener(this);
   b5.addActionListener(this);
   b6.addActionListener(this);
   b7.addActionListener(this);
   b8.addActionListener(this);
   b9.addActionListener(this);
   bp.addActionListener(this);
   bm.addActionListener(this);
   bmulti.addActionListener(this);
   bd.addActionListener(this);
   bequal.addActionListener(this);
   bc.addActionListener(this);
   
  }
  public void layout(Component obj, int x, int y,int width, int height)
  {
   cc.gridx=x; // ������ġ x
   cc.gridy=y; // ������ġ y
   cc.gridwidth=width; // �����̳� �ʺ�
   cc.gridheight=height;  // �����̳� ����
   jp1.add(obj,cc);
  }
  public void actionPerformed(ActionEvent e) {
   String s = e.getActionCommand();
   // �̺�Ʈ�� �߻���Ų ��ü�� ���ڿ� ��ü s�� ����
   String jtfs = jtf.getText();
  
   // �̺�Ʈ �߻� ����� �ؽ�Ʈ �ʵ� ������ ���ڿ� jtfs�� ����
   if ( s == "0" || s=="1" || s =="2" || s == "3" || s == "4" || s=="5" || s =="6" || s == "7" || s == "8" || s=="9" || s==".") {
     jtf.setText( jtfs + s );
   } // ���ڳ� dot�̸� ���ڿ� �ڿ� ���δ�
   if ( s == "+") {
     operand = jtfs;
     operator = s;
     jtf.setText("+");
   }else if ( s=="-") {
	     operand = jtfs;
	     operator = s;
	     jtf.setText("-");
   }else if ( s =="*") {
	     operand = jtfs;
	     operator = s;
	     jtf.setText("*");
   }else if ( s == "/") {
	     operand = jtfs;
	     operator = s;
	     jtf.setText("/");// ��Ģ�����̸� ������ �ؽ�Ʈ�ʵ� ���� �����ڸ� operand�� operator ��ü�� ����
   if ( s == "C") {
     jtf.setText("");
   }
   } // "C"�̸� �ؽ�Ʈ �ʵ��� ������ �����
//   if ( s == "Backspace") {
//     String temp = jtf.getText();
//     temp = temp.substring(0,temp.length()-1);
//     jtf.setText(temp);
//   } // Backspace�̸� ���ڿ��� ������ ���ڸ� �����ϰ� �ٽ� ��Ÿ����
   double result;
//   if ( s == "%") {
//     result = Double.parseDouble(operand) * Double.parseDouble(jtfs) / 100.0 ;
//     jtf.setText(""+result);
//    } // �μ��� ���� 100���� ���� ��(�ۼ�Ʈ)�� ���Ͽ� ��Ÿ����
//   if ( s == "sqrt") {
//     result = Math.sqrt(Double.parseDouble(jtfs));
//     jtf.setText(""+result);
//    }  // ��Ʈ���� ��Ÿ����
//   if ( s == "1/x") {
//     result = 1 / (Double.parseDouble(jtfs));
//     jtf.setText(""+result);
//    } // �������� ��Ÿ����
//   if ( s == "+/-") {
//     result = -1 * (Double.parseDouble(jtfs));
//     jtf.setText(""+result);
//    } // ������ ���� -1�� ���Ͽ� ��ȣ�� ������Ų��
    if ( s == "=" ) {
      char c = operator.charAt(0);
      switch(c) {
 case '+' :
   result = Double.parseDouble(operand) + Double.parseDouble(jtfs);
   		jtf1.setText(""+result);
          break;
        case '-' :
   result = Double.parseDouble(operand) - Double.parseDouble(jtfs);
   		jtf1.setText(""+result);
          break;
        case '*' :
   result = Double.parseDouble(operand) * Double.parseDouble(jtfs);
   		jtf1.setText(""+result);
          break;
        case '/' :
   result = Double.parseDouble(operand) / Double.parseDouble(jtfs);
   		jtf1.setText(""+result);
          break;
      }
   } // "="�� ��� �ش�Ǵ� �����ڸ� �����Ͽ� �ش� �������� ��Ÿ����
 
  }

}
