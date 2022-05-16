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

            if (operationId == Trader.OPERATION_START_DAY) {
                traderManager.startDay();
            }

            boolean isProcessBlocked = traderManager.isOperationNotProcessable() && Trader.isOperationRestricted(operationId);

            if (Trader.isOperationRestricted(operationId)) {
                if(isProcessBlocked) {
                    System.out.println("Трябва да си отворите деня, за да изберете тази операция");
                    continue;
                }
            }

            if (operationId == Trader.OPERATION_BUY) {
                traderManager.buy(10);
            }

            if (operationId == Trader.OPERATION_SELL) {
                traderManager.sell(15);;
            }

            if (operationId == Trader.OPERATION_REPORT) {
                double result = traderManager.getAccountAmount();
                Terminal.output("=================");
                Terminal.output(result);
                Terminal.output("=================");
            }
        }
    }
}

