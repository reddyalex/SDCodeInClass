/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Reddy
 */
public class BelajarStack {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in);
        
        Stack<String> stackString = new Stack<>();
        String inp = sc.nextLine();
        Stack<Integer> lokasiKurungBuka = new Stack<>();
        
        for (int i=0; i < inp.length();i++){
            
            if(inp.charAt(i) == '('){
                lokasiKurungBuka.push(i);                
            }
            if (inp.charAt(i) == ')'){
                int posawal = lokasiKurungBuka.pop();
                String subExpression = inp.substring(posawal, i+1);
                System.out.println(subExpression);
            }
        }
    }
}
