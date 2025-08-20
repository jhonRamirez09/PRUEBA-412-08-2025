# PRUEBA-412-08-2025
# Taller de nivelación PI a PII

## Parte teorica

### que es el markdown?

R/.

1. ¿Qué es un repositorio en Git y cómo se diferencia de un proyecto “normal”?

Un repositorio en Git es un proyecto que tiene un historial de versiones, administrado por Git.
Se diferencia de un proyecto “normal” porque incluye la carpeta oculta .git/ donde se guarda toda la información de commits, ramas y configuraciones.

2. Áreas principales de Git

Working directory: los archivos en tu disco duro que puedes editar directamente.
Staging area (index): un área intermedia donde seleccionas qué cambios quieres incluir en el próximo commit.
Repository (.git): base de datos interna de Git donde se guardan los commits y toda la historia del proyecto.

3. Representación interna en Git

**Blob:** guarda el contenido de un archivo (no el nombre).
**Tree:** estructura de directorios que relaciona nombres de archivos con blobs.
**Commit:** un objeto que apunta a un árbol (tree) y contiene información de autor, fecha y mensaje.
**Tag:** una etiqueta legible para humanos que apunta a un commit específico.

4. Crear un commit y qué almacena

## Se crea con:

git add archivo.txt
git commit -m "Mensaje"
**Un commit guarda:** puntero al tree, autor, fecha, mensaje y referencias a commits padres.

5. Diferencia entre git pull y git fetch

**git fetch:** descarga cambios del remoto pero no los mezcla con tu rama.
**git pull:** hace fetch + merge (o rebase si se configura).

6. Branch (rama) y punteros

Una rama es un puntero (nombre) que apunta a un commit.
HEAD indica en qué rama estás trabajando.
Al avanzar con nuevos commits, el puntero de la rama se mueve hacia adelante.

7. Merge y conflictos

## Se realiza con:

### git merge otra-rama

Conflictos ocurren cuando dos ramas modifican la misma línea de un archivo o lo eliminan/modifican de forma incompatible.
Se resuelven editando el archivo, eligiendo qué cambios mantener y luego:

git add archivo_conflictivo
git commit

8. Área de staging (git add)

**git add** mueve cambios del working directory → staging area.
Si omites este paso y haces git commit, no se guardan los cambios, solo lo que ya estaba en staging.

9. .gitignore

Archivo que lista patrones de archivos/carpetas que Git debe ignorar (no rastrear ni incluir en commits).

## Ejemplo:

*.log
node_modules/
.env

10. Diferencia --amend vs nuevo commit

**git commit --amend:** modifica el último commit (mensaje y/o contenido).

**Nuevo commit:** crea un commit adicional en el historial.
--amend reescribe la historia, cuidado si ya fue publicado.

11. git stash

Guarda cambios temporales sin hacer commit:

git stash
git stash pop

Útil cuando necesitas cambiar de rama pero no quieres perder lo que estabas editando.

12. Mecanismos para deshacer cambios

**git reset:** mueve punteros de commits y (opcionalmente) modifica el working directory.

**git revert:** crea un commit nuevo que deshace los cambios de uno anterior.

**git checkout [archivo]:** descarta cambios en un archivo (vuelve al último commit).

13. Configuración de remotos y forks

**origin:** nombre por defecto del remoto principal (tu fork).

**upstream:** remoto adicional (ej: repo original del que hiciste fork).

## Comandos:

git remote -v          # Ver remotos
git remote add upstream URL
git fetch upstream
git merge upstream/main

14. Inspeccionar historial de commits

**git log:** muestra historial de commits.

**git diff:** muestra diferencias entre commits/archivos.

**git show <commit>:** muestra los cambios y metadatos de un commit específico.

# PROGRAMACION

15. ¿Cuáles son los tipos de datos primitivos en Java?

Java tiene 8 tipos primitivos, que son los bloques básicos de construcción de datos:

## Enteros:

**byte** (8 bits, de -128 a 127).

**short** (16 bits, de -32,768 a 32,767).

**int** (32 bits, muy usado, de -2,147,483,648 a 2,147,483,647).

**long** (64 bits, números muy grandes).

**float** (32 bits, precisión simple).

**double** (64 bits, mayor precisión, es el más usado para decimales).

### Carácter:

**char** (16 bits, un único carácter Unicode como 'a', '9', '♥').

### Booleano:

**boolean** (1 bit lógico, valores true o false).

Estos tipos no son objetos, se almacenan directamente en memoria y son más rápidos que las clases envolventes como Integer, Double, etc.

16. ¿Cómo funcionan las estructuras de control de flujo como if, else, switch y bucles en Java?

Las estructuras de control permiten que el programa tome decisiones y repita instrucciones:

**if / else:** ejecutan bloques de código según una condición.

if (edad >= 18) {
    System.out.println("Mayor de edad");
} else {
    System.out.println("Menor de edad");
}


**switch:** selecciona un caso entre varios posibles.

int dia = 2;
switch(dia) {
    case 1: System.out.println("Lunes"); break;
    case 2: System.out.println("Martes"); break;
    default: System.out.println("Otro día");
}


**Bucles (loops):**

**for:** repite un número conocido de veces.

**while:** repite mientras la condición sea verdadera.

**do...while:** ejecuta al menos una vez antes de verificar la condición.

 ### Ejemplo con for:

for(int i=1; i<=5; i++) {
    System.out.println("Número " + i);
}

17. ¿Por qué es importante usar nombres significativos para variables y métodos?

Un buen nombre hace que el código sea fácil de leer, entender y mantener.
Por ejemplo, una variable llamada notaFinal explica mejor su función que n.
Además, en equipos de trabajo, usar nombres claros evita confusión y errores.

### Ejemplo:

double calcularPromedio(double suma, int cantidad) { ... } 

es mucho más entendible que:

double cp(double s, int c) { ... }

18. ¿Qué es la Programación Orientada a Objetos (POO)?

Es un paradigma de programación que organiza el software en torno a objetos, que combinan atributos (datos) y métodos (funciones).
En Java, todo gira alrededor de las clases (molde o plano) y los objetos (instancias concretas).

### Ejemplo:

class Persona {
   String nombre;
   int edad;
   void saludar() {
      System.out.println("Hola, soy " + nombre);
   }
}

Aquí Persona es la clase, y cada persona que crees en el programa será un objeto distinto.

19. ¿Cuáles son los cuatro pilares de la Programación Orientada a Objetos?

**Abstracción:** enfocarse en lo esencial de un objeto, ignorando detalles innecesarios. Ejemplo: un objeto Auto solo expone métodos como arrancar(), pero no muestra cómo funciona internamente el motor.

**Encapsulamiento:** proteger los datos de un objeto y dar acceso controlado mediante getters y setters. Esto evita manipular atributos directamente.

**Herencia:** permite crear nuevas clases basadas en otras, reutilizando código. Ejemplo: Perro puede heredar de Animal.

**Polimorfismo:** un mismo método puede comportarse distinto según el objeto. Ejemplo: el método sonido() puede imprimir "Ladra" en un Perro y "Maúlla" en un Gato.

20. ¿Qué es la herencia en POO y cómo se utiliza en Java?

La herencia permite que una clase llamada subclase herede atributos y métodos de otra clase llamada superclase.
Esto evita duplicar código y permite especializar clases.

### Ejemplo:

class Animal {
   void sonido() {
      System.out.println("Sonido genérico");
   }
}

class Perro extends Animal {
   void sonido() {
      System.out.println("Ladra");
   }
}

Aquí Perro hereda de Animal, pero sobrescribe el método sonido().

21. ¿Qué son los modificadores de acceso y cuáles son los más comunes en Java?

Los modificadores de acceso controlan qué partes del código pueden acceder a clases, atributos o métodos.

**public:** accesible desde cualquier lugar del proyecto.

**private:** accesible solo dentro de la misma clase.

**protected:** accesible en la misma clase, en clases del mismo paquete y en subclases.

default (package-private): accesible solo dentro del mismo paquete (cuando no se especifica ningún modificador).

### Ejemplo:

class Persona {
   private String nombre; // solo accesible dentro de Persona
   public void setNombre(String n) { this.nombre = n; }
}

22. ¿Qué es una variable de entorno y por qué son importantes para Java o la programación en general?

Una variable de entorno es una configuración definida en el sistema operativo que los programas pueden leer para saber rutas, opciones o credenciales.

En Java son muy importantes porque permiten indicar:

**JAVA_HOME:** ruta donde está instalado Java.

**PATH:** para poder ejecutar java y javac desde cualquier carpeta en la terminal.

En general, se usan para configurar bases de datos, claves de API, contraseñas, entornos de ejecución (desarrollo, pruebas, producción) sin tener que modificar el código. Esto hace que las aplicaciones sean más seguras y portables.

 **Ejemplo:** una aplicación puede leer una variable DB_PASSWORD en lugar de guardar la contraseña en el código fuente.