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
    **Versión de Java: 11**.

![imagen](img/img_02.png)

3. En la siguiente ventana elige Spring Web como la única dependencia del proyecto:

![imagen](img/img_03.png)

4. Dale un nombre y una ubicación al proyecto y presiona el botón `Finish`.

En el proyecto que se acaba de crear debes tener el siguiente paquete: `org.bedu.java.backend.sesion2ejemplo1`. 

![imagen](img/img_04.png)

Dentro de ese paquete crearemos un subpaquete que contendrá los controladores de Spring MVC (los componentes que reciben y manejan las peticiones web dentro de la aplicación).

5. Haz clic con el botón derecho del ratón sobre el paquete y en el menú que se muestra selecciona las opciones `New  -> Package`. Dale a este nuevo paquete el nombre de `controllers`.

![imagen](img/img_05.png)

6. Crea un segundo paquete llamado `model` a la misma altura que el paquete `controllers`. Al final debes tener dos paquetes adicionales:

![imagen](img/img_06.png)

7. Dentro del paquete crea una nueva clase llamada "`Saludo`". Esta clase representará el modelo de los datos que regresará el servicio que crearemos en un momento. Esta será una clase sencilla que solo tendrá una propiedad de tipo `String`: `mensaje`. Además de esta propiedad la clase debe tener su método *setter* y su método *getter*:    

```java
public class Saludo {
    private String mensaje;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
```

Cuando alguien invoque esta clase le regresaremos una instancia nueva de esta clase con un valor establecido en su atributo mensaje. Este diseño se puedde mejorar pero para este ejemplo servirá el diseño anterior.

8. En el paquete `controller` crea una nueva clase llamada `SaludoController`. Esta clase implementará los servicios web REST que manejan a los recursos de tipo `Saludo`. Para indicar a Spring que este componente es un servicio REST debemos decorar la case con la anotación `@RestController`:

```java
@RestController
public class SaludoController {

}
```

Esta clase tendrá, en este momento, un  solo método o manejador de llamadas, el cual no recibirá ningún parámetro y regresará un recurso de tipo `Saludo` con un mensaje preestablecido.

```java
    public Saludo saluda(){

        Saludo saludo = new Saludo();
        saludo.setMensaje("¡¡Hola Mundo!!");

        return saludo;
    }
```

Para indicar que este método es un manejador de peticiones debemos indicar qué tipo de operaciones manejará (el verbo HTTP que soportará). Como en este caso solo se usará para leer información estática se usará el verbo **GET**. Spring en su módulo web (Spring MVC) proporciona una serie de anotaciones que permite indicar esto de una forma sencilla. En este caso la anotación que se usrá es `@GetMapping` a la cual hay que indicarle la URL de las peticiones que manejará. En este caso será la ruta `saludo`. El método completo queda de la siguiente forma:

```java
    @GetMapping("/saludo")
    public Saludo saluda(){

        Saludo saludo = new Saludo();
        saludo.setMensaje("¡¡Hola Mundo!!");

        return saludo;
    }
```

9. Ejecuta la aplicación, en la consola del IDE debes ver un mensaje similar al siguiente:

![imagen](img/img_07.png)

Esto quiere decir que la aplicación se ejecutó correctamente y todo está bien configurado.

10. Desde tu navegador entra en la siguiente ruta: [http://localhost:8080/saludo](http://localhost:8080/saludo). Debes ver una salida similar a la siguiente:

![imagen](img/img_08.png)

Dependiendo de tu navegador y de los plugins que tengas instalado, podrías ver el formato un poco diferente; lo importante es que veas el texto "**¡¡Hola Mundo!!**".

Esto quiere decir que la aplicación ha funcionado de forma correcta.

11. Ahora, consumiremos el servicio usando *Postman*, el cual es una herrmienta cuya finalidad principal es consumir servicios REST. Al abrir Postman debes ver una ventana similar a la siguiente:

![imagen](img/img_09.png)

12. Haz clic en la opción *Create a basic request*:

![imagen](img/img_10.png)

13. En la siguiente ventana coloca la misma URL de la petición que usaste en el navegador y presiona el botón `Send`:

![imagen](img/img_11.png)

14. Una vez que recibas la respuesta, debes ver una salida similar en el panel de respuestas:

![imagen](img/img_12.png)
