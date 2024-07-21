public class Main {

    public static void main(String[] args) {
        /* Initialize the departments */
        Departments.init();

        for (Department department : Departments.getDepartments()) {
            System.out.println(department);
        }

        /* Creating a new Person */
        Person person = new Person("John Ibrahim", 20, "johnibrahim@gmail.com", "+923145663422", "Male", "123 Street, A Block, Super Town");
        System.out.println(person);

        /* Creating a new Staff */
        Staff staff = new Staff("Ali Mohammed", 25, "alimohammed@yahoo.com", "+923132773733", "Male", "456 Street, B Block, Super Town", 1000);
        System.out.println(staff);

        /* Adding the staff to the staff list */
        Departments.addStaff(staff);
        for (Staff departmentStaff : Departments.getStaffList()) {
            System.out.println("Department Staff: " + departmentStaff.getName());
        }
    }

}