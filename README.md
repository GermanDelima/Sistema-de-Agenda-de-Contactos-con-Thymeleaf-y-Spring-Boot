# Sistema-de-Agenda-de-Contactos-con-Thymeleaf-y-Spring-Boot

Este proyecto es un sistema de gestión de contactos desarrollado con Java JDK 20, Spring Boot y Thymeleaf. Utiliza el patrón de diseño MVC (Model-View-Controller) junto con los patrones de Service y Repository para una arquitectura limpia y escalable.

## Características

- **Gestión de Contactos**: Crear, leer, actualizar y eliminar contactos.
- **Interfaz de Usuario**: Desarrollada con Thymeleaf para una presentación dinámica y amigable.
- **Arquitectura MVC**: Separación clara de responsabilidades con controladores, servicios y repositorios.
- **Spring Boot**: Framework principal para el desarrollo del backend.
- **Persistencia de Datos**: Uso de Spring Data JPA para la gestión de la base de datos.
- **Validación de Datos**: Validación de entradas del usuario en el lado del servidor.

## Requisitos

- Java JDK 20
- Maven 3.6+
- Spring Boot 2.7+
- Thymeleaf 3.0+
- H2 Database (para propósitos de desarrollo y pruebas)

## Instalación

1. Clona el repositorio:
   ```sh
   https://github.com/GermanDelima/Sistema-de-Agenda-de-Contactos-con-Thymeleaf-y-Spring-Boot.git
2. Navega al directorio del proyecto
   ```sh
   cd sistema-agenda-contactos

4. Compila y ejecuta la aplicación:
   ```sh
   mvn spring-boot:run
## Uso
1. Accede a la aplicación en tu navegador
  ```sh
   http://localhost:8080

## Estructura del Proyecto
src/main/java/com/tu-usuario/sistemaagenda:
controller: Controladores que manejan las solicitudes HTTP y responden con vistas.
service: Servicios que contienen la lógica de negocio.
repository: Interfaces que extienden JpaRepository para la persistencia de datos.
model: Clases de entidad que representan los datos en la base de datos.
src/main/resources/templates: Plantillas Thymeleaf para las vistas.
src/main/resources/application.properties: Configuración de la aplicación.

