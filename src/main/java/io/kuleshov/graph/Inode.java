package io.kuleshov.graph;

public interface Inode<T> {
    public Inode add(final T value);

    public void forEach(final Iconsumer<T> consume);

    public int count();

    public interface Iconsumer<R> {

        public void consume(final R value);
    }
}
