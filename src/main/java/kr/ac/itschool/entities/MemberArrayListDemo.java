package kr.ac.itschool.entities;

import kr.ac.itschool.entities.Member;

import java.util.ArrayList;

public class MemberArrayListDemo {
	
	

	public ArrayList<Member> memberListGet(){
		ArrayList<Member>list = new ArrayList<Member>();
		Member member = new Member();
		member.setId("korea");
		member.setName("이한국");
		member.setAddr1("대전 서구 용문동");
		member.setAddr2("594-1번지");
		member.setJob("개발자");
		list.add(member);
		return list;
	
	}

}
