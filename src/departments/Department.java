package departments;

import java.util.ArrayList;

public class Department {

    private final int id;
    private final String name;
    private final String location;
    private final String phoneNumber;
    private final String email;

    private final ArrayList<String> workshops = new ArrayList<>();

    public Department(int id, String name, String location, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.email = email;
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

    public void scheduleWorkshop(String workShopName) {
        workshops.add(workShopName);
    }

    public ArrayList<String> getAllWorkshops() {
        return workshops;
    }

    public String toString() {
        return "Department: " + name + "\nLocation: " + location + "\nPhone Number: " + phoneNumber + "\nEmail: " + email + "\n";
    }
}
