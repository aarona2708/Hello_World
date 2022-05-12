// public: access modifier. This sets the accessibility of the class
// class: determines the class
// Hello: class name
public class Hello {

    // A method: a collection of statements that performs an operation (Like a function)
    // static: is a java keyword that needs an understanding of other concepts.
    // void: what the method returns
    // main: the main method
    // String[] args: the method takes string class as argument
    public static void main(String[] args) {

        /*========================================== Intro and Variables =============================================*/
        System.out.println("============================ Intro and Variables outputs ============================");
        // Prints "Hello World!" string
        System.out.println("Hello World!");

        // Initializing a variable. Data type has to be declared (E.g., "int x;")
        int myFirstNumber = 5;
        // Printing the number. Will print the integer number 5
        System.out.println(myFirstNumber);

        // Performing basic arithmetic
        int mySecondNumber =  (5 + 2) * (122 / 2);
        // Will print integer 427
        System.out.println(mySecondNumber);

        // Basic arithmetic between int variable
        int myThirdNumber = 34;
        int totalNumber = myFirstNumber + mySecondNumber + myThirdNumber;
        // Will print 398
        System.out.println(myFirstNumber + mySecondNumber - myThirdNumber);
        // Will print 466
        System.out.println(totalNumber);

        /*=========================================== Primitive Types ================================================*/
        System.out.println("\n================================ Primitive Types ================================");
        int myValue = 10000;

        // Minimum and maximum memory allocation for an int in
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        // Minimum value of an int: -2147483648
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        // Maximum value of an int: 2147483647
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        // De-allocation of -2147483648 bytes of data could cause underflow
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        // Allocation of 2147483646 bytes of data could cause overflow
        System.out.println("Busted Min value = " + (myMaxIntValue - 1));

        /*===================================== Byte, short, long and width ==========================================*/
        System.out.println("\n========================== Byte, short, long and width ==========================");
        // An int, has a much larger range as we know, and occupies 32 bits, width = 32.
        int myMaxIntTest = 2_147_483_467; // still considered and treated as an int
        System.out.println("myMaxIntTest = " + (myMaxIntTest + 2));

        // A Byte occupies 8 bits, so we say a byte has a width of 8.
        // Min and Max Byte values. Bytes could also cause under and overflows
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Min Value = " + myMinByteValue);
        System.out.println("Byte Max Value = " + myMaxByteValue);

        // A Short can store a large range of numbers and occupies 16 bits, and has a width of 16.
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min Value = " + myMinShortValue);
        System.out.println("Short Max Value = " + myMaxShortValue);

        // A Long like an int, has a much larger range as we know, and occupies 32 bits, width = 32.
        // "L" at the end determines this number as long, therefore giving it the max value of a long instead of int
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Min Value = " + myMinLongValue);
        System.out.println("Long Max Value = " + myMaxLongValue);

        /*=============================================== Casting ====================================================*/
        System.out.println("\n=================================== Casting ===================================");
        int myTotal = (myMinIntValue / 2);

        // Casting: (type to cast the value to)(value)
        // Here myMinByteValue / 2 will produce an integer, and an int cannot be set to a byte variable
        byte myNewByteValue = (byte)(myMinByteValue / 2);
        short exampleVal = (short)(myMinByteValue + 2);

        // More practice:
        byte byteVariable = 127;
        short shortVariable = 123;
        int intVariable = 423;

        long longVariable = (5000L + 10 * (byteVariable + shortVariable + intVariable));
        System.out.println(longVariable);

        // Without the short cast, the value will exceed the bits max
        short shortTotal = (short) (1000 + 10 * (byteVariable + shortVariable + intVariable));
        System.out.println(shortTotal);

        /*========================================== Float and double ================================================*/
        System.out.println("\n============================== Float and double ==============================");

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Min Value = " + myMinFloatValue);
        System.out.println("Float Max Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Min Value = " + myMinDoubleValue);
        System.out.println("Double Max Value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f; // or cast it (float) 5.25. Not casting it will assume that 5.25 is a double
        double myDoubleValue = 5d / 3d;
        System.out.println("MyIntValue = " + myIntValue); // ints only prints out whole numbers
        System.out.println("MyFloatValue = " + myFloatValue); // Float is more concise, prints less values than doubles
        System.out.println("MyDoubleValue = " + myDoubleValue); // Double is more precise, therefore prints more values

        // Convert given number of lbs to kg using right type. 1 lbs = 0.45359237 kg
        double lbs = 137d;
        double kg = lbs * 0.45359237d;
        System.out.println("\nExample problem: Convert lbs to kg, where 1 lbs = 0.45359237 kg");
        System.out.println("137 lbs to kg = " + kg);



    }
}