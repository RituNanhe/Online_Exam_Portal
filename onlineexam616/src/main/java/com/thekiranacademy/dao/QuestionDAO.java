package com.thekiranacademy.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.thekiranacademy.entity.Question;

import java.util.List;

import org.hibernate.*;
import org.hibernate.query.Query;


@Repository
public class QuestionDAO 
{

	@Autowired
	SessionFactory factory;
	
	public List<Question> getAllQuestions(String subject)
	{
		Session session=factory.openSession();
			
		Query query=session.createQuery("from Question where subject=:subject");
		
		query.setParameter("subject",subject);
		
		return query.list();
		
	}
	
	
	

}
