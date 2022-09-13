package concreteAggregate;

import aggregate.Menu;
import concreteIterator.LunchMenuIterator;
import iterator.Iterator;
import model.MenuItem;

public class LunchMenu implements Menu {

    private MenuItem[] lunchItems;

    public LunchMenu() {
        lunchItems = new MenuItem[] {
          new MenuItem("Rice", 50),
          new MenuItem("Chicken", 100),
          new MenuItem("Beef", 250)
        };
    }

    @Override
    public Iterator createIterator() {
        return new LunchMenuIterator(lunchItems);
    }
}
