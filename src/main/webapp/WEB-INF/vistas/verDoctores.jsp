<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Listado de Doctores</title>
    <!-- Enlace a los estilos de Bootstrap 5.0.2 -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css">

    <!-- Enlace a tu archivo de estilos personalizados -->
    <link rel="stylesheet" type="text/css" href="/pruebaSalida/res/css/styles.css">

    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Lora&display=swap" rel="stylesheet">
</head>
<body>
    <!-- Barra de navegación -->
    <%@ include file="navbar.jsp"%>
    <div class="container mt-5">
        <h1 class="mb-4" style="font-family: 'Lora', serif; color: rgb(64, 0, 64);">Listado de Doctores</h1>

        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Especialidad</th>
                    <th>Experiencia</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${doctores}" var="doctor">
                    <tr>
                        <td>${doctor.id}</td>
                        <td>${doctor.nombre}</td>
                        <td>${doctor.especialidad.nombre}</td>
                        <td>${doctor.experiencia}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>

    <!-- Footer -->
    <%@ include file="footer.jsp"%>

    <!-- Scripts de Bootstrap (jQuery, Popper.js y Bootstrap JavaScript) -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-pzjw8f+ua6bK4Bf6JLXd1/Jwz4WpJm0z5l+wn5UqI6fIbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
</body>
</html>
