public class Workshop {

    private final String name;
    private final String day;
    private final TimeSlot timeSlot;
    private final String location;

    public Workshop(String name, String day, TimeSlot timeSlot, String location) {
        this.name = name;
        this.day = day;
        this.timeSlot = timeSlot;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getDay() {
        return day;
    }

    public TimeSlot getTimeSlot() {
        return timeSlot;
    }

    public String getLocation() {
        return location;
    }

}
