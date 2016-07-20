package kr.ac.itschool.practice;

import java.util.ArrayList;

public class ArraylistDemo {
	
	ArrayList<String> arrayListMeth(String arr[]){
		ArrayList<String> list = new ArrayList();
		
		for(int i = 0; i < arr.length;i++){
			list.add(arr[i]);
		}
		
	
/*		list.add("Java");
		list.add("Oracle");
		list.add("JSP");
		list.add("MySQL");
		list.remove(0);
//		System.out.println(list.size());    */
		return list; //.size();
	}
	
	ArrayList<String> subjectMeth(String subject){
		String[] in =  subject.split("[|]");
		ArrayList<String> list3 = new ArrayList();
		for(int i = 0; i < in.length;i++){
			list3.add(in[i]);
			
		}
		
		return list3;
		
	
	}
	
	ArrayList<Integer> subjectMeth(int start, int end) {
	
		ArrayList list5 = new ArrayList();
		for(int i = start; i < end; i++){
			i += 1;
			list5.add(i); 
		}
		return list5;
	
	}
	ArrayList<Integer> evenList(int str, int ent){
		ArrayList listoff = new ArrayList();
		
		for(int i = str; i <= ent; i++){
			if(i%2 == 0){
		
				listoff.add(i);
					
			}
		}
		return listoff;
		
		
		

			
		
	}
}
