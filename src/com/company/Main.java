package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        for (int i = 0; i < 1000000; i++) {
        int NumOne = random.nextInt(10);
        System.out.println("what do you think the number is? ");
        int GuessOne = input.nextInt();
        if (GuessOne == NumOne) {
            System.out.println("you are right in " + i + " attempts");
        } else System.out.println("wrong");
        }}}