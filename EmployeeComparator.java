import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        int ageCompare = Integer.compare(emp1.getAge(), emp2.getAge());
        if (ageCompare != 0) {
            return ageCompare;
        }
        int lastNameCompare = emp1.getSurname().compareTo(emp2.getSurname());
        if (lastNameCompare != 0) {
            return lastNameCompare;
        }
        return emp1.getName().compareTo(emp2.getName());
    }
    
}
