package Builder;

public class Employee {

    private final String name;
    private final String company;
    private final boolean hasCar;//optional
    private final boolean hasBike;//optional

    private Employee(EmployeeBuilder employeeBuilder) {
        name = employeeBuilder.name;
        company = employeeBuilder.company;
        hasCar = employeeBuilder.hasCar;
        hasBike = employeeBuilder.hasBike;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public boolean hasCar() {
        return hasCar;
    }

    public boolean hasBike() {
        return hasBike;
    }

    public static class EmployeeBuilder {
        private final String name;
        private final String company;
        private boolean hasCar;//optional
        private boolean hasBike;//optional

        public EmployeeBuilder(String name, String company) {
            this.name = name;
            this.company = company;
        }

        public EmployeeBuilder setHasCar(boolean hasCar) {
            this.hasCar = hasCar;
            return this;
        }

        public EmployeeBuilder setHasBike(boolean hasBike) {
            this.hasBike = hasBike;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}
