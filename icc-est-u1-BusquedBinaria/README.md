
# Práctica sobre la Busqueda Binaria

## 📌 Información General

- **Título:** Práctica sobre la Busqueda Binaria
- **Asignatura:** Estructura de Datos
- **Carrera:** Computación
- **Estudiante:** Kevin Paladines
- **Fecha:** 20/04/2025
- **Profesor:** Ing. Pablo Torres

---

## 🛠️ Descripción


Este proyecto implementa una búsqueda binaria para encontrar a una persona en un arreglo de objetos a partir de su edad.
La búsqueda se realiza luego de ordenar el arreglo por edad.

Permite Ingresar:
- Nombre de la persona.
- Edad de la persona (En caso de ser negativo nos pedira ingresar de nuevo la edad hasta que ingrese una valida).
- En caso de ingresar una edad que no se encunetre en el arreglo nos dira que no existe tal persona con la edad indicada.
- Visualización de como encuentra la edad(Alto, Bajo, ValorCentro, Derecha, Izquierda).

---


## 🧑‍💻 Ejemplo de Entrada

```plaintext

------------Metodo Busqueda Binaria------------
Ingrese la cantidad de personas para el listado : 
9
Ingrese la Persona
Nombre: Bianka
Edad: 17
Ingrese la Persona
Nombre: Erika
Edad: 24
Ingrese la Persona
Nombre: Milton
Edad: 26
Ingrese la Persona
Nombre: Gael
Edad: 6
Ingrese la Persona
Nombre: Mateo
Edad: 4
Ingrese la Persona
Nombre: Jostin
Edad: 14
Ingrese la Persona
Nombre: Christian
Edad: 19
Ingrese la Persona
Nombre: Said
Edad: 18
Ingrese la Persona
Nombre: Andres
Edad: 20

Arreglo ordenado por edad:
4 | 6 | 14 | 17 | 18 | 19 | 20 | 24 | 26 | 

Ingrese el valor de la persona que desea buscar: 14

4 | 6 | 14 | 17 | 18 | 19 | 20 | 24 | 26 | 
Bajo:0
Alto:8
Centro:4
ValorCentro:18
---> Izquierda
4 | 6 | 14 | 17 | 
Bajo:0
Alto:3
Centro:1
ValorCentro:6
---> Derecha
14 | 17 |
Bajo:2
Alto:3
Centro:2
ValorCentro:14
---> Encontrado
La persona con la edad 14 es Jostin
```

---

