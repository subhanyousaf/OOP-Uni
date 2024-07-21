import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public abstract class Staff extends Person {

    private double salary;

    public Staff(String name, int age, String email, String phoneNumber, String gender, String address, double salary) {
        super(name, age, email, phoneNumber, gender, address);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "--- Staff Details ---\n" +
                "Name: " + getName() + "\n" +
                "Age: " + getAge() + "\n" +
                "Email: " + getEmail() + "\n" +
                "Phone Number: " + getPhoneNumber() + "\n" +
                "Gender: " + getGender() + "\n" +
                "Address: " + getAddress() + "\n" +
                "Salary: " + Currency.getInstance(Locale.UK).getSymbol() + NumberFormat.getInstance().format(getSalary()) + "\n";
    }

}
