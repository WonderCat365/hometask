<%--
  Created by IntelliJ IDEA.
  User: wondercat
  Date: 16.05.2019
  Time: 13:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Hello there
<form method="post">
    <label> The first digit
        <input type="number" name="firstDigit"/>
    </label>

    <label>The second digit
        <input type="number" name="secondDigit"/>
    </label>

    <button type="submit">Calculate</button>
</form>
<h1>
<%--    Result: ${result}--%>
    Result:
    <%
//        String str = (String) request.getAttribute("result");
        if(request.getAttribute("result") != null) out.print(request.getAttribute("result"));

    %>
</h1>
</body>
</html>
