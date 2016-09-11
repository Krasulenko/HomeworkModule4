package module4;

public class BankSystemImpl implements BankSystem{
    @Override
    public void withdrawOfUser(User user, int amount) {
        Bank userBank = user.getBank();

        double commission = userBank.getCommission(amount) / 100;
        if (userBank.getLimitOfWithdrawal() >= amount + amount * commission){
            double newBalance = user.getBalance() - amount - amount * commission;
            user.setBalance(newBalance);
        }
        else System.out.println("Out of limit");

    }

    @Override
    public void fundUser(User user, int amount) {
        Bank userBank = user.getBank();

        if (userBank.getLimitOfFunding() <= amount){
            double newBalance = user.getBalance() + amount;
            user.setBalance(newBalance);
        }
        else System.out.println("Out of limit");
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        Bank fromUserBank = fromUser.getBank();
        Bank toUserBank = toUser.getBank();

        double commission = fromUserBank.getCommission(amount) / 100;
        if (fromUserBank.getLimitOfWithdrawal() >= amount + amount * commission){
            if (toUserBank.getLimitOfFunding() <= amount){
                double fromUserNewBalance = fromUser.getBalance() - amount - amount * commission;
                double toUserNewBalance = toUser.getBalance() + amount;
                fromUser.setBalance(fromUserNewBalance);
                toUser.setBalance(toUserNewBalance);

            }
            else System.out.println("Out of funding limit");


        }
        else System.out.println("Out of withdrawal limit");



    }

    @Override
    public void paySalary(User user, int amount) {
        Bank userBank = user.getBank();

        double commission = userBank.getCommission(amount) / 100;
        user.setBalance(user.getBalance() + amount - amount * commission);

    }
}
