/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package product;

import java.util.Scanner;

//  Collects user input using Scanner
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1D array product names - from paper
        String[] products = {
            "Cozy Nights Monarch mattress",
            "Restonic Barbados mattress",
            "Sealy Phuket mattress"
        };

        // 2D array
        int[][] sales = new int[3][3];

        // Ask user for sales for each product each month
        for (int i = 0; i < products.length; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter number of sales for month " + (j+1) + " for " + products[i] + ": ");
                sales[i][j] = sc.nextInt();
            }
        }

        // Create objects and print report
        Product myProduct = new Product(products, sales);
        PrintProduct printer = new PrintProduct();
        printer.PrintFullReport(myProduct);

        sc.close();
    }
}
