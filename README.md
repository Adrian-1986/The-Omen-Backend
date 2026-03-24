# Videoclub (Java MVC)

Proyecto Java vanilla con arquitectura MVC para gestionar peliculas desde consola.

**Requisitos**

- Java 17 (o compatible)
- Maven
- MySQL en local

**Configuracion de base de datos**

1. Crea la base de datos `videoclub`.
2. Ejecuta el script: `src/main/resources/sql/videoclub.sql`.
3. Ajusta credenciales en `DBConnection` si tu password es distinto.

**Ejecucion**

```bash
mvn -q clean compile exec:java -Dexec.mainClass="org.example.Main"
```

**Estructura MVC**

```
src/main/java/org/example/model
src/main/java/org/example/view
src/main/java/org/example/controller
src/main/java/org/example/repository
```
