<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign In | Chewy.com</title>
<!-- <link rel="styleesheet" type="text/css" href=<c:url value="css/egovframework/login.css"></c:url>> -->
<link rel="stylesheet" type="text/css"
	href=<c:url value="css/egovframework/login.css"/>>
</head>
<body>

	<div class="container">
		<form method="post" action="login.do" id="login">
			<input type="text" id="email" name="m_email" required="required">이메일

			<input type="text" id="password" name="m_password"
				required="required">비밀번호
			<button type="submit">입력</button>
		</form>
	</div>






</body>
</html>