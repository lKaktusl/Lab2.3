package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
        Scanner in = new Scanner(System.in);
        float a = in.nextInt(), b = in.nextInt();
        System.out.print("a + b = " + (a + b) + "\na - b = " + (a-b) + "\na * b = " + (a*b));
    }
}
