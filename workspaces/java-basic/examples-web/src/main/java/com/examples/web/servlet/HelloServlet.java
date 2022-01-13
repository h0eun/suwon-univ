package com.examples.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter(); // 네트워크 응답 스트림에 데이터를 전송하는 객체
		out.write("<!DOCTYPE html>");
		out.write("<html>");
		out.write("<head>");
		out.write("<title>Hello Servlet</title>");
		out.write("</head>");
		out.write("<body>");
		out.write("<h1 style='text-align:center'>Hello Servlet !!!!!</h1>");
		out.write("</body>");
		
	}

}
