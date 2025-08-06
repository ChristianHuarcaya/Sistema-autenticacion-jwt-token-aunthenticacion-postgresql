# Sistema de Autenticación con JWT - Spring Boot + PostgreSQL

Este proyecto implementa un sistema de autenticación basado en JSON Web Tokens (JWT), utilizando Spring Boot y una base de datos PostgreSQL.

## 🔐 Tecnologías usadas

- Java 17
- Spring Boot
- Spring Security
- JWT (Json Web Token)
- PostgreSQL
- JPA / Hibernate

## ⚙️ Funcionalidades

- Registro de usuarios
- Login con generación de token JWT
- Validación de token en cada request
- Roles desde base de datos (no en memoria)
- Seguridad con filtros personalizados

## 🧪 Endpoints principales

| Método | Endpoint              | Descripción                     |
|--------|-----------------------|---------------------------------|
| POST   | `/security/login`     | Iniciar sesión y obtener token  |
| POST   | `/security/register`  | Registrar nuevo usuario         |
| GET    | `/saludo`             | Endpoint protegido con JWT      |

## 📦 Estructura del proyecto

src/
├── main/
│ ├── java/com/tuempresa/
│ │ ├── config/ → Configuraciones de seguridad
│ │ ├── controller/ → Controladores REST
│ │ ├── model/ → Entidades JPA
│ │ ├── repository/ → Repositorios JPA
│ │ └── service/ → Lógica de negocio
│ └── resources/
│ └── application.properties


## 🚀 Cómo correr el proyecto

1. Clona el repositorio  
```bash
git clone https://github.com/ChristianHuarcaya/Sistema-autenticacion-jwt-token-aunthenticacion-postgresql.git
Configura tu base de datos PostgreSQL en application.properties

Ejecuta la aplicación desde tu IDE o con:

bash

./mvnw spring-boot:run
👨‍💻 Autor
Christian Huarcaya
Desarrollador Backend | Java 💻
LinkedIn





