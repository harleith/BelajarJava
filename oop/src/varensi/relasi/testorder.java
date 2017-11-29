/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varensi.relasi;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author user
 */
public class testorder {
    
            
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Product iceCream = new Product("Ice Cream",9000.0);
        Order order = new Order();
        order.setProduct(iceCream);
        order.setQuantity(5);
        double bayar = order.calculateTotal();
        System.out.println("Jumlah bayar "+ bayar);
    
        Product Ciki = new Product ("Ciki",10000.0);
        Order discount = new Order();
        discount.setProduct(Ciki);
        discount.setQuantity(5);
        discount.setDiscount(0.05);
        double bayar1 = discount.calculateTotal();
        double bayar2 = discount.diskonCalculate();
        double bayar3 = discount.hargaSetelahDiskon();
        double bayarPPN = discount.ppnCalculate();
        double bayarSemua = discount.allCalculate();
        System.out.printf("Total: RP %,.2f", bayarSemua);
        
        
    }
    
}
