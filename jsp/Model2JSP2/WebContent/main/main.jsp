<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<% 
	String id = (String)session.getAttribute("id");
	if(id == null){
		System.out.println("");
		response.sendRedirect("./MemberLogin.me");
	}
%>


<h2><%=id %>님 환영합니다~</h2>
<h2>${sessionScope.id }</h2>

<input type="button" value="로그아웃" onclick="location.href='./MemberLogout.me'">
<hr>

	<h3> <a href="./MemberInfo.me"> 회원 정보 조회 </a></h3>
	
	
	<h3> <a href="./MemberUpdate.me"> 회원정보 수정</a></h3>

	
	<h3> <a href="./MemberDelete.me"> 회원정보 탈퇴 </a></h3>
	
	<hr>
	<h3> <a href="./GoodsList.go">쇼핑몰 메인 페이지 (사용자)</a></h3>
	
	<!-- 아이디가 Null 일 때, NullPointerException 
		null과 문자열은 비교 자체 불가!  -->
		
	<%
		// 참조형 데이터 값 비교시 항상 null값 먼저 비교 후 데이터 비교 해야함
		if(id != null && id.equals("admin")) {
	%>
	<hr>
	<h3><a href="./MemberList.me"> 회원 목록 보기 </a></h3>
	
	<h3><a href="./AdminGoodsList.ag"> 상품 목록 보기(관리자) </a></h3>
	
	<%
	}
	%>




</body>
</html>