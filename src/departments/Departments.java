package departments;

import entities.Staff;

import java.util.ArrayList;

public class Departments {

    public static final int MEN_CLOTHING = 0;
    public static final int WOMEN_CLOTHING = 1;
    public static final int MAKEUP = 2;
    public static final int FOOD = 3;
    public static final int TOYS = 4;

    private static final ArrayList<Department> departments = new ArrayList<>();
    private static final ArrayList<Staff> staffList = new ArrayList<>();

    public static void init() {
        registerDepartment(new Department(MEN_CLOTHING, "Men's Clothing", "Clothing Floor", "+1 123 456 790", "menclothing@maximus.com"));
        registerDepartment(new Department(WOMEN_CLOTHING, "Women's Clothing", "Clothing Floor", "+1 123 456 789", "womenclothing@maximus.com"));
        registerDepartment(new Department(MAKEUP, "Makeup", "Cosmetics Floor", "+1 123 456 791", "makeup@maximus.com"));
        registerDepartment(new FoodDepartment(FOOD, "Food", "Grocery Floor", "+1 123 456 792", "food@maximus.com"));
        registerDepartment(new Department(TOYS, "Toys", "Toy Floor", "+1 123 456 793", "toys@maximus.com"));
    }

    private static void registerDepartment(Department department) {
        departments.add(department);
    }

    public static Department getDepartment(int departmentId) {
        for (Department department : departments) {
            if (department.getId() == departmentId) {
                return department;
            }
        }
        return null;
    }

    public static ArrayList<Department> getDepartments() {
        return departments;
    }

    public static void addStaff(Staff staff) {
        staffList.add(staff);
    }

    public static void removeStaff(Staff staff) {
        staffList.remove(staff);
    }

    public static ArrayList<Staff> getStaffList() {
        return staffList;
    }

}
