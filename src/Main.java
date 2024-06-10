import departments.Department;
import departments.FoodDepartment;
import entities.Customer;
import entities.FullTimeStaff;
import entities.PartTimeStaff;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        System.out.println("task 3");

        Customer customer = new Customer("John Doe", 30, "johndoe@gmail.com", "12345678", "Male", "1234 Main St");
        Customer customer2 = new Customer("Jim Doe", 25, "Jimdoe@gmail.com", "12345678", "Non Binary", "1234 Main St");
        FullTimeStaff fullTimeStaff = new FullTimeStaff("Jane Doe", 25, "jane.doe@gmail.com", "87654321", "Female", "5678 Main St", 5000);
        PartTimeStaff partTimeStaff = new PartTimeStaff("Jack Doe", 35, "jack.doe@gmail.com", "87654321", "Custom", "5678 Main St", 2500);
        Department department = new Department("Clothing", "Idk", "123455667", "clothing@maximus.com");
        department.addStaff(fullTimeStaff);
        department.addStaff(partTimeStaff);
        department.scheduleWorkshop("How to sew!");

        department.getStaffList().forEach(staff -> System.out.println("Staff name: " + staff.getName()));
        department.getAllWorkshops().forEach(workshop -> System.out.println("Workshop name: " + workshop));

        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.UK);

        System.out.println("Our first customer is = " + customer.getName());
        System.out.println("Our first full time staff is = " + fullTimeStaff.getName());
        System.out.println("Our first part time staff is = " + partTimeStaff.getName());

        System.out.println("The salary of " + fullTimeStaff.getName() + " is = " + nf.format(fullTimeStaff.getSalary()) + " and the staff type is = " + fullTimeStaff.getStaffType());
        System.out.println("The salary of " + partTimeStaff.getName() + " is = " + nf.format(partTimeStaff.getSalary()) + " and the staff type is = " + partTimeStaff.getStaffType());

        System.out.println(department);

        FoodDepartment foodDepartment = new FoodDepartment("Food", "Idk", "123455667", "food@maximus.com");
        foodDepartment.registerForBootCamp(customer);
        foodDepartment.registerForBootCamp(customer2);
        foodDepartment.getAllBootcampRegistrations().forEach(c -> System.out.println("This customer is registered for bootcamp -> " + c.getName()));
    }

}