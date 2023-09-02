package GroupProject.practice.linkedList;

public class CustomLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }

    public void addElement(String data){
        Node temp = new Node(data, null);
        if(isEmpty()){
            head = temp;
            tail = head;
        }else{
            temp.next = head;
            head = temp;
        }
        size++;
    }

    public void addTail(String data){
        Node temp = new Node(data, null);
        if(isEmpty()){
            head = temp;
            tail = head;
        }else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    public int size(){
        return size;
    }

    public String getHead(){
        if(head.data != null) return head.data;
        return "No items in the list";
    }
    public String getTail(){
        if(tail.data != null) return tail.data;
        return "No items in the list";
    }

    @Override
    public String toString() {
        String res = "";
        Node current = head;
        while (current != null){
           res += current.data + ", ";
           current = current.next;
        }
        return res;
    }
}
