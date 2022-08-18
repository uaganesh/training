package com.controller;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.ClassDemo;
import com.service.AddClassService;





/**
 * Servlet implementation class ViewTeacherDetails
 */
public class ViewClassDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewClassDetails() {
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
		   AddClassService ps=new AddClassService();
		   List<ClassDemo> listofClass=ps.findAllClass();
		   pw.println("<table border=1>");
		   pw.println("<tr> <th>Class Id</th> <th>Class Section</th> </tr>");
		   Iterator<ClassDemo> li=listofClass.iterator();
		   while(li.hasNext())
		   {
			   ClassDemo p=li.next();
			   pw.println("<tr> <td>"+p.getCid()+"</td>  <td>"+p.getCsection()+"</td>  </tr> ");
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
