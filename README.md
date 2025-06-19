# SuperCarCustomizationApp

A simple Java **console-based** application that allows users to customize their own supercars.  
This project was developed for learning basic **Object-Oriented Programming (OOP)** concepts such as:
- Class structure and hierarchy
- Inheritance
- Polymorphism (method overriding)
- Encapsulation (use of mutators and accessors)
- ArrayList usage for object management
- User interaction via console input

## 📜 Project Purpose

This application was created as a personal learning project for mastering OOP fundamentals in Java.  
It was designed to reinforce understanding of inheritance, class relationships, and interactive program flow, through building a fun supercar customization app.

## 🚗 Features

- Select car type: **Sports Car** or **Luxury SUV**
- View available car models
- Customize selected car attributes (such as color, speed, interior materials, safety features)
- Display fully customized car details

## 🏛 Class Structure

### SuperCar (Parent Class)
- Attributes: `brand`, `model`, `price`, `topSpeed`, `exteriorColor`, `interiorColor`
- Methods: mutators, accessors, `toString()`

### SportsCar (Child Class)
- Additional attribute: `acceleration`
- Overrides: `toString()`

### LuxurySUV (Child Class)
- Additional attributes: `interiorMaterial`, `hasAdvancedSafetyFeatures`
- Overrides: `toString()`

### CustomizeSuperCar
- Manages car selection and customization
- Stores car lists using `ArrayList`
- Provides methods for user interaction, input validation, and customization logic

## 🔄 Program Flow

1. User selects car type (**Sports Car** / **Luxury SUV**)
2. User selects a specific car model from the list
3. User customizes the car attributes
4. Customized car details are displayed

## 🌳 Inheritance Hierarchy
SuperCar <br />
├── SportsCar <br />
└── LuxurySUV

## 💻 How to Run

1. Compile Java files:
    ```bash
    javac src/*.java
    ```
2. Run the main program:
    ```bash
    java -cp src Project
    ```

## 🌟 Learning Outcomes

Through this project, the following concepts were practiced:
- Java class design and relationships
- Inheritance and polymorphism
- Use of `ArrayList` to store and manage objects
- Console-based user interaction with if-else and switch statements
- Loop control and input validation

## 📸 Screenshots

