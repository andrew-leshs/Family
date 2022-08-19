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
        String[] o1array = o1.getSurname().split(" ");
        String[] o2array = o2.getSurname().split(" ");
        if (o1array.length > block && o2array.length > block) {
            return Integer.compare(o2.getAge(), o1.getAge());
        }
        if (o1array.length > o2array.length) {
            return -1;
        } else if (o1array.length < o2array.length) {
            return 1;
        }
        return Integer.compare(o2.getAge(), o1.getAge());
    }
}
