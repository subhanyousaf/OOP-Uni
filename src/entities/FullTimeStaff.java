package entities;

import java.util.ArrayList;

public class FullTimeStaff extends Staff{

    private ArrayList<String> availabilityHours = new ArrayList<String>();

    public FullTimeStaff(String name, int age, String email, String phoneNumber, String gender, String address, double salary) {
        super(name, age, email, phoneNumber, gender, address, salary);
    }

    public String getStaffType() {
        return FULL_TIME;
    }

    public void setAvailabilityHours(ArrayList<String> availabilityHours) {
        this.availabilityHours = availabilityHours;
    }

    public ArrayList<String> getAvailabilityHours() {
        return availabilityHours;
    }

}
