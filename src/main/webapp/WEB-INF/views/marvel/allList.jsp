<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MarvleMovirAllList</title>
</head>
<body>
	<h1>MARVEL MOVIE LIST</h1>
	<br>
	<ul>
		<c:forEach var="am" items="${allList }">
			<li>ID : <a href="/marvelMovie/movieList?id=${am.id }">${am.id }</a></li>
			<li>제목 : ${am.titleKor }</li>
			<li>개봉일 : ${am.releaseDate }</li>
			<h3>
				<a href="/marvelMovie/update?id=${am.id }">#수정하기#</a>
			</h3>
			<h3>
				<a href="/marvelMovie/delete?id=${am.id }">@삭제하기@</a>
			</h3>
			<hr>
		</c:forEach>
	</ul>
</body>
</html>