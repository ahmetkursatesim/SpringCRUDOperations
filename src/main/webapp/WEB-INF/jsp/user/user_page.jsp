
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>USERPAGE</title>
</head>
<body>
 
 <h1>Crud Operation In Mysql with jdbc </h1>
 <h1>Ahmet Kürşat Esim  </h1>
 <h1>Users List</h1>
 <table width="100%" border="1">
  <tr>
 
   <th>Firstname</th>
   <th>Lastname</th>
   <th>Address</th>
   <th colspan="2">Action</th>
  </tr>
  <c:forEach items="${listUser }" var="user" >
   <tr>

    <td>${user.firstname }</td>
    <td>${user.lastname }</td>
    <td>${user.address }</td>
    <td>
     <spring:url value="/user/update/${user.id }" var="updateURL" />
     <a href="${updateURL }">Update</a>
    </td>
    <td>
     <spring:url value="/user/delete/${user.id }" var="deleteURL" />
     <a href="${deleteURL }">Delete</a>
    </td>
   </tr>    
  </c:forEach>
 </table>
 <spring:url value="/user/add" var="addURL" />
 <a href="${addURL }">Add User</a>
</body>
</html>