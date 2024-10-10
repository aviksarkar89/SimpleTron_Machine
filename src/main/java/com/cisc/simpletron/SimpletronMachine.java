/**
 * The main class there Simpletron Machine runs
 * @author Avik Sarkar
 * @version 3.0
 */

package com.cisc.simpletron;

import com.cisc.simpletron.processor.SimpletronProcessor;
import com.cisc.simpletron.scanner.ScannerHelper;

/**
 * The main class where the Simpletron Machine runs.
 */
public class SimpletronMachine {

    private static final SimpletronProcessor PROCESSOR = new SimpletronProcessor(100, new ScannerHelper());

    public static void main(String[] args) {
        printWelcomeMessage();
        PROCESSOR.process();
    }

    private static void printWelcomeMessage() {
        String welcomeMessage = """
            *** Welcome to Simpletron! ***
            *** Please enter your program one instruction ***
            *** (or data word) at a time. I will type the ***
            *** text field. I will display the location   ***
            *** number and a question mark (?). You then  ***
            *** type the word for that location. Enter    ***
            *** -99999 to stop entering your program.     ***
            """;
        System.out.println(welcomeMessage);
    }
}
