package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Setup any variables you need and call your methods
         * here in the main method */

        double purchasePrice = inputPurchasePrice();
        double stateTaxRate = 0.02;
        double countyTaxRate = 0.04;;

        double tax = calculateTax(purchasePrice, stateTaxRate, countyTaxRate);
        double total = calculateTotal(purchasePrice, tax);

        // Display totals using printf
        displayTotals(purchasePrice, stateTaxRate, countyTaxRate, tax, total);
    }

    /* Write a method called inputPurchasePrice that
     *  takes the user input for price, converts to
     *  a double, and returns the price
     * */
    public static double inputPurchasePrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the purchase price: ");
        return scanner.nextDouble();
    }

    /* Write a method called calculateTax that
     * accepts price and tax rate as parameters and
     * calculates and returns the tax
     * */
    public static double calculateTax(double purchasePrice, double stateTaxRate, double countyTaxRate) {
        return purchasePrice * (stateTaxRate + countyTaxRate);
    }

    /* Write a method called calculateTotal that
     * accepts two double values nd calculates and
     * returns the total
     * */
    public static double calculateTotal(double purchasePrice, double tax) {
        return purchasePrice + tax;
    }
    /* Write a method called displayTotals that takes
     *  purchasePrice, stateTax, countyTax, totalTax and totalPrice
     *  as parameters. Output using decimal formatter amd printf
     * */
    public static void displayTotals(double purchasePrice, double stateTaxRate, double countyTaxRate, double tax, double total) {
        System.out.println("Purchase Details:");
        System.out.printf("Purchase Price: $%.2f%n", purchasePrice);
        System.out.printf("State Tax: $%.2f%n", purchasePrice * stateTaxRate);
        System.out.printf("County Tax: $%.2f%n", purchasePrice * countyTaxRate);
        System.out.printf("Total Tax: $%.2f%n", tax);
        System.out.printf("Total Price: $%.2f%n", total);
    }
}
