package Deque;

public class Deque_Circular_array {
    private int[] num;
    private int size = 0;
    private int front = -1;
    private int back = 0;
    private int length;

    Deque_Circular_array() {
    }

    Deque_Circular_array(int size) {
        num = new int[size];
        length = size;
    }


    public void addLast(int elemnt) {
        if (!isFull()) {
            back = back + 1 + length % length;
            num[back] = elemnt;
            size++;
        }

    }

    public void addFirst(int elemnt) {
        if (!isFull()) {
            front = front - 1 + length % length;
            num[front] = elemnt;
            size++;
        }

    }

    public int removeFirst() {
        if (!isEmpty()) {
            int element = num[front];
            front = front + 1 + length % length;
            size--;
            return element;
        }
        return -1;
    }

    public int removeLast() {
        if (!isEmpty()) {
            int element = num[back];
            back = front - 1 + length % length;
            size--;
            return element;
        }
        return -1;
    }

    public boolean isEmpty() {
        return ((back + 1) % length == front) || ((front - 1 + length) % length == back);
    }

    public boolean isFull() {
        return back + 1 % length == front || ((front - 1 + length) % length == back);
    }
}
