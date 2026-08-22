import java.util.*;

//Implementation of 'Queue' from scratch(Using an array)

//A)With comments
    /* public class QueueDS {
    static class Queue{//Represents the Queue and contains all Queue operations
        //Since Queue is a static nested class-->we can directly create a Queue object without first creating an obj of the outer class QueueDS
        static int[] arr;//Array used to store all Queue elements
        static int size;//Stores the maximum capacity(size)of the Queue
        static int rear;//Stores the index of the last(rear) element of the Queue

        //arr,size,rear-->Declared static so that all Queue objs(Here,only 1 obj) share the same arr,size and rear index in the implementation
        //arr,size,rear-->Declared static because this implementation uses one common arr,size and rear variables for the entire Queue class

        Queue(int size){//Constructor runs automatically whenever a Queue obj is created
            this.size=size;//this.size-->Size variable of the curr Queue obj
            //size-->Value passed to the constructor
            arr=new int[size];//Creates an integer array of the given size to store Queue elements
            rear=-1;//Initially the Queue is empty-->so rear points to an invalid index
        }

        public static boolean isEmpty(){//The method is static bcoz it accesses the static variable rear
            return rear==-1;//Returns true if no element is present in the Queue-->otherwise returns false
        }

        public static boolean isFull(){//The method is static bcoz it accesses the static variables rear,size
            return rear==size-1;//Returns true if rear reaches the last valid index-->otherwise returns false
        }

        //A static method cannot directly access non-static variables because non-static variables belong to objects-->while a static method belongs to the class and has no object(this)to know which objs' variable to use

        //1.Adds(enqueues) a new element at the rear(last valid insertion position) of the Queue
        public static void add(int data){
            if(isFull()){//If Queue is full-->no more elements can be inserted stops the method(By using return;)without inserting the element
                System.out.println("The queue is full");
                return;
            }
            arr[++rear]=data;//First increments rear-->then inserts the new element at the updated rear index
        }

        //2.Removes(Dequeues) the front element from the Queue and returns its value
        public static int remove(){
            if(isEmpty()){//If Queue is empty-->no element can be removed
                System.out.println("The queue is empty");
                return -1;//Returns a special value(-1) indicating Queue Underflow
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){//Shifts all remaining elements one position to the left-->then the front element is automatically removed from the queue
                arr[i]=arr[i+1];
            }
            rear--;//Decreases rear since one element has been removed
            return front;//Returns the removed front element
        }

        //3.Returns the front element without removing it
        public static int peek(){
            if(isEmpty()){//If the Queue is empty-->there is no front element to return
                System.out.println("The queue is empty");
                return -1;
            }
            return arr[0];//Returns the front element without removing it
        }
        }
    public static void main(String[] args) {
        Queue q=new Queue(5);//Creates a Queue obj with a max capacity of 5 elements
        System.out.println("Currently the queue is empty");
        System.out.println();

        q.add(1);//Enqueues(Adds) 1 at the rear of the Queue
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("The queue after adding 5 elements(Using an array) into it is:");
        while(! Queue.isEmpty()){//Although isEmpty() is a static method-->Java allows it to be called using an object reference(q.isEmpty())
        //Java internally treats q.isEmpty() as Queue.isEmpty()-->so the object 'q' is not actually used
            System.out.println(q.peek());
            q.remove();
        }
        System.out.println();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("After adding 5 elements into the queue,the front element is:");
        System.out.println(q.peek());//Prints the curr front element without removing it
        System.out.println();

        System.out.println("The front element removed from the queue is:");
        System.out.println(q.remove());//Removes(Dequeues) and prints the front element

        System.out.println();

        System.out.println("After removing the front element from the queue,the curr front element is:");
        System.out.println(q.peek());
    }
} */

    
//B)Without comments
    /* public class QueueDS {
    static class Queue {
        static int[] arr;
        static int size;
        static int rear;

        Queue(int size) {
            this.size = size;
            arr = new int[size];
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static boolean isFull() {
            return rear == size - 1;
        }

        //1.Adds(Enqueues) a new element at the rear(last valid insertion position) of the Queue
        public static void add(int data) {
            if(isFull()) {
                System.out.println("The queue is full");
                return;
            }
            arr[++rear] = data;
        }

        //2.Removes(Dequeues) the front element from the Queue and returns its value
        public static int remove() {
            if(isEmpty()) {
                System.out.println("The queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        //3.Returns the front element without removing it
        public static int peek() {
            if(isEmpty()) {
                System.out.println("The queue is empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        System.out.println("Currently the queue is empty");
        System.out.println();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("The queue after adding 5 elements(Using an array) into it is:");
        while(!Queue.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
        System.out.println();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("After adding 5 elements into the queue,the front element is:");
        System.out.println(q.peek());
        System.out.println();

        System.out.println("The front element removed from the queue is:");
        System.out.println(q.remove());

        System.out.println();

        System.out.println("After removing the front element from the queue,the curr front element is:");
        System.out.println(q.peek());
    }
} */


//Implementation of 'Circular Queue' from scratch(Using an array)

//A)With comments
    /* public class QueueDS{
    static class Queue{//Represents the Queue and contains all Queue operations
    //Since Queue is a static nested class-->we can directly create a Queue object without first creating an obj of the outer class QueueDS
    static int[] arr;//Array used to store all Queue elements
    static int size;//Stores the max capacity(size)of the Queue
    static int front;//Stores the index of the front element
    //In a Circular Queue-->elements are not shifted(to left)after deletion-->so the front element may not always be at index 0-->Hence, a separate front variable is required    
    static int rear;//Stores the index of the rear(last) element

    //arr,size,front,rear-->Declared static so that all Queue objs(Here,only 1 obj) share the same arr,size,front and rear indices in the implementation
    //arr,size,front,rear-->Declared static because this implementation uses one common arr,size,front and rear variables for the entire Queue class

    Queue(int size){//Constructor runs automatically whenever a Queue obj is created
        this.size=size;//this.size-->Size variable of the curr Queue obj
        //size-->Value passed to the constructor
        arr=new int[size];//Creates an integer array of the given size to store Queue elements
        front=rear=-1;//Initially the Queue is empty-->so both front & rear points to an invalid index(-1)
    }

    public static boolean isEmpty(){
        //Java does not allow chained comparisons like: (rear == front == -1) bcoz:
        //(rear == front) returns a boolean and a boolean cannot be compared with an integer (-1)-->So, each comparison must be written separately and combined using the && operator

        return front==-1 && rear==-1;//The Queue is empty only when both front and rear point to -1
    }
    public static boolean isFull(){//If the next position of rear becomes equal to front-->then there is no empty space left to insert a new element-->so the Circular Queue is full
        return (rear+1)%size==front;//The %(modulus) operator brings rear back to index 0 after reaching the last index-->making the Queue circular

    }

    //1.Adds(Enqueues) a new element at the rear(last valid insertion position) of the Circular Queue
    public static void add(int data){
        if(isFull()){
            System.out.println("The queue is full");
            return;//Stops the method which prevents further insertion of elements
        }
        if(front==-1){//For the first insertion-->the inserted element becomes both the front and rear of the Queue-->So,front is initialized to index 0 only once(Bcoz front should always point to the 1st element of the queue)
            front++;
        }
        //Only rear moves during insertion because new elements are always inserted at the rear-->The front element does not change during insertion
        rear=(rear+1)%size;//The %(modulus) operator brings rear back to index 0 after reaching the last index-->making the Queue circular
        arr[rear]=data;//Inserts the new element at the updated rear index
    }

    //2.Removes(Dequeues) the front element from the Circular Queue and returns its value
    public static int remove(){
        if(isEmpty()){
            System.out.println("The queue is empty");
            return -1;//Returns a special value(-1) indicating-->the Queue is empty
        }
        int elemToBeRem=arr[front];//Stores the front element because it has to be returned after updating front/rear

        //Do NOT check: if(front == 0 && rear == 0 (or) front == rear == 0)
        //A Queue with only one element can be at any index (0,1,2,...)-->So, we check front == rear, which means both pointers refer to the same(only) element,regardless of its index

        if(rear==front){
        //front==rear-->Only one element is present in the Queue-->After removing it, the Queue becomes empty
        //The element is not physically deleted from the array-->Making front and rear point to '-1' simply makes that element inaccessible to the Queue
        //Later insertions however will overwrite that position
            rear=front=-1;
        }
        else{
        front=(front+1)%size;
        }
        //In a Circular Queue-->elements are NOT shifted(to left) after deletion-->Instead, front simply moves to the next circular position(Element)
        //The prev element is considered removed because the Queue can no longer access it
        //The %(modulus) operator brings front back to index 0 after reaching the last index
        return elemToBeRem;//Returns the removed front element
    }

    //3.Returns the front element without removing it
    public static int peek(){
        if(isEmpty()){
            System.out.println("The queue is empty");
            return -1;
        }
        return arr[front];//Returns the element at the front index without removing it-->Neither front (nor) rear is modified-->so the Queue remains unchanged
    }
    }

    public static void main(String[] args) {
        Queue q=new Queue(5);//Creates a Circular Queue obj with a max capacity of 5 elements
        System.out.println("Currently the queue is empty");
        System.out.println();
        q.add(1);//Enqueues(Adds) elements into the Circular Queue
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("The queue after adding 5 elements(Using an array) into it is:");
        while(! q.isEmpty()){//Prints and removes all Queue elements until the Queue becomes empty
            System.out.println(q.remove());
        }
        System.out.println();

        q.add(1);//Enqueues(Adds) elements again for further their removal
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("The front element currently removed from the queue is:");
        System.out.println(q.remove());//Dequeues(Removes) and prints the front element

        System.out.println("Adding an element(6) into the queue at the rear position");
        q.add(6);//Reuses the freed space(Circular Queue property)

        System.out.println("The front element currently removed from the queue is:");
        System.out.println(q.remove());//Dequeues(Removes) and prints the next front element

        System.out.println("Adding an element(7) into the queue at the rear position");
        q.add(7);//Again reuses the next available circular position
        System.out.println();

        System.out.println("Now,the final circular queue is:");
        while(! q.isEmpty()){//Prints all remaining Queue elements using peek() and then removes them one by one
            System.out.println(q.peek());
            q.remove();
        }

        //Output proves the Circular Queue property:
        //6 and 7 are inserted at the freed indices(0 and 1) after deleting 1 and 2-->reusing the empty spaces
    }
} */


//B)Without comments
    /* public class QueueDS {
    static class Queue {
        static int[] arr;
        static int size;
        static int front;
        static int rear;

        Queue(int size) {
            this.size = size;
            arr = new int[size];
            front = rear = -1;
        }

        public static boolean isEmpty() {
            return front == -1 && rear == -1;
        }
        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        //1.Adds(Enqueues) a new element at the rear(last valid insertion position) of the Circular Queue
        public static void add(int data) {
            if (isFull()) {
                System.out.println("The queue is full");
                return;
            }
            if (front == -1) {
                front++;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        //2.Removes(Dequeues) the front element from the Circular Queue and returns its value
        public static int remove() {
            if (isEmpty()) {
                System.out.println("The queue is empty");
                return -1;
            }
            int elemToBeRem = arr[front];
            if (rear == front) {
                rear = front = -1;
            } 
            else {
                front = (front + 1) % size;
            }
            return elemToBeRem;
        }

        //3.Returns the front element without removing it
        public static int peek() {
            if (isEmpty()) {
                System.out.println("The queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        System.out.println("Currently the queue is empty");
        System.out.println();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("The queue after adding 5 elements(Using an array) into it is:");
        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }

        System.out.println();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("The front element currently removed from the queue is:");
        System.out.println(q.remove());

        System.out.println("Adding an element(6) into the queue at the rear position");
        q.add(6);

        System.out.println("The front element currently removed from the queue is:");
        System.out.println(q.remove());

        System.out.println("Adding an element(7) into the queue at the rear position");
        q.add(7);
        System.out.println();

        System.out.println("Now,the final circular queue is:");
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
} */


//Implementation of queue from scratch(Using LL)

//A)With comments
    /* public class QueueDS{
    static class Node{//Represents one node of the LL used to implement the Queue
        //Instance variables:
        int data;//Stores the value of the node
        Node next;//Stores the reference to the next node

        Node(int data){//Constructor runs automatically when a newNode is created
            this.data=data;//Stores the value passed to the constructor in the node
            next=null;//Initially-->the node does not point to any other node
        }
    }
    //Node is kept outside the Queue class to separate the Node structure from Queue operations
    //Node can also be declared inside Queue-->Both are valid

    static class Queue{
        static Node head=null;//Points to the front node-->used for remove() and peek()
        static Node tail=null;//Points to the rear(Last) node-->used for add()

    //Two pointers are used bcoz Queue operations happen at both ends:
    //head-->front(removal/peek) and tail-->rear(insertion)
    //tail allows insertion at the rear in O(1) without traversing the list

    public static boolean isEmpty(){
        return head==null && tail==null;
    }
    //In LL implementation-->no isFull() check is needed bcoz the Queue has dynamic size-->nodes can be added until the available memory is exhausted

    //1.Adds(Enqueues) a new element at the tail of the Queue
    public static void add(int data){
        Node newNode=new Node(data);//Creates a new node with the given data
        if(isEmpty()){
            head=tail=newNode;//For the 1st node-->both head and tail point to it
            return;
        }
        tail.next=newNode;//Connects the curr last node to the newNode
        tail=newNode;//Moves tail to the new last node

        //Key idea: head does not move during insertion bcoz new nodes are always added at the rear(last)-->So, only tail moves to point to the newly added last node
    }

    //2.Removes(Dequeues) the front element from the Queue and returns its value
    public static int remove(){
        if(isEmpty()){
            System.out.println("The queue is empty");
            return -1;//Queue is empty-->so no element can be removed
        }
        int front=head.data;//Stores the front element before moving head

        //Condition for a single node
        if(head==tail){
            head=tail=null;//Queue becomes empty after removing the only node
            return front;
        }
        head=head.next;//Moves head to the next node-->removing the curr front logically
        //The old front node becomes unreachable from the Queue and is eventually handled by Java's garbage collector
        return front;//Returns the removed front element
    }

    //3.Returns the front element without removing it
    public static int peek(){
        if(isEmpty()){
            System.out.println("The queue is empty");
            return -1;//Queue is empty-->so no front element exists
        }
        return head.data;//Returns the front element without changing anything(head or tail)
    }
}
    public static void main(String[] args) {
        //When the Queue class is initialized-->static head and tail are initialized to null then itself
        //They are static-->so they belong to the Queue class and are shared by all Queue objects(Here, there is only 1 queue object)

        Queue q=new Queue();//Creates a Queue object
        System.out.println("The Queue is empty initially");
        System.out.println();

        System.out.println("The queue after adding 5 elements into it(Using LL) is:");
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(! q.isEmpty()){
            System.out.println(q.peek());//Views the front element
            q.remove();//Removes the front element
        }

        //Queue follows FIFO-->Elements are added at the rear(tail) and removed/viewed from the front(head)
    }
} */


//B)Without comments
    /* public class QueueDS {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        //1.Adds(Enqueues) a new element at the tail of the Queue
        public static void add(int data) {
            Node newNode = new Node(data);

            if(isEmpty()) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        //2.Removes(Dequeues) the front element from the Queue and returns its value
        public static int remove() {
            if(isEmpty()) {
                System.out.println("The Queue is empty");
                return -1;
            }

            int front = head.data;

            if(head == tail) {
                head = tail = null;
                return front;
            }

            head = head.next;
            return front;
        }

        //3.Returns the front element without removing it
        public static int peek() {
            if(isEmpty()) {
                System.out.println("The Queue is empty");
                return -1;
            }

            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        System.out.println("The Queue is empty initially");
        System.out.println();

        System.out.println("The Queue after adding 5 elements into it(Using LL) is:");

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
} */


//Implementation of 'Queue' from scratch (Using collection frameworks)
    /* public class QueueDS {
    //ArrayDeque is a resizable double-ended queue which supports insertion and deletion from both the front and rear
    //ArrayDeque is generally preferred over LL bcoz it has lower memory overhead and better cache performance
    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<Integer>();//'q' is a reference variable of type Queue<Integer> that stores Integer objects-->while the Queue interface is implemented using the concrete class(ArrayDeque)
        System.out.println("The Queue is empty currently");
        System.out.println();

        //Queue is an interface-->so it cannot be instantiated(creating an obj of the class) directly using new Queue()
        //ArrayDeque is a concrete class that implements Queue-->Concrete classes can be instantiated(so its object can be created)

        System.out.println("The Queue after adding 5 elements into it(Using java collection frameworks is:");
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
    
        while(! q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }                                                       
    }
} */


//Implementation of Queue Using Two Stacks
    /* public class QueueDS{
    static class Queue{

        //s1 and s2 are static bccoz all Queue methods are static and can directly access these shared Stack objects
        static Stack<Integer> s1=new Stack<Integer>();//'s1' is a reference variable of type Stack<Integer> that points to a Stack obj-->The Stack obj can store Integer values(internally as Integer objs)
        static Stack<Integer> s2=new Stack<Integer>();//'s2' is also a reference variable pointing to another Stack object that stores Integer objects(values)

        //s1 maintains the Queue order(FIFO)
        //s2 is used temporarily while rearranging elements during add()

        public static boolean isEmpty(){
            return s1.empty();//s1 represents the actual Queue-->while s2 is only a temporary helper-->So, Queue emptiness is checked only using 's1'
        }

        //s1/s2 before the dot determine which Stack object's method is called
        //Ex:s2.isEmpty()-→isEmpty() executes on the Stack object referenced by s2

        //1.Adds(Enqueues) a new element into the Queue
        public static void add(int data){
            while(! s1.isEmpty()){
                s2.push(s1.pop());//Move elements away(into s2)
            }
            s1.push(data);//Inserts the new element into s1

            while(! s2.isEmpty()){
                s1.push(s2.pop());//Move the elements of s2 back into s1
                //This keeps the oldest element at the top of s1-->giving FIFO behavior
            }
        }

        //2.Removes(Dequeues) the front element from the Queue
        public static int remove(){
            if(s1.isEmpty()){
                return -1;
            }
            return s1.pop();//add() already keeps the oldest element at the top of s1-->So, pop() directly removes the Queue's front element and returns it 
        }

        //3.Returns the front element without removing it
        public static int peek(){
            if(s1.isEmpty()){
                return -1;
            }
            return s1.peek();//The oldest element is always at the top of s1-->peek() views it without removing it
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        System.out.println("The Queue is empty currently");
        System.out.println();

        System.out.println("The Queue after adding 5 elements into it(Using 2 stacks) is:");
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);


        //Queue follows FIFO-->add() rearranges s1 so the oldest element remains at the top
        while(! q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
} */

