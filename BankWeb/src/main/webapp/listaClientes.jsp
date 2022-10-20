<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="es">
  <head>
    <!-- Required meta tags -->
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Lista de clientes del banco</title>
  </head>
  <body>
    <h1>Lista de clientes del banco </h1>
     
	<div class = "border borde-warning">
		${requestScope.mensaje}
	
	</div>
	<table>
		<c:forEach var="clientes" items="${requestScope.lista}">
			<tr>
				<td>${clientes.firstName}</td>
				<td>${clientes.lastName}</td>
				
				<td>
				   <a href="clientes?firstName=${cliente.firstName}">Comprar 1 unidad</a>
				   <!-- comprar es la url y lo demas es el parametros de la peticion get que pueden ser muchos 
				   de esta manera mandamos los datos a traves de la url -->
				   
				
				</td>
				
			</tr>
		</c:forEach>
	</table>
    
 

  </body>
</html>