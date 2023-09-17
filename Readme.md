# Programming design patterns and principles

(Implemented, using Java v17)

## Creational Patterns

### Factory Method:

> The Factory Method pattern is a creational design pattern that provides an interface for creating objects in a
> superclass but allows subclasses to alter the type of objects that will be created. It's a way to delegate the
> responsibility of instantiating objects to subclasses, promoting loose coupling between the client code and the
> concrete classes it uses.

### Abstract Factory

> The Abstract Factory pattern is another creational design pattern, like the Factory Method pattern, but it provides an
> interface for creating families of related or dependent objects without specifying their concrete classes. While both
> patterns deal with object creation, they serve different purposes, and the choice between them depends on your
> specific
> design requirements.

### Singleton

> A Singleton is a design pattern in software engineering that restricts the instantiation of a class to a single
> instance and provides a global point of access to that instance. In other words, it ensures that a class has only one
> instance in the entire application and provides a way to access that instance from any part of the code.

### Builder

> The Builder Pattern is a design pattern used in software engineering for building complex objects step by step. It
> offers several advantages and is particularly useful in situations where you need to create objects with many optional
> parameters or configurations.

### Prototype

> The Prototype Pattern is a design pattern used in software engineering to create new objects by copying an existing
> object, known as the prototype. It provides a way to create new objects with minimal effort and without the need for
> complex initialization logic.

## Structural Patterns

### Adapter

> The Adapter Pattern is a design pattern used in software engineering to allow two incompatible interfaces to work
> together. It acts as a bridge between two interfaces that are not compatible with each other due to differences in
> method signatures, parameter types, or behavior.

### Bridge

> The Bridge Pattern is a structural design pattern used in software engineering to separate an object's abstraction
> from its implementation so that both can vary independently. It achieves this by creating two separate hierarchies of
> classes—one for the abstraction and one for the implementation—linked together by a bridge interface.

### Composite

> The Composite Pattern is a structural design pattern used in software engineering to compose objects into tree-like
> structures to represent part-whole hierarchies. It allows clients to treat individual objects and compositions of
> objects (composites) uniformly.

### Decorator

> The Decorator Pattern is a structural design pattern used in software engineering to dynamically extend the behavior
> of objects without altering their original class or modifying their code. It involves creating a set of decorator
> classes that are used to wrap concrete components. Decorators add new responsibilities or modify existing ones of
> objects at runtime, allowing for more flexible and reusable code.

### Facade

> The Facade Pattern is a structural design pattern used in software engineering to provide a simplified, unified
> interface to a set of interfaces or a complex subsystem. It acts as a single entry point for a group of related
> functionalities, making it easier for clients to interact with the system.

### Flyweight

> The Flyweight Pattern is a structural design pattern used in software engineering to minimize memory usage and improve
> performance when dealing with a large number of objects that have a significant amount of shared, intrinsic (
> invariant)
> state. It achieves this by sharing common state among multiple objects instead of duplicating it for each instance.

### Proxy

> The Proxy Pattern is a structural design pattern used in software engineering to provide a surrogate or placeholder
> for another object to control access to it. It allows you to add an additional level of control over the interaction
> with the real object.

## Behavioral patterns

### Chain of responsibility

> The Chain of Responsibility Pattern is a behavioral design pattern used in software engineering to create a chain of
> objects that can handle a request or perform an action. It decouples the sender of a request from its receivers and
> allows multiple objects to process the request independently.

### Command

> A Command Interface, often referred to simply as the Command Pattern, is a behavioral design pattern used in software
> engineering to encapsulate a request as an object, thereby allowing for parameterization of clients with queues,
> requests, and operations. It turns a request into a stand-alone object with its own state, which can be passed, stored,
> and executed independently.

###