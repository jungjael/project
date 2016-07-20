package kr.ac.itschool.practice;

import java.util.ArrayList;

public class ArraylistDemoMain {
	

	public static void main(String[] args) {
		ArraylistDemo obj = new ArraylistDemo();
		String arr[] = {"java","jsp","android","oracle","mssql"};
		ArrayList<String> list = obj.arrayListMeth(arr);
		for(String list1 : list){
			//String res = list.get(i);
	
	/*	ArrayList<String> list = obj.arryListMeth();
		for(int i = 0; i < list.size();i++ ){
			String str = list.get(i);
			System.out.println(str);
		}    */
		System.out.println(list1);
		}
		String subject = "oracle|mssql|java|jsp|android|html";
		ArrayList <String> list3 = obj.subjectMeth(subject);
		for(String list4 : list3){
			System.out.println(list4);
		}
		//  arrayList 를 받아서 짝수들만 
		int start = 1;
		int end = 100;
		ArrayList <Integer> list5 = obj.subjectMeth(start,end);
		for(int list6 : list5){
			System.out.print(list6+" ");
		}
		System.out.println();
		int str = 0;
		int ent = 100;

		ArrayList <Integer> liston = obj.evenList(str, ent);
		for(Integer listout : liston){
			System.out.println(listout+" "+"짝수입니다.");
			
		}
	}

}
