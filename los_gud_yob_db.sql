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

insert into servicios values (null, 'Duo', '10MB + telefono ilimitado', 89, 1);
insert into servicios values (null, 'Duo', '20MB + telefono ilimitado', 99, 1);
insert into servicios values (null, 'Duo', '30MB + telefono ilimitado', 129, 1);
insert into servicios values (null, 'Duo', '60MB + telefono ilimitado', 159, 1);
insert into servicios values (null, 'Duo', '100MB + telefono ilimitado', 229, 1);

insert into distritos values (null, 'Callao');
insert into distritos values (null, 'Bellavista');
insert into distritos values (null, 'Carmen de La legua');
insert into distritos values (null, 'La Perla');
insert into distritos values (null, 'La Punta');
insert into distritos values (null, 'Mi Perú');
insert into distritos values (null, 'Ventanilla');
insert into distritos values (null, 'Lima');
insert into distritos values (null, 'Ancón');
insert into distritos values (null, 'Ate');
insert into distritos values (null, 'Barranco');
insert into distritos values (null, 'Breña');
insert into distritos values (null, 'Carabayllo');
insert into distritos values (null, 'Cieneguilla');
insert into distritos values (null, 'Chaclacayo');
insert into distritos values (null, 'Chorrillos');
insert into distritos values (null, 'Comas');
insert into distritos values (null, 'El Agustino');
insert into distritos values (null, 'Independencia');
insert into distritos values (null, 'Jesús María');
insert into distritos values (null, 'La Molina');
insert into distritos values (null, 'La Victoria');
insert into distritos values (null, 'Lince');
insert into distritos values (null, 'Los Olivos');
insert into distritos values (null, 'Lurigancho');
insert into distritos values (null, 'Lurín');
insert into distritos values (null, 'Magdalena del Mar');
insert into distritos values (null, 'Miraflores');
insert into distritos values (null, 'Pachacámac');
insert into distritos values (null, 'Pucusana');
insert into distritos values (null, 'Pueblo Libre');
insert into distritos values (null, 'Puente Piedra');
insert into distritos values (null, 'Punta Hermosa');
insert into distritos values (null, 'Punta Negra');
insert into distritos values (null, 'Rímac');
insert into distritos values (null, 'San Bartolo');
insert into distritos values (null, 'San Borja');
insert into distritos values (null, 'San Isidro');
insert into distritos values (null, 'San Juan de Lurigancho');
insert into distritos values (null, 'San Juan de Miraflores');
insert into distritos values (null, 'San Luis');
insert into distritos values (null, 'San Martín de Porres');
insert into distritos values (null, 'San Miguel');
insert into distritos values (null, 'Santa Anita');
insert into distritos values (null, 'Santa María del Mar');
insert into distritos values (null, 'Santa Rosa');
insert into distritos values (null, 'Santiago de Surco');
insert into distritos values (null, 'Surquillo');
insert into distritos values (null, 'Villa El Salvador');
insert into distritos values (null, 'Villa María del Triunfo');

insert into cargos values (null, 'Operador');
insert into cargos values (null, 'Administrador');
insert into cargos values (null, 'Tecnico');
insert into cargos values (null, 'Ventas');

insert into personal values (null, 'Sandra Paola', 'Castillo', 'Aycachi', '80666319', '989555422', 'sandrita@gmail.com.pe', '2005/06/30', 'clave321', 1, 1, 1);
insert into personal values (null, 'Alejandra', 'Hallasi', 'Montesinos', '90505041', '951623847', 'alejandra@yahoo.es', '1997/04/10', 'clave231', 3, 1, 1);

select * from clientes;
select * from servicios;
select * from distritos;
select * from solicitud;
select * from personal;
select * from cargos;