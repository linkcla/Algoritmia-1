package list;

public class Node<E> {
    private E element;
    private Node<E> next;

    public Node(E element) {
        this.element = element;
        this.next = null;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public E getElement() {
        return element;
    }

    public void setNext(Node<E> nodo) {
        next = nodo;
    }

    public Node<E> getNext() {
        return next;
    }
}
