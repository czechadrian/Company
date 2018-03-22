package Employee;

import Task.Report;
import Task.Task;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;


public abstract class AbstractEmployee implements Employee {

    private final Role role;
    private final String name;
    private final String surname;
    private final List<Task> tasks;

    public AbstractEmployee(String name, String surname,Role role) {
        this.role = role;
        this.name = name;
        this.surname = surname;
        this.tasks = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Role getRole() {
        return role;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    @Override
    public Report reportWork() {
        return new Report(tasks);
    }

    @Override
    public List<Employee> getWorkers() {
        return new LinkedList<>();
    }

    @Override
    public String toString() {
        return "AbstractEmployee{" +
                "role=" + role +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
