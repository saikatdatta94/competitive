import java.util.Arrays;

public class CloneLL
{

    // Driver Method
    public static void main(String[] args)
    {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.rand = head.next.next;
        head.next.rand = head.next.next.next;
        head.next.next.rand = head.next;
        head.next.next.next.rand = head;

        Node clonedList = cloneList(head);

    }

    public static Node cloneList(Node head){
        Node start =head;
        //Make duplicate nodes inside
        while(head!=null){
            Node newNode = new Node(head.data);
            newNode.next = head.next;
            head.next = newNode;
            head = head.next.next;
        }

        return setNewRand(start);

    }

    public static Node setNewRand(Node head){
        Node start = head;
        while (head!=null){
            head.next.rand = head.rand.next;
            head = head.next.next;
        }
        return splitAlternate(start);
    }

    public static Node splitAlternate(Node head){
        Node clonedList = head.next;
        Node original = head;
        Node p = head;
        Node q = head.next;

        if (q==null || p==null){
            return null;
        }

        while (q.next!=null){
            p.next = p.next.next;
            q.next = q.next.next;
            q = q.next;
            p = p.next;
        }
        p.next = null;
        return clonedList;
    }


}

