import CompanyGenerator.CompanyGenerator;
import Employee.Developer;
import Employee.Manager;
import Task.Task;
import Employee.TeamManager;
import Task.Report;

public class Main {
    public static void main(String args[]) {

        CompanyGenerator companyGenerator = new CompanyGenerator();

        Manager ceo = companyGenerator.establishCompany(3);

        ceo.assign(new Task("Android app",8));
        ceo.assign(new Task("coffee",1));


        System.out.println(ceo.reportWork() + "\n\n");

        System.out.println(ceo.toString());

        System.out.println(ceo.canHire());


    }
}
