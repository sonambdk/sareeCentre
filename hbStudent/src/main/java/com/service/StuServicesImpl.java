package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Dao.stuDaoIntr;
import com.model.stud;
@Service
public class StuServicesImpl implements StuServices {
@Autowired
stuDaoIntr userdao;
public String register(stud s) {
		// TODO Auto-generated method stub
		return userdao.register(s);
	}
}
