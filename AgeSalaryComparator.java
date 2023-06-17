import java.util.Comparator;
public class AgeSalaryComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee emp1, Employee emp2) {
        // Сначала сравниваем по возрасту
        int ageComp = emp1.getAge() - emp2.getAge();
        if (ageComp != 0) {
            return ageComp;
        }
        // Если возраст совпадает, сравниваем по зарплате
        return Double.compare(emp1.calculateSalary(), emp2.calculateSalary());
    }    
}
