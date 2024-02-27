package by.itacademy.padaliak;

public class Main26 {
    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product();
        product1.setName("Tea");
        product1.setPrice(34);
        product2.setName("Bread");
        product2.setPrice(20);
        System.out.println(product1.getName());
        System.out.println(product1.getPrice());
        System.out.println(product2.getName());
        System.out.println(product2.getPrice());
        System.out.println(product1);
    }

}
