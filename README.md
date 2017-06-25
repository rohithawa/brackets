#Introduction
CHECK BRACKETS (5-15 min)

You're working with an intern that keeps coming to you with JavaScript code that won't run because the braces, brackets, and parentheses are off.
To save you both some time, you decide to write a braces/brackets/parentheses validator.
'(', '{', '[' are called "openers." ')', '}', ']' are called "closers."
Write an efficient function that tells us whether or not an input string's openers and closers are properly nested.

Examples:
"{ [ ] ( ) }" should return true
"{ [ ( ] ) }" should return false
"{ [ }" should return false

#CHECK BRACKETS
Package - au.com.brackets

#Tools and Technologies
- java 8
- Maven
- junit
- jackson
- cobertura

#How to build the application
```
mvn clean install
```

#How to run the cobertura code coverage
```
mvn cobertura:cobertura
```

#How to view the cobertura report

Go to target/cobertura/index.html

#How to run the application
```
java -jar  target/technicalassessment-app.jar
```