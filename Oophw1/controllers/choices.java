package controllers;

import java.util.Scanner;

public class choices {
    private static Scanner sc;

    public static int choiceM(String validCh) {
        sc = new Scanner(System.in);
        boolean ready = false;
        int ch = 0;
        while (!ready) {
            ch = sc.nextInt();
            if (ch < 9 && validCh.indexOf(Integer.toString(ch)) != -1) {
                ready = true;
            }
        }
        return ch;
    }
}
