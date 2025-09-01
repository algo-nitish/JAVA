package SpringBoot;

public class catalogueAbstraction {
    public static abstract class Product {
        protected String name;
        protected double price;

        // Constructor
        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        // Abstract methods
        abstract double calculateDiscount();
        abstract double calculateTax();
        abstract double calculateShippingCost();
    }

    public  static class  Electronics extends Product {

        public Electronics(String name, double price) {
            super(name, price);
        }

        @Override
        double calculateDiscount() {
            return price * 0.1; // example: 10% discount
        }

        @Override
        double calculateTax() {
            return price * 0.18; // example: 18% GST
        }

        @Override
        double calculateShippingCost() {
            return 50.0; // flat shipping rate
        }
    }

   public  static class Clothing extends Product {

    public Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    double calculateDiscount() {
        return price * 0.2; // 20% discount
    }

    @Override
    double calculateTax() {
        return price * 0.10; // 10% tax
    }

    @Override
    double calculateShippingCost() {
        return 20.0; // flat shipping rate
    }
}


public static void main(String[] args) {
    Product Electronics = new Electronics("smartphone", 1000);
    Product Clothing = new Clothing("shirt", 200);
    System.out.println(Electronics.calculateTax());
    System.out.println(Clothing.calculateDiscount());
}
}
