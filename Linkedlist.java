import java.util.*;

//1.Implementation of a LL(From Scratch)
//LinkedList-->A Linear data structure which is made up of nodes that are connected using references

//A)With comments
    class LL{//Create a LL class to represent the entire LL
   Node head;//Create a variable(head)that always points to the first node
   private int size;//Size is made private so that only the LL class(Its' methods and constructors)can update it correctly
   //Size belongs to the Linked List,not to the main() method

   LL(){//LL class' constructor
    this.size=0;//'this' refers to the current LL object being created-->When LL' object is created(size=0)
   }

   class Node{//Node(class)-->Blueprint of many nodes
    String data;
    Node next;

   Node(String data){//Every node should contain two things(data&next)
   //Constructor's purpose is to initializes every new node
    this.data=data;//this.data-->Tells java that we are referring to the data variable of the current(respective) node,not the constructor parameter(String data)
    this.next=null;//'this' refers to the current LL object that called the method
    size++;//Every node is created using this constructor-->So,size++ happens automatically for every new node created
   }
}

//1.Adding a node to the LL

//A)Adding at first:
   public void addFirst(String data){
    Node newNode=new Node(data);//Create a new node containing the given data
    if(head==null){//If the LL is empty
        head=newNode;//Writing newNode = head-->newNode points to head(null)-->We lose access to the entire LL
        return;
    }
    newNode.next=head;//Connects the new node to the current first node(of the LL)
    head=newNode;//Updates head to point to the new first node
    //If we update head first-->Then newNode.next will point to itself--And so we loose access to the remaining LL
   }

//A)Adding at last:
   public void addLast(String data){
    Node newNode=new Node(data);
    if(head==null){
        head=newNode;
        return;
    }
    Node currNode=head;//currNode-->Temporary variable for traversing
    while(currNode.next != null){//Jab tak we do not reach the lastnode-->UPDATE currNode
        currNode=currNode.next;
    }
    currNode.next=newNode;//Attach the newNode now to the lastNode
   }

//2.Printing the LL
    public void printList(){//This method traverses the entire LLt and prints each node's data
    if(head==null){
        System.out.println("List is empty");
        return;
    }
    Node currNode=head;
    while(currNode !=null){//currNode != null because we want to print every node-->including the last node
        System.out.print(currNode.data+"-->");
        currNode=currNode.next;
    }
    System.out.println("NULL");
}

//3.Adding a node in the middle of a LL
    public void addMiddle(int index,String data){
        if(index<0 || index>size){
        //index < 0-->Trying to insert the node at a negative index(-1, -2)-->is invalid
        //index >size(index=4)-->Trying to insert beyond the last valid insertion position-->Invalid
            System.out.println("Invalid Index");
            return;
        }
        Node newNode=new Node(data);//Constructor initializes data,next and updates size
        if(head==null || index==0){
            //head==null-->Connect newNode.next to head(which is null)and update head to point to the new node
            //index==0-->Same as addFirst()
            newNode.next=head;
            head=newNode;
            return;
        }
        Node currNode=head;//Creating a temporary variable for traversing
        for(int i=0;i<index-1;i++){//Traverse the LL until currNode reaches the node just before the insertion position(secondLast)
            currNode=currNode.next;//Last valid condition to update currNode-->When it is just before secondLast node
        }
        Node nextNode=currNode.next;//Save the remaining LL by just storing the reference(address)of 1st node of remaining LL()(Bcoz C-->D-->E-->Null)
        currNode.next=newNode;//Connect current node to the new node
        newNode.next=nextNode;//Connect the new node(which is just inserted in middle)to the remaining LL
    }

//4.Deleting a node from the LL

//A)Deleting the 1st node
    public void deleteFirst(){
        if(head==null){//If the list is empty-->Then there is nothing to delete
            System.out.println("List is empty");
            return;
        }
        if(head.next==null){//If there is only 1 node in the list
            head=null;//The only node loses its reference(When head-->null)and removed later by Java's Garbage Collector 
            size--;
            return;
        }
        head=head.next;//Move head to the second node-->Then 1st node losses its' reference and removed later by Java's Garbage Collector 
        //Writing head.next=head is wrong-->(which creates a loop)-->1st nodes' next points to itself
        size--;
    }

//B)Deleting the last node
   public void deleteLast(){
    if(head==null){
        System.out.println("List is empty");
        return;
    }
    if(head.next==null){
        head=null;
        size--;
        return;
    }
    Node lastNode=head.next;//Keeps track of the node just before the last node
    Node secondLast=head;//Used to reach and identify the last node
    while(lastNode.next!=null){//Until we reach the last node-->UPDATE
        lastNode=lastNode.next;
        secondLast=secondLast.next;
    }
    //When we've reached the lastNode-->secondLast is on the previous node(Required position)-->So we can safely disconnect the last node
    secondLast.next=null;
    size--;
   }

//5.Returning the size(Total no. of nodes)of the LL
   public int getSize(){//Public-->So it can be called from main()
    return size;
   }

//Reversing a LL(using iterative method)
    public void revIterate(){
        if(head==null || head.next==null){//Nothing to reverse when-->(0 or 1 node)
            return;
        }
        Node prevNode=head;//First node becomes the previous node
        Node currNode=head.next;//Reversal starts from the second node

        while(currNode != null){//Reverse links until all nodes are processed
            Node nextNode=currNode.next;//Save the remaining Linked List
            currNode.next=prevNode;//Reverse the current link

           //Move both pointers one step forward
           //Reversing these updates moves the pointers backward,causing incorrect traversal and breaking the reversal
           prevNode=currNode;
           currNode=nextNode;
        }
        head.next=null;//Old first node(which is pointing to 2nd node after the loop)becomes the last node
        head=prevNode; //Update head to the new first node(which is prevNode during the last iteration)
    }

//Reversing a LL(using recursive method)
    public Node reverseRecursive(Node head){//Returns the new head of the reversed LL(So,Node-->return type)
        //'head'-->local reference variable of the current recursive call-->tells the current call which node it is working on

        if(head==null || head.next==null){//head.next==null-->single node or last node reached(new head found(for the reversed LL))
            return head;//Return the newHead to all previous recursive calls
        }

        Node newHead=reverseRecursive(head.next);//First go to the last node and then reverse the links while returning
        //Each call keeps its own 'head'-->the original 'list.head' is NOT changed
        head.next.next=head;//Make the next node point back to the current node(From 3->4 to 3<-4)
        head.next=null;//Remove the old link(3->4)
        return newHead;//Return the same new head(4)through every recursive call
    }
}

public class Linkedlist{
    public static void main(String[]args){
        LL list=new LL();
        //List-->reference variable that refers to an object of the LL class and is used to access its(LL class')variables and methods
        // Each Linked List object manages its own Linked List independently

        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        System.out.println();
        list.printList();

        list.addFirst("This");
        System.out.println();
        list.printList();

        list.deleteFirst();
        System.out.println();
        list.printList();

        list.deleteLast();
        System.out.println();
        list.printList();

        System.out.println();
        System.out.println("The size of the current LL is:");
        System.out.println(list.getSize());

        list.addFirst("This");
        list.addLast("list");
        System.out.println();
        list.printList();

        System.out.println();
        System.out.println("The size of the current LL is:");
        System.out.println(list.getSize());

        list.deleteLast();
        list.deleteLast();
        System.out.println();
        list.printList();

        list.addLast("list");
        System.out.println();
        list.printList();

        list.addMiddle(2,"my");
        System.out.println();
        System.out.println("The final LL is:");
        list.printList();

        System.out.println();
        System.out.println("The LL after being reversed(using iterative method)is:");
        list.revIterate();
        list.printList();

        System.out.println();
        System.out.println("The original LL is:");
        list.revIterate();
        list.printList();

        System.out.println();
        System.out.println("The LL after being reversed(using recursive method)is:");
        list.head=list.reverseRecursive(list.head);//Update the LL's head(From 1) to the new head(To 4)returned after reversal
        list.printList();
    }
}



//B)Without comments
    /* class LL{
   Node head;
   private int size;

   LL(){
    this.size=0;
   }

   class Node{
    String data;
    Node next;

   Node(String data){
    this.data=data;
    this.next=null;
    size++;
   }
}

//1.Adding a node to the LL

//A)Adding at first:
   public void addFirst(String data){
    Node newNode=new Node(data);
    if(head==null){
        head=newNode;
        return;
    }
    newNode.next=head;
    head=newNode;
   }

//A)Adding at last:
   public void addLast(String data){
    Node newNode=new Node(data);
    if(head==null){
        head=newNode;
        return;
    }
    Node currNode=head;
    while(currNode.next != null){
        currNode=currNode.next;
    }
    currNode.next=newNode;
   }

//2.Printing the LL
    public void printList(){
    if(head==null){
        System.out.println("List is empty");
        return;
    }
    Node currNode=head;
    while(currNode !=null){
        System.out.print(currNode.data+"-->");
        currNode=currNode.next;
    }
    System.out.println("NULL");
}

//3.Adding a node in the middle of a LL
    public void addMiddle(int index,String data){
        if(index<0 || index>size){
            System.out.println("Invalid Index");
            return;
        }
        Node newNode=new Node(data);
        if(head==null || index==0){
            newNode.next=head;
            head=newNode;
            return;
        }
        Node currNode=head;
        for(int i=0;i<index-1;i++){
            currNode=currNode.next;
        }
        Node nextNode=currNode.next;
        currNode.next=newNode;
        newNode.next=nextNode;
    }

//4.Deleting a node from the LL

//A)Deleting the 1st node
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==null){
            head=null;
            size--;
            return;
        }
        head=head.next;
        size--;
    }

//B)Deleting the last node
   public void deleteLast(){
    if(head==null){
        System.out.println("List is empty");
        return;
    }
    if(head.next==null){
        head=null;
        size--;
        return;
    }
    Node lastNode=head.next;
    Node secondLast=head;
    while(lastNode.next!=null){
        lastNode=lastNode.next;
        secondLast=secondLast.next;
    }
    secondLast.next=null;
    size--;
   }

//5.Returning the size of the LL
   public int getSize(){
    return size;
   }

//Reversing a LL(using iterative method)
    public void revIterate(){
        if(head==null || head.next==null){
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode != null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;

           prevNode=currNode;
           currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }

//Reversing a LL(using recursive method)
    public Node reverseRecursive(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newHead=reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
}

public class Linkedlist{
    public static void main(String[]args){
        LL list=new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        System.out.println();
        list.printList();

        list.addFirst("This");
        System.out.println();
        list.printList();

        list.deleteFirst();
        System.out.println();
        list.printList();

        list.deleteLast();
        System.out.println();
        list.printList();

        System.out.println();
        System.out.println("The size of the current LL is:");
        System.out.println(list.getSize());

        list.addFirst("This");
        list.addLast("list");
        System.out.println();
        list.printList();

        System.out.println();
        System.out.println("The size of the current LL is:");
        System.out.println(list.getSize());

        list.deleteLast();
        list.deleteLast();
        System.out.println();
        list.printList();

        list.addLast("list");
        System.out.println();
        list.printList();

        list.addMiddle(2,"my");
        System.out.println();
        System.out.println("The final LL is:");
        list.printList();

        System.out.println();
        System.out.println("The LL after being reversed(using iterative method)is:");
        list.revIterate();
        list.printList();

        System.out.println();
        System.out.println("The original LL is:");
        list.revIterate();
        list.printList();

        System.out.println();
        System.out.println("The LL after being reversed(using recursive method)is:");
        list.head=list.reverseRecursive(list.head);
        list.printList();
    }
}   */



//2.Implementation of a LL(Using Java's collection frameworks)
    /* public class Linkedlist{
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();
        //This-->is-->a-->list-->Null--->LL to be created 
        list.add("is");
        list.addFirst("This");//Adding a node at first
        list.addLast("a");
        list.add("list");//Adding a node at last
        System.out.println("This list is:");
        System.out.println(list);
        System.out.println();
        
        list.add(2,"my");//Adding a node in the middle
        System.out.println("This list after adding a node in middle at index 2 is:");
        System.out.println(list);
        System.out.println();

        list.remove(3);//Deleting a node using index
        System.out.println("This list after deleting a node using index(from index 3)is:");
        System.out.println(list);
        System.out.println();

        list.removeFirst();//Deleting the 1st node
        list.removeLast();//Deleting the last node
        System.out.println("The list after deleting 1st and last nodes is:");
        System.out.println(list);
        System.out.println();

        list.addFirst("This");
        list.addLast("list");
        System.out.println("The list after adding back 1st and last nodes is:");
        System.out.println(list);
        System.out.println();

        list.add(3,"linked");
        System.out.println("The list after adding a node in middle at index 3 is:");
        System.out.println(list);
        System.out.println();

        System.out.println("The final LL is:");//Printing the LL using a loop
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"-->");
        }
        System.out.println("NULL");
        System.out.println();


        int size=list.size();//Printing the size of the LL
        System.out.println("The size of the LL is:"+size);
        System.out.println();

        System.out.println("The elements of the LL are:");//Printing the elements of the LL
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println();

        String value="linked";
        int index=list.indexOf("linked");

        boolean found=false;
        for(int i=0;i<list.size();i++){//Fetching for a specific element in the LL and printing its' index
            if(value.equals(list.get(i))){//Compares two Strings based on their content but not based on their references
                System.out.println("The string "+value+" is found in the LL at index "+index);
                found=true;
                break;//Jumping statements(Like break)are used only with a loop
                //break-->Once the element is found,we immediately exit the loop(No further iterations are performed)
            }
        }
        if(found==false){
            System.out.println("The element "+value+" is not found at any index in the LL");
        }

        System.out.println();
        System.out.println("The LL is:");
        System.out.println(list);

        System.out.println();
        System.out.println("The LL after being reversed is:");
        Collections.reverse(list);
        System.out.println(list);
    }
} */


//3.Creating a LL of integer type & searching for a number & displaying its' index
    /* public class Linkedlist{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> list=new LinkedList<Integer>();
        //LinkedList<Integer>-->The LL class can only store integer values
        //list-->Reference variable which points to the LL object
        //new-->Creates a new object in the memory
        //LinkedList<Integer>();-->Calls the LL constructor to create an empty LL
        
        System.out.println("Add elements into the LL:");
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(3);
        System.out.println("The list is:");
        System.out.println(list);

        System.out.println("Enter a number to be searched:");
        int n=sc.nextInt();

        int index=list.indexOf(n);//Built-in Java collection framework of LL class to find the index of an element
        if(index==-1){//It returns -1 when the element is not found at any index
            System.out.println("The element "+n+" is not found at any index");
        }
        else{
            System.out.println("The element "+n+" is found at index "+index);
        }
    }
} */



//4.Taking elements(1-50)as input and delete all nodes which having values greater than 25
    /* public class Linkedlist{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> list=new LinkedList<Integer>();//Creates an empty LL

        System.out.println("Enter the size of the LL:");
        int size=sc.nextInt();

        System.out.println("Enter elements into the LL:");
        for(int i=0;i<size;i++){//Read and insert 'size' elements into the LL
        list.add(sc.nextInt());
        }
    
        list.removeIf(num -> num>25);//(parameter -> expression)-->Removes all elements greater than 25
        //removeIf-->Removes 
        //num-->a num(from the LL)-->//Start of lambda expression
        //->-->if
        //num>25-->the num>25

        //The compiler automatically figures out that 'num' is of type Integer because the list stores Integer values

        System.out.println("The LL after updation(after removing the numbers>25) is:");
        System.out.println(list);
    }
} */



//LeetCode-19,141,234

