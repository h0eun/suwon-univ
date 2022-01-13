package com.demoweb.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/account/register.action")
public class MemberRegisterServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 요청 데이터 읽기
		// 요청 처리
		// JSP에 전달할 데이터 request에 저장
		// 응답 컨텐츠 생산 ( jsp에게 요청 - forward )
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/account/register.jsp");
		dispatcher.forward(request, response);
		
	}

}
