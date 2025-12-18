# 💳 Proyecto Integrador — Ignacio Tomás Molina  
### 🧩 Especialización Backend (Digital House)

📄 Documentación del Proyecto: https://docs.google.com/document/d/18FSy6IEQ67U-pD987lREGIaZUdcfxeNgF5xjmc39VVs/edit?tab=t.0#heading=h.g4mnf55vhi2x

## 📐 Arquitectura del Sistema
**Backend**: API REST desarrollada con Spring Boot, responsable de la lógica de negocio y la comunicación con la base de datos.
**Base de Datos**: MySQL 8, utilizada para almacenar información de usuarios, cuentas y movimientos.
**Orquestación**: Docker Compose, que gestiona los contenedores de backend y base de datos.
**Red interna**: red bridge generada por Docker para comunicación privada entre los servicios.
**Volúmenes persistentes**: para garantizar que los datos de la base de datos no se pierdan al reiniciar los contenedores.
**Control de versiones**: repositorio GitHub donde se versiona el código y las configuraciones del entorno.


> **Descripción breve de cada microservicio:**  
> - **User Service:** Gestiona usuarios
> - **Account Service:** Administra cuentas, saldos, alias y transacciones.
> - **Auth Service** Gestiona autenticación  
> - **API Gateway:** Enrutador central.  
> - **Eureka Server:** Descubrimiento de servicios.

### 🚀 Cómo levantar el proyecto
1- Ingresar a /pi-backend-itm


2- Abrir una consola


3- Ejecutar los siguientes comandos:
  
  docker compose down -v
  
  docker compose up -d --build


📚 Documentación de la API:

  - Eureka: http://localhost:8761/
  - User: http://localhost:8081/swagger-ui/index.html
  - Account: http://localhost:8082/swagger-ui/index.html
  - Auth: http://localhost:8083/swagger-ui/index.html
