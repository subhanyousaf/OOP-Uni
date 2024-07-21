import java.util.ArrayList;

public class Customer extends Person {
    private final ArrayList<BootCamp> registeredBootCamps;

    public Customer(String name, int age, String email, String phoneNumber, String gender, String address) {
        super(name, age, email, phoneNumber, gender, address);
        this.registeredBootCamps = new ArrayList<>();
    }

    public void registerBootCamp(BootCamp bootCamp) {
        registeredBootCamps.add(bootCamp);
    }

    public ArrayList<BootCamp> getRegisteredBootCamps() {
        return registeredBootCamps;
    }

    @Override
    public String toString() {
        return "--- Customer Details ---\n" +
                "Name: " + getName() + "\n" +
                "Age: " + getAge() + "\n" +
                "Email: " + getEmail() + "\n" +
                "Phone Number: " + getPhoneNumber() + "\n" +
                "Gender: " + getGender() + "\n" +
                "Address: " + getAddress() + "\n";
    }
}
