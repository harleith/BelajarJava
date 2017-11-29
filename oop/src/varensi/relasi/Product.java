package varensi.relasi;
public class Product {

    /**
     * @return the variantProduct
     */
    public String getVariantProduct() {
        return variantProduct;
    }

    /**
     * @param variantProduct the variantProduct to set
     */
    public void setVariantProduct(String variantProduct) {
        this.variantProduct = variantProduct;
    }
        private String nama;
        private double price;
        private String variantProduct;
        
    public Product() {
    }

    public Product(String nama, double price) {
        this.nama = nama;
        this.price = price;
    }

    
        
        
    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
        
}
