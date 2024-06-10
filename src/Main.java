import departments.Departments;
import entities.Customer;
import entities.FullTimeStaff;
import entities.PartTimeStaff;
import entities.Staff;
import misc.PersonalShoppingAppointment;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* Registering all the departments */
        Departments.init();

        /* Adding department staff */
        FullTimeStaff[] fullTimeStaff = {
                new FullTimeStaff("Jane Smith", 30, "janesmith@maximus.com", "+1 123 456 752", "Female", "456 Street, New York", 650),
                new FullTimeStaff("Michael Johnson", 35, "michaeljohnson@maximus.com", "+1 123 456 753", "Male", "789 Road, New York", 700),
                new FullTimeStaff("Emily Davis", 28, "emilydavis@maximus.com", "+1 123 456 754", "Female", "101 Lane, New York", 620),
                new FullTimeStaff("David Wilson", 32, "davidwilson@maximus.com", "+1 123 456 755", "Male", "202 Boulevard, New York", 670)
        };

        // example data, TODO: replace with actual slot system
        ArrayList<String> hours = new ArrayList<>();
        hours.add("10:00 AM - 10:30 AM");
        hours.add("10:30 AM - 11:00 AM");
        hours.add("11:00 AM - 11:30 AM");
        hours.add("11:30 AM - 12:00 PM");

        for (FullTimeStaff staff : fullTimeStaff) {
            staff.setAvailabilityHours(hours);
            Departments.addStaff(staff);
        }

        // Create an array of PartTimeStaff
        PartTimeStaff[] partTimeStaff = {
                new PartTimeStaff("Sarah Brown", 22, "sarahbrown@maximus.com", "+1 123 456 761", "Female", "321 Alley, New York", 300),
                new PartTimeStaff("Chris Green", 26, "chrisgreen@maximus.com", "+1 123 456 762", "Male", "654 Street, New York", 320),
                new PartTimeStaff("Anna White", 24, "annawhite@maximus.com", "+1 123 456 763", "Female", "987 Lane, New York", 310),
                new PartTimeStaff("Tom Black", 29, "tomblack@maximus.com", "+1 123 456 764", "Male", "121 Road, New York", 330),
                new PartTimeStaff("Lisa Blue", 27, "lisablue@maximus.com", "+1 123 456 765", "Female", "232 Avenue, New York", 300),
                new PartTimeStaff("James Grey", 30, "jamesgrey@maximus.com", "+1 123 456 766", "Male", "343 Boulevard, New York", 320),
                new PartTimeStaff("Emily Rose", 23, "emilyrose@maximus.com", "+1 123 456 767", "Female", "454 Street, New York", 310),
                new PartTimeStaff("Mark Orange", 28, "markorange@maximus.com", "+1 123 456 768", "Male", "565 Lane, New York", 330),
                new PartTimeStaff("Sophia Pink", 25, "sophiapink@maximus.com", "+1 123 456 769", "Female", "676 Road, New York", 300),
                new PartTimeStaff("David Purple", 31, "davidpurple@maximus.com", "+1 123 456 770", "Male", "787 Avenue, New York", 320)
        };
        for (PartTimeStaff staff : partTimeStaff) {
            Departments.addStaff(staff);
        }

        /* Example Appointment System */
        Customer customer = new Customer("Jane Doe", 27, "janedoe@gmail.com", "+1 123 456 772", "Female", "222 Elm St, New York");
        FullTimeStaff randomFullTimeStaff = fullTimeStaff[(int) (Math.random() * fullTimeStaff.length)];
        String selectedHour = randomFullTimeStaff.getAvailabilityHours().get((int) (Math.random() * randomFullTimeStaff.getAvailabilityHours().size()));
        PersonalShoppingAppointment appointment = new PersonalShoppingAppointment(customer, randomFullTimeStaff, selectedHour);
        System.out.println(appointment);
    }

}