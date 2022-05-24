<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Marvel Movie Insert</title>
</head>
<body>
	<h1>영화 등록 하기</h1>
	<form action="/marvelMovie/insert" method="post">
		제&emsp;&emsp; 목 : <input type="text" name="titleKor" placeholder="영화 제목(KOR)"><br>
		제 목(eng) : <input type="text" name="titleEng" placeholder="영화 제목(ENG)"><br>
		개&emsp;봉&emsp;일 : <input type="date" name="releaseDate"><br>
		감&emsp;&emsp; 독 : <input type="text" name="director" placeholder="감독"><br>
		배&emsp;&emsp; 우 : <input type="text" name="actor" placeholder="배우"><br>
		<input type="submit" value="등록하기">
	</form>
</body>
</html>