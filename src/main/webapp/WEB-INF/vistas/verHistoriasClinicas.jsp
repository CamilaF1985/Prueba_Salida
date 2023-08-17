<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ver Historia Clínica por Nombre</title>

<!-- Enlace a los estilos de Bootstrap 5.0.2 -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css">

<!-- Enlace a tu archivo de estilos personalizados -->
<link rel="stylesheet" type="text/css"
	href="/pruebaSalida/res/css/styles.css">

<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Lora&display=swap"
	rel="stylesheet">
</head>
<body>

	<!-- Barra de navegación -->
	<%@ include file="navbar.jsp"%>

	<div class="container">

		<c:choose>
			<c:when test="${historiasClinicas ne null}">
				<!-- Mostrar el listado de historias clínicas -->
				<h2 class="tituloClinica">Historia Clínica del Paciente</h2>
				<c:forEach var="historiaClinica" items="${historiasClinicas}">
					<div class="detalleHistoria">
						<p>
							<strong class="tituloDetalle">Nombre del Paciente:</strong>
							${historiaClinica.paciente.nombre}
						</p>
						<p>
							<strong class="tituloDetalle">Nombre del Doctor:</strong>
							${historiaClinica.doctor.nombre}
						</p>
						<p>
							<strong class="tituloDetalle">Fecha de Cita:</strong>
							${historiaClinica.fechaCita}
						</p>
						<p>
							<strong class="tituloDetalle">Diagnóstico:</strong>
							${historiaClinica.diagnostico}
						</p>
						<p>
							<strong class="tituloDetalle">Tratamiento:</strong>
							${historiaClinica.tratamiento}
						</p>
						<hr class="hrDetalle">
					</div>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<!-- Mostrar el formulario de búsqueda -->
				<form method="post" action="/pruebaSalida/verHistoriasClinicas">
					<div class="mb-3">
						<label for="nombrePaciente" class="form-label">Nombre del
							Paciente:</label> <input type="text" class="form-control"
							id="nombrePaciente" name="nombrePaciente">
					</div>
					<button type="submit" class="btn btn-primary">Buscar
						Historia Clínica</button>
				</form>
			</c:otherwise>
		</c:choose>
	</div>

	<!-- Footer -->
	<%@ include file="footer.jsp"%>



	<!-- Scripts de Bootstrap (jQuery, Popper.js y Bootstrap JavaScript) -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-pzjw8f+ua6bK4Bf6JLXd1/Jwz4WpJm0z5l+wn5UqI6fIbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
</body>
</html>

