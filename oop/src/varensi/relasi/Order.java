package varensi.relasi;
public class Order {
        private Product product;
        private int quantity;
        private String total;
        private double discount;
        private final double PPN = 0.1;
        

        public double calculateTotal() {
            double hargaSatuan = getProduct().getPrice();
            double total = hargaSatuan * this.quantity; 
            return total;
        }
        
        public double diskonCalculate(){
            double diskon = getDiscount();
            double total1 = calculateTotal() * diskon;
            return total1;
        }
        
        public double ppnCalculate(){
            double allTotal = hargaSetelahDiskon() * PPN;
            return allTotal;
        }
        
        public double allCalculate(){
            double AllCalculate = hargaSetelahDiskon() + ppnCalculate();
            return AllCalculate;
        }
       
        public double hargaSetelahDiskon(){
            double hSD = calculateTotal() - diskonCalculate();
            return hSD;
        }
        
        
        
    public Order() {
    }

    public Order(Product product, int quantity, String total, double discount) {
        this.product = product;
        this.quantity = quantity;
        this.total = total;
        this.discount = discount;
    }
        
        
    /**
     * @return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * @return the discount
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the total
     */
    public String getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(String total) {
        this.total = total;
    }


        
}
