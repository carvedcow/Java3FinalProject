<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Buildings</title>
</head>
<body>
	<div><a href="addBuilding">Construct new building.</a></div>
	<div align="center">
		Current Buildings
		<table border="1">
			<tr>
				<th>Name</th>
				<th>Resources needed for next level</th>
				<th>Level</th>
			</tr>
			<c:forEach var="building" items="${buildingList}">
				<tr>
					<td><c:out value="${building.buildingName}"></c:out></td>
					<td><c:out value="${building.buildingCost}"></c:out></td>
					<td><c:out value="${building.buildingLevel}"></c:out></td>
					<td><a href="editBuilding?buildingId=${building.buildingId}">Upgrade Building</a></td>
					<td><a href="deleteBuilding?buildingId=${building.buildingId}">Demolish Building</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>

</body>
</html>