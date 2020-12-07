## Ejemplo 1: Pruebas unitarias con JUnit 5 y Mockito

### Objetivo
- Crear una prueba que ayude a vaiar el correcto funcionamiento de una clase o componente.
- Simular el funcionamiento de una clase que aún no existe, usando un mock creado con Mockito.  

#### Requisitos
- Tener instalado el IDE IntelliJ Idea Community Edition con el plugin de Lombok activado.
- Tener instalada la última versión del JDK 11 (de Oracle u OpenJDK).


#### Desarrollo

1. Crea un proyecto Maven usando Spring Initializr desde el IDE IntelliJ Idea.

2. En la ventana que se abre selecciona las siguientes opciones:
- Grupo, artefacto y nombre del proyecto.
- Tipo de proyecto: **Maven Project**.
- Lenguaje: **Java**.
- Forma de empaquetar la aplicación: **jar**.
- Versión de Java: **11**.

3. En la siguiente ventana elige **Spring Web** y **Lombok** como dependencias del proyecto. En automático se agregarán también las dependencias para realizar pruebas unitarias.

4. Dale un nombre y una ubicación al proyecto y presiona el botón *Finish*.

5. En el proyecto que se acaba de crear debes tener el siguiente paquete `org.bedu.java.backend.sesion7.ejemplo1`. Dentro crea los subpaquetes: `persistence`, `services`.

6. Dentro del paquete `persistence` crea una interface llamada `CalculadoraDao` de la siguiente forma:
```java
    @Component
    public interface CalculadoraDao {
        int findValorConstante();
    }
```
Esta interface nos ayudará a simular que se lee un valor constante de una base de datos. Sin embargo, no habrá ninguna clase que implemente esta interface (y por eso deberemos crear un mock para simular su comportamiento).


7. En el paquete `services` crea una clase llamada `CalculadoraService` y decórala con la anotación `@Service` de Spring.
```java@Service
public class CalculadoraService {

}
```

8. Coloca tres métodos dentro de esta clase, uno que regresará la suma de dos valores, otro su resta y un tercero para su multiplicación:
```java
    public int suma(int a, int b) {
        return a + b;
    }

    public int resta(int a, int b) {
        return a - b;
    }

    public int multiplica(int a, int b) {
        return a * b;
    }
```

9. Modificaremos el valor de cada una de las operaciones sumándoles un valor constante que será regresado por el método `findValorConstante` de la interfaz `CalculadoraDao`
```java
    public int suma(int a, int b) {
        return a + b + calculadoraDao.findValorConstante();
    }

    public int resta(int a, int b) {
        return a - b + calculadoraDao.findValorConstante();
    }

    public int multiplica(int a, int b) {
        return a * b + calculadoraDao.findValorConstante();
    }
```

10. Agrega una referencia a esta interface y usa la anotación `@RequiredArgsConstructor` de Lombok para inyectarla:
```java
@Service
@RequiredArgsConstructor
public class CalculadoraService {

    private final CalculadoraDao calculadoraDao;
    
}
```

11. En el directorio de pruebas de Maven agrega una nueva clase llamada `CalculadoraServiceTest`.

![imagen](img/img_01.png)

