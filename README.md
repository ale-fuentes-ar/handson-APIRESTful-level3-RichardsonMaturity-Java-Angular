# Proyecto: API RESTful con Spring Boot (Nivel 3 Richardson Maturity Model) + Frontend React
<img src="https://img.shields.io/badge/Responsável-Alejandro.Fuentes-informational?style=flat-square&logoColor=white&color=cdcdcd" />


**Data**: 04/01/2024 
**Empresa**: Abstergo Industries 
**Responsável**: Raul Alejandro Fuentes


**Objetivo**:  
Crear una API RESTful para un sistema de gestión de libros que cumpla con el nivel 3 del Richardson Maturity Model (HATEOAS), integrada con un frontend en React para demostrar su funcionalidad.  
**Tecnologías**:  
- Backend: Java 17, Spring Boot, Spring HATEOAS, PostgreSQL, Redis, Docker.  
- Frontend: React, Axios, WebSocket (SockJS + Stomp).  

---

## 📝 Enunciado del Proyecto

### **Descripción**  
Desarrollar un sistema que permita:  
1. Gestionar libros (CRUD) con una API RESTful nivel 3 (HATEOAS).  
2. Integrar reseñas de libros como subrecursos.  
3. Implementar WebSockets para notificaciones en tiempo real.  
4. Usar Redis para caché de consultas frecuentes.  
5. Desplegar en Docker con PostgreSQL y Redis.  
6. Frontend en React para consumir la API y mostrar datos.  

### **Características Clave**  
- API auto-descubrible mediante HATEOAS.  
- Autenticación JWT.  
- Escalabilidad con Docker Compose.  
- Pruebas unitarias e integración.  

---

## 🛠️ Paso a Paso para Construir el Proyecto  

### **Paso 1: Configuración del Entorno**  
**Precondiciones**:  
- Sistema operativo: Windows/macOS/Linux.  
- Conexión a internet.  

**Versiones Requeridas**:  
- Java 17 ([SDKMAN!](https://sdkman.io/) o [Oracle JDK](https://www.oracle.com/java/technologies/downloads/)).  
- Maven 3.8.6+.  
- Node.js 18.12.1+ ([NVM](https://github.com/nvm-sh/nvm) recomendado).  
- Docker 23.0+ y Docker Compose 2.20+.  
- PostgreSQL 15.2 y Redis 7.0.  

**Preparación**:  
1. Instalar Java:  
   ```bash  
   sdk install java 17.0.6-tem  
   ```
2. Instalar Maven:  
   ```bash  
   sdk install maven 3.8.6  
   ```
3. Instalar NodeJS:  
   ```bash  
   mvn install 18.12.1  
   ```
4. Instalar Docker:  
[⚓ Guia Oficial][link-docker]



<!-- links and tools -->
[link-docker]:https://docs.docker.com/get-docker/
