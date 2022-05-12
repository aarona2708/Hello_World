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

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
    }
}