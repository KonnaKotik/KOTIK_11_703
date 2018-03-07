package ru.itis;

import java.util.Collection;

public interface List<T> extends Collection<T>, Iterable<T> {
    T get(int index);
    boolean addAll(Collection<? extends T> collection);
}