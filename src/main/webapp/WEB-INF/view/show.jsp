<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--<a href="findAll.do">显示数据</a> ${list }  -->
	<h1 align="center">商品列表</h1>
	<hr>
	<a href="toAdd.do">添加</a>
	<br>

	<div class="container">
		<c:forEach items="${list}" var="g">
			<div style="float: left">
				<img alt="" src="/upload/${g.pic}" width="160px" height="200px">
			<br>	名称：${g.name }
				<br> 价格： ${g.price} <br>品牌：${g.bname} <br>类型：${g.tname}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</div>
		</c:forEach>

		<!-- 取消浮动 -->
		<div style="clear: both">
			<form action="findAll.do">
				<br> <br>
				<button name="pageNow" value="1">首页</button>
				<button name="pageNow" value="${page.prePage==0?1:page.prePage }">上一页</button>
				<button name="pageNow"
					value="${page.nextPage==0?page.pages:page.nextPage }">下一页</button>
				<button name="pageNow" value="${page.pages }">尾页</button>
			</form>
		</div>
	</div>
</body>
</html>