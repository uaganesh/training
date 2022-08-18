package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Subject;
import com.service.AddSubjectService;



/**
 * Servlet implementation class AddStudentController
 */
public class AddSubjectController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddSubjectController() {
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
		
		int tid=Integer.parseInt(request.getParameter("subid"));
		String tname=request.getParameter("subname");
		
		Subject tobj=new Subject();
		tobj.setSubid(tid);
		tobj.setSubname(tname);
	
		
		AddSubjectService ats=new AddSubjectService();
		int result=ats.AddSubjectToDao(tobj);
		if(result==0) {
		    RequestDispatcher rd = request.getRequestDispatcher("AddSubject.jsp");
		    rd.include(request, response);
		    pw.print("<center><span style='color:brown'>Record didn't insert!!!<br>Provide Correct Details!</span</center>");
		   }else {
		   RequestDispatcher rd = request.getRequestDispatcher("AddSubject.jsp");
		   rd.include(request, response);
		   pw.print("<center><span style='color:magenta'>Record inserted Succesfully!!!</span</center>"); 
		   }
		
		
		}
		catch(Exception e)
		{
			
		}
		
	}
	}


