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
<h1>����� six.jsp�Դϴ�.</h1>
���� �����ϴ� ����<br>
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
���� ���� �����ϴ� ����<br>
<br><br>
���� ���� �����ϴ� ���� : 
</body>
</html>








