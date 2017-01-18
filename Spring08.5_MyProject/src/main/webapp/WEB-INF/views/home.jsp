<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<a href="file/list.do">파일 목록으로!</a>
<a href="cafe/list.do">게시판 글 목록으로!</a>


<%if(request.getSession().getAttribute("id")==null){ %>
<form action="users/signin.do?uri=${param.uri }" method="post">
	<label for="id">아이디</label>
	<input type="text" name="id" id="id"/>
	<label for="pwd">비밀번호</label>
	<input type="text" name="pwd" id="pwd"/>
	<button type="submit">로그인</button>
</form>
<%}else{ %>
<div>환영합니다! <strong><%=request.getSession().getAttribute("id") %></strong>님</div>
<%} %>
<%-- <%=request.getSession().getAttribute("id") %> --%>
</body>
</html>
