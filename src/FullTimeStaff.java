public class FullTimeStaff extends Staff{

    public FullTimeStaff(String name, int age, String email, String phoneNumber, String gender, String address, double salary) {
        super(name, age, email, phoneNumber, gender, address, salary);
    }

    public StaffType getStaffType() {
        return StaffType.FullTime;
    }

}
