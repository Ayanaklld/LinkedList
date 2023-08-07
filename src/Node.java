public class Node {
    private Node next;

    private Node prev;

    private String value;

    public Node(Node next, Node prev, String value) {
        this.next = next;
        this.prev = prev;
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
