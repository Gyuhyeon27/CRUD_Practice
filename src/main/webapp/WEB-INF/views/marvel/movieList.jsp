<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Marvel Movie Info</title>
</head>
<body>
	<h1>Movie Details</h1>
	ID = ${movie.id }
	<br> 제목(kor) = ${movie.titleKor }
	<br> 제목(eng) = ${movie.titleEng }
	<br> 개봉일 = ${movie.releaseDate }
	<br> 감독 = ${movie.director }
	<br> 배우 = ${movie.actor }
	<f:parseDate value="${movie.registrationTime }" pattern="yyyy-MM-dd'T'HH:mm:ss" var="registrationTime" />
	<f:formatDate value="${registrationTime }" pattern="yyyy-MM-dd HH:mm:ss" var="rt" />
	<br>등록일 : ${rt }
	<f:parseDate value="${movie.modificationTime }" pattern="yyyy-MM-dd'T'HH:mm:ss" var="modificatioinTime" />
	<f:formatDate value="${modificatioinTime }"	pattern="yyyy-MM-dd HH:mm:ss" var="mt" />
	<br>수정일 : ${mt }
	<h3>
		<a href="/marvelMovie/allList">#리스트로 돌아가기#</a>
	</h3>
</body>
</html>