package by.itacademy.padaliak;

public class Product {
    private String name;
    private int price;

    public void setName(String newName) {
        name = newName;
    }

    public void setPrice(int newPrice) {
        price = newPrice;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    /*
    public String toString(){
    return "Product { name : \"" + getName() + "\", price : \"" +  getPrice() + "\" }";
    }
    */

    public String toString() {
        return String.format("User { name : %s, price : %s}", getName(), getPrice());
    }
}
