package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        Female female1 = new Female(167, 57, 10);
        Female female2 = new Female(157, 54, 10);

        List<Female> females = new ArrayList<>();
        females.add(female1);
        females.add(female2);
        System.out.println(females);
    }
}
