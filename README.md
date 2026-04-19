Tarea de Rony - Backend

# Proyecto Backend - Spring Boot & SQL Server

Este proyecto es una API REST desarrollada con **Spring Boot** para la gestión de datos, utilizando **SQL Server** como base de datos dentro de un entorno **Dockerizado**.

## 🚀 Tecnologías utilizadas
* **Java 17** o superior.
* **Spring Boot 3.x** (Spring Data JPA, Spring Web).
* **Maven** (Gestor de dependencias).
* **Docker & Docker Compose** (Contenedores).
* **SQL Server 2022** (Base de datos).

## 🛠️ Configuración del Entorno

### 1. Levantar la Base de Datos
Para iniciar la base de datos, navega hasta la carpeta `docker-compose` y ejecuta:
```cmd
docker-compose -f docker-compose-db.yml up -d

2. Ejecutar la Aplicación
Puedes correr el proyecto desde tu IDE (IntelliJ IDEA) ejecutando la clase principal MybackendApplication.java.

📂 Estructura del Proyecto
model: Entidades de la base de datos.

repository: Interfaces para el acceso a datos (JPA).

service: Lógica de negocio.

rest: Controladores de la API.

Desarrollado por: Rony


---

### 🛠️ ¿Cómo lo subes a GitHub?

Una vez que hayas guardado el texto en el archivo `README.md` dentro de IntelliJ, haz el último push del día:

1. **Abre el CMD y escribe:**
   ```cmd
   git add README.md
   git commit -m "Docs: Agregando README con instrucciones del proyecto"
   git push origin develop