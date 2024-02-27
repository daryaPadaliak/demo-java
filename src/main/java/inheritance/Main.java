package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human(167, 67);
        Human human2 = new Human(187, 87);

        System.out.println(human1);
        System.out.println(human2);

        List<Human> humans = new ArrayList<>();
        humans.add(human1);
        humans.add(human2);
        System.out.println(humans);
        System.out.println(humans.get(1));
        humans.get(1).setWeight(67);
        System.out.println(humans);

        human2.setWeight(77);
        System.out.println(humans.get(1).getWeight());
    }
}
