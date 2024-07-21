import java.util.ArrayList;

public abstract class BootCamp {
    private String name;
    private int durationWeeks;
    private double fee;
    private final ArrayList<Customer> registeredCustomers;

    public BootCamp(String name, int durationWeeks, double fee) {
        this.name = name;
        this.durationWeeks = durationWeeks;
        this.fee = fee;
        this.registeredCustomers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurationWeeks() {
        return durationWeeks;
    }

    public void setDurationWeeks(int durationWeeks) {
        this.durationWeeks = durationWeeks;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public ArrayList<Customer> getRegisteredCustomers() {
        return registeredCustomers;
    }

    public void registerCustomer(Customer customer) {
        registeredCustomers.add(customer);
    }

    public abstract double getDiscountedPrice(boolean newCustomer, boolean enrollFullTime);
}
