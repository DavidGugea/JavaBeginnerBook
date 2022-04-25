# Java for beginners - book

## Chapter 1. Java history and how it works

## Chapter 2. Imperative langauge concepts

## Chapter 3. Classes and objects

## Chapter 4. Arrays and their applications

## Chapter 5. Dealing with characters

## Chapter 6. Writing your own classes

## Chapter 7. Object-oriented relationship issues

## Chapter 8. Exceptions

## Chapter 9. Nested types

## Chapter 10. Special types of Java SE

## Chapter 11. Generics<T>

## Chapter 12. Lambda expressions and functional programming

## Chapter 13. Architecture, Design and applied OOP

## Chapter 14. Java Platform Module System

## Chapter 15. The class library

## Chapter 16. Introduction to concurrent programming

## Chapter 17. Introduction to data structures and algorithms

## Chapter 18. Introduction to graphical user interface

## Chapter 19. Introduction to files and file streams

## Chapter 20. Introduction to database management with JDBC

## Chapter 21. Bits and Bytes, Mathematics and Money

## Chapter 22. Testing with JUnit

## Chapter 23. The tools of JDK

---
---

# Chapter 1. Java history and how it works

The history of java and how the java environment works.

# Chapter 5. Dealing with characters

## Datatypes for chatacters and strings

When it comes to datatypes that we can use for characters and strings, here's a list that you can choose from:

* **```char```**: This is the primitive char data type that is well known in other programming languages as well.
* **```Character```**: This type of datatype contains a lot of static methods that can help you deal with basic ```char```s.
* **```String```**: This is a list of chars, the basic string that's met in other programming languages as well
* **```StringBuilder```**: Use this for strings that are suppossed to change. ( since basic strings are immutable )

## The ```Character``` class

The ```Character``` class is just a helper class for the primitive data type ```char```. It contains a lot of useful static methods.

### Character test methods

All the test methods have in common that they start with ```is```:

|Method|Result|
|------|------|
|```Character.isDigit('0')```|```true```|
|```Character.isDigit('-')```|```false```|
|```Character.isLetter('a')```|```true```|
|```Character.isLetter('0')```|```false```|
|```Character.isWhitespace(' ')```|```true```|
|```Character.isWhitespace('-')```|```false```|

### An overview of the most important```isXXX(...)```-Methods

* ```static boolean isDigit(char ch)```
* ```static boolean isLetter(char ch)```
* ```static boolean isLetterOrDigit(char ch)```
* ```static boolean isLowerCase(char ch)```
* ```static boolean isUpperCase(char ch)```
* ```static boolean isWhiteSpace(char ch)```

### ```toUpperCase``` and ```toLowerCase```

You can use the methods ```toUpperCase``` and ```toLowerCase``` to change the casing of a character.

* ```static char toUpperCase(char ch)```
* ```static char toLowerCase(char ch)```

### ```XXXdigit(...)``` Methods

* ```static int digit(char ch, int radix)```
    * Returns the numeric value of ```ch``` in the base ```radix```. For example ```Character.digit('f', 16)``` is 15 because F in base 16 is 15 in base 10 ( decimal ). The radix is alllowed between ```Character.MIN_RADIX(2)``` and ```Characte.MAX_RADIX(36)```. If the number can't be transformed, then you recived a -1.
* ```static char forDigit(int digit, int radix)```
    * This is the opposite of ```static int digit(char ch, int radix)```. It returns the character of the digit ```digit``` based on the given number system ( ```radix``` ). For exmpale ```Character.forDigit(6, 8)``` is 6 while ```Character.forDigit(12, 16)``` is ```c```.

## Strings

The difference between String and StringBuffer/StringBuilder is that strings are immutable. Every time you change a string, a new object is created for that string. Java, however uses the flyweight pattern so that if you have a string that looks like this: ```"abcd"```, Java will ensure that there is only one such object with that specific sequence of Character inside the whole heap. This is a very efficient design pattern. ```StringBuffer``` and ```StringBuilder```, however, are mutable objects. The other difference is thread safety:

| |Immutable|Mutable|
|-|---------|-------|
|**Thread Safe**|```String```|```StringBuffer```|
|**Not Thread Safe**|-|```StringBuilder```|

### The ```String``` class

As previously mentioned, the strings are immutable. Every time you use a method to change something to a string, a new string object is actually made, you are not really changing "the old string". Whenever you concatenate two strings together, a third string is made containing the chars from the strings that you added up together.

## The classes ```StringBuilder```/```StringBuffer```

The difference between ```StringBuilder``` and ```StringBuffer``` is that they are immutable objects. The difference between ```StringBuilder``` and ```StringBuffer``` is that ```StringBuffer``` is protected from threaded operations, while ```StringBuilder``` isn't.