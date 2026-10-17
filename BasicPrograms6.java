import java.util.*;

//1.Finding the Second Largest Element in an Array
    /* public class BasicPrograms6 {
    public static void main(String[] args){
    int[] arr={10,5,8,20,15};
    int largest=Integer.MIN_VALUE;//Start with the smallest possible int value as a placeholder
    int secondLargest=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            secondLargest=largest;//Old largest becomes second largest before updating largest
            largest=arr[i];
        }
        else if(arr[i]>secondLargest && arr[i]!=largest){
            secondLargest=arr[i];//Update second largest if the curr value is between them(largest & secondLargest)
        }
    }
    System.out.println("The second largest element in the array is:"+secondLargest);
}
} */


//2.Finding the frequency of each element
    /* public class Simple {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(2);
        list.add(5);
        HashMap<Integer,Integer> map=new HashMap<>();//Key=element & Value=frequency/count(key-value pair)
        for(int i=0;i<list.size();i++){//Traverse the ArrayList
        if(map.containsKey(list.get(i))){//If the element already exists(in the HashMap as key)-->increase its count
            map.put(list.get(i),(map.get(list.get(i)))+1);
        }
        else{
            map.put(list.get(i),1);//First occurrence of the element(in the HashMap as key)-->so frequency starts at 1
        }
        }
        System.out.println("The key-value pairs of the HashMap are:/The frequency of each element(key) is:");
        System.out.print(map);
    }
} */


//3.Searching for an element using Linear Search
    /* public class Simple {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int key=3;
        for (int i=0;i<arr.length;i++) {//Check each element one by one
            if(arr[i] == key){//If current element matches the key
                System.out.println("The element "+key+" is found at index: " + i);
                break;//Stop after finding the element(key)
            }
        }
    }
} */


//4.Reversing an array with using another array
    /* public class Simple {
    public static void main(String[] args) {
        int[] arr = {11, 2, 3, 4, 5};
        int[] newArr = new int[arr.length];//Create another array of the same size
        int j = arr.length - 1;//Start from the last index of newArr
        for (int i = 0; i < arr.length; i++) {
            newArr[j] = arr[i];//Copy the elements in reverse position
            j--;//Move towards the beginning of newArr
        }
        System.out.println("The reversed array is:");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");//Print the reversed array
        }
    }
} */


//5.Removing duplicates from ArrayList
    /* public class Simple {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(2);
        list.add(5);
        HashSet<Integer> set = new HashSet<>(list);//HashSet automatically removes duplicates
        System.out.println("The ArrayList after removing duplicates from it is:");
        System.out.println(set);//Print the unique elements
    }
} */


//6.Sorting an ArrayList in ascending and descending order
    /* public class Simple {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(8);
        list.add(1);
        list.add(4);
        Collections.sort(list);//Sorting in ascending order
        System.out.println("Ascending Order: " + list);
        Collections.sort(list, Collections.reverseOrder());//Sorting in descending order
        System.out.println("Descending Order: " + list);
    }
} */


//7.Removing an element by Object/Value
    /* public class Simple {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        list.remove(Integer.valueOf(1));//Remove the value 1-->valueOf() makes Java treat '1' as an Integer obj
        System.out.println("The list after removing one element by object/value is:");
        System.out.println(list);
    }
} */