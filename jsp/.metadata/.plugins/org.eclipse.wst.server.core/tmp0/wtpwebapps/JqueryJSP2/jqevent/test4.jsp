<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
 #ani {
 width: 50px;
   height: 50px;
	background-color : orange;


}
</style>

<script src="../js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(function(){
		// show(), hide(), toggle()
		// toggle("속도", 콜백함수())
		// 콜백함수 : 적용되는 효과가 100% 실행 후 작동하는 함수
		// slideDown(), slideUp(), slideToggle()
		// fadeIn(), fadeOut(), fadeToggle()
		
		$('h2').click(function(){
			/* $(this).next().toggle('slow', function(){
				alert("끝");
			}); */
			
			$(this).next().slideToggle('slow', function(){
				alert("끝");
			});
		});
		
		
		
		$('#ani').click(function(){
			var wid= $(this).css("width");
			var hei = $(this).css("height");
			
			
			// 효과를 두개이상 쓰고싶다? 중괄호 쓰세요
			$(this).animate({
				'width' : parseInt(wid)+50,
				'height' : parseInt(hei)+50
			});
		});
		
		
	});
</script>
</head>
<body>


<h1>WebContent/jsEvent/test4.jsp</h1>

<h2> 열기/닫기 </h2>
	<div>
	  <h2> 제목 </h2>
	  <p> 내용 </p>
	</div>
	<h2> 열기/닫기 </h2>
	<div>
	  <h2> 제목 </h2>
	  <p> 내용 </p>
	</div>


<hr>
<div id="ani"></div>
</body>
</html>