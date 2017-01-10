<%@page contentType="text/html; charset=euc-kr" %>
<html>
<body>
<h2>Hello World!</h2>
<a href="first">첫번째 요청</a>
<br><br>
<a href="second">두번째 요청</a>
<br><br>
<a href="third?param1=newyork&param2=31">세번째 요청</a>
<br><br>
<form method="get" action="fourth">
	<input type="text" name="name"/><br><br>
	<input type="text" name="age"/><br><br>
	<input type="text" name="point"/><br><br>
	<input type="submit" value="네번째 요청" />
</form>
<br><br>
<form method="post" action="fifth">
	<input type="text" name="name"/><br><br>
	<input type="text" name="age"/><br><br>
	<input type="text" name="point"/><br><br>
	<input type="submit" value="다섯번째 요청" />
</form>
</body>
</html>









