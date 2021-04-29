<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

  <h1>WebContent/fileupload/fileuploadPro.jsp</h1>
  
  <%
  	// 파일 업로드 전 준비
  	
  	// 0) 해당 라이브러리 설치
  	// 1) 파일이 저장될 위치지정
	String path = request.getRealPath("/upload");
  	
  	System.out.println("파일 저장되는 실제 경로 : " + path);
  	
  	// 2) 파일의 크기를 지정 (용량) -> 10MB
	int maxSize = 10 * 1024 * 1024;

	// 파일 업로드 => Multipart 객체 생성 -> lib에 넣은 jar 파일에서 가져온 클래스
	MultipartRequest multi = new MultipartRequest(
			request,
			path,
			maxSize,
			"UTF-8",
			new DefaultFileRenamePolicy()
			);
  	 
 	// -> request 내장객체 (파라미터)
 	// -> path => 실제 파일이 저장될 위치
 	// -> maxSize => 파일의 크기
 	// -> UTF-8 => 파일 업로드시 인코딩
 	// -> new DefaultFileRenamePolicy() => 파일이름 중복처리 객체 -> file.txt / file(1).txt 
	
	System.out.println("파일 업로드 완료!");
 	
 	
 	
 	
 	// 이전 페이지에서 전달해준 정보를 출력 ->
 	// request로 안하는 이유? MultipartRequest로 request객체를 보내버렸기 때문에 multi에서 뺴줘야한다.
 	String name = multi.getParameter("name");
 	String subject = multi.getParameter("subject");
 	// String filename = multi.getParameter("filename");  -> 파일명은 이렇게 받아올 수 없어
 	String filename = multi.getFilesystemName("filename"); 
 	String oFileName = multi.getOriginalFileName("filename"); 
 	
  %>
  
     이름 : <%= name %> <br>
     제목 : <%= subject %><br>
     파일  :	<%= filename%> <br>
   파일(원본) : <%=oFileName %>
  
  
  
</body>
</html>