package kr.ac.itschool.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import customutil.CustomDateFormat;
import kr.ac.itschool.dao.MemberDao;
import kr.ac.itschool.dbpool.DBConnectionManager;
import kr.ac.itschool.entities.Member;

public class MemberDaoService implements MemberDao {
	DBConnectionManager db = DBConnectionManager.getInstance();
	Connection cn = null;
	PreparedStatement ps = null; //쿼리를 던지는 문장 
	ResultSet rs =null;

	@Override
	public boolean insertRow(Member data) {
		boolean success = false;
		String inputdate = CustomDateFormat.dateFormat();
		StringBuilder sb = new StringBuilder();
		sb.append("insert into member(id,name,password,phone1,phone2,phone3,");
		sb.append("post,addr1,addr2,cardno,job,picture,inputdate");
		sb.append(")values(");
		sb.append(" '"+data.getId()+"','"+data.getName()+"','"+data.getPassword()+"',");
		sb.append(" '"+data.getPhone1()+"','"+data.getPhone2()+"','"+data.getPhone3()+"',");
		sb.append(" '"+data.getPost()+"','"+data.getAddr1()+"','"+data.getAddr2()+"',");
		sb.append(" '"+data.getCardno()+"','"+data.getJob()+"','"+data.getPicture()+"',");
		sb.append(" '"+inputdate+"')");
		String sql = sb.toString();
		
		try {
			cn = db.getConnection(); //매니져랑 연결해서 cn이 가지고 있다
			ps = (PreparedStatement) cn.prepareStatement( sql ); //명령어(쿼리)를 던지는 것
			ps.execute();
			success = true;
			cn.close();
			ps.close();
			rs.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		return success;
		
			//return success;
		
		
	}

	@Override
	public boolean findId(String id) {
		// TODO Auto-generated method stub
		String sql = "SELECT id FROM member where id ='"+id+"' "; //* 일때는 desc순서대로 1,2,3,... 위와같이 지정하면 select 1, 2, 3 이렇게 된다(rs.execute에서 출력시)
		boolean findid=false;
		try {
			cn = db.getConnection(); //매니져랑 연결해서 cn이 가지고 있다
			ps = (PreparedStatement) cn.prepareStatement( sql ); //명령어(쿼리)를 던지는 것
			rs = ps.executeQuery(); //결과값을 가지고 있다 에러가 나면 캐치문으로 빠지게 된다DB전용 빈이라고 생각하면 쉽다 executeQuery 는 select에서 사용 select는 무조건 resultset으로 받습니다.

			if ( rs.next() ) { 
			findid = true;
			}
			cn.close();
			ps.close();
			rs.close();
		} catch (Exception e) {
			System.out.println("db error : "+e.getMessage());
		}
		return findid;
	}
	@Override
	public void selectAll() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM student student"; //* 일때는 desc순서대로 1,2,3,... 위와같이 지정하면 select 1, 2, 3 이렇게 된다(rs.execute에서 출력시)
		try {
			cn = db.getConnection(); //매니져랑 연결해서 cn이 가지고 있다
			ps = (PreparedStatement) cn.prepareStatement( sql ); //명령어(쿼리)를 던지는 것
			rs = ps.executeQuery(); //결과값을 가지고 있다 에러가 나면 캐치문으로 빠지게 된다DB전용 빈이라고 생각하면 쉽다 executeQuery 는 select에서 사용 select는 무조건 resultset으로 받습니다.
			while (rs.next()){
				System.out.print(" --> "+rs.getString(1)+" "+rs.getString(2)+rs.getInt("age")); //number -> string 가능 varchar -> int 불가능
			}
//			if ( rs.next() ) {  //결과값이 여려개면 while 문으로 짜는것 그러므로 결과값이 몇개인지 확실히 알아야 한다 insert,delete,update는 결과가 들어갔다 안들어갔다 둘중하나
//				System.out.println( rs.getInt(1) );
//			}
		} catch (Exception e) {
			System.out.println("db error : "+e.getMessage());
		}
	}
	

}
