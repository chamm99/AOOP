package generic.iterator;

import java.util.*;

public class MyStack<T> implements Iterable<T>{
    private List<T> stack;

    public MyStack() {
        stack = new ArrayList<>();
    }

    public void push(T i) {
        stack.add(i);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int lastIndex = stack.size() - 1;
        T i = stack.get(lastIndex);
        stack.remove(lastIndex);
        return i;
    }

    public int size() {
        return stack.size();
    }

    public Iterator<T> iterator() {
        return new MyStackIterator();
    }


    private class MyStackIterator implements Iterator<T> {
        public int index = stack.size() - 1;

        @Override
        public boolean hasNext() {
            return index >= 0;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return stack.get(index--);
        }
    }
}
