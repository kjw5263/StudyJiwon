<%@page import="com.google.gson.JsonElement"%>
<%@page import="com.google.gson.JsonParser"%>
<%@page import="com.movie.movieSearch.MovieSearch"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>영화 검색 페이지</title>
</head>
<body>
	<%
		String query = "";
		System.out.println(">>>>>>> "+ request.getParameter("query"));
		if(request.getParameter("query") != null){
			query = request.getParameter("query");
			
			MovieSearch mSearch = new MovieSearch();
			String result = mSearch.searchMovie(query);
			
			
			JsonParser parser = new JsonParser();
			JsonElement element = parser.parse(result);
			String str = element.getAsJsonObject().getAsJsonArray("items").get(1).getAsJsonObject().get("title").getAsString();
			%>
				<script type="text/javascript">
					document.write(str+"<br>");
				
				</script>
			
			<%
			out.println(str);
			
		} 
	
		
	%>


	



	<form action="searchPage.jsp?query="+<%=query%> method="get" >
	<input type="text" name="query" placeholder="영화 제목을 검색해보세요.">
	<input type="submit" >
	
	</form>
</body>
</html>