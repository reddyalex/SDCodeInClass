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
public class TireWithComparable implements Comparable<TireWithComparable>{

    public String brand;
    public double price;
    public double warranty;

    public TireWithComparable(String Brand, double price, double warranty) {
        this.brand = Brand;
        this.price = price;
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return "TireWithComparable[Brand="+ brand +", Price=" + price+", Warranty="+warranty+"]";
        
    }
    @Override
    public int compareTo(TireWithComparable o) {
        double keyO1 = this.price / this.warranty;
        double keyO2 = o.price / o.warranty;
        if (keyO1 < keyO2){
            return -1;
        }
        else{
            return 1;
        }        
    }
    
}
