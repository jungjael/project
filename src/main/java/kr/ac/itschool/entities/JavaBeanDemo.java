package kr.ac.itschool.entities;

public class JavaBeanDemo {
	Member javamemberGet(){
		Member data = new Member();
		data.setName("kim");
	//	data.setAge(25);
		data.setAddr2("대전 서구");
		data.setJob("developer");
		data.setPhone1("010-0000-0000");
		return data;
	}
	void memberSetting (Member data){
		String name = data.getName();
		if(name.equals("kim")){
			System.out.println("이름:"+data.getName()+"\n"+"addr:"+data.getAddr1());
		}else{
			System.out.println("not found...");
		}
		System.out.println();
	}
	void memberFree (Member data){
		String name = data.getName();
		if(name.equals("kim")){
			System.out.println("메롱");
			
		}
	}

}
