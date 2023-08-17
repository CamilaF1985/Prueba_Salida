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
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <h1 class="prueba-titulo">Bienvenido a Clínica Salud</h1>
                <p class="lead">En Clínica Salud, nos dedicamos a brindar atención médica de calidad y personalizada para el bienestar de nuestros pacientes. Con años de experiencia en el campo de la medicina, nuestro equipo de médicos y especialistas se esfuerza por ofrecer los mejores servicios de salud para toda la comunidad.</p>
                <p class="lead">Contamos con una amplia gama de especialidades médicas, que incluyen cardiología, pediatría, dermatología, ginecología, ortopedia y más. Nuestro compromiso es proporcionar diagnósticos precisos y tratamientos efectivos para abordar las necesidades únicas de cada paciente.</p>
                <p class="lead">Además, en Clínica Salud, estamos comprometidos con la innovación y la tecnología médica. Contamos con instalaciones modernas y recursos tecnológicos de vanguardia que nos permiten ofrecer servicios médicos de alta calidad. Desde equipos de diagnóstico avanzados hasta sistemas de gestión de pacientes, estamos a la vanguardia de la atención médica moderna.</p>
                <p class="lead">Nuestra misión es poner la salud y el bienestar de nuestros pacientes en primer lugar. Ya sea para una consulta médica de rutina o para abordar preocupaciones de salud específicas, estamos aquí para brindarle la mejor atención posible. ¡Gracias por confiar en Clínica Salud para su atención médica!</p>
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





