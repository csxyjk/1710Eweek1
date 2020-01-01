<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resource/bootstrap.css">
<!-- 引入js -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/jquery-3.2.1.js"></script>
</head>
<body>
	<h1 align="center">添加页面</h1>
	<hr>
	<div class="container">
		<form id="f1">
			商品名称:<input type="text" name="name"><br> <br>
			商品英文名称:<input type="text" name="ename"><br> <br>
			品牌:<select name="bid">

			</select> <br> <br> 种类:<select name="tid">

			</select> <br> <br> 
			数量:<input type="text" name="num"><br><br>
			价格:<input type="text" name="price"><br><br>
			 图片:<input type="file" name="file"><br> <br>
			<input type="button" value="提交" onclick="add()">
		</form>
	</div>
</body>
<script type="text/javascript">
	$(function() {
		$.get("findBrand.do", function(s) {
			for ( var i in s) {
				//alert(JSON.stringify(s))
				$("[name=bid]").append(
						"<option value='"+s[i].id+"'>" + s[i].name
								+ "</option>")
			}
		})
		$.get("findType.do", function(s) {
			for ( var i in s) {
				//alert(JSON.stringify(s))
				$("[name=tid]").append(
						"<option value='"+s[i].id+"'>" + s[i].name
								+ "</option>")
			}
		})
	})
	function add() {
		var formData = new FormData($("#f1")[0]);
		$.ajax({
			url : "add.do",
			data : formData,
			type:"post",
			processData : false,
			contentType : false,
			success : function(s) {
				location = "findAll.do"
			}
		})
	}
</script>
</html>