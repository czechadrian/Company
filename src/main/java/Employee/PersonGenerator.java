package Employee;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class PersonGenerator {

    private final String[] names = {"Achacja", "Achacjusz", "Achacy", "Achilles",
            "Ada", "Adalbert", "Adalberta", "Adalgunda", "Adalruna", "Alruna"};

    private final String[] surnames = {"Gabrowski", "Gadowski", "Gajda", "Galewicz",
            "Galiński", "Gałczyński", "Gałecki", "Gancarczyk", "Garbowski"};

    private Random rand = new Random();

    public String getName() {
        return names[rand.nextInt(names.length)];
    }

    public String getSurname() {
        return surnames[rand.nextInt(surnames.length)];
    }
}
