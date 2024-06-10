package departments;

import entities.Staff;

import java.util.ArrayList;

public class Department {

    private final String name;
    private final String location;
    private final String phoneNumber;
    private final String email;

    private final ArrayList<Staff> staffList = new ArrayList<>();
    private final ArrayList<String> workshops = new ArrayList<>();

    public Department(String name, String location, String phoneNumber, String email) {
        this.name = name;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.email = email;
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

    public void addStaff(Staff staff) {
        staffList.add(staff);
    }

    public void removeStaff(Staff staff) {
        staffList.remove(staff);
    }

    public ArrayList<Staff> getStaffList() {
        return staffList;
    }

    public String toString() {
        return "Department: " + name + "\nLocation: " + location + "\nPhone Number: " + phoneNumber + "\nEmail: " + email + "\n";
    }

    public void scheduleWorkshop(String workShopName) {
        workshops.add(workShopName);
    }

    public ArrayList<String> getAllWorkshops() {
        return workshops;
    }
}
