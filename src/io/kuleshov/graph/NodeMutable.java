package io.kuleshov.graph;

public class NodeMutable implements Inode {
    private final int value;
    private Inode left = null;
    private Inode right = null;

    public NodeMutable(final int value) {
        this.value = value;
    }

    @Override
    public Inode add(final Integer value) {
        if (value == this.value) return this;
        if (value < this.value) {
            if (left == null)
                left = new NodeMutable(value);
            else
                left = left.add(value);
            return this;
        }
        if (right == null)
            right = new NodeMutable(value);
        else
            right = right.add(value);
        return this;
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
