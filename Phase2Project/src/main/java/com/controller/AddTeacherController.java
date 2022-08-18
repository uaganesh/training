package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Teacher;
import com.service.AddTeacherService;

/**
 * Servlet implementation class AddTeacherController
 */
public class AddTeacherController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddTeacherController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		try
		{
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		
		int tid=Integer.parseInt(request.getParameter("tid"));
		String tname=request.getParameter("tname");
		int tage=Integer.parseInt(request.getParameter("tage"));
		Teacher tobj=new Teacher();
		tobj.setTid(tid);
		tobj.setTname(tname);
		tobj.setTage(tage);
		
		AddTeacherService ats=new AddTeacherService();
		int result=ats.AddTeacherToDao(tobj);
		if(result==0) {
		    RequestDispatcher rd = request.getRequestDispatcher("AddTeacher.jsp");
		    rd.include(request, response);
		    pw.print("<center><span style='color:brown'>Record didn't insert!!!<br>Provide Correct Details!</span</center>");
		   }else {
		   RequestDispatcher rd = request.getRequestDispatcher("AddTeacher.jsp");
		   rd.include(request, response);
		   pw.print("<center><span style='color:magenta'>Record inserted Succesfully!!!</span</center>"); 
		   }
		
		
		}
		catch(Exception e)
		{
			
		}
		
	}

}
