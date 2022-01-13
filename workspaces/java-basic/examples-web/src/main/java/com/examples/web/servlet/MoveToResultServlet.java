package com.examples.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/05.move-to-result.action" }) // web.xml 파일의 서블릿 등록 및 경로 매핑을 대신하는 annotation
public class MoveToResultServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setAttribute("req-data", "DATA FROM SERVLET (REQ-DATA)");
		
		// resp.sendRedirect("05.result.jsp"); // redirect 이동
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("05.result.jsp");
		dispatcher.forward(req, resp); // forward 이동
	}
	
}
