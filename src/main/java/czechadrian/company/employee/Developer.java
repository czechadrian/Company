package czechadrian.company.employee;

import czechadrian.company.report.Report;
import czechadrian.company.report.WorkerReport;
import czechadrian.company.task.Task;

import java.util.List;

public class Developer extends AbstractEmployee {

    public Developer(String name, String surname, Role role,Integer amount) {
        super(name, surname, role,amount);
    }

    @Override
    public void assign(Task task) {
        System.out.println(this.getName() +" "+this.getSurname()+" "+this.getRole()+
                 " added task: " + task.toString());


        tasks.add(task);
        amountOfUnitsOfWork += task.getUnitsOfWork();
    }

    @Override
    public List<Report> reportWork(List<Report> reports) {
        reports.add(new WorkerReport(this));
        return reports;
    }

    @Override
    public Report reportWork() {
        return new WorkerReport(this);
    }
}
