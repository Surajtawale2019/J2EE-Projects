package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		PrintWriter writer = res.getWriter();
		
		res.setContentType("text/html");

		String name= req.getParameter("name");
		String dob = req.getParameter("dob");
		String gender= req.getParameter("gender");
		String quali= req.getParameter("quali");
		String [] hobbie = req.getParameterValues("hb");
		
		List list = Arrays.asList(hobbie);
		
		//Adding bootstrap cdn
		writer.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ\" crossorigin=\"anonymous\">\r\n"+ "");
		
		writer.println("<div style='width:600px;margin:auto;margin-top:50px'>");
		writer.println("<h2 class='bg-success text-light card-header' align='center'>Register Successfully !!</h2>");
		writer.println("<table class='table table-hover table-striped'>");
		writer.println("<tr>");
		writer.println("<td>Name :- </td>");
		writer.println("<td>"+name+"</td>");
		writer.println("</tr>");
		
		writer.println("<tr>");
		writer.println("<td>DOB :- </td>");
		writer.println("<td>"+dob+"</td>");
		writer.println("</tr>");
		
		writer.println("<tr>");
		writer.println("<td>Gender :- </td>");
		writer.println("<td>"+gender+"</td>");
		writer.println("</tr>");
		
		writer.println("<tr>");
		writer.println("<td>Qualification :- </td>");
		writer.println("<td>"+quali+"</td>");
		writer.println("</tr>");
		
		writer.println("<tr>");
		writer.println("<td>Hobbies :- </td>");
		writer.println("<td>"+list+"</td>");
		writer.println("</tr>");
		writer.println("</div>");
		writer.close();
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		
	}
}
