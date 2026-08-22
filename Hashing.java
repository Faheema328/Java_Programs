//HashSet-->It is a JCF that implements the 'Set' interface and stores only unique elements-->It does not allow duplicates and provides average O(1) time complexity for add(),remove() and contains() operations using hashing

//1.Implementation of HashSet and its Basic Operations
    /* public class Hashing {
    public static void main(String[] args) {

        //Creating a HashSet
        HashSet<Integer> set=new HashSet<Integer>();//'set' is a ref var of type HashSet<Integer> that points to a HashSet obj storing Integer objs
        System.out.println("The HashSet is empty currently");
        System.out.println();

        //HashSet stores only unique elements and does not allow duplicate values
        //1.Adding elements into the set
        set.add(0);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(1);

        //2.Finding the size(total no. of elements in the set)
        System.out.println("After adding few elements(two 1's) into the set...Now, the total no. of elements present in the set are:");
        System.out.println(set.size());
        System.out.println();

        //3.Checking whether an element is present or not(in the set)
        if(set.contains(0)){//contains() returns true if the given element exists in the HashSet
            System.out.println(0+" is present in the set");
            System.out.println();
        }
        else{
            System.out.println(0+" is not present in the set");
            System.out.println();
        }

        //4.Removing an element from the set
        System.out.println("Removing '1' from the set");
        System.out.println();
        set.remove(1);

        //5.Printing the HashSet
        System.out.println("The elements of the curr set are:");
        System.out.println(set);
        System.out.println();

       Iterator it=set.iterator();//iterator() creates an Iterator obj to traverse through the elements of the HashSet bcoz it is not built-in already
       
       //6.Traversing the HashSet using an Iterator and then printing its' elements
       System.out.println("Printing the elements of the curr set using an iterator:");
       while(it.hasNext()){//hasNext() checks whether another element is available or not
        System.out.print(it.next()+" ");//next() returns the next available element and moves the iterator forward automatically
       }
       System.out.println();
       System.out.println();

       //7.Checking whether the HashSet is empty or not
       if(set.isEmpty()){//isEmpty() returns true if the HashSet contains no elements
        System.out.println("The set is empty");
        System.out.println();
       }
       else{
        System.out.println("The curr set is not empty");
        System.out.println();
       }
    }
} */


import java.util.*;
//HashMap-->It is a Java 'Map' implementation that stores data as key-value pairs-->using hashing with average O(1) time for put(),get() and remove() operations

//2.Implementation of HashMap and its Basic Operations
    /* public  class Hashing{
    public static void main(String[] args) {
        //Creation of a Hashmap
        HashMap<String,Integer> map=new HashMap<>();//'map' is a ref var of type HashMap<String, Integer> which points to a HashMap object that stores String keys and Integer values
        System.out.println("The HashMap is empty currently");
        System.out.println();


        //1.Inserting elements into the HashMap
        System.out.println("After adding 5 pairs,the curr Hashmap is:");
        map.put("India",120);
        map.put("USA",30);//put(key, value) adds a new key-value pair to the HashMap
        map.put("China",150);
        map.put("Dubai",25);
        map.put("Japan",100);

        System.out.println(map);
        System.out.println();


        //2.Updating the values of two keys in the Hashmap
        System.out.println("After updating the values of 2 keys(China & Japan),the curr HashMap is:");
        map.put("China",180);//If the key already exists-->put() updates its value instead of creating a duplicate key
        map.put("Japan",110);
        //A HashMap allows duplicate values but does not allow duplicate keys-->Each key must be unique, while multiple keys can have the same value

        System.out.println(map);
        System.out.println();


        //3.Searching for a key in the HashMap
        if(map.containsKey("Saudi Arabia")){//containsKey() checks whether the given key exists in the HashMap or not
            System.out.println("The key 'Saudi Arabia' exists in the map");
            System.out.println();
        }
        else{
            System.out.println("The key 'Saudi Arabia' does not exist in the map");
            System.out.println();  
        }


        //4.Returning the value associated with the key
        System.out.println("The value associated with the key 'Dubai' is: "+map.get("Dubai"));
        //get(key) returns the value associated with the given key-->If the key does not exist, get() returns null
        System.out.println("The value assosiated with the key 'France' is: "+map.get("France"));
        System.out.println();


        //5.Iterating using entrySet()
        for(Map.Entry<String,Integer> e : map.entrySet()){//entrySet() returns all key-value pairs as Entry object-->Each Entry represents one complete key-value pair
            System.out.println("The key of the curr entry is: "+e.getKey());//'e' is a ref var pointing to the curr Entry-->getKey() returns the key of the curr Entry
            System.out.println("The value of the curr key is: "+e.getValue());//getValue() returns the value of the curr Entry
            System.out.println();
            }


       //6.Iterating using keySet()
        Set<String> keys=map.keySet();//keySet() returns all the keys of the HashMap as a Set

        for(String key : keys){//Enhanced For-Loop
            //key contains the curr key-->map.get(key) returns the value associated with that key
            System.out.println("The key from the curr pair(key-value) is: "+key);
            System.out.println("The value associated with the curr key "+key+" is: "+map.get(key));
            System.out.println();
        }
       

        //7.Removing a pair(key-value) from the HashMap
        System.out.println("After removing 2 pairs(key-value) from the HashMap, the curr HashMap is:");
        map.remove("China");//remove(key) removes the key-value pair associated with the given key
        map.remove("Japan");
        System.out.println(map);
    }
} */


//3.Implementation of HashMap from Scratch Using Hashing and LLs
//Hashing-->It is a technique of mapping a key to an index using a hash function for fast data storage and retrieval

//A)With comments
    /* public class Hashing{
    static class HashMap<K,V>{//Our own HashMap implementation using generics--->K=Key type, V=Value type--><K,V> makes the HashMap reusable for different key-value data types

    private class Node{//Node represents one 'key-value pair' stored inside the HashMap
        //private-→Node is an internal implementation detail and should not be accessed directly from outside

        K key;//Stores the key
        V value;//Stores the value associated with the key

        public Node(K key,V value){//private-→Only the HashMap implementation needs to create Nodes
        //A private class can have its own constructor with separate access control(i.e public here)
            this.key=key;//Stores the given key in the Node
            this.value=value;//Stores the given value in the Node
        }
    }

    private int n;//n-→Total no. of key-value pairs(nodes) currently stored
    private int N;//N-→Total number of buckets(size of the array)
    //n, N and buckets-->non-static bcoz they represent the state of each individual HashMap obj
    //Making them static would create one shared copy for the entire class instead of separate copies for each HashMap

    private LinkedList<Node> buckets[];//private-→bucket structure is an internal implementation detail-->outside code should use HashMap methods instead of directly modifying buckets
    //Each bucket is a LL that stores Node objs-->LLs are used bcoz multiple Nodes may fall into the same bucket(index) due to collisions


    //LinkedList<E> is a generic class-->while LinkedList<Node> is a parameterized type that represents a LL storing Node objs
    @SuppressWarnings("unchecked")//Suppresses(prevents smtg from being shown) the unchecked conversion warning caused by assigning a raw LL array to the generic reference LinkedList<Node>[]

    public HashMap(){
        this.N=4;//N-→No.of buckets(size of our array)-->Initially, our HashMap has 4 buckets-→indexes 0, 1, 2, 3
        this.buckets=new LinkedList[4];//Creates an array with 4 LL references-->Initially, all 4 positions contain null
        //Java does not allow direct creation of arrays of parameterized/generic types-->So, we create the array using the 'raw' type-->new LinkedList[4] instead of LinkedList<Node>[4](which is a parameterized type) 

        for(int i=0;i<4;i++){//Creates an empty LL for each bucket(index)-->The array stores references to these LL objs
            this.buckets[i]=new LinkedList<Node>();
        }
    }

    //1.Finding the 'bi' for a given Key using Hashing
    private int hashFunction(K key){
        int hashCode=key.hashCode();//hashCode() is a buit-in java's method that converts the 'key' into an int hashcode-->The actual value returned by hashCode() is always an int
        //The hashcode is not a random bucket index-->it can be +ve, -ve or 0
        int bi=Math.abs(hashCode) % N;//Math.abs() converts a neg hashcode into a non-negative value(+ve)-->'% N' maps the hashcode to a valid bucket index from 0 to N-1(3 here)
        return bi;
    }
    //bi-→Which LL should we search?
    //di-→Which Node inside that LL?

    //2.Searching for a Key Inside the LL of a Bucket
    private int searchInLL(K key,int bi){
        LinkedList<Node> ll=buckets[bi];//buckets[bi] gives the LL stored at 'bi'-->ll is a ref var that points to that existing LL-->No new LL is created here
        for(int i=0;i<ll.size();i++){//'i' represents the index of a Node inside the LL-->size() returns the total no. of Nodes currently present in the LL
            if(ll.get(i).key==key){//get(i) returns the Node obj stored at index i-->.key accesses the key stored inside that Node
        //For String keys-->we will use .equals() when we reach the String comparison block
                return i;//'i' is the data index(di) of the matching Node inside the bucket
            }
        }
        return -1;//-1 means the key was not found anywhere in this bucket
    }

    //'Rehashing' means creating a larger bucket array and re-inserting all existing 'key-value' pairs(Nodes) so that they are distributed according to the new bucket count

    @SuppressWarnings("unchecked")//Suppresses(prevents smtg from being shown) the unchecked conversion warning caused by creating a raw LL array and assigning it to LinkedList<Node>[N*2](which is a parameterized type)

    //3.Increasing the no. of Buckets and Re-inserting All Existing Nodes into the new bucket
    private void reHashing(){
        LinkedList<Node> oldBuckets[]=buckets;//Save the ref to the oldBucket array-->This is necessary bcoz we are going to create a new, larger bucket array but we should not lose access to the existing Nodes stored in the oldBuckets(old array)
        N=N*2;//Double the no. of buckets
       buckets=new LinkedList[N];//Create a new bucket array with double the no. of oldBuckets-->If N = 4-→ new array has 8 bucket positions-->Java does not allow new LinkedList<Node>[N*2] but allows LinkedList[N*2]

       for(int i=0;i<buckets.length;i++){//Create an empty LL obj for every new bucket
        buckets[i]=new LinkedList<Node>();
       }
       for(int i=0;i<oldBuckets.length;i++){//Traverse every bucket of the oldBucket array
        LinkedList<Node> ll=oldBuckets[i];//ll is a ref var pointing to the existing LL stored at the curr bucket of the oldBucket array
        for(int j=0;j<ll.size();j++){//Traverse every Node inside the curr LL-->'j' represents the index of the Node inside that LL
            Node node=ll.get(j);//get(j) returns the particular Node obj stored at index 'j'
            put(node.key,node.value);//Every Node obj contains its own 'key' and 'value' fields-->which are initialized by the Node constructor when the Node obj is created
            //The 'key' and 'value' stay associated bcoz both fields belong to the same Node obj
        }
       }
    }

    //4.Inserting a New Key-Value Pair(node) or Updating an Existing Key's Value
    public void put(K key,V value){
        int bi=hashFunction(key);//Find the 'bi' for this key using its hashCode
        int di=searchInLL(key,bi);//Search for the key inside that bucket's LL
        if(di==-1){//key does not exist inside that bucket's LL
            buckets[bi].add(new Node(key,value));//Create a newNode containing this key and its associated value and add it to the bucket
            n++;//A new 'key-value' pair has been added-->so increase the Node count
        }
        else{//di >= 0-→key already exists at that Node index
            Node node=buckets[bi].get(di);//Get the existing Node from the bucket
            node.value=value;//Every Node has its own key and value fields-->node.value accesses the value stored in this particular Node
            //Only the 'value' is updated-->the existing 'key' remains unchanged
        }
        double loadFactor=(double) n/N;//Load factor = Total no. of stored Nodes / Total no. of buckets-->It tells us how crowded the HashMap is
        if(loadFactor>2.0){//If load factor becomes greater than 2.0-->the table is considered too crowded and rehashing is required
            reHashing();
        }
    }

    //5.Checking Whether a Particular Key Exists in the HashMap
    public boolean containskey(K key){
        int bi=hashFunction(key);//Finds the 'bi' where this key should be present
        int di=searchInLL(key,bi);//Search for the key inside that particular bucket
        if(di==-1){//Key was not found in the bucket
            return false;
        }
        else{//Key was found in the bucket
            return true;
        }
    }

    //6.Removing a Key-Value Pair(node) and Returning the Removed Value
    public V remove(K key){
        int bi=hashFunction(key);//Find the 'bi' where this key should be present
        int di=searchInLL(key,bi);//Search for the key inside that bucket's LL
        if(di==-1){//Key does not exist-->so there is no Node to remove-->'null' indicates that no value was found for this key
            return null;
        }
        else{
            Node node=buckets[bi].remove(di);//remove(di) removes the Node at index 'di' from the LL and returns the removed Node obj-->The returned Node is stored in the ref var 'node'
            //Every Node contains its own key and its associated value
            n--;//One key-value pair(Node) has been removed-->So decrease the count of total no. of Nodes
            return node.value;//node refers to the particular Node that was just removed-->node.value accesses the value stored inside that removed Node and returns the value associated with the removed key
        }
    }

    //7.Getting the Value Associated with the Given Key
    public V getValue(K key){
        int bi=hashFunction(key);//Find the 'bi' where this key should be present
        int di=searchInLL(key,bi);//Search for the key inside that bucket's LL
        if(di==-1){//Key does not exist-->so there is no associated value to return-->null indicates that the key was not found
            return null;
        }
        else{
            Node node=buckets[bi].get(di);//get(di) returns the Node stored at index 'di'-->The Node remains inside the LL
            return node.value;//Every Node contains its own key and associated value-->node.value accesses the value stored in this particular Node and returns that value without modifying the HashMap
        }
    }

    //8.Collecting and Returning All Keys Present in the HashMap
    public ArrayList<K> keySet(){
        ArrayList<K> keys=new ArrayList<K>();//Create an empty AL to store all the key-->'K' represents the generic type of our keys(AL)-->For HashMap<String, Integer>(HashMap<K,V>) it becomes ArrayList<String>
        for(int i=0;i<buckets.length;i++){//Traverse every bucket in the bucket array-->'i' represents the 'bi'
            LinkedList<Node> ll=buckets[i];//buckets[i] gives the LL stored at the curr bucket-->'ll' is a ref var pointing to that existing LL
            for(int j=0;j<ll.size();j++){//Traverse every Node inside the curr LL-->'j' represents the Node's index inside that LL
                Node node=ll.get(j);//get(j) returns the particular Node stored at index 'j'
                keys.add(node.key);//Every Node contains its own key and associated value-->node.key accesses the key stored in this particular Node and adds that key to our 'AL'
            }
        }
        return keys;//After visiting every bucket and every Node-->return the AL containing all the keys
    }

    //9.Checking Whether the HashMap Currently Contains No Key-Value Pairs(nodes)
    public boolean isEmpty(){
        return n==0;//'n'-->No. of Nodes(key-value pairs) currently stored
        //buckets.length tells us the no. of bucket positions but not the no. of elements(nodes) currently stored in the HashMap
    }
}
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();//Create an obj of our custom HashMap class which stores 'String' keys with 'Integer' values
        System.out.println("The HashMap is empty currently");
        System.out.println();

        System.out.println("After adding 6 nodes(key-value pairs) into the HashMap,");
        map.put("India",150);//Insert the nodes(key-value pairs) using our custom put() method
        map.put("US",80);
        map.put("China",180);
        map.put("UAE",50);
        map.put("Japan",120);
        map.put("France",75);

        System.out.println("The 6 key-value pairs currently present in the HashMap are:");
        System.out.println();
        ArrayList<String> keys=map.keySet();//keySet() traverses all buckets and Nodes and returns an AL containing all the keys

        for(int i=0;i<keys.size();i++){//Traverse the AL of keys where 'i' represents the index of a key inside the AL
            System.out.println("The value associated with the key "+keys.get(i)+" is: "+map.getValue(keys.get(i)));//keys.get(i)-→Gets the key at index 'i'-->map.getValue(keys.get(i))-→ uses that key to get its associated value 
        }
        System.out.println();

        map.remove("France");//Remove the key "France" and its associated value from the HashMap
        System.out.println("After removing the key(France)-value(75) pair from the HashMap, the value associated with the key(France) is: "+map.getValue("France"));//Try to get the value associated with "France" after removal-->Since the key "France" no longer exists-->getValue() returns null
    }
} */


//B)Without comments
    /* public class Hashing{
    static class HashMap<K,V>{

        private class Node{
            K key;
            V value;

            public Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }
        private int n;
        private int N;
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N=4;
            this.buckets=new LinkedList[4];

            for(int i=0;i<4;i++){
                this.buckets[i]=new LinkedList<Node>();
            }
        }

        //1.Finding the 'bi' for a given Key using Hashing
        private int hashFunction(K key){
            int hashCode=key.hashCode();
            int bi=Math.abs(hashCode) % N;
            return bi;
        }

        //2.Searching for a Key Inside the LL of a Bucket
        private int searchInLL(K key,int bi){
            LinkedList<Node> ll=buckets[bi];
            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key.equals(key)){
                    return i;
                }
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        //3.Increasing the no. of Buckets and Re-inserting All Existing Nodes into the new bucket
        private void reHashing(){
            LinkedList<Node> oldBuckets[]=buckets;
            N=N*2;
            buckets=new LinkedList[N];

            for(int i=0;i<buckets.length;i++){
                buckets[i]=new LinkedList<Node>();
            }
            for(int i=0;i<oldBuckets.length;i++){
                LinkedList<Node> ll=oldBuckets[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.get(j);
                    put(node.key,node.value);
                }
            }
        }

        //4.Inserting a New Key-Value Pair(node) or Updating an Existing Key's Value
        public void put(K key,V value){
            int bi=hashFunction(key);
            int di=searchInLL(key,bi);
            if(di==-1){
                buckets[bi].add(new Node(key,value));
                n++;
            }
            else{
                Node node=buckets[bi].get(di);
                node.value=value;
            }
            double loadFactor=(double) n/N;
            if(loadFactor>2.0){
                reHashing();
            }
        }

        //5.Checking Whether a Particular Key Exists in the HashMap
        public boolean containskey(K key){
            int bi=hashFunction(key);
            int di=searchInLL(key,bi);
            if(di==-1){
                return false;
            }
            else{
                return true;
            }
        }

        //6.Removing a Key-Value Pair(node) and Returning the Removed Value
        public V remove(K key){
            int bi=hashFunction(key);
            int di=searchInLL(key,bi);
            if(di==-1){
                return null;
            }
            else{
                Node node=buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }

        //7.Getting the Value Associated with the Given Key
        public V getValue(K key){
            int bi=hashFunction(key);
            int di=searchInLL(key,bi);
            if(di==-1){
                return null;
            }
            else{
                Node node=buckets[bi].get(di);
                return node.value;
            }
        }

        //8.Collecting and Returning All Keys Present in the HashMap
        public ArrayList<K> keySet(){
            ArrayList<K> keys=new ArrayList<K>();
            for(int i=0;i<buckets.length;i++){
                LinkedList<Node> ll=buckets[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        //9.Checking Whether the HashMap Currently Contains No Key-Value Pairs(nodes)
        public boolean isEmpty(){
            return n==0;
        }
    }
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        System.out.println("The HashMap is empty currently");
        System.out.println();

        System.out.println("After adding 6 nodes(key-value pairs) into the HashMap,");
        map.put("India",150);
        map.put("US",80);
        map.put("China",180);
        map.put("UAE",50);
        map.put("Japan",120);
        map.put("France",75);

        System.out.println("The 6 key-value pairs currently present in the HashMap are:");
        System.out.println();
        ArrayList<String> keys=map.keySet();

        for(int i=0;i<keys.size();i++){
            System.out.println("The value associated with the key "+keys.get(i)+" is: "+map.getValue(keys.get(i)));
        }
        System.out.println();

        map.remove("France");
        System.out.println("After removing the key(France)-value(75) pair from the HashMap, the value associated with the key(France) is: "+map.getValue("France"));
    }
} */


//4.Majority Element(HashMap)
//Given an integer array of size 'n',find all elements that appear more than [n/3] times
    /* public class Hashing{
    static void majorityElement(int[] nums){//Finds and prints elements whose frequency is more than n/3(>3 here)
        HashMap<Integer,Integer> map=new HashMap<>();//Key = array element & Value = frequency of that element
        int n=nums.length;
        for(int i=0;i<n;i++){//Count the frequency of each element
           if(map.containsKey(nums[i])){
            map.put(nums[i],map.get(nums[i])+1);//If element already exists-->increase its count
           }
           else{
            map.put(nums[i],1);//First occurrence of the element
           }
        }
        for(int key : map.keySet()){//Traverse all keys stored in the HashMap which are returned by the built-in java method 'keySet()'
            if(map.get(key)>n/3){//Check whether frequency is greater than n/3(>3 here)
                System.out.println(key+" is our majority element in the curr array");
            }
        }
    }
    public static void main(String[] args) {
        int nums[]={1,3,2,5,1,3,1,5,1};//Input array
        majorityElement(nums);//Pass the array to the method
    }
} */


//5.Union of 2 arrays(HashSet)
    /* public class Hashing{
    static int union(int[] arr1,int[] arr2){//Finds the union of two arrays and returns the no. of unique elements
        HashSet<Integer> set=new HashSet<>();//HashSet stores only unique elements
        for(int i=0;i<arr1.length;i++){//Add all elements of arr1 to the set(duplicates will be removed)
            set.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){//Add all elements of arr2 to the set-->Duplicate elements are automatically ignored
            set.add(arr2[j]);
        }
        System.out.println("The elements in the union set are: "+set);//Print all unique elements in the union set
        return set.size();//Return the no. of unique elements
    }
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        System.out.println("The union set of arr1 & arr2 contains "+union(arr1,arr2)+" elements");//Calls union() and prints the total no. of unique elements
    }
} */


//6.Intersection of 2 arrays
    /* public class Hashing{
    static int intersection(int[] arr1,int[] arr2){
        HashSet<Integer> set=new HashSet<>();//Stores the unique elements of arr1 for fast searching
        HashSet<Integer> common=new HashSet<>();//Stores the unique elements common to both arrays
        for(int i=0;i<arr1.length;i++){//Add all elements of arr1 to the Set
            set.add(arr1[i]);
        }
        int count=0;
        for(int j=0;j<arr2.length;j++){//Check each element of arr2 against the elements of arr1
            if(set.contains(arr2[j])){//If the element exists in arr1-->it is common to both arrays
                count++;
                common.add(arr2[j]);//Add the common element to the common Set
                set.remove(arr2[j]);//Remove it from set-->so that duplicate elements in arr2 are not counted more than once(double 9)
            }
        }
        System.out.println("The elements in the commom set are: "+common);//Display the unique common elements
        return count;
    }
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        System.out.println(intersection(arr1,arr2)+" elements are common in both the arrays");//Call intersection() and print the no. of common elements
    }
}*/


//7.Finding Itinerary(sequence of stops) from tickets
public class Hashing{
    static String getStart(HashMap<String,String> tick){
        HashMap<String,String> revHashMap=new HashMap<>();
        for(String key : tick.keySet()){
            revHashMap.put(tick.get(key),key);
        }
        for(String key : tick.keySet()){
            if(!revHashMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String> tickets=new HashMap<>();

        tickets.put("Chennai","Bengaluru");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi","Goa");

        String start=getStart(tickets);

        System.out.println("The Itinerary formed from the tickets is:");
        while(tickets.containsKey(start)){
            System.out.print(start+"-->");
            start=tickets.get(start);
        }
        System.out.print(start);
    }
}
