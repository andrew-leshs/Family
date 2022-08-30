import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Michael", "Hamdan Mohamed bin Maktum al Ahmed", 40));
        people.add(new Person("Jack", "ibn Zaid Hadum", 10));
        people.add(new Person("Connor", "al Abbod Hub", 75));
        people.add(new Person("Ramsan", "Kadyrov ibn Ahmed", 80));

        Comparator<Person> comparator = (o1, o2) -> {
            int block = 2;
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
        };
        Collections.sort(people, comparator);
        System.out.println(people);
    }
}
