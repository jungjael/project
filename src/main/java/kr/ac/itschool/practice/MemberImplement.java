package kr.ac.itschool.practice;



public class MemberImplement implements Member{

	@Override
	public void insert(String no) {
		
		
	}

	@Override
	public int update() {
		
		return 0;
	}

	@Override
	public String select() {
		String sql = "select * from student where name is not null";
		return sql;
	}

	@Override
	public int delete() {
		
		return 0;
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Class<?> getDeclaringClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getModifiers() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isSynthetic() {
		// TODO Auto-generated method stub
		return false;
	}

}
