package kr.ac.itschool.entities;


public class JavaBeanDemoMain {
	
	public static void main(String [] args) {
		JavaBeanDemo obj = new JavaBeanDemo();
		
		Member data = obj.javamemberGet();
		//data.setName("lee");
		System.out.println("주소:"+data.getAddr1());
		System.out.println("이름:"+data.getName());
		//System.out.println("나이:"+data.getAge());
		System.out.println("직업:"+data.getJob());
		System.out.println("전번:"+data.getPhone1());
		obj.memberSetting(data);
		obj.memberFree(data);
		
		
	}

}
//ArrayList <student> list = new ArrayList <student> ();
