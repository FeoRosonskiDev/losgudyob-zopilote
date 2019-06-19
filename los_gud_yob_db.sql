create database los_gud_yob_db;
use los_gud_yob_db;

CREATE TABLE clientes (
	id              	INT  NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nombre    			VARCHAR(50),  
	apellido_paterno  	VARCHAR(30),
	apellido_materno  	VARCHAR(30),
	dni 				VARCHAR(8),
	celular           	VARCHAR(9),
	correo            	VARCHAR(50),
	fecha_nacimiento  	DATE,
	clave        		VARCHAR(16),
	estado            	INT -- 1: activo | 2: eliminado
);

CREATE TABLE cargos (
	id 					INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    descripcion			VARCHAR(40)
);

CREATE TABLE distritos (
	id 					INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    descripcion			VARCHAR(40)
);

-- Si gustan de agregar más campos aquí, go ahead --
CREATE TABLE personal (
	id 					INT NOT NULL auto_increment PRIMARY KEY,
    nombre 				VARCHAR(50),
    apellido_paterno  	VARCHAR(30),
	apellido_materno  	VARCHAR(30),
	dni 				VARCHAR(8),
	celular           	VARCHAR(9),
	correo            	VARCHAR(50),
	fecha_nacimiento  	DATE,
	clave        		VARCHAR(16),
    id_cargo 			INT,
    id_distrito			INT,
	estado            	INT, -- 1: activo | 2: inactivo
    foreign key (id_cargo) REFERENCES cargos (id),
    foreign key (id_distrito) REFERENCES distritos (id)
);

CREATE TABLE servicios (
	id 					INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    tipo 				VARCHAR(40),
    descripcion 		VARCHAR(100),
    precio 				DECIMAL(6, 2),
    estado 				INT -- 1: activo | 2: eliminado
);

CREATE TABLE solicitud (
	id					INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    fecha_solicitado	DATE, -- cuando el cliente realiza la solicitud a traves de la web
	fecha_contactado	DATE, -- cuando el operador se pone en contacto con el cliente
    fecha_asignada		DATE, -- cuando se asigna un técnico para realizar el trabajo
	id_cliente 			INT, -- quien la realiza
    id_personal			INT, -- el técnico asignado en caso de realizarse
    id_servicio			INT, -- el servicio solicitado
    id_distrito			INT, -- distrito donde se requiere el servicio
    direccion			VARCHAR(100),
    estado				INT, -- 1: en espera | 2: no contratado | 3: contratado | 4: concluido
    foreign key (id_cliente) references clientes (id),
    foreign key (id_personal) references personal (id),
    foreign key (id_servicio) references servicios (id),
    foreign key (id_distrito) references distritos (id)
);

insert into clientes values (null, 'Juan Carlos', 'Castillo', 'Aycachi', '70555913', '979666355', 'carlosjordi@hotmail.com', '1993/04/01', 'clave123', 1);