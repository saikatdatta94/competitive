public class LL {
    public Node head;
    public LL(Node head){
        this.head = head;
    }

    public void append(int data){
        Node newNode = new Node(data);
        Node current= head;
        if (head == null){
            head = newNode;       //If head is null make the new node head
            return;
        }
        while (current.next!=null){
            current = current.next;     //Loop will run till the next element is null 1->2->3->null loop will stop at (head =3)
        }
        current.next = newNode;
        System.out.println("Inserted value "+data);
    }

    public void traverseLL(Node head){
        Node current= head;
        if (current==null){
            System.out.println("LL is empty");
            return;
        }
        while (current!=null){
            System.out.printf("%d -> ",current.data);
            current = current.next;
        }
        System.out.printf("null");
    }

    public Node linearSearch(int target){
        if(head!=null){
            while (head!=null){
                if (head.data == target){
                    return head;
                }
                head = head.next;
            }
        }
        return null;
    }

}
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}

