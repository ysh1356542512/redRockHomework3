package rockhomework3LV3;

import java.util.Random;
public class Information {
    String name;
    String place;
    Random r = new Random();
    int code = r.nextInt(9000)+1000;
    public Information(String name,String place){
        this.name = name;
        this.place = place;
    }
}
