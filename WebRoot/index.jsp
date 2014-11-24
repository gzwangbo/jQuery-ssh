<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
String path=request.getSession().getServletContext().getRealPath("/");
%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加</title>
</head>
<body>
<form action="<%=request.getContextPath() %>/person!add.action"  method="post">

name:<input type="text" name="person.name" /><br/>
phone:<input type="text" name="person.phone" ><br/>
<input type="submit" value="保存" />  <input type="reset" value="重置" />

</form>

</body>
</html>