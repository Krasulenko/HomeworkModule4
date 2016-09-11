package module4;

public class ChinaBank extends Bank{
    @Override
    public int getLimitOfWithdrawal() {
        int limitOfWithdrawal;
        if (getCurrency() == Currency.USD) limitOfWithdrawal = 100;
        else limitOfWithdrawal = 150;
        return limitOfWithdrawal;
    }

    @Override
    public int getLimitOfFunding() {
        int limitOfFunding;
        if (getCurrency() == Currency.EUR) limitOfFunding = 5000;
        else limitOfFunding = 10000;
        return limitOfFunding;
    }

    @Override
    public int getMonthlyRate() {
        int monthlyRate;
        if (getCurrency() == Currency.USD) monthlyRate = 1;
        else monthlyRate = 0;
        return monthlyRate;
    }

    @Override
    public int getCommission(int amount) {
        int commission;
        if (getCurrency() == Currency.USD) {
            if (amount <= 1000) commission = 3;
            else commission = 5;
        }
        else if (amount <= 1000) commission = 10;
        else commission = 11;
        return commission;
    }

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }
}
