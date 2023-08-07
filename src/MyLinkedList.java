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
            node = new Node(last, null, value);
            last.setNext(node);
        }
        last = node;
        size++;
    }


    @Override
    public void add(int index, String value) {

        if (index < 0 || index > size){
            System.out.println("Invalid");
        } else if (index == 0){
            add(value);
        } else if (index == size){
            add(value);
        } else {
            Node node = new Node(first,last, value);
            for (int i = 0; i < index - 1; i++){
                first = first.getNext();
            }
            node.setNext(first.getNext());
            first.setNext(node);
            size++;
        }

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
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }

        Node current = getNodeIndex(index);

        if (current.getNext() != null) {
            current.getNext().setPrev(null);
        } else {
            last = null;
        }

        first = current.getNext();

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
