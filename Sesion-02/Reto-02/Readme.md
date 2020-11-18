## Reto: Uso de método PUT y parámetros de fechas

###Objetivo
- Aprender la forma de crear controladores de Spring usando su módulo web (Spring MVC) y recibir un parámetro.
- Crear un primer servicio REST que regrese un recurso estático dinámico.
- Consumir el servicio usando un navegador Web y con Postman.

###Requisitos
- Tener instalado el IDE IntelliJ Idea Community Edition.
- Tener instalada la última versión del JDK 11 (de Oracle u OpenJDK).
- Tener instalada la herramienta Postman.

###Desarrollo
- Crea un nuevo proyecto Spring Boot en IntelliJ Idea como lo hiciste en la primera sesión.
- Crea una nueva clase que represente un recurso de tipo Saludo con cuatro atributos: "mensaje", "nombre", "edad" y "fechaNacimiento". Este último debe ser de tipo "`OffsetTime`".
- Crea una nueva clase que represente un servicio REST, unando la anotación `@RestController`.
- Crea un nuevo manejador de peticiones de tipo `PUT` que reciba como un parámetro de tipo "`Saludo`" y regrese este mismo objeto.
- Hacer la prueba desde la herramienta Postman.
