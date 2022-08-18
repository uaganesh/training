package com.controller;

import java.io.IOException;


import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.ClassDemo;
import com.service.AddClassService;


/**
 * Servlet implementation class AddStudentController
 */
public class AddClassController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddClassController() {
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
	
		int cid=Integer.parseInt(request.getParameter("cid"));
		String csection=request.getParameter("csection");
		ClassDemo tobj=new ClassDemo();
		tobj.setCid(cid);
		tobj.setCsection(csection);
	
		
		AddClassService ats=new AddClassService();
		int result=ats.AddClassToDao(tobj);
		if(result==0) {
		    RequestDispatcher rd = request.getRequestDispatcher("AddClass.jsp");
		    rd.include(request, response);
		    pw.print("<center><span style='color:brown'>Record didn't insert!!!<br>Provide Correct Details!</span</center>");
		   }else {
		   RequestDispatcher rd = request.getRequestDispatcher("AddClass.jsp");
		   rd.include(request, response);
		   pw.print("<center><span style='color:magenta'>Record inserted Succesfully!!!</span</center>"); 
		   }
		
		
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
	}
	}


