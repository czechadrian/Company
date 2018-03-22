import CompanyGenerator.CompanyGenerator;
import Employee.Manager;
import Task.Task;
import Employee.TeamManager;

public class Main {
    public static void main(String args[]) {

        CompanyGenerator companyGenerator = new CompanyGenerator();

        Manager ceo = companyGenerator.establishCompany(3);

        ceo.assign(new Task("Android app",8));
        ceo.assign(new Task("coffee",1));

        ceo.fire(ceo.getWorkers().get(2));


    }
}
