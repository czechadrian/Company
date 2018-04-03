package czechadrian.company.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmployeeGenerator {

    private final PersonGenerator personGenerator = new PersonGenerator();

    Random rand = new Random();

    public TeamManager getCEO(int size) {
        return new TeamManager(personGenerator.getName(),
                personGenerator.getSurname(), Role.CEO,personGenerator.amount,size);
    }


    public TeamManager getManager(int size) {
        return new TeamManager(personGenerator.getName(),
                personGenerator.getSurname(), getManagersRole(),personGenerator.amount,size);
    }

    public Role getManagersRole() {
        int a = rand.nextInt(2)+1;
        if(a == 1 ) {
            return Role.TEAM_LEADER;
        }
        else
            return Role.DEVELOPMENT_MANAGER;
    }


    public Developer getDeveloper() {
        return new Developer(personGenerator.getName(),
                personGenerator.getSurname(),getDevsRole(),personGenerator.amount);
    }

    public Role getDevsRole() {
        int b = rand.nextInt(3)+1;
        if(b == 1 )
            return Role.DEVELOPER;
        if(b == 2)
            return Role.TESTER;
        else
            return Role.CONTIBUTOR;
    }

    public List<Manager> getManagers(int size,int amount) {
        List<Manager> managersList = new ArrayList<>();
        for(int i = 0 ; i < amount ; i++) {
            managersList.add(getManager(size));
        }
        return managersList;
    }
    public List<Developer> getDevelopers(int amount) {
        List<Developer> developerList = new ArrayList<>();
        for(int i = 0; i < amount ; i++) {
            developerList.add(getDeveloper());
        }
        return developerList;
    }

}
