package p3;

import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class newList<E> implements List<E> {
    private static final Lock lock = new ReentrantLock();

    private volatile List<E> myList = new ArrayList<>();

    @Override
    public int size() {
        int size = 0;
        lock.lock();
        size = myList.size();
        lock.unlock();

        return size;
    }

    @Override
    public boolean isEmpty() {
        boolean temp = false;
        lock.lock();
        temp = myList.isEmpty();
        lock.unlock();

        return temp;
    }

    @Override
    public boolean contains(Object o) {
        boolean temp = false;
        lock.lock();
        temp = myList.contains(o);
        lock.unlock();

        return temp;
    }

    @Override
    public Iterator<E> iterator() {
        Iterator<E> iterator = null;
        lock.lock();
        iterator = myList.iterator();
        lock.unlock();

        return iterator;
    }

    @Override
    public Object[] toArray() {
        Object[] objects = new Object[]{};
        lock.lock();
        objects = myList.toArray();
        lock.unlock();

        return objects;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        Object[] objects = new Object[]{};
        lock.lock();
        objects = myList.toArray();
        lock.unlock();

        return (T[]) objects;
    }

    @Override
    public boolean add(E t) {
        boolean temp = false;
        lock.lock();
        temp = myList.add(t);
        lock.unlock();

        return temp;
    }

    @Override
    public boolean remove(Object o) {
        boolean temp = false;
        lock.lock();
        temp = myList.remove(o);
        lock.unlock();

        return temp;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        boolean temp = false;
        lock.lock();
        temp = myList.containsAll(c);
        lock.unlock();

        return temp;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean temp = false;
        lock.lock();
        temp = myList.addAll(c);
        lock.unlock();

        return temp;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        boolean temp = false;
        lock.lock();
        temp = myList.addAll(index, c);
        lock.unlock();

        return temp;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean temp = false;
        lock.lock();
        temp = myList.removeAll(c);
        lock.unlock();

        return temp;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean temp = false;
        lock.lock();
        temp = myList.retainAll(c);
        lock.unlock();

        return temp;
    }

    @Override
    public void clear() {
        lock.lock();
        myList.clear();
        lock.unlock();
    }

    @Override
    public E get(int index) {
        E temp = null;
        lock.lock();
        temp = myList.get(index);
        lock.unlock();

        return temp;
    }

    @Override
    public E set(int index, E element) {
        E temp = null;
        lock.lock();
        temp = myList.set(index, element);
        lock.unlock();

        return temp;
    }

    @Override
    public void add(int index, E element) {
        lock.lock();
        myList.add(index, element);
        lock.unlock();
    }

    @Override
    public E remove(int index) {
        E temp = null;
        lock.lock();
        temp = myList.remove(index);
        lock.unlock();

        return temp;
    }

    @Override
    public int indexOf(Object o) {
        int temp = 0;
        lock.lock();
        temp = myList.indexOf(o);
        lock.unlock();

        return temp;
    }

    @Override
    public int lastIndexOf(Object o) {
        int temp = 0;
        lock.lock();
        temp = myList.lastIndexOf(o);
        lock.unlock();

        return temp;
    }

    @Override
    public ListIterator<E> listIterator() {
        ListIterator<E> iterator = null;
        lock.lock();
        iterator = myList.listIterator();
        lock.unlock();

        return iterator;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        ListIterator<E> iterator = null;
        lock.lock();
        iterator = myList.listIterator(index);
        lock.unlock();

        return iterator;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        List<E> list = new ArrayList<>();
        lock.lock();
        list = myList.subList(fromIndex, toIndex);
        lock.unlock();

        return list;
    }
}
