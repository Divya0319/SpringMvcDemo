<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPe html>
<html>
	<head>
		<title>Student Registration Form</title>
	</head>
	<body>
	
	<form:form action="processForm" modelAttribute="student">
	
		First name: <form:input path="firstName" />
	
		<br><br>
	
		Last name: <form:input path="lastName" />
	
		<br><br>
		
		Country:
		<form:select path="country">
			<form:options items="${theCountryOptions}"/>
			
			
		<br><br>
		
		Favorite Language:
		
		<form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}"/>
		
		<br><br>
		
		Operating Systems:
		
		Windows <form:checkbox path="operatingSystems" value="Windows"/>
		MacOS <form:checkbox path="operatingSystems" value="MacOS"/>
		Linux <form:checkbox path="operatingSystems" value="Linux"/>
			
		</form:select>
	
		<input type="submit" value="Submit" />
	
	</form:form>
	
	</body>
</html>