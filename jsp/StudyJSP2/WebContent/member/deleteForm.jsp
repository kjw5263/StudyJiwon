<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>WebContent/member/deleteForm.jsp</h1>
	
	<%
		// 세션 제어
		String id = (String)session.getAttribute("id");
		if ( id== null){
			response.sendRedirect("loginForm.jsp");
		}
		
		// 아이디/비밀번호를 입력받아서 정보를 삭제 처리하는 페이지로 전달
		
	
	%>
	
	<h2> 회원 탈퇴 (삭제) </h2>
	<form action="deletePro.jsp" method ="post">
		<%-- 아이디 : <input type="text" name="id" value="<%=id %>" readonly> <br> --%>
		<!-- hidden은 입력받는 영역이 없기 때문에 value값을 항상 가지고 있어야 한다.
			사용자는 비밀번호만 치는 것 처럼 보이지만 사실은 아이디와 비밀번호 둘 다 넘겨주는 것이다 -->
		<input type="hidden" name="id" value="<%=id %>">
		비밀번호 : <input type="password" name="pw"> <br>
		
	<hr>
	
	<input type="submit" value="삭제하기">
	
	
	</form>
	
	
</body>
</html>