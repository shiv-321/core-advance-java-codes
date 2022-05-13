package com.javapracticeshiv.project;

import java.util.Random;
import java.util.Scanner;

class Game {
    public int number;
    public int inputNumber;
    public int noOfGuess;

   public int getNoOfGuess() {
        return noOfGuess;
    }
    public void setNoOfGuess(int noOfGuess) {
        this.noOfGuess = noOfGuess;
    }

    public Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeUserInput() {
        System.out.println("Guess the number: ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber() {
        if (inputNumber == number) {
            return true;
        } else if (inputNumber < number) {
            System.out.println("Too low....");
        } else if (inputNumber > number) {
            System.out.println("Too high....");
        }
            return false;
        }
    }

public class GuessNumber {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while(!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
            System.out.println(b);
        }
    }
}
