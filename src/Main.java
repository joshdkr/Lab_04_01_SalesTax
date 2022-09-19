public class Main {
    public static void main(String[] args) {

        double purchasePrice = 25.50;
        double salesTax = 0.05;

        System.out.println("The total price of an item costing $" + purchasePrice + " with " + salesTax + " sales tax is $" + ((purchasePrice * salesTax) + purchasePrice));
    }
}