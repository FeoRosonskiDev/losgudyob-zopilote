create database los_gud_yob_db;
use los_gud_yob_db;

CREATE TABLE clientes (
  id              	INT  NOT NULL  AUTO_INCREMENT PRIMARY KEY,
  nombre    		VARCHAR(50),  
  apellido_paterno  VARCHAR(30),
  apellido_materno  VARCHAR(30),
  dni 				VARCHAR(8),
  celular           VARCHAR(9),
  correo            VARCHAR(50),
  fecha_nacimiento  DATE,
  clave        		VARCHAR(16),
  estado            INT -- 1: activo / 2: inactivo | eliminado
);

insert into clientes values (null, 'Juan Carlos', 'Castillo', 'Aycachi', '70555913', '979666355', 'carlosjordi@hotmail.com', '1993/04/01', 'clave123', 1);
select * from clientes;

CREATE TABLE servicios(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    tipo VARCHAR(40),
    descripcion VARCHAR(100),
    precio DECIMAL(6, 2),
    estado INT
);

select * from servicios;