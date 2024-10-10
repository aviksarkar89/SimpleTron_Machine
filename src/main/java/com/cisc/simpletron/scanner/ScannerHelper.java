/**
 * A helper class for using Scanner class methods
 * @author Avik Sarkar
 * @version 3.0
 */

package com.cisc.simpletron.scanner;

import java.util.Scanner;

public class ScannerHelper {

    private final Scanner scanner = new Scanner(System.in);

    public String inputString() {
        return scanner.nextLine();
    }

    public int inputInt() {
        return scanner.nextInt();
    }

    public void closeScanner() {
        scanner.close();
    }
}
