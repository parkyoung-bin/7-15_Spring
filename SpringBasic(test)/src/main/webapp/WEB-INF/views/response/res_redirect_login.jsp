<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action = "Login" method = "post">
		ID : <input type = "text" name = "id"><br>
		PW : <input type = "password" name = "pw"><br>
		<span>${msg }</span><br>
		
		<button type = "submit">로그인</button>
	</form>

</body>
</html>