/*DML: Data Manipulation Language*/
--primero e importante: seleccione la base de datos a usar
USE Gerardo
GO
--Los DML no requieren del uso de GO; pero puede seguirlo usando
--En algunos lengajes las instrucciones SQL terminan con punto y coma

/*Instruccion INSERT
Agrega registros a la tabla:
1) en un INSERT se debe incluir todos los campos obligatorios (NOT NULL)
2) los campos no obligatorios los utiliza si gusta o no (NULL)
3) si tiene un campo que sea IDENTITY (autonumerado) ese no se incluye
   en el INSERT aunque sea obligatorio.*/

--luego del nombre de la tabla se lista los campos a incluir en el INSERT
INSERT Producto(Codigo,Nombre,Costo,PrecioVenta,Existencias,Comentarios)
VALUES('CC01','Coca Cola 3L',55,65,100,'Malo para la salud')
--observe que values llevara los valores de cada campo de acuerdo al orden
--en que fueron icnluidos en el INSERT

--No es obligatorio incluir los campos en el orden que estan en la tabla:
INSERT Producto(Comentarios,Costo,Existencias,PrecioVenta,Codigo,Nombre)
VALUES('un comentario',12,50,18,'ABC99','Ricasula con chicharron')

--recuerden que si un campo no es obligatorio (NULL) lo puede excluir de un INSERT
INSERT Producto(Codigo,Nombre,Costo,PrecioVenta,Existencias)
VALUES('CC02','Sprite 2L',25,30,0)

--que pasa si no incluye un campo ogligatorio (NOT NULL)?
INSERT Producto(Nombre, Costo, PrecioVenta, Existencias)
VALUES('Mirinda 2L',23,30,200)
--lo anterior daria error

--tambien puede insertar varios registros en una sola definicion de campos
INSERT Producto(Codigo,Nombre,Costo,PrecioVenta,Existencias,Comentarios)
VALUES
('AB50','Doritos Fuego',23,35,90,'Malo para la salud tambien'),
('FR12','Manzana Unidad',6,10,45,'Buena para la salud'),
('VD04','Tomate LB',12,17,300,NULL),
('VD01','Lechuga Unidad',13,20,12,NULL)

/*instruccion SELECT
permite consultar los registros de una tabla*/
--deseo consultar todos los registros y campos de la tabla Producto
SELECT * FROM Producto
--deseo consultar los primeros 4 registros y todos los campos de la tabla Producto
SELECT TOP(4) * FROM Producto
/*observe que hemos usado el caracter ASTERISCO * antes de FROM
ese caracter indica que quiero ver todos los campos (columnas) de la tabla
cuando les toque pasar a un ambiente de produccion o un aplicativo trate de evitar
el uso del ASTERISCO en las consultas.
Cuando se usa ese caracter lo que hace la consulta es ir a averiguar a los METADATOS
de la base de datos model que campos tiene la tabla lo que representa doble trabajo
para el servidor*/
--en lugar de *, se recomienda listar los campos que desea mostrar en su consulta:
SELECT ProductoID, Codigo, Nombre, Costo, PrecioVenta, Existencias, Comentarios FROM Producto
--lo anterior muestra todos los registros de la tabla Producto para los campos listados
--tambien lo puede usar con TOP:
SELECT TOP(3) ProductoID, Codigo, Nombre, Costo, PrecioVenta, Existencias, Comentarios FROM Producto
--lo anterior muestra los primeros 3 registros de la tabla Producto para los campos listados

--Podemos elegir que columnas y el orden para mostrarlas:
SELECT Codigo, Nombre, PrecioVenta FROM Producto
SELECT Nombre, Existencias, Comentarios, PrecioVenta FROM Producto
--puede colocar apodos a las columnas (alias)
SELECT	ProductoID as Identificador, Codigo, Nombre as [Nombre del producto],
		PrecioVenta as [Precio de Venta], Comentarios as Observaciones
FROM Producto
--observe que si el alias es solo un palabra no lleva corchetes, en cambio si lleva
--mas de una palabra el alias debe ir entre corchetes o brackets []

--tambien podemos tener campos calculados, estos se generan en tiempo real cuando
--se dispare la consulta (query)
SELECT Codigo, Nombre, Costo, PrecioVenta, PrecioVenta-Costo as Ganancia
FROM Producto

--otro ejemplo:
SELECT	Codigo, Nombre, Costo, PrecioVenta, PrecioVenta-Costo as Ganancia,
		PrecioVenta*0.15 as ISV, POWER(Costo,2) as [Costo al cuadrado],
		SQRT(PrecioVenta) as [Raiz Cuadrada de Precio de Venta],
		(PrecioVenta-Costo)/Costo*100 as [Desviacion estandar]
FROM Producto

--mostrar todos los productos, ordenados por costo de menor a mayor (ASC ascendant)
SELECT Codigo, Nombre, Costo, PrecioVenta
FROM Producto
ORDER BY Costo ASC

--mostrar todos los productos, ordenados por costo de mayor a menor (DESC descendent)
SELECT Codigo, Nombre, Costo, PrecioVenta
FROM Producto
ORDER BY Costo DESC

--mostrar los productos ordenados alfabeticamente por nombre de menor a mayor
SELECT Codigo, Nombre, Costo, PrecioVenta
FROM Producto
ORDER BY Nombre ASC

--puede ordenar usando mas de un campo:
--mostrar todos los productos ordenados por costo de mayor a menor
--y luego por nombre alfabeticamente de menor a mayor
SELECT Codigo, Nombre, Costo, PrecioVenta
FROM Producto
ORDER BY Costo DESC, Nombre ASC

--tambien puede ordenar usando campos calculados:
--mostrar todos los productos ordenados de acuerdo a su ganancia de menor a mayor
SELECT Codigo, Nombre, Costo, PrecioVenta, PrecioVenta-Costo as Ganancia
FROM Producto
ORDER BY PrecioVenta-Costo DESC
--observe que en ORDER BY no se pone el Alias del campo calculado, solo va el calculo

--funciones de agregado
--mostrar la suma de todos los costos de la tabla producto
SELECT SUM(Costo) as [Total Costos] FROM Producto
--mostrar la suma de todas las ganancias de la tabla producto
SELECT SUM(PrecioVenta-Costo) as [Ganancia total] FROM Producto
--mostrar el promedio de todos los costos de la tabla Producto (AVG = Average)
SELECT AVG(Costo) as [Costo promedio] FROM Producto
--mostrar la cantidad de filas que tiene la tabla Producto (dentro de COUNT va cualquier campo)
SELECT COUNT(ProductoID) FROM Producto
--mostrar el precio del producto mas caro de vender en la tabla Producto
SELECT MAX(PrecioVenta) FROM Producto
--mostrar el precio del producto mas barato de vender en la tabla Producto
SELECT MIN(PrecioVenta) FROM Producto

--mostrar los primeros 5 registros de la tabla producto (mostrar todos los campos)
SELECT TOP(5) * FROM Producto
--mostrar los primeros 5 registros de la tabla producto (mostrar ciertos campos)
SELECT TOP(5) Codigo, Nombre, Costo FROM Producto
--mostrar los primeros 5 registros de la tabla producto (mostrar ciertos campos y hasta calculados)
SELECT TOP(5) Codigo, Nombre, PrecioVenta-Costo as Ganancia FROM Producto
--mostrar unicamente el producto mas caro de vender de la tabla producto
SELECT TOP(1) Codigo, Nombre, Codigo, PrecioVenta, Existencias, Comentarios
FROM Producto
ORDER BY PrecioVenta DESC
--mostrar el ultimo numero generado para ProductoID
SELECT TOP(1) ProductoID FROM Producto ORDER BY ProductoID DESC
--otra forma de hacerlo:
SELECT MAX(ProductoID) FROM Producto

--reemplazo de valores NULL
--para la columna Comentarios cualquier NULL encontrado lo mostramos con un texto generico
SELECT Codigo, Nombre, ISNULL(Comentarios,'Sin comentarios') as Comentarios
FROM Producto

--uso del WHERE: permite filtrar datos en una consulta de acuerdo a uno o varios criterios
--mostrar solo los productos con costo >= 25
SELECT *
FROM Producto
WHERE Costo >= 25
--mostrar solo los productos con costo >= 25 ordenados alfabeticamente por nombre
SELECT *
FROM Producto
WHERE Costo >= 25
ORDER BY Nombre ASC
--productos con existencias menores a 10
SELECT Codigo, Nombre, Existencias
FROM Producto
WHERE Existencias < 10
--productos cuyo precio de venta sean mayores o iguales a 20 y menores o iguales a 50
SELECT *
FROM Producto
WHERE PrecioVenta >= 20 AND PrecioVenta <= 50
--otra forma de hacer el anterior:
SELECT *
FROM Producto
WHERE PrecioVenta BETWEEN 20 AND 50
--where tambien se puede usar con campos calculados
--productos cuya ganancia sea mayor a 5
SELECT *, PrecioVenta-Costo as Ganancia
FROM Producto
WHERE PrecioVenta-Costo > 5

--uso de where con valores NULL
--importante: un valor NULL no se puede igualar con operadores de equivalencia como = o <>
--productos cuyo comentario sea nulo
SELECT * FROM Producto WHERE Comentarios IS NULL
--productos cuyo comentario NO sea nulo
SELECT * FROM Producto WHERE NOT Comentarios IS NULL

--operador OR
--productos con costo menor a 5 o arriba de 10
SELECT * FROM Producto WHERE Costo < 5 OR Costo > 10

--uso del DISTINTO DE
--productos cuyo costo NO SEA igual a 25
--forma 1:
SELECT * FROM Producto WHERE Costo != 25
--forma 2:
SELECT * FROM Producto WHERE Costo <> 25
--forma 3: usando el operador logico NOT
SELECT * FROM Producto WHERE NOT Costo = 25

--WHERE en campos de texto
--Importante: algunos motores de base de datos ignorar mayusc/misnuc de forma predeterminada
--esto va a depender de la forma en que ha sido configurado el servidor y la base de datos
--productos cuyo codigo sea CC01
SELECT * FROM Producto WHERE Codigo = 'CC01'
--productos cuyos codigos sean CC01, AB50, AB01 y XY99
SELECT * FROM Producto WHERE Codigo IN ('CC01','AB50','AB01','XY99')
--productos cuyos codigos NO sean CC01, AB50, AB01 y XY99
SELECT * FROM Producto WHERE NOT Codigo IN ('CC01','AB50','AB01','XY99')
--IN tambien sirve con numeros
--producto cuyo ProductoID sea 1,3,5,7,100
SELECT * FROM Producto WHERE ProductoID IN (1,3,5,7,100)
--uso del operador LIKE
--productos que lleven la palabra salud dentro de sus comentarios en cualquier parte
SELECT * FROM Producto WHERE Comentarios LIKE '%salud%'
--productos que lleven la letra e en cualquier parte de su nombre
SELECT * FROM Producto WHERE Nombre LIKE '%e%'
--Productos que lleven la palabra salud en cualquier parte del comentario
--y la letra a en cualquier parte de su nombre
SELECT * FROM Producto WHERE Comentarios LIKE '%salud%' AND Nombre LIKE '%a%'
--productos cuyo nombre comience con la letra c
SELECT * FROM Producto WHERE Nombre LIKE 'c%'
--productos cuyo nombre termine con la letra L
SELECT * FROM Producto WHERE Nombre LIKE '%L'
--productos cuyo codigo comience con CC
SELECT * FROM Producto WHERE Codigo LIKE 'CC%'

/*Instruccion DELETE
Elimina los registros de una tabla
-> IMPORTANTE: se recomienda combinarlo con WHERE para determinar lo que va a borrar.
               un DELETE sin WHERE borra todos los registros de la tabla SIN reiniciar
			   el campo IDENTITY.*/
--borrar todos los registros de la tabla Producto
DELETE FROM Producto
--RECOMENDACION: antes de ejecutar un DELETE, es importante hacer un SELECT con el mismo
--WHERE que va a usar en el DELETE, asi podra saber que registros se van a eliminar.
--lo anterior equivale a hacer una vista previa de los registros a borrar.
--eliminar todos los productos cuyo costo sea menor a 30
SELECT * FROM Producto WHERE Costo < 30
DELETE FROM Producto WHERE Costo < 30
--eliminar los productos cuyo comentario sea nulo
SELECT * FROM Producto WHERE Comentarios IS NULL
DELETE FROM Producto WHERE Comentarios IS NULL

--Instruccion TRUNCATE: borra todos los registros de una tabla, en el caso de SQL SERVER
--reinicia el campo IDENTITY, TRUNCATE no soporta WHERE.
TRUNCATE TABLE Producto

/*Instruccion UPDATE
Hace cambios en los registros de una tabla, se recomienda combinarlo con WHERE
Al igual que DELETE tambien se recomiendo hacer una vista previa usando SELECT.*/
--Colocar en CERO todos los costos de los productos
SELECT * FROM Producto
UPDATE Producto SET Costo = 0 
--colocar en 60 el costo del producto con codigo CC01
SELECT * FROM Producto WHERE Codigo = 'CC01'
UPDATE Producto SET Costo = 60 WHERE Codigo = 'CC01'
--colocar en 0 el costo de los productos con codigo CC01, CC02, VD01
SELECT * FROM Producto WHERE Codigo IN ('CC01','CC02','VD01')
UPDATE Producto SET Costo = 0 WHERE Codigo IN ('CC01','CC02','VD01')
--UPDATE permite afectar mas de nun campo
--colocar en 60 el costo y en 75 el precio de venta para los productos con codigos CC01, CC02, VD01
SELECT * FROM Producto WHERE Codigo IN ('CC01','CC02','VD01')
UPDATE Producto SET Costo = 60, PrecioVenta = 75 WHERE Codigo IN ('CC01','CC02','VD01')
--tambien puede realizar calculos en los UPDATE
--amentar en un 10% el precio de todos los productos
SELECT * FROM Producto
UPDATE Producto SET PrecioVenta = PrecioVenta*1.10
--incrementar en 5 las existencias de los productos cuyo codigo comience con CC
SELECT * FROM Producto WHERE Codigo LIKE 'CC%'
UPDATE Producto SET Existencias += 5 WHERE Codigo LIKE 'CC%'
--colocar el comentario PROMOCION en los registros cuyo comentario sea NULL
SELECT * FROM Producto WHERE Comentarios IS NULL
UPDATE Producto SET Comentarios = 'PROMOCION' WHERE Comentarios IS NULL
--tambie puede concatenar texto en los campos
--agregar la palabra REVISADO a todos los comentarios de aquellos productos con codigos: CC01 y CC02
SELECT * FROM Producto WHERE Codigo IN ('CC01','CC02')
UPDATE Producto SET Comentarios = CONCAT(Comentarios,' REVISADO')
WHERE Codigo IN ('CC01','CC02')
--aplicar un descuento del 15% al precio de venta de todos los productos
--que tengan la palabra PROMOCION en sus comentarios
SELECT * FROM Producto WHERE Comentarios LIKE '%PROMOCION%'
UPDATE Producto SET PrecioVenta = PrecioVenta*0.85 WHERE Comentarios LIKE '%PROMOCION%'

SELECT * FROM Producto