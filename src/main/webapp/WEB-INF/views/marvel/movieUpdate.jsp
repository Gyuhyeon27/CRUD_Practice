<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Marvel Movie Update</title>
</head>
<body>
	<h1>영화 수정 하기</h1>
	<c:if test="${empty movieList}">
		<b>수정 할 데이터 없음</b>
		<h3><a href="/marvelMovie/allList">리스트 목록으로 돌아가기</a></h3>
	</c:if>
	<c:if test="${not empty movieList}">
	<form action="/marvelMovie/update" method="post">
		I D : <input type="text" name="id" readonly="readonly" value="${movieList.id }"><br>
		제 목(kor) : <input type="text" name="titleKor" placeholder="영화 제목(KOR)" value="${movieList.titleKor }"><br>
		제 목(eng) : <input type="text" name="titleEng" placeholder="영화 제목(ENG)" value="${movieList.titleEng }"><br>
		개&emsp;봉&emsp;일 : <input type="date" name="releaseDate" value="${movieList.releaseDate }"><br>
		감&emsp;&emsp; 독 : <input type="text" name="director" placeholder="감독" value="${movieList.director }"><br>
		배&emsp;&emsp; 우 : <input type="text" name="actor" placeholder="배우" value="${movieList.actor }"><br>
		<input type="submit" value="수정하기">
	</form>
	</c:if>
</body>
</html>