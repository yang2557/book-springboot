<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'list.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  
  <body>
  <form action="${pageContext.request.contextPath}/deleteMany.abc" method="post">
    <table align="center" border="1" width="800">
    		<tr>
    			<td><input type="submit" value="删除选中"/><a href="${pageContext.request.contextPath}/add.jsp">添加</a></td>
    			<td>编号</td>
    			<td>书名</td>
	    		<td>价格</td>
	    		<td>作者</td>
	    		<td>描述</td>
	    		<td>删除</td>
	    		<td>修改</td>
	    	</tr>
    		<c:forEach items="${requestScope.bookList}" var="b"> 
    			<tr>
    			<td><input type="checkbox" name="ids" value="${b.id}"/></td>
    			<td>${b.id}</td>
    			<td>${b.name}</td>
    			<td>${b.price}</td>
    			<td>${b.author}</td>
    			<td>${b.description}</td>
    			<td><a href="${pageContext.request.contextPath}/delete.abc?id=${b.id }">删除</a></td>
				<td><a href="${pageContext.request.contextPath}/selectOne.abc?id=${b.id }">修改</a></td>
    			</tr>
    		</c:forEach>
		<tr><td  colspan="8">
			<a href="${pageContext.request.contextPath}/selectAll.abc?page=1">首页</a>
			<a href="${pageContext.request.contextPath}/selectAll.abc?page=${requestScope.PageInfo.pages}"> 尾页</a>
			第${requestScope.PageInfo.pageNum}页/第${requestScope.PageInfo.pages}页
			<c:if test="${requestScope.PageInfo.pageNum >1}">
			<a href="${pageContext.request.contextPath}/selectAll.abc?page=${PageInfo.pageNum-1}">上一页</a></c:if>
			<c:if test="${requestScope.PageInfo.pageNum<requestScope.PageInfo.pages}">
			<a href="${pageContext.request.contextPath}/selectAll.abc?page=${PageInfo.pageNum+1}">下一页</a></c:if>
			一共${requestScope.PageInfo.pages}条数据</td></tr>
    </table>
   </form>
    
  </body>
</html>