public class MyLinkedList{


    private ListNode head;
    private int size;

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

        if(size == 0){
            head = new ListNode(newItem, null);
        } else {
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(new ListNode(newItem, null));
        }
        size++;
        
        return true;
    }

    public boolean addFirst(Object newItem){
        head = new ListNode(newItem, null);
        size++;
        
        return true;
    }

    public boolean addLast(Object newItem){
        boolean added = true;

        if(added == true){
            add(newItem);
            added = true;
        } else {
            added = false;
        }

        return added;
    }

    public Object remove(int i){
        if(i < 0 || i >= size){
            throw new IndexOutOfBoundsException();
        }

        if(i == 0){
            return removeFirst();
        } else {
            ListNode temp = head;
            for(int x = 0; x < i - 1; x++){
                temp = temp.getNext();
            }
            ListNode temp2 = temp.getNext();
            temp.setNext(temp2.getNext());
            Object returnVal = temp2.getValue();
            temp2.setNext(null);
            size--;

            return returnVal;
        }
    }

    public Object removeFirst(){
        ListNode temp = head;

        if(size == 0){
            return null;
        }
        head = head.getNext();
        Object returnValue = temp.getValue();
        temp.setNext(null);

        return returnValue;
    }

    public Object removeLast(){
        if(size == 0){
            return null;
        }
        ListNode temp = head;
        while(temp.getNext().getNext() != null){
            temp = temp.getNext();
        }
        Object returnVal = temp.getNext().getValue();
        temp.setNext(null);

        return returnVal;
    }

    public Object set(int i, Object newValue){
        ListNode temp = head;

        if(i < 0 || i >= size){
            throw new IndexOutOfBoundsException();
        } else {
            for(int x = 0; x < i; x++){
                temp = temp.getNext();
            }
        }

        Object returnValue = temp.getValue();
        temp.setValue(newValue);

        return returnValue;
    }

    public Object get(int i){
        Listnode temp = head;

        if (i < 0 || i >= size){
            throw new IndexOutOfBoundsException();
        } else {
            for(int x =0;x < i; x++){
                temp= temp.getNext();
            }
        }  
            
        return temp.getValue();
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
