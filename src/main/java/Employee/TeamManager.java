package Employee;

import Task.Task;

import java.util.List;
import java.util.LinkedList;
import java.lang.IllegalArgumentException;
import java.util.NoSuchElementException;
import java.util.Random;

public class TeamManager extends AbstractEmployee implements Manager {

    private final LinkedList<Employee> getWorkers;
    private final int limitOfWorkers;

    public TeamManager(String name,String surname,Role role,int limitOfWorkers) {
        super(name, surname, role);
        this.limitOfWorkers = limitOfWorkers;
        getWorkers = new LinkedList<>();
    }

    @Override
    public void hire(Employee employee) {
        if(canHire())
            getWorkers.add(employee);
        else
            throw new IllegalArgumentException("don't have possibilities to hire new employee");
    }

    @Override
    public void fire(Employee employee) {
        if(!getWorkers.contains(employee))
            throw new NoSuchElementException("Impossible to fire the employee");
        else
            getWorkers.remove(employee);

    }

    @Override
    public boolean canHire() {
        return limitOfWorkers < getWorkers.size();
    }

    @Override
    public List<Employee> getWorkers() {
        return getWorkers;
    }
    public void assign(Task task) {
        if(getWorkers.size() == 0)
            throw new NoSuchElementException("No developers avaiable to assign a task");
        else {
            Random rand = new Random();
            System.out.println("task added to: " +
                    getWorkers.get(rand.nextInt(limitOfWorkers)+1)
                    + " task content: " + task.getTaskContent() +
                    " units of work: " +task.getUnitsOfWork());
            this.addTask(task);
        }
    }

    @Override
    public String toString() {
        return "TeamManager{" +
                "getWorkers=" + getWorkers +
                ", limitOfWorkers=" + limitOfWorkers +
                '}';
    }

}
