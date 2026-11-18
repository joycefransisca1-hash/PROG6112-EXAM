/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package product;

// Q1.2 - This interface forces Product class to have these 3 methods
public interface IProduct {
    // total all sales
    int GetTotalProductSold();   
     // average
    double GetAverageProductSold();  
     // most popular name
    String GetMostPopularProduct();  
}
