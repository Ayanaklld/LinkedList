public class MyListMain {
    public static void main(String[] args) {

        MyList myList = new MyLinkedList();
        myList.add("item #1");
        myList.add("item #2");

        //работает неправильно с индексом 0, добавляет в конец
        myList.add(1, "555");

        myList.set(0, "ttt");

        System.out.println(myList.get(2));

        myList.remove(0);

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        System.out.println(myList.contains("555"));


    }
}
