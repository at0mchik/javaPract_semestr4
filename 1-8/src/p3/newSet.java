package p3;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class newSet<E> implements Set<E> {
    private volatile Set<E> mySet = new HashSet<>();
    private Semaphore semaphore = new Semaphore(1, true);

    @Override
    public int size() {
        int size = 0;
        try {
            semaphore.acquire();
            size = mySet.size();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
        return  size;
    }

    @Override
    public boolean isEmpty() {
        boolean emptiness = true;

        try {
            semaphore.acquire();
            emptiness = mySet.isEmpty();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            semaphore.release();
        }
        return emptiness;
    }

    @Override
    public boolean contains(Object o) {
        boolean temp = false;
        try {
            semaphore.acquire();
            temp = mySet.contains(o);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            semaphore.release();
        }
        return  temp;
    }

    @Override
    public Iterator<E> iterator() {
        Iterator<E> iterator = null;
        try {
            semaphore.acquire();
            iterator = mySet.iterator();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            semaphore.release();
        }
        return iterator;
    }

    @Override
    public Object[] toArray() {
        Object[] objects = new Object[]{};
        try {
            semaphore.acquire();
            objects = mySet.toArray();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            semaphore.release();
        }

        return objects;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        Object[] objects = new Object[]{};
        try {
            semaphore.acquire();
            objects = mySet.toArray();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            semaphore.release();
        }
        return (T[]) objects;
    }

    @Override
    public boolean add(E e) {
        boolean temp = false;
        try {
            semaphore.acquire();
            temp = mySet.add(e);
        } catch (InterruptedException E) {
            E.printStackTrace();
        }finally {
            semaphore.release();
        }
        return  temp;
    }

    @Override
    public boolean remove(Object o) {
        boolean temp = false;
        try {
            semaphore.acquire();
            temp = mySet.remove(o);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            semaphore.release();
        }
        return  temp;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        boolean temp = false;
        try {
            semaphore.acquire();
            temp = mySet.containsAll(c);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            semaphore.release();
        }
        return  temp;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean temp = false;
        try {
            semaphore.acquire();
            temp = mySet.addAll(c);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            semaphore.release();
        }
        return  temp;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean temp = false;
        try {
            semaphore.acquire();
            temp = mySet.retainAll(c);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            semaphore.release();
        }
        return  temp;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean temp = false;
        try {
            semaphore.acquire();
            temp = mySet.removeAll(c);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            semaphore.release();
        }
        return  temp;
    }

    @Override
    public void clear() {
        try {
            semaphore.acquire();
            mySet.clear();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            semaphore.release();
        }
    }
}
