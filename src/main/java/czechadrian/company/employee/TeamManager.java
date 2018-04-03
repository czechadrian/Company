package czechadrian.company.employee;


import czechadrian.company.report.ManagerReport;
import czechadrian.company.report.Report;
import czechadrian.company.report.WorkerReport;
import czechadrian.company.task.Task;

import java.util.*;

public class TeamManager extends AbstractEmployee implements Manager {

    private final List<Employee> workerList;
    private int limitOfWorkers;

    public TeamManager(String name, String surname, Role role, Integer amount, int limitOfWorkers) {
        super(name, surname, role, amount);
        this.workerList = new ArrayList<>();
        this.limitOfWorkers = limitOfWorkers;
    }

    @Override
    public void hire(Employee employee) {
        if(canHire())
            workerList.add(employee);
        else
            throw new IllegalArgumentException("don't have possibilities to hire new employee");
    }

    @Override
    public void fire(Employee employee) {
        if(!workerList.contains(employee))
            throw new NoSuchElementException("Impossible to fire the employee");
        else
            workerList.remove(employee);
    }


    @Override
    public boolean canHire() {
        return limitOfWorkers >= workerList.size();
    }


    @Override
    public Employee getWorkerWithLowestWorkload() {

        Optional<Employee> workerWithLowestWorkload = workerList.stream()
                .min(Comparator.comparing(Employee::getAmountOfUnitsOfWork));

        return workerWithLowestWorkload.orElseThrow(NoSuchElementException::new);

    }

    @Override
    public void assign(Task task) {

        Employee employee = getWorkerWithLowestWorkload();

        System.out.println(this.getName()+" "+this.getSurname() +" "+ this.getRole() + " added task: " + task.toString()
                + " to worker: " + employee.getName()+" " + employee.getSurname()+" " +employee.getRole()+
        " with actual: " + employee.getAmountOfUnitsOfWork() + " amount units of works");

        employee.assign(task);
        tasks.add(task);
        amountOfUnitsOfWork+=task.getUnitsOfWork();

    }

    @Override
    public Report reportWork() {

        List<Report> reportList = new ArrayList<>();

        workerList.forEach(employee -> employee.reportWork(reportList));

        return new ManagerReport(this,reportList);
    }

    @Override
    public List<Report> reportWork(List<Report> reports) {

        workerList.forEach(employee -> employee.reportWork(reports));

        reports.add(new WorkerReport(this));

        return reports;
    }


}
