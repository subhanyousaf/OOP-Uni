import java.util.ArrayList;

public class Department {

    private final int id;
    private final String name;
    private final String location;
    private final String phoneNumber;
    private final String email;
    private final Workshop workshop;

    private final ArrayList<BootCamp> bootCamps = new ArrayList<>();

    public Department(int id, String name, String location, String phoneNumber, String email, Workshop workshop) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.workshop = workshop;
    }

    public Department(int id, String name, String location, String phoneNumber, String email) {
        this(id, name, location, phoneNumber, email, null);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public Workshop getWorkshop() {
        return workshop;
    }

    public void addBootCamp(BootCamp bootCamp) {
        bootCamps.add(bootCamp);
    }

    public ArrayList<BootCamp> getBootCamps() {
        return bootCamps;
    }

    public void registerCustomerForBootCamp(Customer customer, BootCamp bootCamp) {
        bootCamp.registerCustomer(customer);
        customer.registerBootCamp(bootCamp);
    }

    @Override
    public String toString() {
        return "--- Department Details ---" + name + "\nLocation: " + location + "\nPhone Number: " + phoneNumber + "\nEmail: " + email + "\n";
    }
}