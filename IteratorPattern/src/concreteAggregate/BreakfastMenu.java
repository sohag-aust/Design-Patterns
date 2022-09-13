package concreteAggregate;

import aggregate.Menu;
import concreteIterator.BreakfastMenuIterator;
import iterator.Iterator;
import model.MenuItem;

import java.util.Arrays;
import java.util.List;

public class BreakfastMenu implements Menu {

    private List<MenuItem> breakfastItems;

    public BreakfastMenu() {
        breakfastItems = Arrays.asList(
           new MenuItem("Bread", 10),
           new MenuItem("Vegetable", 15),
           new MenuItem("Tea", 8)
        );
    }

    @Override
    public Iterator createIterator() {
        return new BreakfastMenuIterator(breakfastItems);
    }
}
