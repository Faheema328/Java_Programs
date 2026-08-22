import java.util.*;

//1.Implementation of stack from scratch(Using LL)
//Stack-->A Stack is a linear data structure that follows the LIFO principle,where push and pop operations are performed only at one end called the Top


//A)With comments
    /* public class StackDS {
    private static class Node{//Represents one node of the LL used to implement the Stack
        //private-->Node is accessible only inside the outer class StackDS-->so all the nested classes(like Stack)can use it
        //static-->Node class can be used directly without creating a StackDS class' obj
        int data;//Instance variable-->Every node has its own copy to store data
        Node next;//Reference variable of type Node that stores the address of the next node

        Node(int data){//Constructor runs automatically whenever a new node is created
        this.data=data;//this.data-->Current node's data
        //data-->Value passed to the constructor
        next=null;//Initially-->When a newNode is created it is not connected to any other node
        }
    }
    static class Stack{//Represents the Stack and contains all Stack operations 
        public static Node head=null;//Head acts as the Top of the Stack-->It is of type Node boz it stores the reference to the first node
        //null-->the Stack is currently empty(the LL has no nodes)

        //1.Add(push) an element onto the Stack
    public static void push(int data){//Adds a new element at the Top of the Stack
        Node newNode=new Node(data);//Creates a newNode containing the given data
        if(head==null){//Checks whether the Stack is empty
            head=newNode;//The 1st node becomes the Top of the Stack
            return;//Insertion is complete
        }
        //If Stack is not empty
        newNode.next=head;//Connects the newNode to the curr Top
        head=newNode;//Updates the Top to the newly inserted node
    }

    public static boolean isEmpty(){//Returns whether the Stack is empty or not
        return head==null;//Returns true if head points to null-->else returns false
    }

    //2.Remove(pop) the Top element and return its data
    public static int pop(){//Removes the Top node from the Stack and returns its data
        if(isEmpty()){//Calls isEmpty() instead of writing (head == null) again-->Avoids repeating the same condition and improves code readability
            return -1;//Stack is empty-->so no element can be removed and a special value(-1)is returned
        }
        Node top=head;//Stores the reference of the Top node because we need to return its data after removing it
        //Without the top reference variable-->we lose access to the node that is about to be deleted
        head=head.next;//Removes the Top node by moving head to the next node
        return top.data;//Returns the data stored in the removed node
    }

    //3.Return the data of the Top node
    public static int peek(){//Returns the Top element without removing it
        if(isEmpty()){
            return -1;
        }
        Node top=head;//Stores the reference of the Top node for easy access(Improves readability)
        return top.data;//We could also directly write return head.data;
    }
}
    public static void main(String[] args){
        Stack stack=new Stack();

        System.out.println("Currently the stack is empty");
        System.out.println();
        
        stack.push(1);//Pushes(Adds) 1 onto the Stack
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("The stack after adding 5 elements onto(Using LL) is:");

        //Since a Stack follows LIFO-->the elements are printed in the reverse order of insertion
        while(!stack.isEmpty()){//Runs until the Stack becomes empty
            System.out.println(stack.peek());//Prints the Top element without removing it
            stack.pop();//Removes the curr Top-->so the nxt element becomes the new Top and can be printed in the next iteration
        }
    }
} */


//B)Without comments
    /* public class StackDS {
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Stack {//Represents the stack
        public static Node head = null;

        //1.Add(push) an element onto the Stack
        public static void push(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static boolean isEmpty() {
            return head == null;
        }

        //2.Remove(pop) the Top element and return its data
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            Node top = head;
            head = head.next;
            return top.data;
        }

        //3.Return the data of the Top node
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            Node top = head;
            return top.data;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();//Follows LIFO

        System.out.println("Currently the stack is empty");
        System.out.println();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("The stack after pushing 5 elements onto(Using LL) is:");

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
} */


//2.Implementation of stack from scratch(Using AL)
    /* public class StackDS{
    static class Stack{//Represents the Stack and contains all Stack operations
        //The Stack class is declared static-->so that it can be used inside the static main() method without creating an obj of the outer class StackDS
        ArrayList<Integer> list=new ArrayList<Integer>();
        //ArrayList(A Generic Class)-->Works only with different data types(objs)[Do not work with primitive data types] without rewriting the code-->The data type is specified inside < >


        public void push(int data){//Adds(Pushes)an element onto the Top of the Stack
            list.add(data);//The last element of the AL is always considered the Top of the Stack
        }

        public boolean isEmpty(){//Checks whether the Stack is empty or not
            return list.size()==0;
        }

        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=list.get(list.size()-1);//Stores the Top element(Of the stack)
            list.remove(list.size()-1);//Removes the Top element(From the stack)
            return top;
        }

        public int peek(){//Prints the curr Top element without removing it
            if(isEmpty()){
                return -1;//-1 is a special value indicating that the Stack is empty
            }
            int top=list.get(list.size()-1);
            return top;
        }

    }
    public static void main(String[] args) {//A static method can directly access only static members(static variables,static methods and static nested classes)of the same class
        Stack stack=new Stack();//Creates an objeobjct of the Stack class
        System.out.println("Currently the stack is empty");
        
       System.out.println("The stack after pushing 5 elements onto(Using AL) is:");
       stack.push(1);
       stack.push(2);
       stack.push(3);
       stack.push(4);
       stack.push(5);

       while(!stack.isEmpty()){//Runs until the Stack becomes empty
        System.out.println(stack.peek());
        stack.pop();//Removes the curr Top element(After printing it)-->The next element automatically becomes the new Top
       }
    }
} */


//3.Implementation of stack(Using Java's collection frameworks)
    /* public class StackDS{
    public static void main(String[] args) {
        Stack stack=new Stack();//Creates a Stack object
        System.out.println("Currently the stack is empty");

        System.out.println("The stack after pushing(adding) 5 elements onto it(Using JCFs) is:");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        while(!stack.isEmpty()){//Prints and removes elements until the Stack becomes empty
            System.out.println(stack.peek());//Prints the curr Top element
            stack.pop();//Removes the curr Top element
        }
    }
} */


//4.A program to insert an element at the bottom of a Stack using recursion
    /* public class StackDS{
    public static void pushAtBottom(Stack<Integer> s,int data){//This recursive method pushes an element at the Bottom of a Stack 
        if(s.isEmpty()){//Base Case-->If the Stack becomes empty-->insert the new element(At bottom)
            s.push(data);
            return;        
        }
        int temp=s.pop();//Stores the curr Top element before removing it
        pushAtBottom(s,data);//Recursively removes all elements until the Stack becomes empty
        s.push(temp);//While backtracking-->pushes the removed elements back in the same order

        //After Call 1 ends-->method execution is complete-->so control automatically returns(implicit return)to the main() method
    }

    public static void main(String[] args) {  
        Stack stack=new Stack();
        System.out.println("Currently the stack is empty");
        System.out.println();


        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("The stack after adding 3 elements onto is:");
        while(! stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
        System.out.println();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        pushAtBottom(stack,4);//Calls the method to push an element at the Bottom of a Stack using Recursion

        System.out.println("The stack after inserting an element(4) at the bottom of a Stack is:");
        while(! stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
    //We return newHead in the LL bcoz the head changes after reversal-->so main() must know the new first node
    //In this Stack problem-->we don't return the Stack because all recursive calls modify the same Stack object-->so main() automatically sees the updated Stack
} */


//5.Reversing a Stack using Recursion
    /* public class StackDS{
    public static void pushAtBottom(Stack<Integer> s,int data){//Inserts an element at the Bottom of the Stack
        if(s.isEmpty()){//Base Case-->If the Stack becomes empty-->insert the new element
            s.push(data);
            return;
        }
        int temp=s.pop();//Stores the curr Top element before removing it
        pushAtBottom(s,data);//Recursively removes all elements until the Stack becomes empty
        s.push(temp);//While backtracking-->pushes the removed elements back in the same order
    }

    public static void revStack(Stack<Integer> s){//Reverses the Stack using Recursion
        if(s.isEmpty()){//Base Case-->If the Stack becomes empty-->Recursion stops and Backtracking starts
            return;
        }
        int top=s.pop();//Stores the curr Top element before removing it
        revStack(s);//Recursively removes all elements from the Stack
        pushAtBottom(s,top);//While backtracking-->inserts each removed element at the Bottom
    }

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<Integer>();
        System.out.println("Currently the stack is empty");
        System.out.println();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("The stack after adding 3 elements onto is:");
        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }

        stack.push(1);
        stack.push(2);
        stack.push(3);

        revStack(stack);//Calls the revStack() method to reverse all the elements of the Stack recursively

        System.out.println("The stack after being reversed using recursion is:");
        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
} */




