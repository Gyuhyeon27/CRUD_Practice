<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert & Update Result</title>
</head>
<body>
	<h1>Marvel Movie Insert & Update Result</h1>
		<br>
	<c:if test="${empty resultMovie}">
		등록(수정) 실패
	</c:if>
	<c:if test="${not empty resultMovie}">
		등록(수정) 성공
		<hr>
		<ul>
			<li>id : ${resultMovie.id }</li>
			<li>제목(kor) : ${resultMovie.titleKor }</li>
			<li>제목(eng) : ${resultMovie.titleEng }</li>
			<li>개봉일 : ${resultMovie.releaseDate }</li>
			<li>감독 : ${resultMovie.director }</li>
			<li>배우 : ${resultMovie.actor }</li>
			<f:parseDate value="${resultMovie.registrationTime }" pattern="yyyy-MM-dd'T'HH:mm:ss" var="registrationTime"/>
			<f:formatDate value="${registrationTime }" pattern="yyyy-MM-dd HH:mm:ss" var="rt"/>
			<li>등록일 : ${rt }</li>
			<f:parseDate value="${resultMovie.modificationTime }" pattern="yyyy-MM-dd'T'HH:mm:ss" var="modificatioinTime"/>
			<f:formatDate value="${modificatioinTime }" pattern="yyyy-MM-dd HH:mm:ss" var="mt"/>
			<li>수정일 : ${mt }</li>
		</ul>
	</c:if>
	<h3> <a href="/marvelMovie/allList">#리스트 목록으로#</a> </h3> <br>
	<h3> <a href="/marvelMovie/insert">@입력창으로@</a></h3>
</body>
</html>