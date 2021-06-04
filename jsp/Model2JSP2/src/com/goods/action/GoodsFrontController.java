package com.goods.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// 사용하지 않는 패키지 제거 ctrl + shift + o 



public class GoodsFrontController extends HttpServlet{

	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("C : GoodsFrontController_doProcess() 호출!");
		
		/********************************* 1. 페이지 주소 파싱 *************************/
		// (1) 가상주소 전체 가져오기
		String requestURI = request.getRequestURI();
		
		// (2) 프로젝트명 가져오기
		String ContextPath = request.getContextPath();
		
		// (3) 필요한 가상주소 생성
		String command = requestURI.substring(ContextPath.length());
		System.out.println("command : " + command);
		System.out.println("C : 1.페이지 주소 파싱");
		
		/********************************* 1. 페이지 주소 파싱 *************************/
		
		
		
		/********************************* 2. 페이지 주소 매핑(연결) *******************/
		// -> 특정 주소일때 실행할 기능들 정의해주기
		// 같은 패키지 안에 있는 Action을 호출 해주어야함!
		Action action = null;
		ActionForward forward = null;
		
		if(command.equals("/GoodsList.go")){
			System.out.println("C : /GoodsList.go 호출!");
			// DB 정보를 화면 이동 없이 출력
			// GoodsListAction() 객체 생성
			action = new GoodsListAction();
			
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
		else if(command.equals("/GoodsDetail.go")){
			System.out.println("C : /GoodsDetail.go 호출~!");
			
			// DB 정보를 받아서 페이지 이동없이 (주소 이동없이) 출력
			// GoodsDetailAction() 객체 생성
			action = new GoodsDetailAction();
			
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("C : 2. 페이지 주소 매핑 완료 ");
		/********************************* 2. 페이지 주소 매핑(연결) *******************/
	
		
		/******************* 3. 페이지 주소 이동 종류를 정하기 (제어) *******************/
		// forward 가 null 이 아닐 때 : 페이지 이동 정보가 있을 때 
		if(forward != null){
			if(forward.isRedirect()){ // TRUE일 때, 
				response.sendRedirect(forward.getPath());	// 해당 경로로 이동하기
				System.out.println("C : 페이지 주소 이동 >> sendRedirect() << 방식, " + forward.getPath());
			} else { // FALSE일 때
				RequestDispatcher dis = request.getRequestDispatcher(forward.getPath());
				dis.forward(request, response);
				System.out.println("C : 페이지 주소 이동 >> forward << 방식, " + forward.getPath());
			}
			System.out.println("C : 3. 페이지 주소 이동 완료 ");
		}
		
		System.out.println("C : 3. 페이지 주소 이동 X (주소 이동X ) >> forward NULL ");
		
		
		/******************* 3. 페이지 주소 이동 종류를 정하기 (제어) *******************/
		
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("C : GoodsFrontController_doGet() 호출!");
		doProcess(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("C : GoodsFrontController_doPost() 호출!");
		doProcess(request, response);
	}
	
}
