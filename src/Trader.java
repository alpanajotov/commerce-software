public class Trader {

    public int accountAmount = 0;

    public void buy(double price) {
        accountAmount -= price;
    }

    public void sell(double price) {
        accountAmount += price;
    }

    public double getAccountAmount() {
        return accountAmount;
    }
}
