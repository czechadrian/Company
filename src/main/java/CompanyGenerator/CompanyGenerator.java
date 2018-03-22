package CompanyGenerator;

import Employee.EmployeeGenerator;
import Employee.PersonGenerator;
import Employee.TeamManager;

public class CompanyGenerator {

        private final EmployeeGenerator employeeGenerator = new EmployeeGenerator();

        public TeamManager establishCompany(int level) {
                TeamManager CEO = employeeGenerator.getManager(3);
                addWorkers(CEO, level - 1);
                return CEO;
        }

        private final void addWorkers(TeamManager manager, int level) {
                while(level > 0) {
                        if (level == 1) {

                                manager.hire(employeeGenerator.getDeveloper());
                                manager.hire(employeeGenerator.getDeveloper());
                                level--;
                        } else {

                                TeamManager manager1 = employeeGenerator.getManager(2);
                                TeamManager manager2 = employeeGenerator.getManager(2);

                                manager.hire(manager1);
                                manager.hire(manager2);
                                level--;
                        }
                }
        }
}

