package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner keyboard;

        int chosedNumber;

        for(int i = 0; i <30; i++) {
        chosedNumber = (int) (Math.random()*2);

            System.out.println(chosedNumber);
    }
}}
