public class BakeryBootCamp extends BootCamp {

    public static final double BASE_FEE = 350.0;
    private static final double DISCOUNT_RATE = 0.68; // 32% discount

    public BakeryBootCamp(double fee, int durationWeeks) {
        super("Bakery BootCamp", durationWeeks, fee);
    }

    @Override
    public double getDiscountedPrice(boolean newCustomer, boolean enrollFullTime) {
        if (newCustomer && enrollFullTime) {
            return Math.round(getFee() * DISCOUNT_RATE);
        } else {
            return getFee();
        }
    }
}
