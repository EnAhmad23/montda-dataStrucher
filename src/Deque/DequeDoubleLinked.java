package Deque;

public class DequeDoubleLinked {
    DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

    public boolean isEmpty() {
        return list.header.getNext() == list.trailer;
    }

    public int size() {
        return list.size();
    }

    public void addLast(int element) {
        if (isEmpty())
            return;
        Node<Integer> temp = new Node<>(element);
        Node<Integer> prev = list.trailer.getPrev();
        temp.setPrev(prev);
        temp.setNext(list.trailer);
        prev.setNext(temp);
        list.trailer.setPrev(temp);

    }

    public void addFirst(int element) {
        if (isEmpty())
            return;
        Node<Integer> temp = new Node<>(element);
        Node<Integer> next = list.header.getNext();
        temp.setPrev(list.header);
        temp.setNext(next);
        next.setPrev(temp);
        list.header.setNext(temp);

    }

    public int removeFirst() {
        if (isEmpty())
            return -1;
        Node<Integer> temp = list.header.getNext();
        Node<Integer> next = temp.getNext();
        temp.setPrev(null);
        temp.setNext(null);
        next.setPrev(list.header);
        list.header.setNext(next);
        return temp.getElement();
    }
    public int removeLast() {
        if (isEmpty())
            return -1;
        Node<Integer> temp = list.trailer.getPrev();
        Node<Integer> prev = temp.getPrev();
        temp.setPrev(null);
        temp.setNext(null);
        prev.setNext(list.trailer);
        list.trailer.setPrev(prev);
        return temp.getElement();
    }
}
