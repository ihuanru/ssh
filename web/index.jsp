<%--
  Created by IntelliJ IDEA.
  User: yupeng
  Date: 2016/11/11
  Time: 10:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath}/userAction">
    用户名：<input type="text" name="username"/>
    密码：<input type="password" name="password">
    年龄：<input type="text" name="age">
    <input type="submit" value="提交">
  </form>
  </body>
</html>
