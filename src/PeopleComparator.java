import java.util.Comparator;

public class PeopleComparator implements Comparator<Person> {
    protected int maxWords;

    public PeopleComparator(int maxWords) {
        this.maxWords = maxWords;
    }

    @Override
    public int compare(Person o1, Person o2) {
        String[] surnames = o1.getSurname().split(" ");
        String[] oSurnames = o2.getSurname().split(" ");
        if (this.maxWords <= surnames.length && this.maxWords <= oSurnames.length) {
            return o1.getAge() - o2.getAge();
        } else if (surnames.length > oSurnames.length) {
            return 1;
        } else if (surnames.length < oSurnames.length){
            return -1;
        }else {
            return o1.getAge() - o2.getAge();
        }
    }
}

