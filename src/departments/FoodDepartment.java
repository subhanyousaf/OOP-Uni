package departments;

import entities.Customer;
import interfaces.Bootcamp;

import java.util.ArrayList;

public class FoodDepartment extends Department implements Bootcamp {

    private final ArrayList<Customer> bootCampParticipants = new ArrayList<>();

    public FoodDepartment(String name, String location, String phoneNumber, String email) {
        super(name, location, phoneNumber, email);
    }

    @Override
    public void registerForBootCamp(Customer customer) {
        bootCampParticipants.add(customer);
    }

    @Override
    public void unregisterFromBootCamp(Customer customer) {
        bootCampParticipants.remove(customer);
    }

    @Override
    public ArrayList<Customer> getAllBootcampRegistrations() {
        return bootCampParticipants;
    }
}
