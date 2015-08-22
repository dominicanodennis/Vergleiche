import java.util.Comparator;

/**
 * Created by dennis on 20.08.15.
 */
 class NameComparator implements Comparator<Person>
{
    public int compare(Person o1, Person o2)
    {
        return o1.getName().compareTo(o2.getName());
    }
}

 class AgeComparator implements Comparator<Person>
{
    public int compare(Person o1, Person o2)
    {
        return o1.getAge().compareTo(o2.getAge());
    }
}

 class CountryComparator implements Comparator<Person>
{
    public int compare(Person o1, Person o2)
    {
        return o1.getCountry().compareTo(o2.getCountry());
    }
}
