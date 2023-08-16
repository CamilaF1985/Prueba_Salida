-- Crear la base de datos
CREATE DATABASE prueba;

-- Crear el usuario
CREATE USER 'admin'@'localhost' IDENTIFIED BY '12345';

-- Otorgar todos los permisos al usuario sobre la base de datos
GRANT ALL PRIVILEGES ON prueba.* TO 'admin'@'localhost';

-- Actualizar los privilegios
FLUSH PRIVILEGES;

-- Crear tabla usuarios
CREATE TABLE usuarios (
    id INT PRIMARY KEY,
    user VARCHAR(50),
    password VARCHAR(100),
    rol VARCHAR(20),
    email VARCHAR(100),
    tipo ENUM('Cliente', 'Administrador') NOT NULL
);
