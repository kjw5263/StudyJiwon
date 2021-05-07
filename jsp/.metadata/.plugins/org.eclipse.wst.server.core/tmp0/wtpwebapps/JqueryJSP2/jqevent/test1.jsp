<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="../js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(function(){
		// 이벤트 : 사용자가 브라우저에서 행하는 모든 행동
		
		// bind("이벤트 종류", 함수); : 이벤트를 등록하는 함수
		// click이라는 이벤트가 발생하면 function 함수 실행 
		$('input').bind("click", function() {
			alert("클릭(J쿼리)");
		});		
	
		$('input').click(function() {
			alert("클릭이벤트");
		});
		
		
		
		///////////////////////////////////////
		// h2 태그클릭할때 마다 + 기호 추가하기
		$('h2').click(function(){
			//$('h2').append("+");
			//$(this).append("+");
			// idx 안써도 적어주지 않으면 ohtml이 idx로 인식되어버림
			$(this).html(function(idx, ohtml){
				return ohtml+"+";
			});
		})
		
		// 체이닝 기법을 활용한 2개 이상의 이벤트 처리
		//  mouseover, mouseout 해당 이벤트가 발생할 때 마다 
		// 이미지를 변경
		var exImg = "";
		$('img').mouseover(function(){
			//alert("!!!");
			$(this).attr("src","../jq/2.jpg");
		}).mouseout(function(){
			$(this).attr("src", "../jq/1.jpg");
		});
		
		
		
	});

</script>
</head>
<body>
	<h1>Content/jsEvent/test1.jsp</h1>
	
<!-- 	<input type="button" value="버튼" onclick="alert('클릭!')"> -->
	<input type="button" value="버튼">
	<input type="password" name="pw">
	<input type="password" name="pw_check">
	<div></div>
	
	<hr>
	
	<hr>
	<h2>head-0 </h2>
	<h2>head-1 </h2>
	<h2>head-2 </h2>
	<hr>
	
	<img src="../jq/1.jpg">
	
	
	
	
</body>
</html>