<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>마리아DB 연동 확인</h1>
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>이미지</th>
				<th>가격</th>
				<th>토탈</th>
				<th>할인</th>
				<th>별점</th>
				<th>리뷰</th>
				<th>QnA</th>
			</tr>
		</thead>
		<tbody>
				<c:forEach items="${list }" var ="result">
					<tr>
						<td>${result.p_id }</td>
						<td>${result.p_name }</td>
						<td>${result.p_img }</td>
						<td>${result.p_price }</td>
						<td>${result.p_total }</td>
						<td>${result.p_discount }</td>
						<td>${result.p_star }</td>
						<td>${result.p_review }</td>
						<td>${result.p_QnA }</td>
					</tr>
				</c:forEach>		
			</tbody>
		
	</table>
</body>
</html>