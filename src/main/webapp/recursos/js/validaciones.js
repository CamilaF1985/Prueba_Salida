// Función para mostrar mensaje de validación
function mostrarMensajeValidacion(input, mensaje) {
	var validationMessage = document.getElementById(input.id + "ValidationMessage");
	validationMessage.textContent = mensaje;
	validationMessage.style.display = "block"; // Mostramos el mensaje

	// Ajustar el margen superior para colocar el mensaje debajo del campo
	input.style.marginBottom = "20px";
}

// Función para ocultar mensaje de validación
function ocultarMensajeValidacion(input) {
	var validationMessage = document.getElementById(input.id + "ValidationMessage");
	validationMessage.style.display = "none"; // Ocultamos el mensaje

	// Restaurar el margen inferior original del campo
	input.style.marginBottom = "0";
}

// Validar Campo nombre
var nombreInput = document.getElementById('nombre');
var nombreValidationMessage = document.getElementById('nombreValidationMessage');

nombreInput.addEventListener('input', function() {
	var nombreValue = nombreInput.value.trim();

	if (nombreValue.length < 5 || nombreValue.length > 70) {
		mostrarMensajeValidacion(nombreInput, 'El nombre debe tener entre 5 y 70 caracteres.');
	} else {
		ocultarMensajeValidacion(nombreInput);
	}
});

// Validar Campo email
var emailInput = document.getElementById('email');
var emailValidationMessage = document.getElementById('emailValidationMessage');

emailInput.addEventListener('input', function() {
	var emailValue = emailInput.value.trim();
	var emailPattern = /^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$/;

	if (!emailPattern.test(emailValue)) {
		mostrarMensajeValidacion(emailInput, 'Por favor, introduzca un correo electrónico válido.');
	} else {
		ocultarMensajeValidacion(emailInput);
	}
});

// Validar Campo comentario
var comentarioInput = document.getElementById('comentario');
var comentarioValidationMessage = document.getElementById('comentarioValidationMessage');

comentarioInput.addEventListener('input', function() {
	var comentarioValue = comentarioInput.value.trim();

	if (comentarioValue === '') {
		mostrarMensajeValidacion(comentarioInput, 'El comentario no puede quedar vacío. Campo Obligatorio.');
	} else if (comentarioValue.length > 100) {
		mostrarMensajeValidacion(comentarioInput, 'El comentario no puede tener más de 100 caracteres.');
	} else {
		ocultarMensajeValidacion(comentarioInput);
	}
});



