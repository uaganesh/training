package com.service;

import java.util.Iterator;
import java.util.List;

import com.bean.ClassDemo;
import com.dao.ClassDao;

public class AddClassService {
	
	ClassDao td=new ClassDao();
	
	public int AddClassToDao(ClassDemo t)
	{
		if(td.storeClass(t)>0) {
            return 1;
        }else {
            return 0;
        }
		
	}
			
	public List<ClassDemo> findAllClass()
	{
		List<ClassDemo> listOfClass=td.findAllClass();
		Iterator<ClassDemo> li =listOfClass.iterator();
		
		return listOfClass;
		
	}
}
