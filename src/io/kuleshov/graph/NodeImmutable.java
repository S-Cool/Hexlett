package io.kuleshov.graph;

public class NodeImmutable implements Inode {

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
    public void print() {
        if (left != null) left.print();
        System.out.println(value);
        if (right != null) right.print();
    }

    @Override
    public int count() {
        int leftCount = left != null ? left.count() : 0;
        int rightCount = right != null ? right.count() : 0;
        return leftCount + 1 + rightCount;
    }
}
