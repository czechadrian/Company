package czechadrian.company.employee;

import java.util.Random;

public class PersonGenerator {

    private final String[] names = {"Zosia","Zdzisia","Paulina","Maciek","Achacja", "Achacjusz", "Achacy", "Achilles",
            "Ada", "Adalbert", "Adalberta", "Adalgunda", "Adalruna", "Alruna"};

    private final String[] surnames = {"Gabrowski", "Gadowski", "Gajda", "Galewicz",
            "Galiński", "Gałczyński","Pioro","Onderka","Daniels","Kowalski", "Gałecki", "Gancarczyk", "Garbowski"};

    private Random rand = new Random();

    public String getName() {
        return names[rand.nextInt(names.length)];
    }

    public String getSurname() {
        return surnames[rand.nextInt(surnames.length)];
    }

    public final int amount = 0;
}
