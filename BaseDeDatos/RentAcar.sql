create table Automoviles(
	idCar serial not null,
	patent text primary key not null,
	tipo text not null,
	model integer,
	brand text not null,
	color text,
	observation text default 'Sin Observaciones',
	rentPrice float not null,
	condition boolean not null
	);
insert into Automoviles(patent,tipo,model,brand,color,observation,rentPrice,condition) values ('AMD 288','Ecosport',2000,'Ford','Negro','Funcionando, en mal estado',1000.0,false )
insert into Automoviles(patent,tipo,model,brand,color,rentPrice,condition) values ('GGG 543','Meriva',1994,'Chevrolet','Gris',950.50,false )
insert into Automoviles(patent,tipo,model,brand,color,observation,rentPrice,condition) values ('PXP 121','Patriot',2009,'Jeep','Verde','Funcionando perfecto',1500.0,true )
insert into Automoviles(patent,tipo,model,brand,color,observation,rentPrice,condition) values ('KLJ 222','Aveo',2011,'Chevrolet','Blanco','Funcionando perfecto',1300.99,false )
insert into Automoviles(patent,tipo,model,brand,color,rentPrice,condition) values ('NOO 343','Corsa',2012,'Chevrolet','Gris',899.99,true )
insert into Automoviles(patent,tipo,model,brand,color,observation,rentPrice,condition) values ('KPJ 541','Siena',2014,'Fiat','Blanco','Funcionando, en mal estado',599.99,false)
insert into Automoviles(patent,tipo,model,brand,color,observation,rentPrice,condition) values ('LLL 231','C4',2016,'Citroen','Azul','Funcionamiento perfecto',1799.99,true)

truncate table Automoviles restart identity

-- Creacion de nueva columna para datos de quien lo alquila
alter table Automoviles
add rented integer
-- Creacion de foreign key
alter table Automoviles
add constraint dniClient_Clientes
foreign key (rented)
references clientes (dni)

select * from Automoviles

update Automoviles set rented = 41999123
where patent = 'PXP 121'


update Automoviles set rented = 39888111
where patent = 'NOO 343'
update Automoviles set rented = 39123321
where patent = 'LLL 231'




-- Nueva Relacion (Clientes)

create table clientes(
	idClient serial not null,
	dni integer primary key,
	name text not null,
	surname text not null,
	paymentType text not null,
	high date,
	low date,
	phone text default 'Vacio',
	condition boolean not null
	);
	
-- Agrega  nuevos clientes (datos)
insert into clientes(dni,name,surname,paymentType,high,low,condition) values (30999265,'Luciano','Paz','Efectivo','2018-10-15', '2018-11-15',false)
insert into clientes(dni,name,surname,paymentType,high,low,condition) values (22541222,'Maria','Gonzalez','Debito','2018-12-10', '2019-01-10',false)
insert into clientes(dni,name,surname,paymentType,high,low,phone,condition) values (34999111,'Martin','Lopez','Credito','2018-12-11', '2019-01-11','1166771233',false)
insert into clientes(dni,name,surname,paymentType,high,low,phone,condition) values (38602058,'Jonathan','Gomez','Efectivo','2019-01-05', '2019-02-05','1165783160',false)
insert into clientes(dni,name,surname,paymentType,high,low,phone,condition) values (40444561,'Julio','Rodriguez','Efectivo','2019-01-06', '2019-02-06','1162323213',false)
insert into clientes(dni,name,surname,paymentType,high,low,phone,condition) values (41999123,'Ernesto','Soria','Debito','2019-01-07', '2019-02-07','1112323333',true)
insert into clientes(dni,name,surname,paymentType,high,low,phone,condition) values (39888111,'Roberto','Canosa','Efectivo','2019-02-06', '2019-03-06','116543555',true)
insert into clientes(dni,name,surname,paymentType,high,low,condition) values (39123321,'Jose','Mora','Efectivo','2019-02-07', '2019-03-07',true)


-- Creacion de nueva columna
alter table clientes
add patentCar text

-- Visualizamos
select * from clientes

-- Creacion de foreign key
alter table clientes
add constraint patentCar_automoviles
foreign key (patentCar)
references Automoviles (patent)

-- Agrega la patente solo para el dni ingresado
update clientes set patentCar = 'PXP 121'
where dni = 41999123
-- drop table automoviles

update clientes set patentCar = 'NOO 343'
where dni = 39888111

update clientes set patentCar = 'PXP 121'
where dni = 41999123

update clientes set patentCar = 'LLL 231'
where dni = 39123321


--truncate table clientes restart identity
