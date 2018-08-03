package io.kuleshov.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Item {
    private int k;

    public Item(int k) {
        setK(k);
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    @Override
    public String toString() {
        return "Item{" +
                "k=" + k +
                '}';
    }

    public static void main(String[] args) {
        Item item1 = new Item(1);
        Item item2 = new Item(2);
        Item item3 = new Item(3);

        Map<String, Item> map = new HashMap<String, Item>();
        map.put("one", item1);
        map.put("two", item2);
        map.put("three", item3);

        Set<Map.Entry<String, Item>> set = map.entrySet();
        Object[] arrayMapEntry = new Object[set.size()];

        arrayMapEntry = set.toArray(arrayMapEntry);

        ((Map.Entry<String, Item>) arrayMapEntry[0]).setValue(new Item(4));
        System.out.println(map);
    }
}
