public class FullTimeStaff extends Staff{

    private TimeSlot availabilityHour;

    public FullTimeStaff(String name, int age, String email, String phoneNumber, String gender, String address, double salary) {
        super(name, age, email, phoneNumber, gender, address, salary);
    }

    public void setAvailabilityHour(TimeSlot availabilityHour) {
        this.availabilityHour = availabilityHour;
    }

    public TimeSlot getAvailabilityHour() {
        return availabilityHour;
    }

}
