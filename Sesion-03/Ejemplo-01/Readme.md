## Ejemplo: Validaciones de Java Beans

### Objetivo
- Aplicar las anotaciones proporcionadas por el JSR 303 para restringir los valores correctos de los atributos de los objetos del modelo de datos.
- Usar Hibernate Validator como implementación del JSR 303.

#### Requisitos
- Tener instalado el IDE IntelliJ Idea Community Edition.
- Tener instalada la última versión del JDK 11 (de Oracle u OpenJDK).
- Tener instalada la herramienta Postman.

#### Desarrollo

1. Crea un proyecto Maven usando Spring Initializr desde el IDE IntelliJ Idea.

2. En la ventana que se abre selecciona las siguientes opciones:
- Grupo, artefacto y nombre del proyecto. 
- Tipo de proyecto: **Maven Project**. 
- Lenguaje: **Java**. 
- Forma de empaquetar la aplicación: **jar**. 
- Versión de Java: **11**.

3. En la siguiente ventana elige Spring Web y **Validation** como dependencias del proyecto:

![imagen](img/img_01.png)






