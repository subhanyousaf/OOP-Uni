public class PersonalShoppingAppointment {
    private final Customer customer;
    private final FullTimeStaff staff;
    private final String appointmentTime;

    public PersonalShoppingAppointment(Customer customer, FullTimeStaff staff, String appointmentTime) {
        this.customer = customer;
        this.staff = staff;
        this.appointmentTime = appointmentTime;
    }

    public Customer getCustomer() {
        return customer;
    }

    public FullTimeStaff getStaff() {
        return staff;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    @Override
    public String toString() {
        return "Appointment Details:\n" +
                "Customer Name: " + customer.getName() + "\n" +
                "Customer Phone: " + customer.getPhoneNumber() + "\n" +
                "Staff Name: " + staff.getName() + "\n" +
                "Appointment Time: " + appointmentTime;
    }

}