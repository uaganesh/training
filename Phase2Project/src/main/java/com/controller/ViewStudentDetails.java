package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Student;
import com.service.AddStudentService;



/**
 * Servlet implementation class ViewTeacherDetails
 */
public class ViewStudentDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewStudentDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		 PrintWriter pw =response.getWriter();
		   response.setContentType("text/html");
		   AddStudentService ps=new AddStudentService();
		   List<Student> listofStudent=ps.findAllStudent();
		   pw.println("<table border=1>");
		   pw.println("<tr> <th>Student Id</th> <th>Student name</th> <th>Student Age</th>");
		   Iterator<Student> li=listofStudent.iterator();
		   while(li.hasNext())
		   {
			   Student p=li.next();
			   pw.println("<tr> <td>"+p.getSid()+"</td>  <td>"+p.getSname()+"</td>  <td>"+p.getSage()+"</td> </tr> ");
		   }
		   pw.println("</table>");
		   
		
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
