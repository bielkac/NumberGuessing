package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String answer;

        int chosedNumber;

        for (int h = 4; h < 30; h++) {
            chosedNumber = (int) (Math.random() *2);

            do {


                System.out.println(" Do you want to continue?");
                answer = keyboard.nextLine().toLowerCase();
            } while (answer.equals("yes"));

            System.out.println(chosedNumber);
            cnkdcjndcjjfljwkjwS

        }
    }
}
