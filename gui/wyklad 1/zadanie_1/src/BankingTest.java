public class BankingTest {
    public static void main(String[] args) {
    
        Person janP = new Person("Jan"),
        alaP = new Person("Ala");
        BankCustomer jan = new BankCustomer(janP);
        BankCustomer ala = new BankCustomer(alaP);
    
        jan.getAccount().deposit(1000);
        ala.getAccount().deposit(2000);
        jan.getAccount().transfer(ala.getAccount(), 500);
        ala.getAccount().withdraw(1000);
    
        System.out.println(jan);
        System.out.println(ala);
    
        Account.setInterestRate(4.5);
        jan.getAccount().addInterest();
        ala.getAccount().addInterest();
    
        System.out.println(jan);
        System.out.println(ala);
        }
    }

/* oczekiwany wynik
Klient: Jan stan konta 500.0
Klient: Ala stan konta 1500.0
Klient: Jan stan konta 522.5
Klient: Ala stan konta 1567.5
*/