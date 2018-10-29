package com.aws.codestar.projecttemplates.dao;

import java.util.List;

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
		Session  session=sf.getCurrentSession();
		Alien a=(Alien) session.get(Alien.class, aid);
		System.out.println(a);
		
		return a;
		
	}
	
	 @Transactional
	   	public Alien createAlien(Alien a) {
	   		
	   		Session session=sf.getCurrentSession();
	   		Alien alien=(Alien) session.save(a);
	   		return alien;
	   	}
	    
	    @Transactional
	   	public List<Alien> getAliens() {
	   		
	   		Session session=sf.getCurrentSession();
	   		List<Alien> alien=session.createCriteria(Alien.class).list();
	   		//List<Alien> alien1=session.createQuery("from Alien").list();
	   		return alien;
	   	}
}
