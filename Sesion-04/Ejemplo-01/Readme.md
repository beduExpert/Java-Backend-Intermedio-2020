## Ejemplo 4: Manejo de errores con ResponseStatusException

### Objetivo
- Regresar los estatus de respuesta más adecuados cuando ocurre un error al procesar una petición.

#### Requisitos
- Tener instalado el IDE IntelliJ Idea Community Edition.
- Tener instalada la última versión del JDK 11 (de Oracle u OpenJDK).
- Tener instalada la herramienta Postman.


#### Desarrollo

1. Crea un proyecto Maven usando Spring Initializr desde el IDE IntelliJ Idea.

2. En la ventana que se abre selecciona las siguientes opciones:
- Grupo, artefacto y nombre del proyecto.
- Tipo de proyecto: Maven Project.
- Lenguaje: Java.
- Forma de empaquetar la aplicación: jar.
- Versión de Java: 11.

3. En la siguiente ventana elige Spring Web como dependencia del proyecto.

4. Dale un nombre y una ubicación al proyecto y presiona el botón Finish.

5. En el proyecto que se acaba de crear debes tener el siguiente paquete: org.bedu.java.backend.sesion4.ejemplo1. Dentro crea dos subpaquetes: model y controllers.
