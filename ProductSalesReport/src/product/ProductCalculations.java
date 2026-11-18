/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package product;

// Q2.5 - Does calculations: VAT 15%, Commission 5%, Total = Price+VAT+Commission
public class ProductCalculations implements IProductCalculations {

    private double price;

    public ProductCalculations(double price) {
        this.price = price;
    }

    @Override
    public double GetVat() {
        // 15%
        return price * 0.15; 
    }

    @Override
    public double GetCommission() {
        // 5%
        return price * 0.05; 
    }

    @Override
    public double GetTotal() {
        // Price + VAT + Commission
        return price + GetVat() + GetCommission(); 
    }
}
