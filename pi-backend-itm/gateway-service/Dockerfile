# Etapa 1: Construcción con Maven
FROM maven:3.9-eclipse-temurin-21-alpine AS build

WORKDIR /app

# Copiar archivos de Maven
COPY pom.xml .
COPY src ./src

# Compilar y empaquetar la aplicación (sin tests)
RUN mvn clean package -DskipTests

# Etapa 2: Runtime
FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

# Copiar el JAR desde la etapa de construcción
COPY --from=build /app/target/*.jar app.jar

# Exponer el puerto del Gateway
EXPOSE 8080

# Comando de arranque
CMD ["java", "-jar", "app.jar"]
