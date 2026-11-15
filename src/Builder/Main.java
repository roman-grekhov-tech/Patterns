package Builder;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee
                .EmployeeBuilder(
                "Vikram",
                "ABC")
                .setHasBike(false)
                .setHasBike(true)
                .build();

        System.out.println(employee.hasBike());
    }
}
