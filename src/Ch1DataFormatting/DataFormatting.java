package Ch1DataFormatting;


import java.util.ArrayList;
import java.util.List;

public class DataFormatting {

    static class Person{
        public final Integer id;
        public final String name;
        public final Boolean likePizza;

        public Person(Integer id, String name, Boolean likePizza) {
            this.id = id;
            this.name = name;
            this.likePizza = likePizza;
        }
    }

    static class PersonUtils{
        public static String getFirstName(Person person){
            return person.name.split(" ")[0];
        }
    }



    public static void main(String[] args) {
        //Univariate arrays
        String[] names = { "John Doe", "Jane Jones", "Bill Smith", "Betsy Garcia" };
        Integer[] ids =  { 123, 234, 345, 456 };
        Boolean[] likesPizza = { false, true, true, false };

        //Multivatiate arrays
        Integer[] person1 = { 123, 0, 1994, 4, 3 };
        Integer[] person2 = { 234, 1, 1940, 8, 4 };

        //Matrices
        Integer[][] peopleData = {
                { 123, 0, 1994, 4, 3 },
                { 234, 1, 1940, 8, 4 },
        };

        //Data Objects
//        Person person = new Person(123,"John Doe",false);
//        String firstName = PersonUtils.getFirstName(person);
//        System.out.println(firstName);
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(123,"Joe Doe",false));
        personList.add(new Person(234,"Pam Boe",true));

        for (Person person : personList) {
            System.out.println(person.name);
        }

        //Data represent to JSON object

    }
}
