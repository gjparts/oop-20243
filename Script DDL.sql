--comentario de una linea
/*comentario
de
varias
lineas*/
/*T-SQL: Transact SQL
grupos de instrucciones:
DDL: Data Definition Language; CREATE, DROP, ALTER
DML: Data Manipulation Language: SELECT, INSERT, UPDATE, DELETE
DCL: Data Control Language: GRANT, DENY
TCL: Transaction Control Language: BEGIN TRANSACTION, COMMIT, ROLLBACK*/
--DDL:
--creacion de la base de datos
CREATE DATABASE Gerardo
GO
--se recomienda que entre cada instruccion DDL colocar GO
--para que al procesar dicha instruccion continue con la siguiente.
--Importante antes de comenzar a ejecutar instrucciones
--hay que seleccionar la base de datos en la cual vamos a trabajar:
USE Gerardo
GO

--Borrar una base de datos: PRECAUCION!
--Importante: la base de datos no debe de estar en uso.
--antes seleccione otra base de datos, por ejemplo master
USE master
GO
DROP DATABASE Gerardo
GO

--crear una tabla
CREATE TABLE Producto(
	ProductoID bigint NOT NULL IDENTITY(1,1), --campo autonumerico de 1 en 1
	Codigo VARCHAR(20) NOT NULL,
	Nombre VARCHAR(150) NOT NULL,
	Costo DECIMAL(12,2) NOT NULL,
	PrecioVenta DECIMAL(12,2) NOT NULL,
	Existencias DECIMAL(12,2) NOT NULL,
	Comentarios TEXT NULL,
	PRIMARY KEY(ProductoID) --la llave primaria hace unico a cada registro
)
GO
--NOT NULL: campo obligatorio
--NULL: campo opcional

--borrar una tabla
DROP TABLE Producto
GO

--vaciar una tabla sin eliminarla (borrar solo sus registros)
--tambien reinicia el campo IDENTITY
TRUNCATE TABLE Producto
GO

--Agregar una columna a una tabla que ya tiene datos
ALTER TABLE Producto
ADD Disponible bit NULL
GO

--Borrar una columna de la tabla
ALTER TABLE Producto
DROP COLUMN Disponible
GO

--cambiar el tamaño de una columna
--ampliar el tamaño de la columna Nombre
ALTER TABLE Producto
ALTER COLUMN Nombre VARCHAR(255) NOT NULL
GO

--cambiar la condicion de nulidad de una columna
--que nombre permita usar NULL
ALTER TABLE Producto
ALTER Column Nombre VARCHAR(255) NULL
GO

--cambiar la condicion de nulidad de una columna
--que nombre SEA OBLIGATORIO
ALTER TABLE Producto
ALTER Column Nombre VARCHAR(255) NOT NULL
GO