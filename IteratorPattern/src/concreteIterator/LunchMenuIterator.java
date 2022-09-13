package concreteIterator;

import iterator.Iterator;
import model.MenuItem;

public class LunchMenuIterator implements Iterator {

    private MenuItem[] lunchItems;
    int itemPosition = 0;

    public LunchMenuIterator(MenuItem[] lunchItems) {
        this.lunchItems = lunchItems;
    }

    @Override
    public boolean hasNext() {
        return itemPosition < lunchItems.length;
    }

    @Override
    public MenuItem next() {
        return lunchItems[itemPosition++];
    }
}
