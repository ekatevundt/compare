import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {


    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Olaf", "von Sholz", 22));
        people.add(new Person("Andrey", "Sholz ", 21));
        people.add(new Person("Eduard", "Lu De Fork", 22));
        people.add(new Person("Anton", "Petrov", 45));
        people.add(new Person("Anyon", "Con com chu", 11));

        Comparator<Person> comparator = (Person x, Person y) -> {
            String[] surnames = x.getSurname().split(" ");
            String[] oSurnames = y.getSurname().split(" ");
            int maxWords = 3;
            if (maxWords <= surnames.length && maxWords <= oSurnames.length) {
                return y.getAge() - x.getAge();
            } else if (surnames.length > oSurnames.length) {
                return -1;
            } else if (surnames.length < oSurnames.length) {
                return 1;
            } else {
                return y.getAge() - x.getAge();
            }
        };
        sortList(people, comparator);
    }
    public static <T> void sortList(List<T> list, Comparator<T> comparator) {
        list.sort(comparator);
        list.forEach(System.out::println);

    }


}