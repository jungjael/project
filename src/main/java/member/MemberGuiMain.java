package member;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;



public class MemberGuiMain {

	public static void main(String[] args) {
		boolean confirmchk = false;
		JFrame frame = new JFrame("Member");
		frame.setLocation(500, 200);
		frame.setPreferredSize(new Dimension(920,500));
		Container contentPane = frame.getContentPane();
		Font font = new Font("바탕체", Font.TYPE1_FONT, 14);
//		Font font15 = new Font("바탕체", Font.TYPE1_FONT, 15);
		String colNames[] = {"ID","이름","전화번호"}; 
		
		DefaultTableModel model = new DefaultTableModel(colNames,0);
		
		JTable table = new JTable( model );
		//table.setFont(font15);
		contentPane.add( new JScrollPane(table), BorderLayout.WEST);
		
		JPanel panel1= new JPanel();
		panel1.setLayout( new GridLayout(0,2));
		
		JLabel  labelid = new JLabel("ID");
		labelid.setHorizontalAlignment(JLabel.CENTER);
		JPanel idpanel = new JPanel();
		JTextField id = new JTextField(11);
		JButton conbtn = new JButton("중복검사");
		idpanel.add(id);
		idpanel.add(conbtn);
		id.setFont(font);
		
		JLabel  labelpasswd = new JLabel( "비밀번호" );
		labelpasswd.setHorizontalAlignment(JLabel.CENTER);
		JTextField password = new JTextField(11);
		id.setFont(font);
		
		JLabel  labelname = new JLabel( "이름" );
		labelname.setHorizontalAlignment(JLabel.CENTER);
		JTextField name = new JTextField(11);
		name.setFont(font);
		JLabel  labelphone = new JLabel( "전화번호" );
		labelphone.setHorizontalAlignment(JLabel.CENTER);
		JPanel phonepanel= new JPanel();
		JTextField phone1 = new JTextField(3);
		phone1.setFont(font); 
//		phone1.BorderLayout(JTextField.WEST);
		JLabel label1 = new JLabel("-");
		JTextField phone2 = new JTextField(4);
		phone2.setFont(font); 
//		phone2.BorderLayout(JTextField.CENTER);
		JLabel label2 = new JLabel("-");
		JTextField phone3 = new JTextField(4);
//		phone3.BorderLayout(JTextField.EAST);
		phone3.setFont(font); 
		phonepanel.add(phone1);
		phonepanel.add(label1);
		phonepanel.add(phone2);
		phonepanel.add(label2);
		phonepanel.add(phone3);
		phonepanel.add(phone3);
		JLabel labelpost = new JLabel("우편번호");
		labelpost.setHorizontalAlignment(JLabel.CENTER);
		JTextField post = new JTextField(5);
		JLabel labeladdr1 = new JLabel("주소");
		labeladdr1.setHorizontalAlignment(JLabel.CENTER);
		JTextField addr1 = new JTextField(50);
		addr1.setFont(font);
		JLabel labeladdr2 = new JLabel("");
		JTextField addr2 = new JTextField(50);
		addr2.setFont(font);
		post.setFont(font); 
		JLabel labelcardno = new JLabel("카드번호");
		labelcardno.setHorizontalAlignment(JLabel.CENTER);
		JTextField cardno = new JTextField(11);
		cardno.setFont(font);
		JLabel  labeljob = new JLabel("직업");
		labeljob.setHorizontalAlignment(JLabel.CENTER);
		JTextField job = new JTextField(11);
		job.setFont(font);
		JLabel  labelpicture = new JLabel("사진");
		labelpicture.setHorizontalAlignment(JLabel.CENTER);
		JTextField picture = new JTextField(11);
		picture.setFont(font);
		JLabel  labelinputdate = new JLabel("기타");
		labelinputdate.setHorizontalAlignment(JLabel.CENTER);
		JTextField inputdate = new JTextField(11);
		inputdate.setFont(font);
		
		panel1.add(labelid);
		panel1.add(idpanel);
		panel1.add(labelpasswd);
		panel1.add(password);
		panel1.add(labelname);
		panel1.add(name);
		panel1.add(labelphone);
		panel1.add(phonepanel);
		panel1.add(labelpost);
		panel1.add(post);
		panel1.add(labeladdr1);
		panel1.add(addr1);
		panel1.add(labeladdr2);
		panel1.add(addr2);
		panel1.add(labelcardno);
		panel1.add(cardno);
		panel1.add(labeljob);
		panel1.add(job);
		panel1.add(labelpicture);
		panel1.add(picture);
		panel1.add(labelinputdate);
		panel1.add(inputdate);
	//	panel1.setSize(400,300);
		contentPane.add( panel1, BorderLayout.CENTER);
		
		String arrbtn[] = {"입력","수정","삭제","검색","취소"};
		JPanel panel = new JPanel();
		JTextField find = new JTextField(9);
		find.setFont(font);
		JButton button;
		ActionListener listener = new MemberGuiActionListener(confirmchk,
				model, find, table , id, name, password, phone1, phone2,
				phone3, post, addr1, addr2) ;
		for ( int i = 0 ; i < arrbtn.length ; i++ ) {
			button = new JButton( arrbtn[i]);
			panel.add(button);
			
			if (i == 2)
				panel.add(find);
			
			button.addActionListener( listener );
		}
		conbtn.addActionListener( listener);
		contentPane.add( panel, BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible( true );
	}

}