package com.project.kmt;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class KmtDAO {

	@Autowired
	private SqlSessionTemplate sqlsession;

	
	
	
	
}
