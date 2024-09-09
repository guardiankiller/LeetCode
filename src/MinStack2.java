import java.util.ArrayList;

public class MinStack2 {
    private final ArrayList<Integer> list;
    private final ArrayList<Integer> minList;
    private int size;

    public MinStack2() {
        list = new ArrayList<>();
        minList = new ArrayList<>();
        size = 0;
    }

    public void push(int val) {
        list.add(val);
        if (size == 0) {
            minList.add(val);
        } else {
            minList.add(Math.min(minList.get(size - 1), val));
        }
        size++;
    }

    public void pop() {
        if (size > 0) {
            list.remove(size - 1);
            minList.remove(size - 1);
            size--;
        }
    }

    public int top() {
        return list.get(size - 1);
    }

    public int getMin() {
        return minList.get(size - 1);
    }
}
