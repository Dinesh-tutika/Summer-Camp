//A Linked list is a linesr data struecture where elements (indexes) are stored in memory non ccontineously.Each node holds data and a 
//pointer to the next node .unlike arrays there is no .you miust traverse from the head.
//middle linked list             linked listcycle-2
//linked list cycle-1            206
//rotate list                    19 remove nth node fromm end of the list
//delete the middle element
// reverse nodes in k-group


import java.util.LinkedList;

public class linkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;            
        }
    }
    public void insertAtBeginning(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public static void main(String[] args) {
        linkedList list=new linkedList();
        list.insertAtBeginning(3);

    }
}
