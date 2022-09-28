package classeswithattributes;

public class ClassesWithAttributes {

    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus");
        product.setPrice(8000);
        product.setStockAmount(3);
        
        
        ProductManager productManager = new ProductManager();
        productManager.add(product); 

        System.out.println(product.getName());

    }

}
