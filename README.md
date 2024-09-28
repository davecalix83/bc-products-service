# Products Service

## Description
This microservice handles product management, allowing clients to retrieve product information.

## Features
- Retrieve product details by ID
- List all available products

## API Endpoints

| Method | Endpoint                | Description                      |
|--------|-------------------------|----------------------------------|
| GET    | `/api/v1/products/{id}` | Retrieve product details by ID    |
| GET    | `/api/v1/products`      | Retrieve all products             |

## Models

- **ProductDto**: Represents the product details.

## Technologies Used
- Spring Boot
- Java
- JPA/Hibernate
- Swagger/OpenAPI

## Installation
1. Clone the repository.
2. Run `mvn clean install` to build the project.
3. Configure your application properties.
4. Run the application using your IDE or with `mvn spring-boot:run`.

## License
This project is licensed under the License Apache 2.0.
