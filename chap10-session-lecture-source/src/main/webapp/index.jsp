<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Session Handling</h1>

<form action="session" method="post">
    <table>
        <tr>
            <td>First Name:</td>
            <td><input type="text" name="firstName"></td>
        </tr>
        <tr>
            <td>Last Name:</td>
            <td><input type="text" name="lastName"></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><button type="submit" style="width:256px">전송</button></td>
        </tr>
    </table>
</form>
<br>
<a href="delete">세션 데이터 지우기</a>
</body>
</html>