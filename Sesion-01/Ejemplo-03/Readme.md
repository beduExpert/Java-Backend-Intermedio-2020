## Ejemplo : Creación de proyecto Maven con Spring Initilizr desde IntelliJ Idea

### Objetivo
- Aprender la forma de crear un proyecto Maven usando Spring Initlizr desde IntelliJ Idea.
- Compilar, empaquetar y ejecutar la aplicación o proyecto generados desde el IDE.
- Ejecutar la aplicación.

#### Requisitos
- Tener instalado la última versión del JDK 11 (De Oracle u OpenJDK).
- Tener instalado la última versión del IDE IntelliJ Idea Community Edition (o el trial de la última edition).
- Tener una conexión a Internet.

#### Desarrollo

1. Abre el IDE IntelliJ Idea. Crea un nuevo proyecto usando el menú `New -> Project`. 

![imagen](img/img_01.png)

2. En el menú que se abre selecciona la opción `Spring Initializr` y como SDK Java **11** (o superior).

![imagen](img/img_02.png)

3. En la ventana que se abre selecciona las siguientes opciones: 
- Grupo, artefacto y nombre del proyecto.
- Tipo de proyecto: **Maven Proyect**.
- Lenguaje: **Java**.
- Forma de empaquetar la aplicación: **jar**.
- Versión de Java: **11**.

![imagen](img/img_03.png)

4. En la siguiente ventana selecciona Spring Web como dependencia para el proyecto. 

![imagen](img/img_04.png)

5. En la última ventana dale un nombre y una ubicación al proyecto y presiona el botón `Finish`. Con esto se creará un nuevo proyecto que tiene la siguiente estructura:

![imagen](img/img_05.png)

