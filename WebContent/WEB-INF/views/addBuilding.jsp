<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Building</title>
</head>
<body>
	<div hidden="true">Current planetId: ${param.planetId}</div>
	<div align="center">
	<!-- action attribute defines the RequestMapping chosen inside the controller
		method attribute is method
		modelAttribute defines the object used to perform the action. It is created inside the controller. -->
		<header>New Building Info</header>
		<form:form action="addingBuilding" method="post" modelAttribute="building">
			<table>
				<form:hidden path="planet.planetId"/>
				<tr>
					<td>Building Name: </td>
					<td><form:input path="buildingName" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Submit"></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>