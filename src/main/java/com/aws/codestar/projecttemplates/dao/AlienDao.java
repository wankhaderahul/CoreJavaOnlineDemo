package com.aws.codestar.projecttemplates.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aws.codestar.projecttemplates.model.Alien;

@Repository
public class AlienDao {

	@Autowired
	SessionFactory sf;
	
	
	
	@Transactional
	public Alien getAlien(int aid) {
		Session  session=sf.openSession();
		Alien a=session.get(Alien.class, aid);
		System.out.println(a);
		
		return a;
		
	}
}
