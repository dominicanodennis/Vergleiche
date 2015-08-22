import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Rene", 22, "Deutschland");
        Person person2 = new Person("Thomas", 45, "Ungarn");
        Person person3 = new Person("Sindy", 24, "DomRep");

        List<Person> personList = new ArrayList<Person>();

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);


        Collections.sort(personList, new AgeComparator());
        Collections.sort(personList, new NameComparator());
        Collections.sort(personList, new CountryComparator());


        for (Person person : personList) {
            System.out.println(person.getName() +
                    "    " + person.getCountry() + "    " + person.getAge());


        }
        int[]array = {23,1,9,234,0};
        Arrays.sort(array);
        for(Integer integer : array) {
            System.out.println(integer);
        }

    }
}
