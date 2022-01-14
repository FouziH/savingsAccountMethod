public class Store {

    // Instance fields
    String productType;
    double price;

    // Constructor method

    public Store(String product, double initialPrice) {
        productType = product;
        price = initialPrice;

    }

    //increase price method

    public void increasePrice(double priceToAdd) {
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    // advertise method

    public void advertise() {
        System.out.println("Selling " + productType + "!");
        System.out.println("Come spend some money!");

    }

    public void greetCustomer (String customer) {
        System.out.println("Welcome to the store, " + customer + "!");
    }

    // main method
    public static void main(String[] args) {

        String drink = "Lemonade";

        Store lemonadeStand = new Store(drink, 3.75);
        lemonadeStand.advertise();
        lemonadeStand.greetCustomer("Hamza");
        lemonadeStand.increasePrice(1.5);
        System.out.println(lemonadeStand.price);


    }

}