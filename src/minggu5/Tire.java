/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu5;

/**
 *
 * @author Reddy
 */
public class Tire {
    
    public String brand;
    public double price;
    public double warranty;

    public Tire(String Brand, double price, double warranty) {
        this.brand = Brand;
        this.price = price;
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return "Tire[Brand="+ brand +", Price=" + price+", Warranty="+warranty+"]";
        
    }

    
    
}
