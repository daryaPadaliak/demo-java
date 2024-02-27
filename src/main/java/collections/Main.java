package collections;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Element element1 = new Element("div");
        Element element2 = new Element("input");
        Element element3 = new Element("a");

        List <Element> elements = new ArrayList<>();
        elements.add(element1);
        elements.add(element2);
        elements.add(element3);
        System.out.println(elements);

        Element element4 = new Element("li");
        elements.add(1, element4);

        System.out.println(elements);

        elements.set(0, element4);
        System.out.println(elements);
    }
}
