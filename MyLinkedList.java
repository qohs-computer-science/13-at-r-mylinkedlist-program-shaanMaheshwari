public class MyLinkedList{


    private ListNode head;
    private ListNode size;

    public MyLinkedList(){
        head = null; //head is null, list is empty
        size = 0;
    }

    public int size(){
        return size;
    }

    public booelan isEmpty(){
        if(head == null || size == 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean add(Object newItem){
        ListNode temp = head;
        
        while(temp.getNext() != null){
            temp = temp.getNext();
        }

        temp.setNext(newItem); 

        return temp;

    }

    public String toString(){
        ListNode temp = head;
        String results = "";
        int count = 1;
        while (temp != null){
            results += count + ":" + temp.getValue() + "\n";
            count++;
            temp = temp.getNext();
        }
        return results;
    }

}
