package com.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.stud;
@Repository
@Transactional

public class stuDao implements stuDaoIntr {
	@Autowired
	private SessionFactory sessionFactory;
   
	public String register(stud s) {
		// TODO Auto-generated method stub
		System.out.println("STUDENT ADDE");
		sessionFactory.getCurrentSession().save(s);
		return "Added data successfully";	
	}

}
