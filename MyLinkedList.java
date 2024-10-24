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
        
        int tempSize = temp.size();
        boolean added = false;
        while(temp.getNext() != null){
            temp = temp.getNext();
        }

        temp.setNext(newItem); 

        if(tempSize != temp.size()){
            added = true;
        }

        return added;
    }

    public boolean addFirst(Object newItem){
        ListNode temp = head;

        temp.setNext(newItem);
        
        return true;
    }

    public boolean addLast(Object newItem){
        ListNode temp = head;
        
        int tempSize = temp.size();
        boolean added = false;
        while(temp.getNext() != null){
            temp = temp.getNext();
        }

        temp.setNext(newItem); 

        if(tempSize != temp.size()){
            added = true;
        }

        return added;
    }

    public Object get(int i){
        

        return index;
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
