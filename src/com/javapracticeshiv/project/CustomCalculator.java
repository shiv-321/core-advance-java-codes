package com.javapracticeshiv.project;
class InvalidInputException extends Exception{
    @Override
    public String toString() {
        return "Can not add 8 and 9";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}
class CannotDivideByZeroException extends Exception{
    @Override
    public String toString() {
        return "Can not divide by zero";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}
class MaxInputException extends Exception{
    @Override
    public String toString() {
        return "Input should not be greater than 100000";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}
class MaxMultiplierException extends Exception{
    @Override
    public String toString() {
        return "Multiplier should not be greater than 7000";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

class Calculator{
double add(double a, double b) throws InvalidInputException, MaxInputException{
    if (a>100000 || b>100000){
        throw new MaxInputException();
    }
    if (a==8 || b==9){
        throw new InvalidInputException();
    }
    return a+b;
}
double subtract(double a, double b)throws MaxInputException{
    if (a>100000 || b>100000){
        throw new MaxInputException();
    }
    return a-b;
}
double multiply(double a, double b)throws MaxInputException, MaxMultiplierException{
    if (a>100000 || b>100000){
        throw new MaxInputException();
    }
    else if (a>7000 || b> 7000){
        throw new MaxMultiplierException();
    }
    return a*b;
}
double divide(double a, double b) throws CannotDivideByZeroException, MaxInputException{
    if (a>100000 || b>100000){
        throw new MaxInputException();
    }
    if (b==0){
        throw new CannotDivideByZeroException();
    }
    return a/b;
}
}

public class CustomCalculator {
    public static void main(String[] args) throws InvalidInputException, CannotDivideByZeroException, MaxInputException, MaxMultiplierException{
        Calculator c = new Calculator();
//        c.add(8, 9);
//        c.divide(6, 0);
        c.add(1000000, 100);
        c.multiply(8000, 2);


        /*
        exercise 6: You have to create a custom calculator with following operation
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplicaiton
        4. / -> Division

        which throws the following exceptions:
        1. Invalid input Exception ex: 8 &9
        2. Cannot divide by 0 Exception
        3. Max Input Exception if any of the inputs is greater than 100000
        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000

         */
    }
}
