package varensi.relasi;
public class ArrayProducts {
    public static void main(String[] args) {

        Product iceCream = new Product("Magnum", 8000.0);
        Product indomie = new Product("Indomie Goreng", 2500.0);
        Product cocaCola = new Product("Coca Cola", 5000.0);
        
        Product[] productz = {iceCream, indomie, cocaCola};
        double totalBayar = 0.0;
        for (Product product : productz) {
           totalBayar += product.getPrice();
        }
        System.out.println("Total Bayar Belanjaan: Rp "+ totalBayar);
    }
    
}
