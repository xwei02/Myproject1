package com.sylvie;

import java.util.Scanner;

public class vending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        boolean end = false;
        while (!end) {
            System.out.println("Please put your coin 1/5/10: Total: "+total);
            String s = scanner.next();
            int num = Integer.parseInt(s);
            switch (num) {
                case 1:
                    System.out.println("1");
                    total = total + num;
                    break;
                case 0:
                    System.out.println("0");
                    end = true;
                    break;
                case 5:
                    System.out.println("5");
                    total = total + num;
                    break;
                case 10 :
                    System.out.println("10");
                    total = total + num;
                    break;
                default:
                    break;
            }
        }
    }
}
