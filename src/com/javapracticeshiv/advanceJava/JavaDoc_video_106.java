package com.javapracticeshiv.advanceJava;

/**
 * This class is to demonstrate what javadoc is and how it is used in the java industry.
 * @author Shivaraj
 * @version 0.1
 * @since 2020
 * @see <a href="https://docs.oracle.com/en/java/javase/17/docs/api/index.html" target ="_blank">Java Docs</a>
 */
public class JavaDoc_video_106 {
    /** This method is used to return the divison of two numbers
     * @throws ArithmeticException if divided by 0
     * @return Integer
     * @param a First parameter -  Integer
     * @param b Second parameter - Integer
     * */
    public double divide(int a, int b) throws ArithmeticException{
        return a/b;
    }

    /**
     * This method is use to add two numbers
     * @param i This is the first number to add
     * @param j This is the second number to add
     * @return This will return sum of two numbers
     * @deprecated This method is deprecated please use + operator
     */
    public int add(int i, int j){
        int c = i +j;
        return c;
    }

    /**
     *
     * @param args These are the arguments supplied to the command line.
     */
    public static void main(String[] args) {

        System.out.println("This is my main method");
        JavaDoc_video_106 jv = new JavaDoc_video_106();
        int sum = jv.add(10,30);
        System.out.println(sum);

    }
}
