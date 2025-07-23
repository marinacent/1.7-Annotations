# Task 7 - Annotations

## 📄 Description

### Level 1

#### Exercise 1

1. Create a class hierarchy with the classes *Employee*, *OnSiteEmployee* and *RemoteEmployee*.
2. The employee class and its subclasses should have the attributes *name*, *surname* and *hourly rate*.
3. Create the method *computeSalary()* in the employee class. The method takes the number of hours worked as a parameter and multiplies it by the hourly rate.
4. Override the *computeSalary()* method in the *OnSiteEmployee* subclass adding a fuel allowance.
5. Override the *computeSalary()* method in the *RemoteEmployee* subclass adding an internet allowance.

#### Exercise 2

1. Add deprecated methods to the child classes using the @Deprecated annotation.
2. From an external class, call those deprecated methods, and suppress the deprecation warnings.

### Level 2

Create a custom annotation that allows a Java object to be serialized into a JSON file. The annotation must receive the directory where the resulting file will be saved.

### Level 3

Add the functionality for the annotation created in the previous step to be retained by the Virtual Machine at runtime. Demonstrate that the annotation is read using Java Reflection.

## 💻 Technologies used

Java 21

Maven 4.0.0

## 📋 Requirements

Java 21

Maven 4.0.0

## 🛠️ Set up

1. Clone repository: ```git clone```
2. Access project repository: ```cd 1.7-Annotations```
3. Compile files: ```mvn compile```

## ▶️ Run

Run the following commands to execute each one of the Main classes:

```java -cp target/classes level_1.Main```

```java -cp target/classes level_2.Main```

```java -cp target/classes level_3.Main```
