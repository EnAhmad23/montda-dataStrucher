package Deque;

public class DoublyLinkedList<E> {


    public Node<E> header;
    public Node<E> trailer; // trailer sentinel
    private int size = 0; // number of elements in the list

    public DoublyLinkedList() {
        header = new Node<>(null, null, null); // create header
        trailer = new Node<>(null, header, null); // trailer is preceded by header
        header.setNext(trailer); // header is followed by trailer
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty()) {
            return null;
        }
        return header.getNext().getElement(); // first element is beyond header
    }

    public E last() {
        if (isEmpty()) {
            return null;
        }
        return trailer.getPrev().getElement(); // last element is before trailer
    }

    public void addFirst(E e) {
        addBetween(e, header, header.getNext()); // place just after the header
    }

    public void addLast(E e) {
        addBetween(e, trailer.getPrev(), trailer); // place just before the trailer
    }

    public E removeFirst() {
        if (isEmpty()) {
            return null; // nothing to remove
        }
        return remove(header.getNext());
    }

    public E removeLast() {
        if (isEmpty()) {
            return null; // nothing to remove
        }
        return remove(trailer.getPrev()); // last element is before trailer
    }

    private void addBetween(E e, Node<E> predecessor, Node<E> successor) {

        Node<E> newest = new Node<>(e, predecessor, successor);
        predecessor.setNext(newest);
        successor.setPrev(newest);
        size++;
    }

    private E remove(Node<E> node) {
        Node<E> predecessor = node.getPrev();
        Node<E> successor = node.getNext();
        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        size--;
        return node.getElement();
    }
    //********************************************************************************           Q_2
    public Node<E> reverse(DoublyLinkedList list) {
        Node temp = list.header;
        Node temp2 = list.trailer;
        temp.setPrev(temp2.getPrev());
        temp2.setNext(temp.getNext());
        temp.setNext(null);
        temp2.setPrev(null);
        return temp;
    }
    //********************************************************************************           Q_3
    public int equals(Node header2){
        int res =0;
        Node temp =header;
        Node temp2 =header2;
        while(temp==temp2){
            res = 1 ;
            temp=temp.getNext();
            temp2= temp2.getNext();
        }
        return res;
    }
}
