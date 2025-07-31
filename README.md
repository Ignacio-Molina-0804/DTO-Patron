# 🚀 DTO Example API

Bienvenido a **DTO Example**, una API REST moderna construida con **Spring Boot**, que demuestra el uso de **Data Transfer Objects (DTO)**, **MapStruct** para el mapeo eficiente de datos y **Spring Data JPA** para la persistencia. ¡Ideal para aprender buenas prácticas en arquitectura de aplicaciones Java!

---

## 🛠️ Tecnologías Principales

- **Spring Boot 3.5.4**  
- **Spring Data JPA**
- **MapStruct**
- **Lombok**
- **H2 Database** (en memoria)
- **Maven**

---

## 🗂️ Arquitectura del Proyecto

```
src/
 └── main/
     └── java/
         └── com/example/DTO/
             ├── entity/         # Entidades JPA (Persona, Direccion)
             ├── dto/            # Data Transfer Objects (PersonaDireccionDTO)
             ├── mapper/         # MapStruct mappers (PersonaMapper)
             ├── repository/     # Spring Data JPA repositories (PersonaRepository)
             ├── service/        # Lógica de negocio (PersonaService)
             └── controller/     # Controladores REST (PersonaController)
```

---

## 📦 ¿Cómo Funciona?

- **Entidad:**  
  `Persona` y `Direccion` son modelos persistidos en la base de datos.

- **DTO:**  
  `PersonaDireccionDTO` es el objeto que viaja entre el backend y el frontend, ocultando detalles internos.

- **Mapper:**  
  `PersonaMapper` convierte automáticamente entre entidades y DTOs usando MapStruct.

- **Repository:**  
  `PersonaRepository` accede a los datos con métodos listos para usar.

- **Service:**  
  `PersonaService` contiene la lógica de negocio y orquesta el flujo de datos.

- **Controller:**  
  `PersonaController` expone los endpoints REST para interactuar con la app.

---

## 🔗 Endpoints REST

| Método | Endpoint           | Descripción                                 |
|--------|--------------------|---------------------------------------------|
| GET    | `/api/personas`    | Lista todas las personas (DTO)              |
| POST   | `/api/personas`    | Crea una nueva persona (con dirección)      |

---

## 🧑‍💻 Ejemplo de Uso

### Crear una Persona

```json
POST /api/personas
{
  "nombre": "Juan",
  "apellido": "Pérez",
  "dni": "12345678",
  "direccion": {
    "calle": "Calle Falsa 123",
    "provincia": "Buenos Aires"
  }
}
```

### Obtener Personas

```json
GET /api/personas
[
  {
    "nombre": "Juan",
    "apellido": "Pérez",
    "dni": "12345678",
    "calle": "Calle Falsa 123",
    "provincia": "Buenos Aires"
  }
]
```

---

## ▶️ Cómo Ejecutar

1. **Clona el repositorio**
2. Ejecuta:  
   - Linux/Mac: `./mvnw spring-boot:run`  
   - Windows: `mvnw.cmd spring-boot:run`
3. Accede a: [http://localhost:8080/api/personas](http://localhost:8080/api/personas)

---

## 💡 Notas

- La base de datos **H2** es en memoria: los datos se borran al reiniciar la app.
- El mapeo entre entidades y DTOs es automático gracias a **MapStruct**.
- Puedes modificar y extender fácilmente la estructura para tus propios proyectos.

---

## 📚 Recursos Útiles

- [Documentación oficial de Spring Boot](https://spring.io/projects/spring-boot)
- [Guía de MapStruct](https://mapstruct.org/documentation/stable/reference/html/)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)

---

¡Explora el código, aprende y diviértete programando!
