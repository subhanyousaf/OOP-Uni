public class Main {

    public static void main(String[] args) {
        /* Departments Initialization */
        Departments.init();

        /* Full-Time Staff */
        FullTimeStaff fullTimeStaff1 = new FullTimeStaff("Imran Rehman", 30, "imranreh@gmail.com", "+923014000566", Person.GENDER_MALE, "Street 1, Johar Town, Lahore", 500);
        FullTimeStaff fullTimeStaff2 = new FullTimeStaff("Ali Khan", 25, "alikhan@gmail.com", "+923027549574", Person.GENDER_MALE, "Street 2, Johar Town, Lahore", 600);

        /* Part-Time Staff */
        PartTimeStaff partTimeStaff1 = new PartTimeStaff("Sara Khan", 22, "sarakhan@gmail.com", "+923014434545", Person.GENDER_FEMALE, "Street 3, Johar Town, Lahore", 300);
        PartTimeStaff partTimeStaff2 = new PartTimeStaff("Ahmed Ali", 24, "ahmedali@gmail.com", "+923215485294", Person.GENDER_MALE, "Street 4, Johar Town, Lahore", 400);

        /* Adding Staff to Departments */
        Departments.addStaff(fullTimeStaff1);
        Departments.addStaff(fullTimeStaff2);
        Departments.addStaff(partTimeStaff1);
        Departments.addStaff(partTimeStaff2);

        /* Checking which staff is Full-Time and which is Part-Time */
        for (Staff staff : Departments.getStaffList()) {
            if(staff instanceof FullTimeStaff) {
                System.out.println(staff.getName() + " is a Full-Time Staff");
            } else if(staff instanceof PartTimeStaff) {
                System.out.println(staff.getName() + " is a Part-Time Staff");
            }
        }
    }

}