//Shaan Maheshwari, 10/30/24, pd. 3
//This program creates a LinkedList with the ability to get the size, check if it is empty, add an object to the beginning, end , or just in general. You can also remove items, set and get certain items. 
public class MyLinkedList{

    private ListNode head;
    private int size;

    public MyLinkedList(){
        head = null; //head is null, list is empty
        size = 0;
    }//end constuctor

    public int size(){
        return size;
    }//end function

    public boolean isEmpty(){
        if(head == null || size == 0){
            return true;
        } else {
            return false;
        }//end else-if
    }//end function

    public boolean add(Object newItem){
        ListNode temp = head;

        if(size == 0){
            head = new ListNode(newItem, null);
        } else {
            while(temp.getNext() != null){
                temp = temp.getNext();
            }//end while
            temp.setNext(new ListNode(newItem, null));
        }//end else-if
        size++;
        
        return true;
    }//end function

    public boolean addFirst(Object newItem){
        head = new ListNode(newItem, null);
        size++;
        
        return true;
    }//end function

    public boolean addLast(Object newItem){
        boolean added = true;

        if(added == true){
            add(newItem);
            added = true;
        } else {
            added = false;
        }//end if else

        return added;
    }//end function

    public Object remove(int i){
        if(i < 0 || i >= size){
            throw new IndexOutOfBoundsException();
        }//end if

        if(i == 0){
            return removeFirst();
        } else {
            ListNode temp = head;
            for(int x = 0; x < i - 1; x++){
                temp = temp.getNext();
            }//end for
            ListNode temp2 = temp.getNext();
            temp.setNext(temp2.getNext());
            Object returnVal = temp2.getValue();
            temp2.setNext(null);
            size--;

            return returnVal;
        }//end if else
    }//end function

    public Object removeFirst(){
        ListNode temp = head;

        if(size == 0){
            return null;
        }//end if
        head = head.getNext();
        Object returnValue = temp.getValue();
        temp.setNext(null);

        return returnValue;
    }//end function

    public Object removeLast(){
        if(size == 0){
            return null;
        }//end if
        ListNode temp = head;
        while(temp.getNext().getNext() != null){
            temp = temp.getNext();
        }//end while
        Object returnVal = temp.getNext().getValue();
        temp.setNext(null);

        return returnVal;
    }//end function

    public Object set(int i, Object newValue){
        ListNode temp = head;

        if(i < 0 || i >= size){
            throw new IndexOutOfBoundsException();
        } else {
            for(int x = 0; x < i; x++){
                temp = temp.getNext();
            }//end for
        }//end if else

        Object returnValue = temp.getValue();
        temp.setValue(newValue);

        return returnValue;
    }//end function

    public Object get(int i){
        ListNode temp = head;

        if (i < 0 || i >= size){
            throw new IndexOutOfBoundsException();
        } else {
            for(int x =0;x < i; x++){
                temp= temp.getNext();
            }//end for
        }//end if else
            
        return temp.getValue();
    }//end function


    public String toString(){
        ListNode temp = head;
        String results = "";
        int count = 1;
        while (temp != null){
            results += count + ":" + temp.getValue() + "\n";
            count++;
            temp = temp.getNext();
        }//end while
        return results;
    }//end function

}//end class
