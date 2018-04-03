package czechadrian.company.employee;

import czechadrian.company.task.Task;

import java.util.ArrayList;
import java.util.List;


public abstract class AbstractEmployee implements Employee {

    private Role role;
    private final String name;
    private final String surname;
    final List<Task> tasks;
    Integer amountOfUnitsOfWork = 0;

    public AbstractEmployee(String name, String surname,Role role,Integer amount) {
        this.role = role;
        this.name = name;
        this.surname = surname;
        this.tasks = new ArrayList<>();
        this.amountOfUnitsOfWork = 0;
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

    public List<Task> getTasks() {
        return tasks;
    }

    public Integer getAmountOfUnitsOfWork() {
        return amountOfUnitsOfWork;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
