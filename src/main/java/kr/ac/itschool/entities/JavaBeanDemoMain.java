package kr.ac.itschool.entities;


public class JavaBeanDemoMain {
	
	public static void main(String [] args) {
		JavaBeanDemo obj = new JavaBeanDemo();
		
		Member data = obj.javamemberGet();
		//data.setName("lee");
		System.out.println("�ּ�:"+data.getAddr1());
		System.out.println("�̸�:"+data.getName());
		//System.out.println("����:"+data.getAge());
		System.out.println("����:"+data.getJob());
		System.out.println("����:"+data.getPhone1());
		obj.memberSetting(data);
		obj.memberFree(data);
		
		
	}

}
//ArrayList <student> list = new ArrayList <student> ();
