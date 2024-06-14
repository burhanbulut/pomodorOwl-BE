
# pomodorOwl-BE

This is the backend repository for the PomodorOwl project, a time management application implementing the Pomodoro Technique.

## Features
- Implements Pomodoro Technique for time management
- RESTful API for managing tasks and sessions
- Docker support for containerization
- Swagger UI for API documentation

## Technologies Used
- Java
- Spring Boot
- Docker
- MySQL

## Getting Started

### Prerequisites
- Java 11+
- Docker

### Installation

1. Clone the repository:
   ```sh
   git clone https://github.com/burhanbulut/pomodorOwl-BE.git
   cd pomodorOwl-BE
   ```

2. Build the project:
   ```sh
   ./mvnw clean install
   ```

3. Run the application:
   ```sh
   ./mvnw spring-boot:run
   ```

### Docker
To run the application using Docker:
```sh
docker build -t pomodorowl-be .
docker run -p 8080:8080 pomodorowl-be
```

## Usage
After running the application, the API will be available at `http://localhost:8080`.

Access the Swagger UI for detailed API documentation at `http://localhost:8080/swagger-ui.html`.
