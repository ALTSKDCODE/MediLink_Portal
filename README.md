# 🏥 MediLink Portal — Healthcare Patient Management System

> A full-stack, secure healthcare portal enabling patients, doctors, and administrators to manage **appointments, medical records, billing, prescriptions**, and communication — built using **Spring Boot, React (Vite), MySQL, and MongoDB**.

---

## 🧩 Tech Stack

| Layer | Technologies Used |
|-------|--------------------|
| **Frontend** | React (Vite), Tailwind CSS, Redux Toolkit, Axios |
| **Backend** | Spring Boot 3, Spring Security, JPA, Validation |
| **Databases** | MySQL (Relational), MongoDB (Documents) |
| **DevOps / Tools** | Docker, AWS, GitHub Actions, Postman |
| **Testing** | JUnit, Postman API Runner |

---

### 🏷️ Project Badges

![Java](https://img.shields.io/badge/Java-17-blue?logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?logo=springboot)
![React](https://img.shields.io/badge/React-18-blue?logo=react)
![MySQL](https://img.shields.io/badge/MySQL-Database-orange?logo=mysql)
![MongoDB](https://img.shields.io/badge/MongoDB-NoSQL-brightgreen?logo=mongodb)
![Docker](https://img.shields.io/badge/Docker-Containerization-blue?logo=docker)
![Postman](https://img.shields.io/badge/Postman-API%20Testing-orange?logo=postman)

---

## 📁 Project Structure

```
📦 MediLink_Portal/
│
├── ⚙️ backend/              # Spring Boot backend (REST APIs, JPA, Security)
│   ├── src/
│   │   ├── main/java/com/healthcare/patientportal/
│   │   └── resources/application.properties
│   ├── pom.xml
│   └── Dockerfile
│
├── 💻 frontend/             # React (Vite) frontend (UI Layer)
│   ├── src/
│   ├── vite.config.js
│   ├── package.json
│   └── Dockerfile
│
├── 🗃️ database/             # SQL & Mongo setup scripts
│   ├── schema.sql
│   ├── data.sql
│   └── seed_data.json
│
├── 📚 docs/                 # Documentation & architecture diagrams
│   ├── architecture-diagram.png
│   ├── er-diagram.png
│   └── api-endpoints.md
│
├── 🐳 docker-compose.yml    # Combined backend + frontend + databases
├── 🧾 .gitignore
└── 📘 README.md
```

---

## 🚀 Getting Started

### 🔧 Backend Setup
```bash
cd backend
mvn clean install
mvn spring-boot:run
```
➡️ Runs on: [http://localhost:8080](http://localhost:8080)

---

### 💻 Frontend Setup
```bash
cd frontend
npm install
npm run dev
```
➡️ Runs on: [http://localhost:5173](http://localhost:5173)

---

### 🗃️ Database Configuration
Make sure both databases are running:

#### 🧱 MySQL
- Host: `localhost:3306`
- Database: `patient_portal`
- Username: `root`
- Password: (set in `application.properties`)

#### 🍃 MongoDB
- Host: `localhost:27017`
- Database: `patient_portal_mongo`

You can configure these in:
```
backend/src/main/resources/application.properties
```

---

## 🔍 API Testing (Postman)

Use the Postman collection included in:
```
docs/Healthcare_Patient_Portal_Phase1.postman_collection.json
```

### Example Endpoints
| API | Method | Description |
|------|--------|-------------|
| `/api/test/mysql/add` | POST | Add new patient (MySQL) |
| `/api/test/mysql/all` | GET | Fetch all patients |
| `/api/test/mysql/ping` | GET | Test MySQL connection |
| `/api/test/mongo/test` | GET | Test MongoDB connection |
| `/api/test/mongo/all` | GET | Fetch all medical records |

---

## 🔐 Security Overview

- JWT Authentication (to be implemented in Phase 2)
- Role-based Access (Patient / Doctor / Admin)
- Password hashing using **BCrypt**
- CORS configuration for frontend API access

---

## 🧠 Git Branching Workflow

| Branch | Purpose |
|--------|----------|
| `main` | Stable production-ready code |
| `dev` | Ongoing development |
| `feature/*` | Feature branches (e.g., `feature/auth`, `feature/appointments`) |
| `bugfix/*` | Bug fix branches |
| `hotfix/*` | Urgent production patches |

### 🧩 Commands
```bash
git checkout -b dev
git push -u origin dev

git checkout -b feature/auth
git push -u origin feature/auth
```

---

## 🧰 Environment Configuration
📄 `.env`
```bash
MYSQL_HOST=localhost
MYSQL_PORT=3306
MYSQL_DB=patient_portal
MYSQL_USER=root
MYSQL_PASSWORD=root
MONGO_URI=mongodb://localhost:27017/patient_portal_mongo
```

---

## 🐳 Docker Deployment

You can run the entire stack with one command:
```bash
docker compose up -d
```

---

## 📊 Future Enhancements (Phase 2 & 3)

- ✅ JWT-based authentication and authorization  
- ✅ Appointment scheduling with calendar integration  
- ✅ Secure messaging system (WebSocket + JWT)  
- ✅ Prescription and billing management  
- ✅ Health tracking dashboard with wearable data integration  
- ✅ Dockerized deployment on AWS EC2  

---

## 🤝 Contributing

1. Fork the repo  
2. Create a feature branch (`feature/<name>`)  
3. Commit your changes  
4. Push and open a Pull Request  

---

## 🧾 License

This project is licensed under the **MIT License** — see the `LICENSE` file for details.

---

## ✨ Author

👨‍💻 **Sudeep Kumar Dalei**  
📧 [sudeepdalei38@gmail.com](mailto:sudeepdalei38@gmail.com)  
🌐 [GitHub Profile](https://github.com/ALTSKDCODE)  
💼 Backend Developer | Java | Spring Boot | React | AWS  
