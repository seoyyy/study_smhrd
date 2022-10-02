package com.smhrd.domain;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.database.SqlSessionManager;

public class BoardDAO {
	SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
	public int getLike(int boardNum) {
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int like = -1;

		try {
			like = (int)sqlSession.selectOne("com.smhrd.domain.BoardDAO.getLike", boardNum);
			if(like!=-1) {
				sqlSession.commit();
			}else {
				sqlSession.rollback();
			}
		}finally {
			sqlSession.close();
		}
		return like;
	}
	
	public int updateLike(int boardNum, String status) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int cnt = 0;

		try {
			if(status.equals("like")) {
				System.out.println(boardNum);
				cnt = (int)sqlSession.update("com.smhrd.domain.BoardDAO.like", boardNum);
			}else {
				cnt = (int)sqlSession.update("com.smhrd.domain.BoardDAO.dislike", boardNum);
			}
			if(cnt!=0) {
				sqlSession.commit();
			}else {
				sqlSession.rollback();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}
	
	public List<Comm> selectAllComm(int boardNum) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Comm> commList = null;

		try {
			commList = sqlSession.selectList("com.smhrd.domain.BoardDAO.selectAllComm", boardNum);
			if(commList!=null) {
				sqlSession.commit();
			}else {
				sqlSession.rollback();
			}
		}finally {
			sqlSession.close();
		}
		return commList;
	}
	
	public int addComment(Comm comm) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int commNum = 0;
		try {
			sqlSession.insert("com.smhrd.domain.BoardDAO.addComment", comm);
			commNum = sqlSession.selectOne("com.smhrd.domain.BoardDAO.getCommNum");
			
			if(commNum!=0) {
				sqlSession.commit();
			}else {
				sqlSession.rollback();
			}
		}finally {
			sqlSession.close();
		}
		return commNum;
	}
	
	public int deleteComment(int commNum) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int cnt = 0;
		try {
			cnt = sqlSession.delete("com.smhrd.domain.BoardDAO.deleteComment", commNum);
			if(cnt>0) {
				sqlSession.commit();
			}else {
				sqlSession.rollback();
			}
		}finally {
			sqlSession.close();
		}
		return cnt;
	}
	
}
