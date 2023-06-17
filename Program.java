import java.util.Arrays;
import java.util.Random;

public class Program {

    static Random random = new Random();

    /**
     * TODO: Переработать метод generateEmployee в рамках домашнего задания,
     * метод должен генерировать рабочих (Employee) разных типов.
     * 
     * @return
     */
    static Employee generateEmployee() {
        String[] employees = new String[] { "Worker", "Freelanser" };
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий",
                "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов",
                "Горбунов", "Лыткин", "Соколов" };
        int salaryWorker = random.nextInt(20000, 80000);
        int salaryFrelanser = random.nextInt(120, 500);
        int age = random.nextInt(25, 50);
        String kind_Employee = employees[random.nextInt(employees.length)];
        if (kind_Employee == "Worker") {
            return new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], age, salaryWorker);
        } else {
            return new Freelancer(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], age,
                    salaryFrelanser);
        }
    }

    /**
     * TODO: Придумать новые состояния для наших сотрудников
     * Придумать несколько Comparator'ов для сортировки сотрудников
     * по фамилии + имени или по возрасту + уровню зп.
     * 
     * @param args
     */
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateEmployee();
        }

        Arrays.sort(employees);

        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("----------------------------------");

        Arrays.sort(employees, new EmployeeComparator());
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("----------------------------------");
        Arrays.sort(employees, new AgeSalaryComparator());
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("----------------------------------");

    }

}

