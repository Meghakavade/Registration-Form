package com.jbk;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.cj.jdbc.Driver;
import com.sun.jdi.connect.spi.Connection;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/regform")
public class RegisterServlet extends HttpServlet {
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		 String fname=req.getParameter("name1");
		 String Lname=req.getParameter("name2");
		 String email=req.getParameter("email");
		 String mobno=req.getParameter("num");
		 String address=req.getParameter("add");
		 String gender=req.getParameter("gender1");
		 String dob=req.getParameter("birthday");
		 String city=req.getParameter("city");
		 String state=req.getParameter("state1");
		 String country=req.getParameter("country1");
		 String degree=req.getParameter("degree1");
		 String passyear=req.getParameter("PassYear");
		 String password=req.getParameter("pass");
		
		 
		 
		 System.out.println(fname);
		 System.out.println(Lname);
		 System.out.println(email);
		 System.out.println(mobno);
		 System.out.println(address);
		 System.out.println(gender);
		 System.out.println(dob);
		 System.out.println(city);
		 System.out.println(state);
		 System.out.println(country);
		 System.out.println(degree);
		 System.out.println(passyear);
		 System.out.println(password);
		 
		 PrintWriter out=resp.getWriter();
		 
		 
		 

		 out.print(fname);
		 out.print(Lname);
		 out.print(email);
		 out.print(mobno);
		 out.print(address);
		 out.print(gender);
		 out.print(dob);
		 out.print(city);
		 out.print(state);
		 out.print(country);
		 out.print(degree);
		 out.print(passyear);
		 out.print(password);
		 
		
		
		 
		 
	}

	

}
