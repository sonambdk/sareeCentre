<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Students List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>Address</th></tr>  
   <c:forEach var="stud" items="${list}">   
   <tr>  
   <td>${stud.sid}</td>  
   <td>${stud.name}</td>  
   <td>${stud.addr}</td>  
     <td><a href="StudByIdServ?id=${stud.sid}">Edit</a></td>  
   <td><a href="deleteStudByIdServ?id=${stud.sid}">Delete</a></td>  
   </tr>  
   </c:forEach>  
</body>
</html>