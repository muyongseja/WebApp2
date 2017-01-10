<%@page import="java.util.List"%>
<%@ page contentType="text/html; charset=EUC-KR"
	isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>여기는 six.jsp입니다.</h1>
내가 좋아하는 음식<br>
<ul>
	<% 
		List foods = (List)request.getAttribute("foodList");
		for(int i=0; i<foods.size(); i++){
	%>
		<li><%=foods.get(i) %></li>
	<%
		}
	%>
</ul>
<br><br>
내가 제일 좋아하는 과일<br>
<br><br>
내가 제일 좋아하는 요일 : 
</body>
</html>








