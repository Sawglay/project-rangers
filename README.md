# Project Rangers — Thai Flashcard Learning Platform

A Java-based Thai consonant learning application built for Global Academy. The project includes **a Spark-powered web server** with ***a login-protected*** flashcard interface, a standalone Swing desktop game, and educational OOP demos.

---

## Table of Contents

- [Overview](#overview)
- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Running the Web Server](#running-the-web-server)
- [Running the Desktop App](#running-the-desktop-app)
- [API Reference](#api-reference)
- [Default Credentials](#default-credentials)
- [Educational Modules](#educational-modules)

---
<<<<<<< HEAD

=======
>>>>>>> 90cd02144d2c9ecc3d9a4fcfba9b283a4b4fee9c
## Overview

It teaches Thai consonants through two interfaces:

- **Web App** — A browser-based flashcard viewer with a secure login page, served by an embedded Spark Java HTTP server.
- **Desktop Game** — A Swing GUI multiple-choice quiz that presents Thai consonant characters and tests romanized pronunciation.

---

## Project Structure

```
project-rangers/
├── FakeGUIDemo.java                 # OOP/Swing polymorphism demo
├── slides/
│   ├── ClosedShape.java             # Base shape class (inheritance demo)
│   ├── Rectangle.java               # Rectangle extending ClosedShape
│   └── TestShapes.java              # Shape unit tests
└── webservice/                      # Maven web application
    ├── pom.xml                      # Maven build configuration
    ├── mvnw / mvnw.cmd              # Maven wrapper scripts
    └── src/main/
        ├── java/org/global/academy/
        │   ├── Server.java          # Spark HTTP server (login + flashcard API)
        │   ├── ThaiFlashcardGame.java  # Swing desktop quiz game
        │   └── VerifyHash.java      # SHA-256 password hash verifier (CLI utility)
        └── resources/public/
            ├── index.html           # Landing page
            ├── login.html           # Login form
            └── welcome.html         # Flashcard viewer (post-login)
```

---
<<<<<<< HEAD

=======
>>>>>>> 90cd02144d2c9ecc3d9a4fcfba9b283a4b4fee9c
## Prerequisites

| Requirement | Version |
|---|---|
| Java (JDK) | 21 or later |
| Maven | 3.x (or use the included `mvnw` wrapper) |

---
<<<<<<< HEAD

## Getting Started

### 1. Clone or extract the project

```bash
unzip project-rangers.zip
cd project-rangers/webservice
```

### 2. Build the project

=======
## Getting Started
 
### 1. Clone or extract the project
 
```bash
unzip project-rangers-main.zip
cd project-rangers-main/webservice
```
 
### 2. Build the project
 
>>>>>>> 90cd02144d2c9ecc3d9a4fcfba9b283a4b4fee9c
**macOS / Linux:**
```bash
bash mvnw clean package
```
<<<<<<< HEAD

=======
 
>>>>>>> 90cd02144d2c9ecc3d9a4fcfba9b283a4b4fee9c
**Windows:**
```powershell
.\mvnw clean package
```
<<<<<<< HEAD

=======
>>>>>>> 90cd02144d2c9ecc3d9a4fcfba9b283a4b4fee9c
This compiles the source and produces a fat JAR at:
```
target/spark-hello-1.0-SNAPSHOT-jar-with-dependencies.jar
```
<<<<<<< HEAD

---

## Running the Web Server

```bash
java -jar target/spark-hello-1.0-SNAPSHOT-jar-with-dependencies.jar
```

Once started, open your browser and navigate to:

```
http://localhost:8080
```

- **Landing page:** `http://localhost:8080/index.html`
- **Login page:** `http://localhost:8080/login.html`

---

## Running the Desktop App

The `ThaiFlashcardGame` Swing application can be run directly from an IDE (e.g. IntelliJ IDEA or Eclipse) by executing its `main` method, or compiled and run from the command line:

=======
 
---
 
## Running the Web Server
 
```bash
java -jar target/spark-hello-1.0-SNAPSHOT-jar-with-dependencies.jar
```
 
Once started, open your browser and navigate to:
 
```
http://localhost:8080
```
 
- **Landing page:** `http://localhost:8080/index.html`
- **Login page:** `http://localhost:8080/login.html`
---
## Running the Desktop App
 
The `ThaiFlashcardGame` Swing application can be run directly from an IDE (e.g. IntelliJ IDEA or Eclipse) by executing its `main` method, or compiled and run from the command line:
 
>>>>>>> 90cd02144d2c9ecc3d9a4fcfba9b283a4b4fee9c
```bash
# From the webservice directory, after building:
java -cp target/spark-hello-1.0-SNAPSHOT-jar-with-dependencies.jar org.global.academy.ThaiFlashcardGame
```
<<<<<<< HEAD

The game presents Thai consonant cards one at a time with three multiple-choice romanized pronunciation options. Your score is displayed at the end of the round.

---

## API Reference

The Spark server exposes two JSON endpoints.

### `POST /login`

Authenticates a user and returns a session token.

**Request body:**
```json
{
  "username": "alice",
  "password": "secret"
}
```

**Success response (200):**
```json
{
  "username": "alice",
  "token": "token123"
}
```

**Failure response (401):**
```json
{
  "error": "Invalid username or password"
}
```

---

### `GET /randflashcard`

Returns a random Thai consonant flashcard.

**Response (200):**
```json
{
  "front": "ก (กอ ไก่)",
  "back": "ko kai - mid class"
}
```

---

## Default Credentials

> ⚠️ These are hardcoded demo credentials for development and testing only. Do not use in production.

| Username | Password |
|---|---|
| `alice` | `secret` |

---

## Educational Modules

The root-level Java files serve as teaching examples and are not part of the web application.

**`FakeGUIDemo.java`** — Demonstrates Java OOP concepts including abstract classes (`UIComponent`), interfaces (`Clickable`), and polymorphism using a simple Swing window with a label and button.

**`slides/ClosedShape.java` & `Rectangle.java`** — Classic inheritance example showing a base `ClosedShape` class extended by a `Rectangle` with positional and dimensional properties.

**`VerifyHash.java`** — A CLI utility that accepts console input and checks it against a stored SHA-256 hash, useful for understanding password hashing concepts.

---

## Dependencies

| Library | Version | Purpose |
|---|---|---|
| [Spark Java](https://sparkjava.com) | 2.9.4 | Embedded HTTP web server |
| [Gson](https://github.com/google/gson) | 2.11.0 | JSON serialization/deserialization |

---

## License

This project was created for educational purposes by **G Lay**.
=======
 
The game presents Thai consonant cards one at a time with three multiple-choice romanized pronunciation options. Your score is displayed at the end of the round.
 
---
 
## API Reference
 
The Spark server exposes two JSON endpoints.
>>>>>>> 90cd02144d2c9ecc3d9a4fcfba9b283a4b4fee9c
