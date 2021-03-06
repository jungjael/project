package member;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;

import kr.ac.itschool.entities.Member;
import kr.ac.itschool.service.MemberDaoService;



public class MemberGuiActionListener implements ActionListener {
	MemberDaoService service = new MemberDaoService();
	boolean confirmchk;	DefaultTableModel model; JTable table;
	JTextField find;JTextField id;JTextField name;JTextField phone1;
	JTextField phone2;JTextField phone3;JTextField post;JTextField addr1;
	JTextField addr2;JTextField password;
	MemberGuiActionListener(boolean confirmchk, DefaultTableModel model,
			JTextField find,JTable table,JTextField id,JTextField password,
			JTextField name,JTextField phone1,JTextField phone2,
			JTextField phone3,JTextField post,JTextField addr1,
			JTextField addr2) {
		this.confirmchk = confirmchk;
		this.model = model;
		this.find  = find;
		this.table = table;
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone1=phone1;
		this.phone2=phone2;
		this.phone3=phone3;
		this.post=post;
		this.addr1=addr1;
		this.addr2=addr2;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String btntxt = e.getActionCommand();
		boolean success;
		
		boolean findid = service.findId(id.getText());
//		if(findid){
//			JOptionPane.showMessageDialog(id, "ID중복입니다.");
//			id.setText("");
//			confirmchk = false;
//			return;
//		}else if((!findid)&&id.getText().equals("")){
//			JOptionPane.showMessageDialog(id, " ID입력하세요");
//			confirmchk = false;
//			return;
//		}else{
//			JOptionPane.showMessageDialog(id, "사용가능한 ID 입니다");
//			confirmchk = true;
//		}
		
		if(btntxt.equals("중복검사")){
			
			if(findid){
				JOptionPane.showMessageDialog(id, "ID중복입니다.");
				id.setText("");
				confirmchk = false;
				return;
			}else if((!findid)&&id.getText().equals("")){
				JOptionPane.showMessageDialog(id, " ID입력하세요");
				confirmchk = false;
				return;
			}else{
				JOptionPane.showMessageDialog(id, "사용가능한 ID 입니다");
				confirmchk = true;
			}
		}
		String message = "- 입력시 체크사항 - \n\n";
		if ( !confirmchk )
			message += "중복검사 하세요! \n";
		
		if (id.getText().equals("") || id.getText() == null) {
			message += "ID를 입력하세요! \n";
		}
		if (name.getText().equals("") || name.getText() == null) {
			message +=  "이름을 입력하세요!\n";
			
		}
		if (!message.equals("- 입력시 체크사항 - \n\n")){
			JOptionPane.showMessageDialog(id, message);
			return;
		}
		
		Member data = new Member();
		
		data.setId(id.getText());
		data.setName(name.getText());
		data.setPassword(password.getText());
		data.setPhone1(phone1.getText());
		data.setPhone2(phone2.getText());
		data.setPhone3(phone3.getText());
		data.setPost(post.getText());
		data.setAddr1(addr1.getText());
		data.setAddr2(addr2.getText());
		
		if ( btntxt.equals("입력")){
			insertMember( data );
			
		}
		
	}
//	void idConfirmChk() {
//		MemberDaoService service = new MemberDaoService();
//		boolean findid = service.findId(id.getText());
//		if(findid){
//			JOptionPane.showMessageDialog(id, "ID중복입니다.");
//			id.setText("");
//			confirmchk = false;
//			return;
//		}else if((!findid)&&id.getText().equals("")){
//			JOptionPane.showMessageDialog(id, " ID입력하세요");
//			confirmchk = false;
//			return;
//		}else{
//			JOptionPane.showMessageDialog(id, "사용가능한 ID 입니다");
//			confirmchk = true;
//		}
//	}
	
	void insertMember( Member data ) {
		boolean success = service.insertRow(data);
		if(success){
			
			Object row[] ={ "", "", ""};
			row[0] = data.getId();
			row[1] = data.getName();
			row[2] = data.getPhone1()+"-"+data.getPhone2()+"-"+data.getPhone3();
			model.addRow( row );
		
			JOptionPane.showMessageDialog(id,"저장되었습니다.");
			
		}else{
			JOptionPane.showMessageDialog(id,"저장이 실패하였습니다.");
			
		}
		
//		Object row[] ={ "", "", ""};
//		row[0] = data.getId();
//		row[1] = data.getName();
//		row[2] = data.getPhone1()+"-"+data.getPhone2()+"-"+data.getPhone3();
//		model.addRow( row );
		screenClear();
		
	}
	void screenClear() {
		id.setText("");;
		password.setText("");
		name.setText("");
		phone1.setText("");
		phone2.setText("");
		phone3.setText("");
		post.setText("");
		addr1.setText("");
		addr2.setText("");
		confirmchk = false;
	}
	
}
