package com.spring.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.dao.HrDao;
import com.spring.model.Hr;

@Service("hrService")
public class HrServiceImpl {
	
	@Resource(name="hrDao")
	private HrDao hrDao;
	
	public List<Hr> getHrList() {
		return hrDao.getHrList();
	}
}
