public class MyLinkedList implements MyList {

    private Node first;
    private Node last;
    private int size;

    public MyLinkedList() {
        first = null;
        last = null;
        size = 0;
    }


    @Override
    public void add(String value) {
        Node node;
        if (size == 0) {
            node = new Node(null, null, value);
            first = node;
        } else {
            node = new Node(null, last, value);
            last.setNext(node);
        }
        last = node;
        size++;
    }


    @Override
    public void add(int index, String value) {
        if (index == 0) {
            first = new Node(first, null, value);
        } else if (index == size) {
            Node newNode = new Node(null, last, value);
            last.setNext(newNode);
            last = newNode;
        } else {
            Node current = getNodeIndex(index);
            Node prev = current.getPrev();
            Node newNode = new Node(current, prev, value);
            current.setPrev(newNode);
            prev.setNext(newNode);

        }

        size++;
    }

    @Override
    public void set(int index, String value) {
        getNodeIndex(index).setValue(value);
    }

    @Override
    public String get(int index) {
        Node node = first;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node.getValue();
    }

    @Override
    public void remove(int index) {
        if (index == 0){
            if (first.getNext() != null){
                first.getNext().setPrev(null);
            }
            first = first.getNext();
        } else if (index == size - 1){
            if (last.getPrev() != null){
                last.getPrev().setNext(null);
            }
            last = last.getPrev();
        } else {
            Node current = getNodeIndex(index);
            current.getPrev().setNext(current.getNext());
            current.getNext().setPrev(current.getPrev());
        }
        size--;
    }

    @Override
    public boolean contains(String value) {
        Node current = first;

        while (current != null) {
            if (current.getValue().equals(value)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    private Node getNodeIndex(int index){
        Node current = first;
        for (int i = 0; i < index; i++){
            current = current.getNext();
        }
        return current;
    }
}
