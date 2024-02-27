package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        Man man1 = new Man(77, 183, 1000);
        Man man2 = new Man(87, 185, 1500);

        List<Man> mans = new ArrayList<>();
        mans.add(man1);
        mans.add(man2);
        System.out.println(mans);
    }
}
