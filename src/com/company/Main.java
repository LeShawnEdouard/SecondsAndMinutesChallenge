package com.company;

public class Main {

    public static void main(String[] args) {

    }
    // Create a method called getDurationString with two parameters, first parameter
    // minutes and 2nd parameter seconds.

    // You should validate that the first parameter minutes is >= 0

    // You should validate that the 2nd parameter seconds is >= 0 and <= 59.

    // The method should return "Invalid value" in the method if either of the above are not true.

    // If the parameters are valid then calculate how many hours minutes and seconds equal the minutes
    // and seconds passed to this method and return that value as string in format
    // "XXH YYm ZZs" where XX represents a number of hours, YY the minutes and ZZ the seconds.

    // Create a 2nd method of the same name but with only one parameter seconds.

    // Validate that it is >= 0, and return "Invalid value" if it is not true.

    // If it is valid, then calculate how many minutes are in the seconds value and then call
    // the other overloaded method passing the correct minutes and seconds calculated so that
    // it can calculate correctly.

    // Call both methods to print values to the console.

    // TIPS:
    // Use int or long for your number data types is probably a good idea.
    // 1 minute = 60 seconds and 1 hour = 60 minutes or 3600 seconds.
    // Methods should be static as we have used previously.

    public static int getDurationStrong(int minutes, int seconds) {
        if((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            System.out.println("Invalid value");
        }
        return 0;
    }

}
