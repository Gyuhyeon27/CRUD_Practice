<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Marvel Movie Delete</title>
</head>
<body>
	<c:if test="${empty marvelMovie }">
		<h2>삭제 실패 </h2>
	</c:if>
	<c:if test="${not empty marvelMovie }">
		<h2>삭제 성공 </h2>
	</c:if>
	<hr>
	<h3><a href="/marvelMovie/allList">리스트 목록으로 돌아가기</a></h3>
</body>
</html>