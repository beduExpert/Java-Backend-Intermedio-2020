## Postwork Sesión 6

### Objetivo
- Entender qué es una entidad y cómo declararla usando las anotaciones de JPA dentro de nuestro proyecto.
- Aprender qué es un repositorio de Spring Data, la forma de declararlos y de usarlos para las operaciones relacionadas con el manejo de las bases de datos.
- Usar la consola de H2 para visualizar la información de la base de datos embebida dentro de nuestra aplicación.


#### Desarrollo   
1. Agrega el driver de MySQL como dependencia del proyecto.

2. Agrega las propiedades para realizar la conexión a la base de datos en el archivo `application.properties` del proyecto. 

3. Añade un nuevo paquete llamado entities, dentro del paquete persistence.

4. Crea una copia de los objetos contenidos en el paquete model pero coloca las anotaciones de JPA en lugar de las validaciones.

5. Crea un repositorio para cada una de las entidades (recuerda que debe ser una interface que extienda de `JpaRepository`).

6. Agrega la dependencia de H2 a la aplicación y asegúrate de que puedes conectarte a esta.

![imagen](img/img_01.png)

7. Agrega una clase que implemente la interface `CommandLineRunner` de Spring para inicializar los catálogos de la aplicación.

![imagen](img/img_02.png)

![imagen](img/img_03.png)
