<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <!-- Configuración inicial de ancho y escala para dispositivos móviles -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Título de la página -->
    <title>Inicio</title>
    
    <!-- Enlace a los estilos de Bootstrap 5.0.2 -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css">
    
    <!-- Enlace a los estilos personalizados -->
    <link rel="stylesheet" type="text/css" href="/pruebaSalida/res/css/styles.css">
    
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Lora&display=swap" rel="stylesheet">
</head>
<body>
    <!-- Barra de navegación -->
    <%@ include file="navbar.jsp"%>

    <!-- Contenido principal -->
    <div class="container mt-4">
        <div class="row">
            <div class="col-lg-8 col-md-10 mx-auto">
<h1 class="text-center prueba-titulo">Prueba de Salida</h1>

                <!-- Aquí puedes agregar más contenido -->
            </div>
        </div>
    </div>

    <!-- Footer -->
    <%@ include file="footer.jsp"%>

    <!-- Scripts -->
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/fancybox/3.5.7/jquery.fancybox.min.js"></script>
    <script src="/sushipe/res/js/fancybox-init.js"></script>
    <!-- Scripts de Bootstrap (Popper.js y Bootstrap JavaScript) -->
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>


