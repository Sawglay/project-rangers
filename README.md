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
## Prerequisites

| Requirement | Version |
|---|---|
| Java (JDK) | 21 or later |
| Maven | 3.x (or use the included `mvnw` wrapper) |

---
## Getting Started
 
### 1. Clone or extract the project
 
```bash
unzip project-rangers-main.zip
cd project-rangers-main/webservice
```
 
### 2. Build the project
 
**macOS / Linux:**
```bash
bash mvnw clean package
```
 
**Windows:**
```powershell
.\mvnw clean package
```
This compiles the source and produces a fat JAR at:
```
target/spark-hello-1.0-SNAPSHOT-jar-with-dependencies.jar
```
 
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
