<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<body style="font-family:'隶书' ;">
		<h1 align="center">修改书籍</h1>
		<hr />
		<form action="${pageContext.request.contextPath}/update.abc" method="post">
		    <input type="hidden" name="id" value="${requestScope.book.id }"/>
			<table align="center" border="0" cellspacing="10" >
				<tr><td>书名:</td><td><input type="text" name="name" value="${requestScope.book.name }"/></td></tr>
				<tr><td>价格:</td><td><input type="text" name="price" value="${requestScope.book.price }"/></td></tr>
				<tr><td>作者:</td><td><input type="text" name="author" value="${requestScope.book.author }"/></td></tr>
				<tr><td>简介:</td><td><input type="text" name="description" value="${requestScope.book.description }"/></td></tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" style="font-family: '隶书';" value="修改"/>
					</td>
				</tr>
			</table>
		</form>	
	</body>
</html>
