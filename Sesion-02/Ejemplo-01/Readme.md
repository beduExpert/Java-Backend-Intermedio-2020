## Ejemplo : Controladores con Spring MVC

### Objetivo
- Aprender la forma de crear controladores de Spring usando su módulo web (Spring MVC).
- Crear un primer servicio REST que regrese un recurso estático.
- Consumir el servicio usando un navegador Web y con [Postman](https://www.postman.com/downloads/).

#### Requisitos
- Tener instalado el IDE IntelliJ Idea Community Edition.
- Tener instalada la última versión del JDK 11 (de Oracle u OpenJDK).
- Tener instalada la herramienta [Postman](https://www.postman.com/downloads/).

#### Desarrollo

1. Crea un proyecto Maven usando Spring Initializr desde el IDE IntelliJIdea como lo hiciste en la primera sesión.

![imagen](img/img_01.png)

2.  En la ventana que se abre selecciona las siguientes opciones:

    Grupo, artefacto y nombre del proyecto.
    Tipo de proyecto: **Maven Project**.
    Lenguaje: **Java**.
    Forma de empaquetar la aplicación: **jar**.
    Versión de Java: **11**.

![imagen](img/img_02.png)

3. En la siguiente ventana elige Spring Web como la única dependencia del proyecto:

![imagen](img/img_03.png)

4. Dale un nombre y una ubicación al proyecto y presiona el botón `Finish`.

En el proyecto que se acaba de crear debes tener el siguiente paquete: `org.bedu.java.backend.sesion2ejemplo1`. 

![imagen](img/img_04.png)

Dentro de ese paquete crearemos un subpaquete que contendrá los controladores de Spring MVC (los componentes que reciben y manejan las peticiones web dentro de la aplicación).

5. Haz clic con el botón derecho del ratón sobre el paquete y en el menú que se muestra selecciona las opciones `New  -> Package`. Dale a este nuevo paquete el nombre de `controllers`.

![imagen](img/img_05.png)
