import java.util.Iterator;
import java.util.function.Consumer;

public class DynamicArrayIterator implements Iterator {
    IntDynamicArray arr;
    int count;

    public DynamicArrayIterator(IntDynamicArray arr){
        this.arr = arr;
        count = 0;
    }

    @Override
    public boolean hasNext() {
        return count < arr.size();
    }

    @Override
    public Object next() {
        Integer n = arr.get(count);
        count++;
        return n;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }

    @Override
    public void forEachRemaining(Consumer action) {
        Iterator.super.forEachRemaining(action);
    }

}
