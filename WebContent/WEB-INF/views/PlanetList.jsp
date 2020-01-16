<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Planets</title>
</head>
<body>
	<div><a href="addPlanet">Colonize new planet</a></div>
	<div align="center">
		Current Planets
		<table border="1">
			<tr>
				<th>Name</th>
				<th>Resources</th>
			</tr>
			<c:forEach var="planet" items="${planetList}">
				<tr>
					<td><c:out value="${planet.planetName}"></c:out></td>
					<td><c:out value="${planet.planetResource}"></c:out></td>
					<td><a href="/Java3FinalProject/buildings/buildingList?planetId=${planet.planetId}&planetName=${planet.planetName}&planetResource=${planet.planetResource}">View Buildings</a></td>
					<td><a href="collectingResource?planetId=${planet.planetId}">Collect Resources</a></td>
					<td><a href="deletingPlanet?planetId=${planet.planetId}">Abandon Planet</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>