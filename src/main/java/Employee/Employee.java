package Employee;

import Task.Task;
import Task.Report;
import java.util.List;

public interface Employee {

    String getName();
    String getSurname();
    Role getRole();
    void assign(Task task);
    Report reportWork();

    List<Employee> getWorkers();

}
