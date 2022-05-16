import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Trader traderManager = new Trader();

        while (true) {

            Terminal.output("Търговски операции");
            Terminal.output("1. Стартиране на деня");
            Terminal.output("2. Покупка");
            Terminal.output("3. Продажба");
            Terminal.output("4. Справки");
            Terminal.output("5. Приключване на деня ");

            int operationId = Terminal.input();

            if (operationId == 2) {
                traderManager.buy(10);
            }

            if (operationId == 3) {
                traderManager.sell(15);;
            }

            if (operationId == 4) {
                double result = traderManager.getAccountAmount();
                Terminal.output(result);
            }
        }
    }
}

