package module4;

public class EUBank extends Bank{
    @Override
    public int getLimitOfWithdrawal() {
        int limitOfWithdrawal;
        if (getCurrency() == Currency.USD) limitOfWithdrawal = 2000;
        else limitOfWithdrawal = 2200;
        return limitOfWithdrawal;
    }

    @Override
    public int getLimitOfFunding() {
        int limitOfFunding;
        if (getCurrency() == Currency.EUR) limitOfFunding = 2000;
        else limitOfFunding = 10000;
        return limitOfFunding;
    }

    @Override
    public int getMonthlyRate() {
        int monthlyRate;
        if (getCurrency() == Currency.USD) monthlyRate = 0;
        else monthlyRate = 1;
        return monthlyRate;
    }

    @Override
    public int getCommission(int amount) {
        int commission;
        if (getCurrency() == Currency.USD) {
            if (amount <= 1000) commission = 5;
            else commission = 7;
        }
        else if (amount <= 1000) commission = 2;
        else commission = 4;
        return commission;
    }

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }
}
