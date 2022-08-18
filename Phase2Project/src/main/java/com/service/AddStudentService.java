package com.service;

import java.util.Iterator;
import java.util.List;

import com.bean.Student;
import com.dao.StudentDao;

public class AddStudentService {

		StudentDao td=new StudentDao();
		
		public int AddStudentToDao(Student t)
		{
			if(td.storeStudent(t)>0) 
			{
	            return 1;
	        }
			else 
	        {
	            return 0;
	        }
			
			
		}
		
		public List<Student> findAllStudent()
		{
			List<Student> listOfStudent=td.findAllStudent();
			Iterator<Student> li =listOfStudent.iterator();
			
			return listOfStudent;
			
		}
}

