package com.spring.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.dao.HrDao;
import com.spring.model.Hr;

@Repository("hrDao")
public class HrDaoImpl implements HrDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public List<Hr> getHrList() {
		return sqlSession.selectList("getHrList");
	}
}
