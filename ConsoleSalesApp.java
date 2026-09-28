/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consolesalesapp;

/**
 *
 * @author Arehone Makugo
 */
import java.util.Scanner;

public class RunApplication {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Present the menu to select console type
        System.out.println("Select the console type");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");
        System.out.print("\n"); // Blank line for formatting

        // Read the user's choice
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline character

        // Determine the console type based on the choice
        String consoleType = "";
        switch (choice) {
            case 1:
                consoleType = "PS5";
                break;
            case 2:
                consoleType = "XBOX";
                break;
            case 3:
                consoleType = "SWITCH";
                break;
            default:
                System.out.println("Invalid selection. Defaulting to PS5.");
                consoleType = "PS5";
        }

        // Prompt for store name
        System.out.print("Enter the store: ");
        String storeName = scanner.nextLine();

        // Prompt for total sales
        System.out.print("Enter the total sales of " + consoleType + " consoles for " + storeName + ":");
        int totalSales = scanner.nextInt();

        // Instantiate the ConsoleSales object using the collected data
        ConsoleSales sales = new ConsoleSales(consoleType, storeName, totalSales);

        // Print the final report
        sales.printReport();

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}