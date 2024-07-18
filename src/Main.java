import departments.Departments;
import departments.FoodDepartment;
import entities.Customer;
import entities.FullTimeStaff;
import entities.PartTimeStaff;
import misc.PersonalShoppingAppointment;
import misc.TimeSlot;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* Registering all the departments */
        Departments.init();
        FoodDepartment department = (FoodDepartment) Departments.getDepartment(Departments.FOOD);

        if(department == null) {
           throw new RuntimeException("Food Department not found");
        }

        Customer newCustomer = new Customer("John Irkle", 25, "john.irkle@gmail.com", "1234567890", "Male", "123 Main St, Springfield, IL 62701");
        double feeForNewCustomer = department.calculateBootCampFees(newCustomer, true, true);
        System.out.println("Fee for new customer (" + newCustomer.getName() + "): $" + feeForNewCustomer);

        Customer existingCustomer = new Customer("Angela Fernandoz", 19, "angela.f@gmail.com", "098765432", "Female", "456 Elm St, Springfield, IL 62701");
        double feeForExistingCustomer = department.calculateBootCampFees(existingCustomer, false, true);
        System.out.println("Fee for existing customer (" + existingCustomer.getName() + "): $" + feeForExistingCustomer);
    }
}