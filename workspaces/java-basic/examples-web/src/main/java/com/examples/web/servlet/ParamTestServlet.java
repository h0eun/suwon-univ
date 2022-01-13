package com.examples.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/param-test.action" }) // web.xml 파일의 서블릿 등록 및 경로 매핑을 대신하는 annotation
public class ParamTestServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 데이터 읽기
		String data1 = req.getParameter("data1"); // <input ... name="data1" ... > 입력 요소에 저장된 데이터 읽기
		String data2 = req.getParameter("data2"); // <input ... name="data2" ... > 입력 요소에 저장된 데이터 읽기
		
		System.out.printf("[%s][%s]\n", data1, data2);
		
		// 응답 처리
		
		resp.setContentType("text/plain;charset=utf-8"); // 응답 컨텐츠의 종류와 encoding 지정
		
		PrintWriter out = resp.getWriter(); // 네트워크 응답 스트림에 데이터를 전송하는 객체
		
		out.write(String.format("[%s][%s]", data1, data2));
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 데이터 읽기
		
		req.setCharacterEncoding("utf-8"); // 요청 데이터를 읽을 때 사용할 encoding 지정
		
		String data1 = req.getParameter("data1"); // <input ... name="data1" ... > 입력 요소에 저장된 데이터 읽기
		String data2 = req.getParameter("data2"); // <input ... name="data2" ... > 입력 요소에 저장된 데이터 읽기
		
		System.out.printf("[%s][%s]\n", data1, data2);
		
		// 응답 처리
		
		resp.setContentType("text/plain;charset=utf-8"); // 응답 컨텐츠의 종류와 encoding 지정
		
		PrintWriter out = resp.getWriter(); // 네트워크 응답 스트림에 데이터를 전송하는 객체
		
		out.write(String.format("[%s][%s]", data1, data2));
		
	}

}
