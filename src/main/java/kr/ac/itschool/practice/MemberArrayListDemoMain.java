package kr.ac.itschool.practice;

import java.util.ArrayList;

import kr.ac.itschool.entities.Member;

import kr.ac.itschool.entities.MemberArrayListDemo;

public class MemberArrayListDemoMain {
	public static void main(String [] args){
		MemberArrayListDemo obj = new MemberArrayListDemo();
		ArrayList<Member> list = obj.memberListGet();
		Member data = null;
		for(int i =0; i < list.size();i++){
			data = new Member();
			data = list.get(i);
		System.out.println("ID: "+data.getId()+"name: "+data.getName());
		}
		
	}

}

//setting : �ڷḦ set() => bean => list

//getting : list �о => bean => get
//				  ->new->