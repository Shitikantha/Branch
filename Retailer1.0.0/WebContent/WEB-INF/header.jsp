<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
<title>Tag Example</title>
</head>
<body>
<c:set var="userName" scope="session" value="${sessionScope.name}"/>
Hi,<c:out value="${userName}"/>
		<BR>
		<a href="./logout.html">Logout</a><br>

  <fmt:bundle basename="com.situ.SampleDB">
  <c:out value="${userName}"/>
     <td><fmt:message key="${userName}"></fmt:message></td>
  </fmt:bundle>
     </body>
     <br>
     <hr>
</html>

