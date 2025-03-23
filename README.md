# Proyecto: API RESTful con Spring Boot (Nivel 3 Richardson Maturity Model) + Frontend React
<img src="https://img.shields.io/badge/Responsável-Alejandro.Fuentes-informational?style=flat-square&logoColor=white&color=cdcdcd" />


![Last Commit (Branch)](https://img.shields.io/github/last-commit/ale-fuentes-ar/handson-APIRESTful-level3-RichardsonMaturity-Java-Angular/main)  ![Created At](https://img.shields.io/github/created-at/ale-fuentes-ar/handson-APIRESTful-level3-RichardsonMaturity-Java-Angular)

> **Date**: 23/03/2025 <br> 
> **Goal**: uso de HATEOAS  <br>
> **Developer**: *Raul Alejandro Fuentes*



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
- Java 17 ([SDKMAN!][link-sdkman] o [Oracle JDK][link-oracle-jdk]).  
- Maven 3.8.6+.  
- Node.js 18.12.1+ ([NVM][link-nvm] recomendado).  
- Docker 23.0+ y Docker Compose 2.20+.  
- PostgreSQL 15.2 y Redis 7.0.  

**Preparación**:  

> **NOTA** <br>
> a.- Utilicei el SDKMAN! para la instalación de las herramientas. <br>
> b.- La instalación fue desde el GitBash.

1. Instalar SDKMAN!:
   ```bash
   curl -s "https://get.sdkman.io" | bash
   
   sdk versions
   ```

1. Instalar Java:  
   ```bash  
   # verify versions
   java -version
   
   # verify current version java
   sdk current java
   
   # verify all installable java distributions from sdkman!
   sdk list java
   
   # install java 17.0.3.6.1-amzn
   sdk install java 17.0.3.6.1-amzn
   sdk use java 17.0.3.6.1-amzn
   java -version

   # set java default
   sdk default java 17.0.3.6.1-amzn
   sdk current java
   ```
2. Instalar Maven:  
   ```bash  
   sdk list maven
   sdk install maven  3.9.6 
   mvn -v
   
   # verify version
   sdk default maven  3.9.6 
   mvn -v
   ```
3. Instalar NodeJS:  
   ```bash  
   nvm version
   nvm install 18.12.1
   nvm use 18.12.1

   # verify versions
   node -v
   npm -v 
   ```
4. Instalar Docker:  
[⚓ Guia Oficial][link-docker]



<!-- links and tools -->
[link-docker]:https://docs.docker.com/get-docker/
[link-sdkman]:https://sdkman.io/
[link-oracle-jdk]:https://www.oracle.com/java/technologies/downloads/
[link-nvm]:https://github.com/nvm-sh/nvm