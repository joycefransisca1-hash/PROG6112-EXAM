/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package product;

// Q1.1 + Q1.2 - Main class that holds data and does calculations
// Uses 1D array for names and 2D array for sales
public class Product implements IProduct {

     // 1D array
    private String[] productNames;
    
    // 2D array [product][month]
    private int[][] salesData;     

    // Constructor to receive data from Main
    public Product(String[] productNames, int[][] salesData) {
        this.productNames = productNames;
        this.salesData = salesData;
    }

    // Q1.2 - Total: sum everything in 2D array
    @Override
    public int GetTotalProductSold() {
        int total = 0;
        for (int i = 0; i < salesData.length; i++) { // products
            for (int j = 0; j < salesData[i].length; j++) { // months
                total += salesData[i][j];
            }
        }
        return total;
    }

    // Q1.2 - Average: total divided by number of entries (3x3=9)
    @Override
    public double GetAverageProductSold() {
        int total = GetTotalProductSold();
        int count = salesData.length * salesData[0].length;
        return (double) total / count;
    }

    // Q1.2 - Most Popular: sum each product row and find max
    @Override
    public String GetMostPopularProduct() {
        int maxSales = 0;
        String popular = "";
        for (int i = 0; i < salesData.length; i++) {
            int rowTotal = 0;
            for (int j = 0; j < salesData[i].length; j++) {
                rowTotal += salesData[i][j];
            }
            if (rowTotal > maxSales) {
                maxSales = rowTotal;
                popular = productNames[i];
            }
        }
        return popular + "(" + maxSales + ")"; // format like screenshot
    }
}