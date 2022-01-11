<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>




<%@ include file="header.jsp" %>

<%@ include file="login.jsp" %>
index.jsp 파일입니다.
<a href="/sample/member?id=abcd&pw=1234&name=정자바">회원</a>
<form action="sample/memberDTO" method="post">
	<div> id :<input type="text" name="id" ></div>
	<div> pw :<input type="password" name="pw" ></div>
	<div> name:<input type ="text" name="name" ></div>
	<input type="submit" value="회원가입">
</form>
<%@ include file="footer.jsp" %>

</body>
</html>