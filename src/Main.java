public class Main {

    public static void main(String[] args) {
        /* Registering all the departments */
        Departments.init();

        /* Adding Bakery Boot Camp to the Food Department */
        Department foodDepartment = Departments.getDepartment(Departments.FOOD);

        if (foodDepartment == null) {
            throw new RuntimeException("Food Department not found.");
        }

        BakeryBootCamp bakeryBootCamp = new BakeryBootCamp(BakeryBootCamp.BASE_FEE, 4);
        foodDepartment.addBootCamp(bakeryBootCamp);

        /* Sample Customers */
        Customer newCustomer = new Customer("Jane Smith", 30, "janesmith@maximus.com", "+1 123 456 752", Person.GENDER_FEMALE, "456 Street, New York");
        Customer newCustomerWithFullTimeEnrollment = new Customer("Jamie Hornett", 32, "jamiehornett@maximus.com", "+1 324 235 2324", Person.GENDER_MALE, "353 Street, New York");
        Customer existingCustomer = new Customer("Michael Johnson", 35, "michaeljohnson@maximus.com", "+1 123 456 753", Person.GENDER_MALE, "789 Road, New York");

        /* Registering New Customer */
        double bootCampFees = bakeryBootCamp.getDiscountedPrice(true, false);
        foodDepartment.registerCustomerForBootCamp(newCustomer, bakeryBootCamp);
        System.out.println(newCustomer.getName() + " has been registered for the Bakery Boot Camp. The fees are £" + bootCampFees);

        /* Registering New Customer with Full Time Enrollment */
        bootCampFees = bakeryBootCamp.getDiscountedPrice(true, true);
        foodDepartment.registerCustomerForBootCamp(newCustomerWithFullTimeEnrollment, bakeryBootCamp);
        System.out.println(newCustomerWithFullTimeEnrollment.getName() + " has been registered for the Bakery Boot Camp with full time enrollment. The fees are £" + bootCampFees);

        /* Registering Existing Customer */
        bootCampFees = bakeryBootCamp.getDiscountedPrice(false, false);
        foodDepartment.registerCustomerForBootCamp(existingCustomer, bakeryBootCamp);
        System.out.println(existingCustomer.getName() + " has been registered for the Bakery Boot Camp. The fees are £" + bootCampFees);

    }

}