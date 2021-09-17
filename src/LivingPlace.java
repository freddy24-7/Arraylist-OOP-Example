//This is the most "basic" object in this programme. Only contains attributes, constructor,
//getters (setters are removed as they are not used in this programme anyway). Can of course be
//added if needed.

public class LivingPlace {
    private String place;//says where a person lived
    private String time;//indicate when a person lived there (i.e "1995-1997")

    //Constructor
    public LivingPlace(String place, String time) {
        this.place = place;
        this.time = time;
    }

    //Getters
    public String getPlace() {
        return place;
    }

    public String getTime() {
        return time;
    }
}


