package collection.example;

import java.util.Collection;
import java.util.HashSet;

public class InstrumentSet<E> extends HashSet<E> {
    private int count;

    @Override
    public boolean add(E e) {
        count++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        count++;
        return super.addAll(c);
    }

    public int getCount() {
        return count;
    }
}
