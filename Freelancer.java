public class Freelancer extends Employee {

    public Freelancer(String name, String surname, int age, double salary) {
        super(name, surname, age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary * 20 * 8;
    }

    @Override
    public String toString() {
        return String.format(
                "%s %s; Фрилансер; возраст: %d; Месячная оплата за 160 часов: %.2f (руб.)",
                surname, name, age, calculateSalary());
    }
}
