public class MyLLTester {
  public static void main(String [] args) {
    MyLinkedList myLL = new MyLinkedList();
    System.out.println("Initial size: " + myLL.size());
    System.out.println("Initial isEmpty: " + myLL.isEmpty());
    myLL.add("test1");
    myLL.add("test2");
    myLL.add("test3");
    myLL.add("test4");
    myLL.add("test5");
    myLL.add("test6");
    myLL.add("test7");
    myLL.add("test8");
    myLL.add("test9");
    System.out.println("Initial adding of elements\n" + myLL);
    myLL.addLast("testLast");
    System.out.println("Add Last\n" + myLL);
    myLL.addFirst("testFirst");
    System.out.println("Add first \n" + myLL);
    System.out.println("Size: " + myLL.size());
    System.out.println("Empty: " + myLL.isEmpty());
    System.out.println("First element: " + myLL.get(0));
    System.out.println("Third Element: " + myLL.get(2));
    System.out.println("Last Element: " + myLL.get(10));
    System.out.println("Second Element: " + myLL.get(1));
    myLL.set(0,"newFirst");
    myLL.set(10,"newLast");
    myLL.set(2,"new3");
    System.out.println("After set\n"+myLL);
    myLL.removeFirst();
    System.out.println("After Remove First\n"+myLL);
    myLL.remove(2);
    System.out.println("After Remove 2\n"+myLL);
    myLL.removeLast();
    System.out.println("After Remove Last\n" + myLL);

  } // end main
  
} // end class
