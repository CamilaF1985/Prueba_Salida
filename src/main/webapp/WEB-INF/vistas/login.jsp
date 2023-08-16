<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css"
	href="/pruebaSalida/res/css/styles.css">
	
	<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Lora&display=swap" rel="stylesheet">
</head>

<title>Login</title>
<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
</head>
<body>
	<%
	String error = (String) request.getAttribute("error");
	if (error != null && error.equals("true")) {
		// Código JavaScript para mostrar la alerta de error
		out.println("<script>Swal.fire('Error de Autenticación', 'Verifica tus credenciales', 'error');</script>");
	}
	%>

	<div class="contacto" style="display: flex; justify-content: center;">
		<section class="form-login">
			<h1 class="tituloContacto">Ingresa</h1>
			<form name="loginForm" class="form"
				action="${pageContext.request.contextPath}/login" method="post">
				<div class="campo">
					<label for="username" class="mb-2">Usuario:</label> <input
						class="form-control" type="text" name="username"
						placeholder="Introduce nombre">
				</div>
				<div class="campo">
					<label for="password" class="mb-2">Clave de acceso:</label> <input
						class="form-control" type="password" name="password"
						placeholder="Introduce contraseña">
				</div>
				<div style="display: flex; justify-content: center;" class="mb-5">
					<input type="submit" value="Enviar" class="boton-enviar">
				</div>
			</form>
		</section>
	</div>


	<%@ include file='footer.jsp'%>
	<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
	<script src="/sushipe/res/js/validaciones.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
		crossorigin="anonymous"></script>
</body>
</html>






















