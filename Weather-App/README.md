# 🌦️ Weather App — Spring Boot

A RESTful Weather Application built with **Java and Spring Boot** that provides current weather information and weather forecasts for a given city.

The project follows a clean backend architecture with separate **Controller, Service, DTO, and API integration** layers.

---

## 🚀 Features

* 🌍 Search weather by city name
* 🌡️ Get current temperature and weather conditions
* 💨 Weather details such as wind, humidity, pressure, and visibility
* 🌅 Astro information including sunrise and sunset
* 📅 Multi-day weather forecast
* 🕐 Hourly weather information
* 🔌 RESTful API endpoints
* 🧩 DTO-based response structure
* 🌐 CORS support for frontend integration
* ⚡ Built using Spring Boot

---

## 🏗️ Project Architecture

```text
Weather-App/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── cfs/
│   │   │           └── Weather_App/
│   │   │               │
│   │   │               ├── controller/
│   │   │               │   └── Controller.java
│   │   │               │
│   │   │               ├── service/
│   │   │               │   └── WeatherService.java
│   │   │               │
│   │   │               └── dto/
│   │   │                   ├── Astro.java
│   │   │                   ├── Condition.java
│   │   │                   ├── Current.java
│   │   │                   ├── Day.java
│   │   │                   ├── DayTemp.java
│   │   │                   ├── Forecast.java
│   │   │                   ├── Forecastday.java
│   │   │                   ├── Hour.java
│   │   │                   └── WeatherResponse.java
│   │   │
│   │   └── resources/
│   │       └── application.properties
│   │
│   └── test/
│
├── pom.xml
└── README.md
```

---

## 🛠️ Tech Stack

| Technology     | Purpose                            |
| -------------- | ---------------------------------- |
| ☕ Java         | Programming Language               |
| 🌱 Spring Boot | Backend Framework                  |
| 🌐 REST API    | Client-Server Communication        |
| 📦 Maven       | Dependency Management              |
| 🧩 DTOs        | API Response Mapping               |
| 🔗 HTTP Client | External Weather API Communication |

---

## 📡 API Endpoints

### 1. Get Weather by City

```http
GET /weather/{city}
```

Example:

```http
GET /weather/Delhi
```

Returns the weather information for the requested city.

---

### 2. Get Weather Details

```http
GET /weather/my/{city}
```

Example:

```http
GET /weather/my/Mumbai
```

Returns structured weather information using the application's `WeatherResponse` DTO.

---

### 3. Get Weather Forecast

```http
GET /weather/forecast?city={city}&days={days}
```

Example:

```http
GET /weather/forecast?city=Delhi&days=5
```

Returns a multi-day weather forecast.

---

## ⚙️ Getting Started

### Prerequisites

Make sure you have the following installed:

* Java JDK
* Maven
* Git
* IntelliJ IDEA / Eclipse / VS Code

Check Java:

```bash
java -version
```

Check Maven:

```bash
mvn -version
```

---

## 📥 Clone the Repository

```bash
git clone https://github.com/qadir4mulaMind/java.git
```

Navigate to the project:

```bash
cd java/Weather-App
```

---

## 🔑 Configuration

The application uses an external weather API.

Create/configure your API key in:

```text
src/main/resources/application.properties
```

Example:

```properties
weather.api.key=YOUR_API_KEY
weather.api.url=YOUR_WEATHER_API_URL
```

> Never commit your real API key or other sensitive credentials to GitHub.

For local development, use environment variables or another secure configuration mechanism.

---

## ▶️ Run the Application

Using Maven:

```bash
mvn spring-boot:run
```

Or build the project:

```bash
mvn clean package
```

Then run the generated JAR:

```bash
java -jar target/*.jar
```

The application will normally be available at:

```text
http://localhost:8080
```

---

## 🔗 Example Requests

### Current Weather

```text
http://localhost:8080/weather/Delhi
```

### Weather Details

```text
http://localhost:8080/weather/my/Delhi
```

### Forecast

```text
http://localhost:8080/weather/forecast?city=Delhi&days=5
```

---

## 📦 Response Structure

The application uses dedicated DTOs to represent weather data.

Example structure:

```text
WeatherResponse
│
├── Current
│   ├── Temperature
│   ├── Condition
│   ├── Humidity
│   ├── Wind
│   └── Visibility
│
└── Forecast
    │
    └── Forecastday
        ├── Day
        ├── Astro
        └── Hour
```

This makes the API response easier to maintain and consume from a frontend application.

---

## 🌐 Frontend Integration

This backend can be connected to a separate frontend application.

Frontend:

**Weather-App-UI**

Backend:

**Weather-App**

The frontend can consume the REST APIs exposed by this Spring Boot application.

Example:

```text
Frontend
   │
   │ HTTP Request
   ▼
Spring Boot REST API
   │
   ▼
Weather Service
   │
   ▼
External Weather API
   │
   ▼
Weather Data
```

---

## 🔒 Security

Do not expose sensitive credentials in source code.

Avoid committing:

```text
API keys
Passwords
Tokens
Private credentials
```

Use environment variables or secure configuration for production deployments.

---

## 🧪 Testing

Run the test suite using:

```bash
mvn test
```

---

## 📌 Future Improvements

* [ ] Add global exception handling
* [ ] Add request validation
* [ ] Add unit and integration tests
* [ ] Add API documentation with Swagger/OpenAPI
* [ ] Add caching for repeated city searches
* [ ] Improve error responses
* [ ] Add Docker support
* [ ] Add production-ready configuration
* [ ] Deploy backend to a cloud platform
* [ ] Improve frontend/backend integration

---

## 👨‍💻 Author

**Abdul Qadir**

B.Tech AIML Student
DSA Enthusiast | Problem Solver | GATE CSE & DA Aspirant

GitHub:
https://github.com/qadir4mulaMind

---

## ⭐ Project

If you find this project useful, consider giving the repository a ⭐ on GitHub.

---

## 📄 License

This project is intended for learning and development purposes.
