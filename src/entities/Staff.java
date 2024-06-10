package entities;

public abstract class Staff extends Person {

    private double salary;

    public static final String PART_TIME = "Part-Time";
    public static final String FULL_TIME = "Full-Time";

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

    public abstract String getStaffType();

}
