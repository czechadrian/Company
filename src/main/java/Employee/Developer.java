package Employee;

import Task.Report;
import Task.Task;

import java.util.List;

public class Developer extends AbstractEmployee {

    public Developer(String name, String surname,Role role) {
        super(name,surname,role);
    }

    @Override
    public void assign(Task task) {
     System.out.println("task content " + task.getTaskContent() + " / " +
             task.getUnitsOfWork() + "units of work");
    }

    @Override
    public String toString() {
        return "Developer{}";
    }

}
