package io.kuleshov.graph;

public class NodeImmutable implements Inode<Integer> {

    private final int value;

    private final Inode left;

    private final Inode right;

    public NodeImmutable(final int value, final Inode left, final Inode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    @Override
    public Inode add(final Integer value) {
        if (value == this.value) return this;
        if (value < this.value) {
            if (left == null)
                return new NodeImmutable(this.value, new NodeImmutable(value, null, null), right);
            return new NodeImmutable(this.value, left.add(value), right);
        }
        if (right == null)
            return new NodeImmutable(this.value, left, new NodeImmutable(value, null, null));
        return new NodeImmutable(this.value, left, right.add(value));
    }


    @Override
    public void forEach(Iconsumer<Integer> consume) {
        if (left != null) left.forEach(consume);
        consume.consume(value);
        if (right != null) right.forEach(consume);
    }

    @Override
    public int count() {
        int leftCount = left != null ? left.count() : 0;
        int rightCount = right != null ? right.count() : 0;
        return leftCount + 1 + rightCount;
    }
}
