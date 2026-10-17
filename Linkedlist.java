import java.util.*;

//1.Implementation of a LL(From Scratch)
//LinkedList-->A Linear data structure which is made up of nodes that are connected using references

//A)With comments
    /* class LL{//Create a LL class to represent the entire LL
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

//C)Deleting the middle node
   public void deleteMiddle(int index){
    if(head==null){//If the list is empty-->there is nothing to delete
        System.out.println("The SLL is empty");
        return;
    }
    if(index<0 || index>=size){//Valid indexes are from 0 to size - 1
        System.out.println("Invalid Index");
        return;
    }
    if(head.next == null){//If there is only one node-->deleting it makes the list empty
        head=null;
        size--;
        return;
    }
    if(index==0){//If index is 0, use deleteFirst()-->deleteFirst() already decreases the size
        deleteFirst();
        return;
    }
    if(index==size-1){//If index is the last position, use deleteLast()-->deleteLast() already decreases size
        deleteLast();
        return;
    }
    Node currNode=head;//Start from the first node-->Move to the node just before the one to be deleted
    for(int i=0;i<index;i++){
        currNode=currNode.next;
    }
    currNode.next=currNode.next.next;//Skip the node to be deleted
    size--;//Middle node was deleted directly-->so decrease size here
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

        list.deleteMiddle(2);
        System.out.println();
        System.out.println("The LL after deleting the middle node:");
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
}  */


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

//C)Deleting the middle node
    public void deleteMiddle(int index) {
    if (head == null) {
        System.out.println("The SLL is empty");
        return;
    }
    if (index < 0 || index >= size) {
        System.out.println("Invalid Index");
        return;
    }
    if (head.next == null) {
        head = null;
        size--;
        return;
    }
    if (index == 0) {
        deleteFirst();
        return;
    }
    if (index == size - 1) {
        deleteLast();
        return;
    }
    Node currNode = head;
    for (int i = 0; i < index; i++) {
        currNode = currNode.next;
    }
    currNode.next = currNode.next.next;
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

        list.deleteMiddle(2);
        System.out.println();
        System.out.println("The LL after deleting the middle node:");
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


//5.Implementation of a DLL(From Scratch)
//Doubly Linked List(DLL)--> A linear DS made up of nodes where each node is connected to both the prev and next node

//A)With Comments
    /* class DLL{
    Node head;//head always points to the first node of the DLL
    private int size;//size stores the total no. of nodes in the DLL-->private-->Only the DLL class can directly update it

    DLL(){//Constructor of the DLL class-->When a new DLL object is created-->it starts empty
        this.size=0;//'this' refers to the current DLL object-->Initially, the DLL contains 0 nodes
    }

    class Node{//Node-->Blueprint used to create individual nodes
        String data;
        Node next;
        Node prev;//Stores the reference to the prev node

        Node(String data){//Node constructor-->Creates a new node with the given data
            this.data=data;//'this.data' refers to the data variable of the curr Node-->'data' on the right side is the constructor parameter
            this.next=null;//Initially, the node is not connected to any next or prev nodes
            this.prev=null;
            size++;//Every time a new Node is created-->increase the DLL size by 1
        }
    }
//1.Adding a node to the DLL

    //A)Adding at first:
    public void addFirst(String data){
        Node newNode=new Node(data);//Create a new node containing the given data
        if(head==null){//If the DLL is empty-->there is no existing node to connect with
            head=newNode;//The new node becomes the first node
            return;
        }
        newNode.next=head;//Connect the new node to the current first node i.e newNode--> old head
        head.prev=newNode;//Connect the curr first node back to the new node i.e old head--> newNode
        head=newNode;//Update head so that it points to the new first node
    }

    //B)Adding at last:
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;//Temporary reference used to traverse the DLL-->Start from the first node(the node to which head is pointing to)
        while(currNode.next != null){//Keep moving until currNode reaches the last node-->The last node has next == null
            currNode=currNode.next;
        }
        currNode.next=newNode;//Connect the curr last node to the new node i.e currNode--> newNode
        newNode.prev=currNode;//Connect the new node back to the curr last node i.e currNode<-- newNode
    }

    //C)Adding the node in the middle of a DLL
    public void addMiddle(int index,String data){
        if(index<0 || index>size){//Valid indexes are from 0 to size
            System.out.println("Invalid Index");
            return;
        }
        Node newNode=new Node(data);//Create a new node containing the given data-->Node constructor also increases the size by 1

        if(head==null || index==0){//If the DLL is empty or index is 0-->Insert the new node at the beginning
            newNode.next=head;//New node connects with the old head
        if(head != null){
            head.prev=newNode;//Old head points back to the new node
        }
        head=newNode;//New node becomes the first node
        return;
        }

        Node currNode=head;//Start from the first node-->We will move to the node just before the insertion position
        for(int i=0;i<index-1;i++){
            currNode=currNode.next;//Move to the next node
        }
        Node nextNode=currNode.next;//Store the node that currently comes after currNode-->We need this reference before changing the links

        currNode.next=newNode;//currNode now points forward to the new node
        newNode.prev=currNode;//New node points backward to currNode
        newNode.next=nextNode;//New node points forward to the next node

        if(nextNode != null){//Next node points backward to the new node-->If nextNode is null, the new node is being added at the end
            nextNode.prev=newNode;
        }
    }

//2.Deleting a node from the DLL

    //A)Deleting the 1st node
    public void deleteFirst(){
        if(head==null){//If the DLL is empty-->there is nothing to delete
            System.out.println("The DLL is empty");
            return;
        }
        if(head.next==null){//If there is only one node-->removing it makes the DLL empty
            head=null;
            size--;
            return;
        }
        head=head.next;//Move head to the second node
        head.prev=null;//Now, the old first node is no longer part of the DLL-->The new head has no previous node
        size--;//One node has been deleted
    }

    //B)Deleting the last node
    public void deleteLast(){
        if(head==null){//If the DLL is empty-->there is nothing to delete
            System.out.println("The DLL is empty");
            return;
        }
        if(head.next==null){//If there is only one node-->deleting it makes the DLL empty
            head=null;
            size--;
            return;
        }
        Node currNode=head;//Start from the first node
        while(currNode.next != null){
            currNode=currNode.next;//Move until currNode reaches the last node
        }
        currNode.prev.next=null;//The second-last node becomes the new last node-->Its' next now points to null
        size--;//One node has been deleted
    }

    //C)Delete the middle node
    public void deleteMiddle(int index){
        if(head==null){
            System.out.println("The DLL is empty");
            return;
        }
        if(index<0 || index>=size){//Valid indexes are from 0 to size - 1
            System.out.println("Invalid Index");
            return;
        }
        if(index==0){//If index is 0-->delete the first node
            deleteFirst();//This will call deleteFirst() and deleteFirst() already handles the one-node case(head.next==null)
            return;
        }
        if(index==size-1){//If index is the last position-->delete the last node
            deleteLast();
            return;
        }
        Node currNode=head;//Start from the first node
        for(int i=0;i<index;i++){//Move currNode to the node at the given index
            currNode=currNode.next;
        }
        currNode.prev.next=currNode.next;//prev node now points to the next node
        currNode.next.prev=currNode.prev;//Next node now points back to the prev node
        size--;//One node has been deleted
    }

//3.Returning the size(Total no. of nodes)of the DLL
    public int getSize(){
        return size;//Return the curr no. of nodes in the DLL
    }

//4.Printing the DLL
    public void printList(){
        if(head==null){//If the DLL is empty-->there is nothing to print
            System.out.println("The DLL is empty");
            return;
        }
        Node currNode=head;//Start from the first node
        while(currNode != null){//Continue until we reach the end of the DLL
            System.out.print(currNode.data+"-->");//Print the current node's data
            currNode=currNode.next;//Move to the next node
        }
        System.out.println("null");//Marks the end of the DLL
    }

//5.Reversing the DLL(using iterative method)
    public void reverseIterate(){
        if(head==null){//If the DLL is empty-->there is nothing to reverse
            System.out.println("The DLL is empty");
            return;
        }
        Node currNode=head;//Start from the first node
        Node newHead=null;//Initially, we don't know which node will become the new head-->After reversal, the old last node will become the new head
        while(currNode != null){
            Node nextNode=currNode.next;//Store the original next node-->We need this bcoz currNode.next will be changed below
            currNode.next=currNode.prev;//Swap the next link with the prev link
            currNode.prev=nextNode;//Swap the prev link with the original next link
            newHead=currNode;//Keep updating newHead-->The last node processed will eventually become the new head
            currNode=nextNode;//Move to the original next node-->We use nextNode because currNode.next has already been changed
        }
        head=newHead;//The old last node is now the new first node
    }
}

    public class Linkedlist{
    public static void main(String[] args){
        DLL list = new DLL();//list-->ref var that refers to an obj of the DLL class and is used to access its variables and methods
        //Each DLL obj manages its own DLL independently

        //Testing addFirst()
        list.addFirst("a");
        list.addFirst("is");
        System.out.println("The DLL after adding 2 nodes at 1st is:");
        list.printList();


        //Testing addLast()
        list.addLast("list");
        System.out.println();
        System.out.println("The DLL after adding 1 node at last is:");
        list.printList();


        //Testing addFirst() again
        list.addFirst("This");
        System.out.println();
        System.out.println("The DLL again after adding 1 node at 1st is:");
        list.printList();


        //Testing deleteFirst()
        list.deleteFirst();
        System.out.println();
        System.out.println("The DLL after deleting 1 node from 1st is:");
        list.printList();


        //Testing deleteLast()
        list.deleteLast();
        System.out.println();
        System.out.println("The DLL again after deleting 1 node from last is:");
        list.printList();


        //Testing getSize()
        System.out.println();
        System.out.println("The size of the curr DLL is:");
        System.out.println(list.getSize());


        //Adding elements again
        list.addFirst("This");
        list.addLast("list");
        System.out.println();
        System.out.println("The DLL again again after adding 2 nodes at 1st and last is:");
        list.printList();


        //Checking the size again
        System.out.println();
        System.out.println("The size of the current DLL is:");
        System.out.println(list.getSize());


        //Testing deleteLast() again
        list.deleteLast();
        list.deleteLast();
        System.out.println();
        System.out.println("The DLL again after deleting 2 nodes from last is:");
        list.printList();


        //Adding the last element again
        list.addLast("list");
        System.out.println();
        System.out.println("The DLL again after adding 1 node at last is:");
        list.printList();


        //Testing addMiddle()
        list.addMiddle(2, "my");
        System.out.println();
        System.out.println("The DLL after adding a node in middle(at index 2) is:");
        list.printList();


        //Testing deleteMiddle()
        list.deleteMiddle(2);
        System.out.println();
        System.out.println("The DLL after deleting the middle node(at index 2) is:");
        list.printList();


        //Testing revIterate()
        System.out.println();
        System.out.println("The DLL after being reversed(using iterative method) is:");

        list.reverseIterate();
        list.printList();


        //Reversing again to get the original DLL back
        System.out.println();
        System.out.println("The original DLL after reversing again is:");

        list.reverseIterate();
        list.printList();
    }
} */


//B)Without Comments
/* class DLL{
    //1.Implementation of a DLL(From Scratch)
    Node head;
    private int size;

    DLL(){
        this.size=0;
    }

    class Node{
        String data;
        Node next;
        Node prev;

        Node(String data){
            this.data=data;
            this.next=null;
            this.prev=null;
            size++;
        }
    }

    //2.Adding a node to the DLL

    //A)Adding at first
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    //B)Adding at last
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
        newNode.prev=currNode;
    }

    //C)Adding the node in the middle of a DLL
    public void addMiddle(int index,String data){
        if(index<0 || index>size){
            System.out.println("Invalid Index");
            return;
        }
        Node newNode=new Node(data);
        if(head==null || index==0){
            newNode.next=head;
            if(head != null){
                head.prev=newNode;
            }
            head=newNode;
            return;
        }
        Node currNode=head;
        for(int i=0;i<index-1;i++){
            currNode=currNode.next;
        }
        Node nextNode=currNode.next;
        currNode.next=newNode;
        newNode.prev=currNode;
        newNode.next=nextNode;
        if(nextNode != null){
            nextNode.prev=newNode;
        }
    }

    //3.Deleting a node from the DLL

    //A)Deleting the 1st node
    public void deleteFirst(){
        if(head==null){
            System.out.println("The DLL is empty");
            return;
        }
        if(head.next==null){
            head=null;
            size--;
            return;
        }
        head=head.next;
        head.prev=null;
        size--;
    }

    //B)Deleting the last node
    public void deleteLast(){
        if(head==null){
            System.out.println("The DLL is empty");
            return;
        }
        if(head.next==null){
            head=null;
            size--;
            return;
        }
        Node currNode=head;
        while(currNode.next != null){
            currNode=currNode.next;
        }
        currNode.prev.next=null;
        size--;
    }

    //C)Deleting the middle node
    public void deleteMiddle(int index){
        if(head==null){
            System.out.println("The DLL is empty");
            return;
        }
        if(index<0 || index>=size){
            System.out.println("Invalid Index");
            return;
        }
        if(index==0){
            deleteFirst();
            return;
        }
        if(index==size-1){
            deleteLast();
            return;
        }
        Node currNode=head;
        for(int i=0;i<index;i++){
            currNode=currNode.next;
        }
        currNode.prev.next=currNode.next;
        currNode.next.prev=currNode.prev;
        size--;
    }

    //4.Returning the size(Total no. of nodes)of the DLL
    public int getSize(){
        return size;
    }

    //5.Printing the DLL
    public void printList(){
        if(head==null){
            System.out.println("The DLL is empty");
            return;
        }
        Node currNode=head;
        while(currNode != null){
            System.out.print(currNode.data+"-->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }

    //6.Reversing the DLL(using iterative method)
    public void reverseIterate(){
        if(head==null){
            System.out.println("The DLL is empty");
            return;
        }
        Node currNode=head;
        Node newHead=null;
        while(currNode != null){
            Node nextNode=currNode.next;
            currNode.next=currNode.prev;
            currNode.prev=nextNode;
            newHead=currNode;
            currNode=nextNode;
        }
        head=newHead;
    }
}

public class Linkedlist{
    public static void main(String[] args){
        DLL list = new DLL();

        //1.Testing addFirst()
        list.addFirst("a");
        list.addFirst("is");
        System.out.println("The DLL after adding 2 nodes at 1st is:");
        list.printList();

        //2.Testing addLast()
        list.addLast("list");
        System.out.println();
        System.out.println("The DLL after adding 1 node at last is:");
        list.printList();

        //3.Testing addFirst() again
        list.addFirst("This");
        System.out.println();
        System.out.println("The DLL again after adding 1 node at 1st is:");
        list.printList();

        //4.Testing deleteFirst()
        list.deleteFirst();
        System.out.println();
        System.out.println("The DLL after deleting 1 node from 1st is:");
        list.printList();

        //5.Testing deleteLast()
        list.deleteLast();
        System.out.println();
        System.out.println("The DLL again after deleting 1 node from last is:");
        list.printList();

        //6.Testing getSize()
        System.out.println();
        System.out.println("The size of the curr DLL is:");
        System.out.println(list.getSize());

        //7.Adding elements again
        list.addFirst("This");
        list.addLast("list");
        System.out.println();
        System.out.println("The DLL again again after adding 2 nodes at 1st and last is:");
        list.printList();

        //8.Checking the size again
        System.out.println();
        System.out.println("The size of the current DLL is:");
        System.out.println(list.getSize());

        //9.Testing deleteLast() again
        list.deleteLast();
        list.deleteLast();
        System.out.println();
        System.out.println("The DLL again after deleting 2 nodes from last is:");
        list.printList();

        //10.Adding the last element again
        list.addLast("list");
        System.out.println();
        System.out.println("The DLL again after adding 1 node at last is:");
        list.printList();

        //11.Testing addMiddle()
        list.addMiddle(2, "my");
        System.out.println();
        System.out.println("The DLL after adding a node in middle(at index 2) is:");
        list.printList();

        //12.Testing deleteMiddle()
        list.deleteMiddle(2);
        System.out.println();
        System.out.println("The DLL after deleting the middle node(at index 2) is:");
        list.printList();

        //13.Testing reverseIterate()
        System.out.println();
        System.out.println("The DLL after being reversed(using iterative method) is:");
        list.reverseIterate();
        list.printList();

        //14.Reversing again to get the original DLL back
        System.out.println();
        System.out.println("The original DLL after reversing again is:");
        list.reverseIterate();
        list.printList();
    }
} */

