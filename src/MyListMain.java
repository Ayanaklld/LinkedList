public class MyListMain {
    public static void main(String[] args) {

        MyList myList = new MyLinkedList();
        myList.add("item #1");
        myList.add("item #2");


        myList.add(2, "item #0");
//
//        myList.set(0, "ttt");
//
//        System.out.println(myList.get(2));

//        myList.remove(0);

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }



    }
}
