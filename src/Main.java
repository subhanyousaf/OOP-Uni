public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Mohsin Pervaiz", 29, "mohsin@gmail.com", "+923024554354", "Male", "Gulbahar Block, Bahria Town");
        System.out.println(customer);

        FullTimeStaff fullTimeStaff = new FullTimeStaff("Ali Raza", 25, "aliraza@gmail.com", "+923024334543", "Male", "Gulmahar Block, Bahria Town", 50000);
        System.out.println(fullTimeStaff);

        PartTimeStaff partTimeStaff = new PartTimeStaff("Sara Khan", 22, "sarakhan@gmail.com", "+923164663425", "Female", "Badar Block, Bahria Town", 25000);
        System.out.println(partTimeStaff);
    }

}