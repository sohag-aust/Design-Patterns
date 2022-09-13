import concreteAggregate.BreakfastMenu;
import concreteAggregate.LunchMenu;
import iterator.Iterator;
import model.MenuItem;

public class Main {
    public static void main(String[] args) {

        BreakfastMenu breakfastMenu = new BreakfastMenu();
        LunchMenu lunchMenu = new LunchMenu();

        Iterator breakfastMenuIterator = breakfastMenu.createIterator();
        Iterator lunchMenuIterator = lunchMenu.createIterator();

        System.out.println("==** Breakfast Items **==");
        while (breakfastMenuIterator.hasNext()) {
            MenuItem breakfastItem = breakfastMenuIterator.next();
            System.out.println(breakfastItem.getItem() + " with rate: " + breakfastItem.getRate());
        }

        System.out.println("\n==** Lunch Items **==");
        while (lunchMenuIterator.hasNext()) {
            MenuItem lunchItem = lunchMenuIterator.next();
            System.out.println(lunchItem.getItem() + " with rate: " + lunchItem.getRate());
        }
    }
}