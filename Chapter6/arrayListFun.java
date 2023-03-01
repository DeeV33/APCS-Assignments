import java.util.ArrayList;
import java.util.ListIterator;

public class arrayListFun {
    public static void main(String[] args) {
        ArrayList<String> ingridients = new ArrayList<String>();

        ingridients.add("flour");
        ingridients.add("sugar");
        ingridients.add("coco");
        ingridients.add("oil");
        ingridients.add("margerine");
        ingridients.add("baking soda");

        System.out.println("To make a chocolate cake, use the following " + ingridients.size() + " ingridients:");
        ingridients.add(5, "eggs");

        System.out.println("To make a chocolate cake, use the following " + ingridients.size() + " ingridients:");

        ListIterator iterator = ingridients.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        int location = ingridients.indexOf("margerine");
        ingridients.remove("margarine");
        ingridients.add(location, "butter");

        iterator = ingridients.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        while (true) {
            break;
        }
    }
}
