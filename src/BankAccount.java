public class BankAccount {
    private double amount;
    public BankAccount(double initialAmount) {
        this.amount = initialAmount;
    }

    public double getAmount() {
        return amount;
    }
    public void deposit(double sum) {
        if (sum > 0) {
            amount += sum;
            System.out.println("Депозит на сумму " + sum + " успешно проведен. Новый баланс: " + amount);
        } else {
            System.out.println("Некорректная сумма для депозита.");
        }
    }
    public void withdraw(double sum) throws LimitException {
        if (sum > 0) {
            if (amount >= sum) {
                amount -= sum;
                System.out.println("Снятие средств на сумму " + sum + " успешно проведено. Новый баланс: " + amount);
            } else {
                throw new LimitException("Недостаточно средств на счете.", amount);
            }
        } else {
            System.out.println("Некорректная сумма для снятия.");
        }
    }
}
