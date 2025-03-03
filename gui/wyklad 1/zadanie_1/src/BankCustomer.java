public class BankCustomer {

   private Account account = new Account();
   private Person person;

    BankCustomer(Person osoba)
    {
        person=osoba;
    }
    public Account getAccount() {
        return account;
    }

    @Override
    public String toString() {
        
        return "Klient: "+ person.imie + " stan konta " + account.getBallance();
    }
}