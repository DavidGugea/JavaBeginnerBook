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

### The classes ```StringBuilder```/```StringBuffer```

The difference between ```StringBuilder``` and ```StringBuffer``` is that they are immutable objects. The difference between ```StringBuilder``` and ```StringBuffer``` is that ```StringBuffer``` is protected from threaded operations, while ```StringBuilder``` isn't.

### The base class ```CharSequence```

The class ```CharSequence``` is the base class for the classes ```String```, ```StringBuilder``` and ```StringBuffer```.

For example, we can look at the method ```contains(CharSequence s)``` from the class String. The parameter ```s``` can be of type ```String```, ```StringBuilder``` or ```StringBuffer```. This is useful since we don't have to be bound to one single type.

### Basic string methods

|Method|Description|
|------|-----------|
|```isEmpty()``` or ```isBlank()```|This methods test if a string is empty or not. The difference between them is that ```isBlank()``` testes if a string only contains out of whitespace.|
|```charAt(int index)```|You can use this method to get the char at a specific index|
|```indexOf(String/char i, int fromIndex)```|This method returns the index of a specific character at a specific index. You can use ```fromIndex``` to specify a start index.|
|```lastIndexOf(...)```|This is the exact opposite of ```indexOf(...)```, it returns the last index of a given string/char.|
|```equals(...)```|This method returns true if the strings are perfectly the same|
|```equalsIgnoreCase(...)```|This method returns true if the strings are perfectly the same|This method returns true if the given strings are the same, while ignoring the casing|
|```startsWith(...)``` or ```endsWith(...)```|You can test if a string starts with or ends with a certain char/string using this two methods.|
|```compareTo(...)``` or ```compareToIgnoreCase(...)```|You can use this method to compare two strings. The return values are not boolean values, they are integers. These methods compare how much a string is lexically smaller/bigger than another string. If you use the ```compareToIgnoreCase(...)``` version, the casing of the characters will be ignore.|
|```regionMatches(boolean ignoreCase, int toffset, String other, int offset, int len)```|This method compares if two regions of two strings match. Returns a boolean|
|```substring(...)```|This method returns a substring from a string based on the given startindex and optional end index ( the index index defaults to the lenght of the string )|
|```substringBefore(String string, String delimiter)``` and ```substringAfter(String string, String delimiter)```|It's like splitting a string but instead, you get the string that remains before/after the given delimiter. Example: ```substringBefore("index.html", ".")``` is "index" and ```substringAfter("index.html", ".")``` is "html".
|```getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)```|Copies chars from a string into the given source|
|```toCharArray()```|Converts the string into an array of chars|
|```concat(CharSequence s)```|Use this method to add a new string to yours. This method is actually creating a new internal char array and is adding all the chars from both strings and returns a new string as a result.|
|```join(CharSequence delimiter, CharSequence... elements/Iterable<? extends CharSequence> elements)```|This method works just like in any other programming language. It gets a sequence of elements and it puts them all together using the given delimiter.|
|```trim()```, ```strip()```, ```stripLeading()```, ```stripTrailing()```| The ```trim()``` and ```strip()``` methods both remove the whitespace from the start and from the end of a string. The difference between these two methods is that ```strip()``` is the "Unicode-Aware" evolution of ```trim()```. The method ```stripLeading()``` only removes the whitespace from the start of the string while ```stripTralining()``` remove the whitespace from the end of a string.|
|```replace(CharSequence target, CharSequence replacement)```| This method replaces all the substrings from the given ```target``` parameter with the ```replacement``` parameter > Replaces each substring of this string that matches the literal target sequence with the specified literal replacement sequence.|
|```replaceAll(String regex, String replacement)```|Replaces each substring of this string that matches the given regular expression with the given replacement.|
|```replaceFirst(String regex, String replacement)```|Replaces the first substring of this string that matches the given regular expression with the given replacement.|

### ```String``` constant pool

As previously mentioned, strings are immutable. That means that every time you create a string and change something to it, the methods that you use to change it aren't actually "changing" the string since it's immutalbe. What these methods actually do is, they are creating a new string and returning it to you.

Java uses the flyweight pattern so you don't have multiple strings in the memory that have the same contents. A string with certain contents only exists once.

> The String constant pool is a special memory area. When we declare a String literal, the JVM creates the object in the pool and stores its reference on the stack. Before creating each String object in memory, the JVM performs some steps to decrease the memory overhead.
> The String constant pool uses a Hashmap in its implementation. Each bucket of the Hashmap contains a list of Strings with the same hash code.

## Immutable strings with ```StringBuilder``` and ```StringBuffer```

We've learned that strings are immutable. This doesn't apply to ```StringBuilder``` and ```StringBuffer```. If you are making a change to a ```StringBuilder```/```StringBuffer``` object, you are actually changing the object itself and not building a new string inside the memory with new contents that is given back to you by the used method. The methods used with ```String``` objects are the same or very similar to the methods that we use with ```StringBuilder```/```StringBuffer```.

All the methods that you can use with ```StringBuilder``` you can also use the with ```StringBuffer```. From now on I'll just talk about ```StringBuilder```.

### Adding something to ```StringBuilder```

In order to add something to a ```StringBuilder``` you hav eto use the ```append``` method.

You should never use a plus ( ```+```  ) inside an ```append()``` method since that's counter-productive.

Bad:

```Java
sb.append("," + value)
```

Good:

```Java
sb.append(",").append(value);
```