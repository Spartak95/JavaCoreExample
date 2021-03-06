package reentrantreadwritelock.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteList<E> {
     private List<E> list = new ArrayList<>();
     private ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();

     public ReadWriteList(E... initialElements) {
         list.addAll(Arrays.asList(initialElements));
     }

     public void add(E element) {
         Lock writeLock = rwLock.writeLock();
         writeLock.lock();
         try {
             list.add(element);
         } finally {
             writeLock.unlock();
         }
     }

     public E get(int index) {
         Lock readLock = rwLock.readLock();
         readLock.lock();
         try {
             return list.get(index);
         } finally {
             readLock.unlock();
         }
     }

     public int size() {
         Lock readLock = rwLock.readLock();
         readLock.lock();
         try {
             return list.size();
         } finally {
             readLock.unlock();
         }
     }
}
