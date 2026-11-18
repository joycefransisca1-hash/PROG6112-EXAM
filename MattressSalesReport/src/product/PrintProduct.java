/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package product;

// Q1.3 - Only job is printing, not calculating (good design)
public class PrintProduct {

    // Print total
    public void PrintTotalProductSales(Product product) {
        System.out.println("TOTAL PRODUCT SALES: " + product.GetTotalProductSold());
    }

    // Print average - cast to int to match screenshot 17
    public void PrintAverageProductSales(Product product) {
        System.out.println("AVERAGE PRODUCT SALES: " + (int)product.GetAverageProductSold());
    }

    // Print most popular
    public void PrintMostPopularProduct(Product product) {
        System.out.println("MOST POPULAR PRODUCT: " + product.GetMostPopularProduct());
    }

    // Print full report
    public void PrintFullReport(Product product) {
        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("\n******************************************");
        PrintTotalProductSales(product);
        PrintAverageProductSales(product);
        PrintMostPopularProduct(product);
    }
}
