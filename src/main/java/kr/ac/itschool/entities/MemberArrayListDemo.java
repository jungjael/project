package kr.ac.itschool.entities;

import kr.ac.itschool.entities.Member;

import java.util.ArrayList;

public class MemberArrayListDemo {
	
	

	public ArrayList<Member> memberListGet(){
		ArrayList<Member>list = new ArrayList<Member>();
		Member member = new Member();
		member.setId("korea");
		member.setName("���ѱ�");
		member.setAddr1("���� ���� �빮��");
		member.setAddr2("594-1����");
		member.setJob("������");
		list.add(member);
		return list;
	
	}

}
