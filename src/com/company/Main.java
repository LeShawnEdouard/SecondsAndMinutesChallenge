package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
        System.out.println(area(5.0));
        System.out.println(area(5.0, 4.0));
        printYearsAndDays(525600);
        printYearsAndDays(1440);
        printYearsAndDays(-525600);
        printYearsAndDays(0);
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

    private static String getDurationString(int minutes, int seconds) {
        if((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "Invalid value";
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s ";

    }

    private static String getDurationString(int seconds) {
        if(seconds < 0) {
            return "Invalid Value";
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }






    // Area Calculator Exercise //
    // Write a method named 'area' with one 'double' parameter named 'radius'.
    // The method needs to return a 'double' value that represents the 'area' of a circle.
    // If the parameter 'radius' is 'negative' then return -1.0 to represent an invalid value.

    // Write another overloaded method with '2 parameters x and y (both doubles),
    // were x and y represent the sides of a rectangle.
    // The method needs to return an area of an rectangle.
    // If either or both parameters is/are 'negative' return -1.0 to indicate an invalid value.

    // TIPS
    // The formula for calculating the area of a rectangle is x * y
    // The formula for calculating a circle area is radius * radius * PI.
    // For PI ue a constant from 'Math' class e.g. 'Math.PI'.
    // All methods need to be defined as public static like we have
    // been doing so far in the course.


    public static double area(double radius) {
        if(radius < 0) {
            return -1.0;
        }
        double circle = radius * (radius * Math.PI);
        return circle;
    }

    public static double area(double x, double y) {
        if((x < 0) || (y < 0)) {
            return -1.0;
        }
        double rectangle = x * y;
        return rectangle;
    }

    // Minutes To Years and Days Calculator //
    // Write a method 'printYearsAndDays' with 'parameter' of type 'long'
    // named 'minutes'

    // The method should not return anything (void) and it needs to calculate the
    // 'years and days' from the 'minutes' parameter.

    // If the parameter 'is less than 0', print text 'Invalid Value'
    // Otherwise, if the parameter is valid then it needs to print a message in the
    // format 'XX min = YY y and ZZ d'.

    // XX represents the original value 'minutes'
    // YY represents the calculated 'years'
    // ZZ represents the calculated 'days'

    public static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.println("Invalid Value");
        }
        long years = minutes / 525600;
        long days = minutes / 1440;

        if(minutes >= 0) {
            System.out.println(minutes + " min = " + years + " y " + "and " + days + " d");
        }
    }






}
