<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="for" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="submiited" method="get">
		<h1>Gear Technical Forum</h1><br>
		<h1>Answer the query</h1><br>
		
			
				<a href="home">Home</a><br>
				
				<label>Query Id:</label><input type="text" name="id" value="${sear.query_Id}" readonly="true"/><br>
			
				<label>Select Technology:</label>
				<input type="text" name="technology" value="${sear.technology}" readonly="true"/><br>
			
				<label>Question:</label>
				<input type="text" name="Question" value="${sear.query}" readonly="true"/><br>
			
				<label>Question Raised By:</label>
				<input type="text" name="raisedBy" value="${sear.query_Raised_By}" readonly="true"/><br>
			<label>Solution:</label>
				<textarea name="solution"></textarea><br>
			
				<label>Answered by:</label>
				
					<select name="name">
						<option>Uma</option>
						<option>Rahul</option>
						<option>Kavitha</option>
						<option>Hema</option>
					</select>
				<br>
				<input type="submit" value="Update Query">
			
	</form>
</body>
</html>