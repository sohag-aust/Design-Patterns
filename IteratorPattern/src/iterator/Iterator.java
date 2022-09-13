package iterator;

import model.MenuItem;

public interface Iterator {
    boolean hasNext();
    MenuItem next();
}
