package com.service;

import java.util.Iterator;

import java.util.List;

import com.bean.Teacher;
import com.dao.TeacherDao;

public class AddTeacherService {
	
	TeacherDao td=new TeacherDao();
	
	public int AddTeacherToDao(Teacher t)
	{
		if(td.storeTeacher(t)>0) {
            return 1;
        }else {
            return 0;
        }
		
	}
	
	public List<Teacher> findAllTeacher()
	{
		List<Teacher> listOfTeacher=td.findAllTeacher();
		Iterator<Teacher> li =listOfTeacher.iterator();
		
		return listOfTeacher;
		
	}
			

}
