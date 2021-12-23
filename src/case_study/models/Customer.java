package case_study.models;

public class Customer extends Person {
    private String type;
    private String address;

    public Customer() {
    }

    public Customer(String type, String address) {
        this.type = type;
        this.address = address;
    }

    public Customer(int id, String name, String dateOfBirth, String sex, int idCard, int numberPhone, String email, String type, String address) {
        super(id, name, dateOfBirth, sex, idCard, numberPhone, email);
        this.type = type;
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +super.toString()+
                "type='" + type + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
