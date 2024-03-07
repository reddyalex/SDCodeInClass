/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu5;

import java.util.Comparator;

/**
 *
 * @author Reddy
 */
public class CompareTireFileBeda implements Comparator<Tire> {
    @Override
        public int compare(Tire o1, Tire o2) {
            double keyO1 = o1.price / o1.warranty;
            double keyO2 = o2.price / o2.warranty;
            if (keyO1 < keyO2){
                return -1;
            }
            else{
                return 1;
            }                
        }
}
