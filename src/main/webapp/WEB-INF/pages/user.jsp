<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
  <title>SampleSpring</title>
</head>
<body>
  <h2>Users:</h2>
  <ul>
  <c:forEach items="${users}" var="user">
      <li>${user.firstname}, ${user.lastname}</li>
    </tr>
  </c:forEach>
  </ul>
</body>
</html>
