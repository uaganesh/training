package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Teacher;
import com.service.AddTeacherService;


/**
 * Servlet implementation class ViewTeacherDetails
 */
public class ViewTeacherDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewTeacherDetails() {
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
		   AddTeacherService ps=new AddTeacherService();
		   List<Teacher> listofTeacher=ps.findAllTeacher();
		   pw.println("<table border=1>");
		   pw.println("<tr> <th>Teacher Id</th> <th>Teacher name</th> <th>Teacher Age</th>");
		   Iterator<Teacher> li=listofTeacher.iterator();
		   while(li.hasNext())
		   {
			   Teacher p=li.next();
			   pw.println("<tr> <td>"+p.getTid()+"</td>  <td>"+p.getTname()+"</td>  <td>"+p.getTage()+"</td> </tr> ");
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
