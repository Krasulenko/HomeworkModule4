package module4;

public class USBank extends Bank {
    @Override
    public int getLimitOfWithdrawal() {
        int limitOfWithdrawal;
        if (getCurrency() == Currency.USD) limitOfWithdrawal = 1000;
        else limitOfWithdrawal = 1200;
        return limitOfWithdrawal;
    }

    @Override
    public int getLimitOfFunding() {
        int limitOfFunding;
        if (getCurrency() == Currency.EUR) limitOfFunding = 10000;
        else limitOfFunding = 2000000000;
        return limitOfFunding;
    }

    @Override
    public int getMonthlyRate() {
        int monthlyRate;
        if (getCurrency() == Currency.USD) monthlyRate = 1;
        else monthlyRate = 2;
        return monthlyRate;
    }

    @Override
    public int getCommission(int amount) {
        int commission;
        if (getCurrency() == Currency.USD) {
            if (amount <= 1000) commission = 5;
            else commission = 7;
        }
        else if (amount <= 1000) commission = 6;
             else commission = 8;
        return commission;
    }

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }
}
