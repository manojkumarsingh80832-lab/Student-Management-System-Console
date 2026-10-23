# Student Management System - Console

A simple **Java Console-based Student Management System** for managing student records using CRUD operations.

## Features

* Add Student
* View All Students
* Search Student by Roll No
* Update Student Details
* Delete Student
* Exit

## Student Details

Each student contains:

* Roll Number
* Name
* Course
* Marks

## Project Structure

```text
Student-Management-System-Console/
│
├── Student.java
├── StudentService.java
├── Main.java
└── README.md
```

## Technologies Used

* Java
* ArrayList
* Scanner
* Object-Oriented Programming
* Exception Handling

## CRUD Operations

| Operation | Description              |
| --------- | ------------------------ |
| Create    | Add a new student        |
| Read      | View and search students |
| Update    | Update student details   |
| Delete    | Remove a student         |

## Best Practices

This project follows basic Java best practices:

* User input validation
* Meaningful class and variable names
* Separate methods for different operations
* Exception handling for invalid input
* Clean and readable code
* Comments for better understanding
* Separation of responsibilities using multiple classes

## Input Validation

The application validates:

* Roll number must be greater than `0`
* Name cannot be empty
* Course cannot be empty
* Marks must be between `0` and `100`
* Duplicate roll numbers are not allowed
* Invalid numeric input is handled using exception handling

## How to Run

Compile the Java files:

```bash
javac *.java
```

Run the application:

```bash
java Main
```

## Sample Menu

```text
===== Student Management System =====
1. Add Student
2. View All Students
3. Search Student
4. Update Student
5. Delete Student
6. Exit

Enter your choice:
```

## Sample Data

```text
101 | Ananya Sharma | BCA | 89.5
102 | Rahul Kumar | BCA | 76.0
103 | Priya Singh | MCA | 92.0
104 | Aman Verma | BTech | 68.5
105 | Neha Joshi | BCA | 84.0
```

## Learning Objectives

This project helps practice:

* Classes and Objects
* Constructors
* Methods
* ArrayList
* Loops
* Conditional Statements
* Switch Case
* Exception Handling
* Scanner
* CRUD Operations
* Basic OOP concepts

## Future Improvements

* Database integration using MySQL
* File-based data storage
* Student grade calculation
* Sorting and filtering
* Login and authentication
* GUI version

## Author

**Manoj Kumar Singh**

---

This project is created for **learning and educational purposes**.
