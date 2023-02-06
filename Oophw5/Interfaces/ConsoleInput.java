package Oophw5.Interfaces;

import java.util.Scanner;

public class ConsoleInput {
    private static Scanner sc;

    public String input() {
        sc = new Scanner(System.in);
        // String inp = sc.nextLine();
        // return inp;
        return sc.nextLine();
    }
}
