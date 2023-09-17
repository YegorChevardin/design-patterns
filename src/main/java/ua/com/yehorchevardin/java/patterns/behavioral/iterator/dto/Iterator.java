package ua.com.yehorchevardin.java.patterns.behavioral.iterator.dto;

public interface Iterator<T> {
    boolean hasNext();

    T next();
}
