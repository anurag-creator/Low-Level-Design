# **Factory Method Design Pattern**
![img.png](img.png)
is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

📖 **Concept :**
To delegate the responsibility of object instantiation to subclasses or factory methods.
Problem Solved: Avoid tight coupling between the client code and specific implementations of objects.
Real-World Example: Notification systems that need to create various types of notifications (Email, SMS, Push) based on the context.

**Implementation :** the Factory Method pattern in a notification system for an eCommerce platform.


Components:
Product Interface (Notification)
Defines a common interface for all types of notifications.

Concrete Products (EmailNotification, SMSNotification, PushNotification)
These classes implement the Notification interface to handle specific notification types.

Factory Class (NotificationFactory)
Contains a method getNotification() that decides which notification object to create based on input.

Client (Main)
Uses the factory to create notifications without knowing the specific implementation details.