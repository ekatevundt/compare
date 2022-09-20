import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Olaf", "von Sholz", 22));
        people.add(new Person("Andrey", "Sholz ", 21));
        people.add(new Person("Eduard", "Lu De Fork", 22));
        people.add(new Person("Anton", "Petrov", 45));
        people.add(new Person("Anyon", "Con com chu", 11));

        System.out.println(people);
        Collections.sort(people, new PeopleComparator(3));
        System.out.println(people);

    }
}