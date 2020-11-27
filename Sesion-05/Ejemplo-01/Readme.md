## Ejemplo 1: Creación de getters, setters, constructores, equals y hashcode con @Data

### Objetivo
- Usar las anotaciones básicas de Lombok para la generación de getters, setters, constructores, equals y hashcode.

#### Requisitos
- Tener instalado el IDE IntelliJ Idea Community Edition con el plugin de Lombok activado.
- Tener instalada la última versión del JDK 11 (de Oracle u OpenJDK).
- Tener instalada la herramienta Postman.


#### Desarrollo

1. Crea un proyecto **Maven** desde el IDE IntelliJ Idea. Este proyecto No deberá ser creado con Spring Initilizr.

2. Agrega al proyecto, en el archivo **pom.xml** la dependencia de Lombok 

```xml
    <dependencies>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.18.16</version>
            <scope>provided</scope>
        </dependency>
    </dependencies>
```
