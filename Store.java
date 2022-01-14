public class Store {

    // Instance fields
    String productType;

    // Constructor method

    public Store(String product) {
        productType = product;

    }

    // advertise method

    public void advertise() {
        System.out.println("Selling " + productType + "!");
        System.out.println("Come spend some money!");

    }

    // main method
    public static void main(String[] args) {

        String drink = "Lemonade";

        Store lemonadeStand = new Store(drink);
        lemonadeStand.advertise();
        lemonadeStand.advertise();
        lemonadeStand.advertise();

    }

}