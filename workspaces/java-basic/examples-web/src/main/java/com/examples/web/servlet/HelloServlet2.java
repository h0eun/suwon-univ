package com.examples.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/hello2.action" }) // web.xml 파일의 서블릿 등록 및 경로 매핑을 대신하는 annotation
public class HelloServlet2 extends HttpServlet {
	
	// hell2.action 경로에 get 방식의 요청이 발생하면 호출되는 메서드
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter(); // 네트워크 응답 스트림에 데이터를 전송하는 객체
		out.write("<!DOCTYPE html>");
		out.write("<html>");
		out.write("<head>");
		out.write("<title>Hello Servlet 2</title>");
		out.write("</head>");
		out.write("<body>");
		out.write("<h1 style='text-align:center'>Hello Servlet 2 !!!!!</h1>");
		out.write("</body>");
		out.write("</html>");
		
		
		
	}

}
