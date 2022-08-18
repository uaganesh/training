package com.service;

import java.util.Iterator;
import java.util.List;

import com.bean.Student;
import com.bean.Subject;
import com.dao.SubjectDao;

public class AddSubjectService {

		SubjectDao td=new SubjectDao();
		
		public int AddSubjectToDao(Subject t)
		{
			if(td.storeSubject(t)>0) 
			{
	            return 1;
	        }
			else 
	        {
	            return 0;
	        }
			
		}
		
		public List<Subject> findAllSubject()
		{
			List<Subject> listOfSubject=td.findAllSubject();
			Iterator<Subject> li =listOfSubject.iterator();
			
			return listOfSubject;
			
		}
}

