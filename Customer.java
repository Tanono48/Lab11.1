/*
 * IG : i_am_bnkt
 */

/**
 *
 * @author BNKT
 */
public class Customer {

    private String firstName;
    private String lastName;
    private CheckingAccount acct;

    public Customer() {
        this("", "", null);
    }

    public Customer(String firstName, String lastName) {
        this(firstName, lastName, null);
    }

    public Customer(String firstName, String lastName, CheckingAccount acct) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = acct;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAcct(CheckingAccount acct) {
        this.acct = acct;
    }

    public CheckingAccount getAcct() {
        return acct;
    }

    public CheckingAccount getAcct(CheckingAccount acct) {
        return acct;
    }

    public String toString() {
        if (acct == null) {
            return this.firstName + this.lastName + " doesn’t have account.";
        } else {
            return "The " + this.firstName + "  account has " + acct.getBalance() + " baht and " + acct.getCredit() + " credits.";
        }
    }

    public boolean equals(Customer c) {
        return (c.firstName.equals(this.firstName)) && (c.lastName.equals(this.lastName));
    }
}