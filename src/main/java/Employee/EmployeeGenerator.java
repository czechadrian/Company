package Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeGenerator {

    private final PersonGenerator personGenerator = new PersonGenerator();

    public TeamManager getManager(int size) {
        return new TeamManager(personGenerator.getName(),
                personGenerator.getSurname(),Role.DEVELOPMENT_MANAGER,size);
    }

    public Developer getDeveloper() {
        return new Developer(personGenerator.getName(),
                personGenerator.getSurname(),Role.DEVELOPER);
    }

}
