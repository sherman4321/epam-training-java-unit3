package Unit3.Customer;

public class Customer {
    private int id;
    private String name;
    private String surname;
    private String middleName;
    private String address;
    private int creditCardNumber;
    private int bankAccountNumber;

    public Customer() {
        this.id = 0;
        this.name = "UNKNOWN";
        this.surname = "UNKNOWN";
        this.middleName = "UNKNOWN";
        this.address = "UNKNOWN";
        this.creditCardNumber = 0;
        this.bankAccountNumber = 0;
    }
    public Customer(int creditCardNumber) {
        this.id = 0;
        this.name = "UNKNOWN";
        this.surname = "UNKNOWN";
        this.middleName = "UNKNOWN";
        this.address = "UNKNOWN";
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = 0;
    }

    public Customer(int id, String name, String surname, String middleName, String address, int creditCardNumber, int bankAccountNumber) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", middleName='" + middleName + '\'' +
                ", adress='" + address + '\'' +
                ", creditCardNumber=" + creditCardNumber +
                ", bankAccountNumber=" + bankAccountNumber +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAdress() {
        return address;
    }

    public void setAdress(String address) {
        this.address = address;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }
}
