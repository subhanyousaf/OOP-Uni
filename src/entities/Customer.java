package entities;

public class Customer extends Person {

    public Customer(String name, int age, String email, String phoneNumber, String gender, String address) {
        super(name, age, email, phoneNumber, gender, address);
    }

    // TODO: Bootcamp stuff

    @Override
    public String toString() {
        return "Customer: \n" +
                "Name: " + getName() + "\n" +
                "Age: " + getAge() + "\n" +
                "Email: " + getEmail() + "\n" +
                "Phone Number: " + getPhoneNumber() + "\n" +
                "Gender: " + getGender() + "\n" +
                "Address: " + getAddress() + "\n";
    }
}
