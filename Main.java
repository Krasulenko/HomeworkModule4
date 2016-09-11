package module4;

public class Main {
    public static void main(String[] args) {
        Bank usBank = new USBank(11234, "USA", Currency.USD, 345, 2750, 5, 300000);
        Bank euBank = new EUBank(23487, "Germany", Currency.EUR, 540, 2400, 3, 250000);
        Bank chinaBank = new ChinaBank(43987, "China", Currency.EUR, 720, 1400, 7, 800000);

        User user1 = new User(2345, "John", 5000, 34, "Oracle", 2500, usBank);
        User user2 = new User(3456, "Jack", 8000, 44, "IBM", 3000, usBank);

        User user3 = new User(2534, "Emma", 6000, 14, "Siemens", 2300, euBank);
        User user4 = new User(5324, "Michael", 10000, 54, "Bosch", 3100, euBank);

        User user5 = new User(3425, "Li", 4000, 24, "Lenovo", 1800, chinaBank);
        User user6 = new User(4235, "Si", 7000, 64, "Meizu", 1300, chinaBank);

        BankSystem bankSystem = new BankSystemImpl();

        System.out.println(user1);
        bankSystem.withdrawOfUser(user1, 900);
        System.out.println("Balance of " + user1.getName() + " after withdrawal " + user1.getBalance());
        bankSystem.fundUser(user1,500);
        System.out.println("Balance of " + user1.getName() + " after funding " + user1.getBalance());
        bankSystem.paySalary(user1);
        System.out.println("Balance of " + user1.getName() + " after receiving sallary " + user1.getBalance());
        System.out.println(user2);
        bankSystem.transferMoney(user1, user2, 500);
        System.out.println("Balance of " + user1.getName() + " after transfer of money " + user1.getBalance());
        System.out.println("Balance of " + user2.getName() + " after transfer of money " + user2.getBalance());

        System.out.println();

        System.out.println(user2);
        bankSystem.withdrawOfUser(user2, 600);
        System.out.println("Balance of " + user2.getName() + " after withdrawal " + user2.getBalance());
        bankSystem.fundUser(user2,300);
        System.out.println("Balance of " + user2.getName() + " after funding " + user2.getBalance());
        bankSystem.paySalary(user2);
        System.out.println("Balance of " + user2.getName() + " after receiving sallary " + user2.getBalance());
        System.out.println(user3);
        bankSystem.transferMoney(user2, user3, 200);
        System.out.println("Balance of " + user2.getName() + " after transfer of money " + user2.getBalance());
        System.out.println("Balance of " + user3.getName() + " after transfer of money " + user3.getBalance());

        System.out.println();

        System.out.println(user3);
        bankSystem.withdrawOfUser(user3, 700);
        System.out.println("Balance of " + user3.getName() + " after withdrawal " + user3.getBalance());
        bankSystem.fundUser(user3,800);
        System.out.println("Balance of " + user3.getName() + " after funding " + user3.getBalance());
        bankSystem.paySalary(user3);
        System.out.println("Balance of " + user3.getName() + " after receiving sallary " + user3.getBalance());
        System.out.println(user4);
        bankSystem.transferMoney(user3, user4, 100);
        System.out.println("Balance of " + user3.getName() + " after transfer of money " + user3.getBalance());
        System.out.println("Balance of " + user4.getName() + " after transfer of money " + user4.getBalance());

        System.out.println();

        System.out.println(user4);
        bankSystem.withdrawOfUser(user4, 800);
        System.out.println("Balance of " + user4.getName() + " after withdrawal " + user4.getBalance());
        bankSystem.fundUser(user4,650);
        System.out.println("Balance of " + user4.getName() + " after funding " + user4.getBalance());
        bankSystem.paySalary(user4);
        System.out.println("Balance of " + user4.getName() + " after receiving sallary " + user4.getBalance());
        System.out.println(user5);
        bankSystem.transferMoney(user4, user5, 150);
        System.out.println("Balance of " + user4.getName() + " after transfer of money " + user4.getBalance());
        System.out.println("Balance of " + user5.getName() + " after transfer of money " + user5.getBalance());

        System.out.println();

        System.out.println(user5);
        bankSystem.withdrawOfUser(user5, 50);
        System.out.println("Balance of " + user5.getName() + " after withdrawal " + user5.getBalance());
        bankSystem.fundUser(user5,1000);
        System.out.println("Balance of " + user5.getName() + " after funding " + user5.getBalance());
        bankSystem.paySalary(user5);
        System.out.println("Balance of " + user5.getName() + " after receiving sallary " + user5.getBalance());
        System.out.println(user6);
        bankSystem.transferMoney(user5, user6, 100);
        System.out.println("Balance of " + user5.getName() + " after transfer of money " + user5.getBalance());
        System.out.println("Balance of " + user6.getName() + " after transfer of money " + user6.getBalance());

        System.out.println();

        System.out.println(user6);
        bankSystem.withdrawOfUser(user6, 25);
        System.out.println("Balance of " + user6.getName() + " after withdrawal " + user6.getBalance());
        bankSystem.fundUser(user6,400);
        System.out.println("Balance of " + user6.getName() + " after funding " + user6.getBalance());
        bankSystem.paySalary(user6);
        System.out.println("Balance of " + user6.getName() + " after receiving sallary " + user6.getBalance());
        System.out.println(user1);
        bankSystem.transferMoney(user6, user1, 125);
        System.out.println("Balance of " + user6.getName() + " after transfer of money " + user6.getBalance());
        System.out.println("Balance of " + user1.getName() + " after transfer of money " + user1.getBalance());
    }
}
