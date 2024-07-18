package departments;

import entities.Customer;
import interfaces.Bootcamp;

import java.util.ArrayList;

public class FoodDepartment extends Department implements Bootcamp {

    private final ArrayList<Customer> bootCampParticipants = new ArrayList<>();
    private static final double BOOT_CAMP_FEE = 350.0;
    private static final double DISCOUNT_PERCENTAGE = 32.0;

    public FoodDepartment(int id, String name, String location, String phoneNumber, String email) {
        super(id, name, location, phoneNumber, email);
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

    @Override
    public double calculateBootCampFees(Customer customer, boolean isNewCustomer, boolean enrollsInFullTimeBootCamp) {
        double fee = BOOT_CAMP_FEE;
        if (isNewCustomer && enrollsInFullTimeBootCamp) {
            fee -= fee * (DISCOUNT_PERCENTAGE / 100);
        }
        return fee;
    }
}
