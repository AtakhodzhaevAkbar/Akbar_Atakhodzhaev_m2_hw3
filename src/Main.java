public class Main {

    public static void main(String[] args) {
        BankAccount clientAccount = new BankAccount(15000);
        while (true) {
            try {
                clientAccount.withdraw(6000);
            } catch (LimitException e) {
                System.out.println("Не удалось снять 6000 сом. Снято: " + (6000 - e.getRemainingAmount()) + " сом.");
                break;
            }
        }
        System.out.println("Текущий остаток на счете: " + clientAccount.getAmount());
    }
}