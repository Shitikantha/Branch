<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<head>
<title>sign up</title>
</head>
<body>
SignUp
	<form:form action="signup.html" >
	<form:errors path="id"></form:errors>
		 <form:input path="id" />
		<form:input path="name" />
		<form:input path="email" />
		<input type="submit" value="creat"> 
	</form:form> 
</body>