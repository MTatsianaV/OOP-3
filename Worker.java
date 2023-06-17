public class Worker extends Employee {

    public Worker(String name, String surname, int age, double salary) {
        super(name, surname, age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; возраст: %d; Месячный оклад: %.2f (руб.)",
                surname, name, age, calculateSalary());
    }
}
