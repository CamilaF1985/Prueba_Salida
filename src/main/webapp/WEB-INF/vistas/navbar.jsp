<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sec"
    uri="http://www.springframework.org/security/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Navbar</title>

<!-- Enlace a los estilos de Bootstrap 5.0.2 -->
<link rel="stylesheet"
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css">

<!-- Enlace a tu archivo de estilos personalizados -->
<link rel="stylesheet" type="text/css"
    href="/pruebaSalida/res/css/styles.css">
</head>
<body>
    <nav
        class="navbar navbar-expand-lg navbar-expand-md navbar-expand-s navbar-dark navbar-custom">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">Clínica Salud</a>

            <button class="navbar-toggler" type="button"
                data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false"
                aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <sec:authorize access="hasRole('ROLE_doctor')">
                        <li class="nav-item"><a class="nav-link"
                            href="verHistoriasClinicas">Historias Clínicas</a></li>
                    </sec:authorize>
                    <sec:authorize access="hasRole('ROLE_paciente')">
                        <li class="nav-item"><a class="nav-link" href="verCitas">Ver Citas</a></li>
                        <li class="nav-item"><a class="nav-link" href="verDoctores">Ver Doctores</a></li>
                    </sec:authorize>
                    <li class="nav-item"><a class="nav-link active"
                        aria-current="page" href="/pruebaSalida/">Home</a></li>
                    <sec:authorize access="isAuthenticated()">
                        <li class="nav-item"><a class="nav-link"
                            href="${pageContext.request.contextPath}/logout">Cerrar
                                Sesión</a></li>
                    </sec:authorize>
                    <sec:authorize access="!isAuthenticated()">
                        <li class="nav-item"><a class="nav-link" href="login">Login</a></li>
                    </sec:authorize>
                </ul>
            </div>
        </div>
    </nav>

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










