package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Subject;
import com.service.AddSubjectService;





/**
 * Servlet implementation class ViewTeacherDetails
 */
public class ViewSubjectDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewSubjectDetails() {
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
		   AddSubjectService ps=new AddSubjectService();
		   List<Subject> listofSubject=ps.findAllSubject();
		   pw.println("<table border=1>");
		   pw.println("<tr> <th>Subject Id</th> <th>Subject name</th> </tr>");
		   Iterator<Subject> li=listofSubject.iterator();
		   while(li.hasNext())
		   {
			   Subject p=li.next();
			   pw.println("<tr> <td>"+p.getSubid()+"</td>  <td>"+p.getSubname()+"</td> </tr> ");
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
