package concreteIterator;

import iterator.Iterator;
import model.MenuItem;

import java.util.List;

public class BreakfastMenuIterator implements Iterator {

    private List<MenuItem> breakfastItems;
    int itemPosition = 0;

    public BreakfastMenuIterator(List<MenuItem> breakfastItems) {
        this.breakfastItems = breakfastItems;
    }

    @Override
    public boolean hasNext() {
        return itemPosition < breakfastItems.size();
    }

    @Override
    public MenuItem next() {
        return breakfastItems.get(itemPosition++);
    }
}
