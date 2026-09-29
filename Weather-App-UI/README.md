# 🌦️ Weather App UI

A modern and responsive **Weather Application UI** designed to display real-time weather information and forecasts in a clean and user-friendly interface.

The UI is designed to work with the **Weather App Spring Boot REST API** and provides an intuitive way to search for cities and view detailed weather information.

---

## ✨ Features

* 🌍 Search weather by city
* 🌡️ Display current temperature
* ☁️ Show weather conditions
* 💧 Humidity information
* 💨 Wind information
* 👁️ Visibility information
* 🌅 Sunrise and sunset information
* 📅 Weather forecast
* 🕐 Hourly weather information
* 📱 Responsive user interface
* 🔗 Integration with Spring Boot backend
* ⚡ Dynamic weather data

---

## 🖥️ Application Flow

```text
User
 │
 │ Search City
 ▼
Weather App UI
 │
 │ HTTP Request
 ▼
Spring Boot Weather API
 │
 ▼
External Weather API
 │
 ▼
Weather Data
 │
 ▼
Weather App UI
 │
 ▼
User
```

---

## 🛠️ Tech Stack

| Technology     | Purpose                      |
| -------------- | ---------------------------- |
| 🌐 HTML        | Application Structure        |
| 🎨 CSS         | Styling & Responsive Design  |
| ⚡ JavaScript   | UI Logic & API Communication |
| 🔗 REST API    | Backend Communication        |
| 🌱 Spring Boot | Weather Backend              |
| ☁️ Weather API | Weather Data                 |

---

## 📁 Project Structure

```text
Weather-App-UI/
│
├── index.html
├── style.css
├── script.js
│
├── assets/
│   ├── images/
│   └── icons/
│
└── README.md
```

> The exact structure may vary depending on the current implementation.

---

## 🌦️ Weather Information

The application can display information such as:

### Current Weather

* 🌡️ Temperature
* ☁️ Weather condition
* 💧 Humidity
* 💨 Wind speed
* 👁️ Visibility
* 🌡️ Feels-like temperature

### Additional Information

* 🌅 Sunrise
* 🌇 Sunset
* 📅 Forecast
* 🕐 Hourly weather

---

## 🔌 Backend Integration

This UI is designed to communicate with the Spring Boot backend:

**Backend Repository:**
`Weather-App`

**Frontend Repository:**
`Weather-App-UI`

The UI sends HTTP requests to the backend and uses the returned JSON data to dynamically update the weather information.

Example:

```text
GET /weather/my/Delhi
```

Forecast:

```text
GET /weather/forecast?city=Delhi&days=5
```

---

## ⚙️ Configuration

Before running the UI, make sure the Spring Boot backend is running.

Example backend URL:

```text
http://localhost:8080
```

Configure the API base URL in the JavaScript configuration according to your backend:

```javascript
const API_BASE_URL = "http://localhost:8080";
```

---

## ▶️ Running the Project

### 1. Clone the Repository

```bash
git clone https://github.com/qadir4mulaMind/java.git
```

### 2. Navigate to the UI

```bash
cd java/Weather-App-UI
```

### 3. Start the Backend

Make sure the Spring Boot `Weather-App` backend is running on:

```text
http://localhost:8080
```

### 4. Open the UI

Open:

```text
index.html
```

in your browser.

For a better development experience, you can also use a local development server such as **VS Code Live Server**.

---

## 🔗 Related Project

### 🌱 Weather App Backend

The backend is built using Java and Spring Boot and provides the REST APIs consumed by this UI.

```text
Weather-App
```

---

## 📸 Application Preview

Add screenshots of the application here:

```text
screenshots/
├── home.png
├── weather.png
└── forecast.png
```

Example:

```markdown
![Weather App](screenshots/home.png)
```

---

## 🔮 Future Improvements

* [ ] Add current location weather
* [ ] Add weather icons based on conditions
* [ ] Add dark/light mode
* [ ] Add loading animation
* [ ] Add better error handling
* [ ] Add recent searches
* [ ] Add temperature unit conversion
* [ ] Add detailed hourly forecast
* [ ] Improve mobile responsiveness
* [ ] Deploy the application
* [ ] Add weather charts
* [ ] Add location-based weather detection

---

## 👨‍💻 Author

**Abdul Qadir**

B.Tech AIML Student
DSA Enthusiast | Problem Solver | GATE CSE & DA Aspirant

GitHub:
https://github.com/qadir4mulaMind

---

## ⭐ Support

If you find this project useful, consider giving the repository a ⭐ on GitHub.

---

## 📄 License

This project is intended for learning and development purposes.
