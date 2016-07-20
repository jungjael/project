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
   
   // 계산기에서 사용할 버튼과 텍스트 필드 객체 선언
   private String operand, operator;
   // 첫번째 오퍼란드 값을 저장할 operand와 오퍼레이터를 저장할 operator 선언
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
   cc.gridx=x; // 시작위치 x
   cc.gridy=y; // 시작위치 y
   cc.gridwidth=width; // 컨테이너 너비
   cc.gridheight=height;  // 컨테이너 높이
   jp1.add(obj,cc);
  }
  public void actionPerformed(ActionEvent e) {
   String s = e.getActionCommand();
   // 이벤트를 발생시킨 객체를 문자열 객체 s에 저장
   String jtfs = jtf.getText();
  
   // 이벤트 발생 당시의 텍스트 필드 내용을 문자열 jtfs에 저장
   if ( s == "0" || s=="1" || s =="2" || s == "3" || s == "4" || s=="5" || s =="6" || s == "7" || s == "8" || s=="9" || s==".") {
     jtf.setText( jtfs + s );
   } // 숫자나 dot이면 문자열 뒤에 붙인다
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
	     jtf.setText("/");// 사칙연산이면 현재의 텍스트필드 값과 연산자를 operand와 operator 객체에 저장
   if ( s == "C") {
     jtf.setText("");
   }
   } // "C"이면 텍스트 필드의 내용을 지운다
//   if ( s == "Backspace") {
//     String temp = jtf.getText();
//     temp = temp.substring(0,temp.length()-1);
//     jtf.setText(temp);
//   } // Backspace이면 문자열의 마지막 글자를 제외하고 다시 나타낸다
   double result;
//   if ( s == "%") {
//     result = Double.parseDouble(operand) * Double.parseDouble(jtfs) / 100.0 ;
//     jtf.setText(""+result);
//    } // 두수의 곱을 100으로 나눈 값(퍼센트)를 구하여 나타낸다
//   if ( s == "sqrt") {
//     result = Math.sqrt(Double.parseDouble(jtfs));
//     jtf.setText(""+result);
//    }  // 루트값을 나타낸다
//   if ( s == "1/x") {
//     result = 1 / (Double.parseDouble(jtfs));
//     jtf.setText(""+result);
//    } // 역수값을 나타낸다
//   if ( s == "+/-") {
//     result = -1 * (Double.parseDouble(jtfs));
//     jtf.setText(""+result);
//    } // 현재의 값에 -1을 곱하여 부호를 반전시킨다
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
   } // "="일 경우 해당되는 연산자를 구분하여 해당 연산결과를 나타낸다
 
  }

}
