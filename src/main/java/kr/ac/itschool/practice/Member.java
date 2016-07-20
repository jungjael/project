package kr.ac.itschool.practice;

public interface Member {
	public void insert();
	public int update();
	public String select();
	public int delete();
	void insert(String no);
	Class<?> getDeclaringClass();
	String getName();
	int getModifiers();
	boolean isSynthetic();
	

}


//개별적으로 리턴 시킬수 있는 방법은 bean 을 이용해서 할수 있다