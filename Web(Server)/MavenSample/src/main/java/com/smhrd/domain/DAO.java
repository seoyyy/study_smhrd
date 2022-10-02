package com.smhrd.domain;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.database.SqlSessionManager;

public class DAO {
	
	//연결 종료 실행 하는 세션
	// 그걸 sqlsession에  SqlSessionFactory 메소드가 관리해줌
	
	//객체 생성도안했는데 어떻게 바로 사용가능하지?? => sqlSessionManager클래스에 세션 관리하는 메소드 앞에 static이 붙어있음!! static 키워드가 어디에서든 호출가능하게 만듬
	//static(정적메소드) : 프로그램이 실행되자마자 객체 생성 혹은 변수 선언 따로 할 필요 없이 특정한 주소에 자리를 잡음.  -> 다른 클래스 내에서도 선언없이 바로 사용가능
	SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
	
	//이제부터 세션을 생성하는 공장으로 보면됨!
	
	//sqlfactory 안에서 세션 생성하는 코드 .openSession();
	 SqlSession sqlSession = sqlSessionFactory.openSession();
	
	 //회원가입 기능
	 public int join(Member m_vo) {
		 //db에 어떠한 값들을 삽입할지 정의해주면됨
		 int cnt = 0;
		 
		 try {
			
			 //sql문이 제대로 실행되었을때(가입 성공) -> commit
			 //sql문 실행시 오류(가입 실패) -> rollback
			 //그래서 insert해주느는걸 cnt int형으로 결과값나오게끔해주기
			 //cnt -> 제대로 삽입(1) , 안된경우(0)
			 
			 //어떤 sql문들을 실행할건지 - 그게 MemberMapper 거기에 정리되어있음 거기를 알려주면됨
			 cnt = sqlSession.insert("com.smhrd.domain.DAO.insert",m_vo); //insert할때 어떤 sql문을 찾아가야할지 - mapper  , 어떤 값들을 넣어줄지 매개인자나 객체
		
			if(cnt>0) {
				sqlSession.commit();
			}else {
				sqlSession.rollback();
			}
			 
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }finally {
			 sqlSession.close();
		 }
		 return cnt;
	 }
	 
	 
	 public Member login(Member m_vo) {
		 //db에 어떠한 값들을 삽입할지 정의해주면됨
		 Member m = null;
		 
		 try {
			
			 //sql문이 제대로 실행되었을때(가입 성공) -> commit
			 //sql문 실행시 오류(가입 실패) -> rollback
			 //그래서 insert해주느는걸 cnt int형으로 결과값나오게끔해주기
			 //cnt -> 제대로 삽입(1) , 안된경우(0)
			 
			 //어떤 sql문들을 실행할건지 - 그게 MemberMapper 거기에 정리되어있음 거기를 알려주면됨
			 m = (Member)sqlSession.selectOne("com.smhrd.domain.DAO.selectOne",m_vo); //로그인이라는게 하나의 회원만 선택하는거닌까
		
			if(m!=null) {
				sqlSession.commit();
			}else {
				sqlSession.rollback();
			}
			 
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }finally {
			 sqlSession.close();
		 }
		 return m;
	 }
	

}
