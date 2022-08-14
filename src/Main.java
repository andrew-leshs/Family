import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Michael", "Hamdan Mohamed bin Maktum al Ahmed", 40));
        people.add(new Person("Jack", "ibn Zaid Hadum", 10));
        people.add(new Person("Connor", "al Abbod Hub", 75));
        people.add(new Person("Ramsan", "Kadyrov ibn Ahmed", 80));

        Collections.sort(people, new FamilyAgeComparator(2));
        System.out.println(people);
    }
}
