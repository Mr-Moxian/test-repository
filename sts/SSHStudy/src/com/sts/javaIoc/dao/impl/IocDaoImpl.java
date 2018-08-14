package com.sts.javaIoc.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sts.javaIoc.dao.IocDao;

public class IocDaoImpl implements IocDao {
	
	private JdbcTemplate jdbcTemplete;
	
	public void setJdbcTemplete(JdbcTemplate jdbcTemplete) {
		this.jdbcTemplete = jdbcTemplete;
	}
	
	public IocDaoImpl() {
		System.out.println("IocDaoImpl create");
	}
	
	@Override
	public void execute() {
		List<Map<String, Object>> queryForList = jdbcTemplete.queryForList("select * from t_sys_user");
		if(queryForList == null || queryForList.size() ==0) {
			
			System.out.println("查询无结果！");
		}
		else {
			for (Map<String, Object> map : queryForList) {
				System.out.println(map);
			}
		}
	}
}
