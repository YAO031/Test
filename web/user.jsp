<%--
  Created by IntelliJ IDEA.
  User: 曜
  Date: 2021/7/19
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

            <table>
                <tr>
                    <td>id</td>
                    <td>姓名</td>
                    <td>标题</td>
                    <td>内容</td>


                </tr>
                <c:forEach items="${sessionScope.user}" var="user">

                    <tr>
                        <td>${user.id}</td>
                        <td>${user.name}</td>
                        <td>${user.biaoti}</td>
                        <td>${user.text}</td>


                    </tr>





                </c:forEach>


            </table>

</body>
</html>
