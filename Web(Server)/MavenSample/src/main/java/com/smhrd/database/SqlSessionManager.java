package com.smhrd.database;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionManager {
	
	public static SqlSessionFactory sqlSession;

	//생성자 메소드랑 비슷해보이긴하는데
	//생성자 : 인스턴스 생성시 초기화하는 메소드
	
	//static은 객체 생성시 실행되는 부분
	   static {
		   //설정파일 경로(db관련 - url,계정 / mapper.xml 경로)
	      String resource = "com/smhrd/database/mybatis-config.xml";
	      Reader reader;
	      try {
	         reader = Resources.getResourceAsReader(resource);
	         sqlSession = new SqlSessionFactoryBuilder().build(reader);
	      } catch (IOException e) {
	         e.printStackTrace();
	      }
	   }
	   
	   //db 연결해주거나 종료, 실행 세션을 관리
	   public static SqlSessionFactory getSqlSession() {
	      return sqlSession;
	   }
	
	
	
	

}
