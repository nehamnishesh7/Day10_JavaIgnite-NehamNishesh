1)Explain Java Exception hierarchy:

Throwable
Exception
Error

Give one example for each.


2)Can we have multiple catch blocks?
Explain with example when it is useful.


3)A program crashes when user enters text instead of number.

What exception occurs?

How will you handle it?

Where should try-catch be placed?



4)try {
    int a = 10 / 0;
    
    System.out.println("Hello");

}

catch(Exception e) {

    System.out.println("Error handled");

}

System.out.println("End");

Predict the output - 

What prints first?

Does program stop?

1. Java Exception Hierarchy
The Java Exception hierarchy is rooted in a single parent class called Throwable. Every problem that can occur and be caught in a Java application stems from this class. It is divided into two main branches: Exception and Error. The Exception branch represents problems that a reasonable application should anticipate and attempt to catch, allowing the program to recover and continue running. A common example is a FileNotFoundException, which occurs when you try to open a document that does not exist. The Error branch, on the other hand, represents severe, system-level failures that an application typically cannot and should not try to handle. An example of this is an OutOfMemoryError, which happens when the Java Virtual Machine completely runs out of memory and crashes.

2. Multiple Catch Blocks
Yes, you can absolutely use multiple catch blocks attached to a single try block. This is highly useful when a specific piece of code has the potential to fail in several completely different ways, and you need to provide a unique response or fallback mechanism for each specific type of failure. For example, if you are reading numbers from a file and dividing them, the program might fail because the file is missing, or it might fail because it attempts to divide by zero. By using multiple catch blocks, you can give the user a specific message about the missing file in one block, and a completely different message about the invalid math operation in another. This ensures the program handles both unique situations gracefully. You must always order these blocks from the most specific exception type at the top to the most general at the bottom.

3. Handling Text Instead of Numbers
When a user enters text instead of a valid number, the program will typically throw an InputMismatchException or a NumberFormatException, depending on exactly which Java method you are using to read the input. To handle this safely, you must intercept the error using a try-catch block, which allows you to display a friendly warning message asking the user to provide a valid number rather than letting the entire application crash. This try-catch block should be placed precisely around the specific line of code that reads and parses the user input, along with any immediate calculations that depend directly on that input.

4. Predicting the Output
In the provided code snippet, the text that prints first is "Error handled". The program does not stop or crash. When the math operation attempts to divide ten by zero, it instantly triggers an arithmetic exception. This causes the code execution to immediately abort the rest of the try block, completely bypassing the line that prints "Hello". The catch block successfully intercepts the exception and prints its message. Because the error was safely caught and handled, the program resumes normal execution right after the catch block and prints "End" as its final action.


