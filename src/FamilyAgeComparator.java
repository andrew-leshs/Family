import java.util.Comparator;

public class FamilyAgeComparator implements Comparator<Person> {

    private int block;

    public FamilyAgeComparator(int block) {
        if (block > 0) {
            this.block = block;
        }
    }
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getSurname().split(" ").length > block && o2.getSurname().split(" ").length > block) {
            return Integer.compare(o2.getAge(), o1.getAge());
        }
        if (o1.getSurname().length() > o2.getSurname().length()) {
            return -1;
        } else if (o1.getSurname().length() < o2.getSurname().length()) {
            return 1;
        }
        return Integer.compare(o2.getAge(), o1.getAge());
    }
}
