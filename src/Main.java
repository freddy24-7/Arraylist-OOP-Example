public class Main {
    //In the main class you will here only work with objects already prepared elsewhere
    //Start in LivingPlace, then go to class Person, then Main

    public static void main(String[] args) {

        //Use of Person Class constructor:
        Person anna = new Person("Anna", 35);

        //Method "addPlace" from Person class, as well as constructor from LivingPlace Class is used below
        anna.addPlace(new LivingPlace("Amsterdam", "1988-1992"));
        anna.addPlace(new LivingPlace("Utrecht", "1993-1997"));
        anna.addPlace((new LivingPlace("London", "1998-2002")));
        anna.addPlace(new LivingPlace("Rotterdam", "2003 to present"));

        //tell()-method use from Person Class
        anna.tell();
    }
}
