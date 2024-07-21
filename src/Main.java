import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* Registering all the departments */
        Departments.init();

        /* Adding department staff */
        ArrayList<FullTimeStaff> fullTimeStaff = new ArrayList<>();
        fullTimeStaff.add(new FullTimeStaff("Jane Smith", 30, "janesmith@maximus.com", "+1 123 456 752", Person.GENDER_FEMALE, "456 Street, New York", 650));
        fullTimeStaff.add(new FullTimeStaff("Michael Johnson", 35, "michaeljohnson@maximus.com", "+1 123 456 753", Person.GENDER_MALE, "789 Road, New York", 700));
        fullTimeStaff.add(new FullTimeStaff("Emily Davis", 28, "emilydavis@maximus.com", "+1 123 456 754", Person.GENDER_FEMALE, "101 Lane, New York", 620));
        fullTimeStaff.add(new FullTimeStaff("David Wilson", 32, "davidwilson@maximus.com", "+1 123 456 755", Person.GENDER_MALE, "202 Boulevard, New York", 670));
        fullTimeStaff.add(new FullTimeStaff("Sophia Brown", 29, "sophiabrown@maximus.com", "+1 123 456 756", Person.GENDER_FEMALE, "303 Avenue, New York", 680));
        fullTimeStaff.add(new FullTimeStaff("James Taylor", 38, "jamestaylor@maximus.com", "+1 123 456 757", Person.GENDER_MALE, "404 Street, New York", 720));
        fullTimeStaff.add(new FullTimeStaff("Olivia Martinez", 31, "oliviamartinez@maximus.com", "+1 123 456 758", Person.GENDER_FEMALE, "505 Lane, New York", 660));
        fullTimeStaff.add(new FullTimeStaff("John Anderson", 40, "johnanderson@maximus.com", "+1 123 456 759", Person.GENDER_MALE, "606 Boulevard, New York", 730));

        /* Settings availability hours for full-time staff & adding them to the departments */
        TimeSlot[] timeSlots = {
                new TimeSlot("12:00 PM", "12:30 PM"),
                new TimeSlot("12:30 PM", "1:00 PM"),
                new TimeSlot("1:00 PM", "1:30 PM"),
                new TimeSlot("1:30 PM", "2:00 PM"),
                new TimeSlot("2:00 PM", "2:30 PM"),
                new TimeSlot("2:30 PM", "3:00 PM"),
                new TimeSlot("3:00 PM", "3:30 PM"),
                new TimeSlot("3:30 PM", "4:00 PM")
        };
        for (int i = 0; i < fullTimeStaff.size(); i++) {
            FullTimeStaff staff = fullTimeStaff.get(i);
            staff.setAvailabilityHour(timeSlots[i]);
            Departments.addStaff(staff);
        }

        // Create an array of PartTimeStaff
        ArrayList<PartTimeStaff> partTimeStaff = new ArrayList<>();
        partTimeStaff.add(new PartTimeStaff("Sarah Brown", 22, "sarahbrown@maximus.com", "+1 123 456 761", Person.GENDER_FEMALE, "321 Alley, New York", 300));
        partTimeStaff.add(new PartTimeStaff("Chris Green", 26, "chrisgreen@maximus.com", "+1 123 456 762", Person.GENDER_MALE, "654 Street, New York", 320));
        partTimeStaff.add(new PartTimeStaff("Anna White", 24, "annawhite@maximus.com", "+1 123 456 763", Person.GENDER_FEMALE, "987 Lane, New York", 310));
        partTimeStaff.add(new PartTimeStaff("Tom Black", 29, "tomblack@maximus.com", "+1 123 456 764", Person.GENDER_MALE, "121 Road, New York", 330));
        partTimeStaff.add(new PartTimeStaff("Lisa Blue", 27, "lisablue@maximus.com", "+1 123 456 765", Person.GENDER_FEMALE, "232 Avenue, New York", 300));
        partTimeStaff.add(new PartTimeStaff("James Grey", 30, "jamesgrey@maximus.com", "+1 123 456 766", Person.GENDER_MALE, "343 Boulevard, New York", 320));
        partTimeStaff.add(new PartTimeStaff("Emily Rose", 23, "emilyrose@maximus.com", "+1 123 456 767", Person.GENDER_FEMALE, "454 Street, New York", 310));
        partTimeStaff.add(new PartTimeStaff("Mark Orange", 28, "markorange@maximus.com", "+1 123 456 768", Person.GENDER_MALE, "565 Lane, New York", 330));
        partTimeStaff.add(new PartTimeStaff("Sophia Pink", 25, "sophiapink@maximus.com", "+1 123 456 769", Person.GENDER_FEMALE, "676 Road, New York", 300));
        partTimeStaff.add(new PartTimeStaff("David Purple", 31, "davidpurple@maximus.com", "+1 123 456 770", Person.GENDER_MALE, "787 Avenue, New York", 320));

        for (PartTimeStaff staff : partTimeStaff) {
            Departments.addStaff(staff);
        }

        /* Customer Interaction & Appointment System */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Maximus Shopping Mall!");

        String customerName = getStringInput(scanner, "Please enter your name:");
        int customerAge = getIntInput(scanner, "Please enter your age:");
        scanner.nextLine();
        String customerEmail = getStringInput(scanner, "Please enter your email:");
        String customerPhoneNumber = getStringInput(scanner, "Please enter your phone number:");
        String customerGender = getStringInput(scanner, "Please enter your gender:");
        String customerAddress = getStringInput(scanner, "Please enter your address:");

        System.out.println("When would you like a personal shopper?");
        for (int i = 0; i < timeSlots.length; i++) {
            System.out.println((i + 1) + ". " + timeSlots[i] + " - " + fullTimeStaff.get(i).getName());
        }

        int timeSlot = getIntInput(scanner, "Please select a time slot (1-8):", 1, 8);
        TimeSlot selectedTimeSlot = timeSlots[timeSlot - 1];

        FullTimeStaff availableStaff = null;
        for (FullTimeStaff staff : fullTimeStaff) {
            if (staff.getAvailabilityHour().equals(selectedTimeSlot)) {
                availableStaff = staff;
                break;
            }
        }

        if (availableStaff == null) {
            System.out.println("No staff available at the selected time. Please try again later.");
            return;
        }

        System.out.println(
                "\n------ Appointment Confirmed ------\n" +
                        "Thank you for your information " + customerName + ".\n" +
                        "We have booked " + availableStaff.getName() + " as your personal shopper from " + selectedTimeSlot.getStartTime() + " to " + selectedTimeSlot.getEndTime() + ".\n" +
                        "Please be on time and meet at the entrance of the mall.\n\n" +
                        "----- Your Information -----\n" +
                        "Name: " + customerName + "\n" +
                        "Age: " + customerAge + "\n" +
                        "Email: " + customerEmail + "\n" +
                        "Phone Number: " + customerPhoneNumber + "\n" +
                        "Gender: " + customerGender + "\n" +
                        "Address: " + customerAddress + "\n"
        );

    }

    private static String getStringInput(Scanner scanner, String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    private static int getIntInput(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
        }
    }

    private static int getIntInput(Scanner scanner, String prompt, int min, int max) {
        while (true) {
            int value = getIntInput(scanner, prompt);
            if (value >= min && value <= max) {
                return value;
            } else {
                System.out.println("Invalid input. Please enter a number between " + min + " and " + max + ".");
            }
        }
    }

}