# Introduction: Java Masterclass
## Overview
This repository includes a list of assignments from self-learning Java course at [Udemy](https://www.udemy.com/course/java-the-complete-java-developer-course).

## Course content
* **Course Name:** Java Masterclass 2025
* **Platform:** [Udemy](https://www.udemy.com/course/java-the-complete-java-developer-course)
* **Time:** Jun 2025

## Assignments overview

## Key skills gained from the

### Get started with Java
* Java versions & development environments (JShell & IntelliJ IDEA)
* Working with Jshell
  * Write and modify statements

--- 
### Data types
* Jave's different primitive data types and wrapper classes
  * byte (see [Java_byte_short_long.txt](../archive/Java_byte_short_long.txt))
    * range -128 to 128
    * takes up less space but less used
    * width: 8 bits
  * short (see [Java_byte_short_long.txt](../archive/Java_byte_short_long.txt))
    * Short range: (-32768 to 32767)
    * width: 16 bits
  * long (see [Java_byte_short_long.txt](../archive/Java_byte_short_long.txt))
    * Long range: (-9223372036854775808 to 9223372036854775807)
    * width: 64 bits
    * When assigning to a variable, best practice is long myLongValue = 100L for values within integer range;
  * int (see [Java_variables.txt](../archive/Java_variables.txt))
    * wrapper class: Integer
    * width: 32 bits
  * char
    * only one single character
    * encapsulated by single quotes ''
    * can be used to loop programmatically through, for example, an alphabet
    * we can assign to the char variable by (see [03_Assign to char.txt](Exercises/03_Assign%20to%20char.txt) ):
      * literal character
      * unicode
      * hash number (in HTML)
  * float
    * Specified using F
  * double
    * check [Java_float_double.txt](Exercises/Java_float_double.txt)
      * default for any float or real number
      * specified using D
  * boolean
* Develop must be aware and mindful of data overflow and underflow
* Numbers can be written with "_" for easy reading

--- 
### Casting
By default, Java treats a variable value as an integer, no matter the type of this integer. Therefore, it may result in an error when assign a new variable using previously initialised variable. For example:
```java
short myNewShortValue = (myMinShortValue / 2); 
--> error
```
To avoid this, casting is used to specifically inform Java the type of the variable
```java
short myNewShortValue = (short) (myMinShortValue /2);
```
(see [Java_casting.txt](../archive/Java_casting.txt))

At this point, a few assignments were presented:
* [1.0_Primitive Types Challenge](Exercises/1.0_Primitive%20Types%20Challenge)

### Floating point precision
In Java, we must be careful when defining a variable. If a calculation is used to define a variable, the type of the numbers in the calculation determine the type of data output
When precise calculation is involved, float and double are not the choice
Instead, we make use of the BigDecimal class