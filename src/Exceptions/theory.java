/*The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that normal flow of the application can be maintained.
There are mainly two types of exceptions: checked and unchecked. Here, an error is considered as the unchecked exception. According to Oracle, there are three types of exceptions:

Checked Exception
The classes which directly inherit Throwable class except RuntimeException and Error are known as checked exceptions e.g. IOException, SQLException etc. Checked exceptions are checked at compile-time.

Unchecked Exception
The classes which inherit RuntimeException are known as unchecked exceptions e.g. ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException etc. Unchecked exceptions are not checked at compile-time, but they are checked at runtime.

Error
Error is irrecoverable e.g. OutOfMemoryError, VirtualMachineError, AssertionError etc.*/

/*try
The "try" keyword is used to specify a block where we should place exception code. The try block must be followed by either catch or finally. It means, we can't use try block alone.

Catch
The "catch" block is used to handle the exception. It must be preceded by try block which means we can't use catch block alone. It can be followed by finally block later.

finally
The "finally" block is used to execute the important code of the program. It is executed whether an exception is handled or not.

throw
The "throw" keyword is used to throw an exception.

throws
The "throws" keyword is used to declare exceptions. It doesn't throw an exception. It specifies that there may occur an exception in the method. It is always used with method signature.*/




// final and finally are keywords in java whereas finalize is a method
// final keyword can be used with class variables so that they can’t be reassigned, with class to avoid extending by classes and with methods to avoid overriding by subclasses
// finally keyword is used with try-catch block to provide statements that will always gets executed even if some exception arises, usually finally is used to close resources.
// finalize() method is executed by Garbage Collector before the object is destroyed, it’s great way to make sure all the global resources are closed.
