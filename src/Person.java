import java.util.ArrayList;
import java.util.List;
//You start with the class LivingPlace (a Person can have more livingplaces)
//This current object (Person) is the second object to work on, after "Livingplace"

public class Person {
    private String name;
    private int age;
    //In the list below you "link" to the class LivingPlace (inside <>) and make a new Arraylist
    //that you give a name. Here "allPlaces" is chosen as a name.
    private List<LivingPlace> allPlaces = new ArrayList<>();

    //constructor - note the new Arraylist does not enter into the constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Methods

    //The below tell() method prints out the content of the new arraylist
    public void tell() {
        System.out.println("I am " + name + " and I am " + age + " years old.");
        System.out.println("These are the places I have lived:");

        for (LivingPlace livingPlace : allPlaces) {
            //above is a "for-each loop". Syntax:
            //there are two references to the class. First capitalized (Livingplace)),
            //then noncapitalised (livingplace), thereafter comes ":", then name of new arraylist(allPlaces)
                  System.out.println(livingPlace.getPlace() +": " + livingPlace.getTime());
                  //In the above the getters are used from the LivingPlace object
        }
    }
    //Below method fills up the arraylist - class name enters parameters twice (same capitalization as above)
    //then name of new arraylist(here: allPlaces), .add, then classname again (small capitals)
    public void addPlace (LivingPlace livingPlace) {
        allPlaces.add(livingPlace);
    }
    }



