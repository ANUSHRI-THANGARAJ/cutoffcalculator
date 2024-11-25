# Simple Cutoff Mark Calculator

This is a simple **Cutoff Mark Calculator** for engineering students. It calculates the cutoff marks based on the marks entered in different subjects.

## Features
- Input marks for different subjects.
- Calculate the cutoff marks based on the provided formulas.
- Simple web interface with no database required.

## Technologies Used
- **Java** (Spring Boot)
- **Maven** for building the project

## How to Run

1.Clone the repository:
   git clone https://github.com/anushrithangaraj/cutoffmarkcalculator.git

2.Navigate to the project folder:
cd cutoffmarkcalculator

3.Build the project:
mvn clean install

4.Run the application:
mvn spring-boot:run

5.Access the application in your browser at: http://localhost:8080

File Structure

cutoffmark [boot]
├── src/main/java
│   ├── com.team5.couoffmark.domain
│   │   └── student.java
│   ├── com.team5.cutoffmark
│   │   ├── CutoffmarkApplication.java
│   │   └── StudentController
│   │       └── StudentController.java
│   └── src/main/resources
│       ├── static
│       │   ├── p1.jpg
│       │   └── p2.jpg
│       ├── templates
│       │   ├── index.html
│       │   └── result.html
│       └── application.properties
├── src/test/java
└── target
    ├── HELP.md
    ├── mvnw
    ├── mvnw.cmd
    ├── bin
    └── src





This version is more concise and focuses on the key information. Let me know if you'd like to make any more changes!
