package app;

import java.util.Scanner;

public class Bellwork1025 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        grade(number);
    }

    public static void grade(int number) {
        if (number >= 90) {

            System.out.println("A");

        }

        else if (number >= 80) {

            System.out.println("B");

        }

        else if (number >= 70) {

            System.out.println("B");

        }

        else if (number >= 60) {

            System.out.println("B");

        }

        else {

            System.out.println("F");

        }
    }
}