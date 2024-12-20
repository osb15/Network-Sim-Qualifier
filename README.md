# Sim Management System

This project demonstrates a simple Spring Framework-based application for simulating calling functionality using different mobile networks. The system defines multiple mobile network SIM classes and showcases dependency injection to manage and use those classes in a `Person` class.

## Features
- Two different mobile network classes (`Airtel` and `Jio`) implementing a common `Sim` interface.
- Dependency Injection is used to inject the appropriate SIM objects into the `Person` class using Spring's `@Autowired` and `@Qualifier` annotations.
- Spring's component scanning is configured to automatically detect and manage the beans in the project.

## Technologies Used
- Spring Framework
- Java
- Spring Annotations (e.g., `@Component`, `@Autowired`, `@Qualifier`, `@ComponentScan`)

## Structure
1. **Sim Interface**: Defines the `Calling()` method that all network classes must implement.
2. **Airtel & Jio Classes**: Implements the `Sim` interface and provides network-specific implementations of the `Calling()` method.
3. **Person Class**: Demonstrates dependency injection by using the `@Autowired` annotation to inject two different SIM instances (`Airtel` and `Jio`).
4. **MyConfiguration Class**: Configures the Spring container to scan the necessary packages and detect all the Spring beans.
5. **Main Class**: The entry point of the application, where the Spring context is initialized and the `Person` bean is retrieved to display the calling messages from both `Airtel` and `Jio` SIMs.

## How It Works
1. **Spring Bean Configuration**: The application uses `@Component` annotations to mark classes as Spring beans. The `@ComponentScan` annotation ensures that Spring scans the package and detects all necessary beans.
2. **Dependency Injection**: The `@Autowired` annotation is used to inject the SIM objects into the `Person` class. The `@Qualifier` annotation specifies which specific bean (e.g., `airtel` or `jio`) should be injected when multiple beans of the same type exist.
3. **Running the Application**: When the application is executed, it will print messages that simulate calling from both Airtel and Jio networks.

## How to Run
1. Clone the repository.
2. Set up a Spring-based environment with dependencies in your `pom.xml` (if using Maven) or `build.gradle` (if using Gradle).
3. Compile and run the `Main_Class` to see the output.

## Output
U Are Calling From Airtel U Are Calling From Jio

## Conclusion
This project provides an introduction to Spring's dependency injection mechanism, demonstrating how to inject and manage multiple beans of the same type using annotations like `@Autowired` and `@Qualifier`. The use of `@ComponentScan` simplifies the configuration by automatically scanning for Spring beans within the specified package.
