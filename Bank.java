//package bank;//Userdefined package- A folder that groups related Java classes together
//Folder-like container that which is the collection of java classes and interfaces together.

//Access Modifiers(Public,Protected,Private)


//1.Public(Accessible anywhere in the entire program and also in other packages(Along with the current package))
    /* public class Bank {
public static void main(String[]args){
//Main must be public so that the JVM can access and start execution from outside the class
    Account acc1=new Account();
    acc1.name="Faheema";
    acc1.email="faheemashaik328@gmail.com";
    acc1.password="Faheema@2007";
    acc1.printInfo();
    }
}
class Account{
    public String name;
    public String email;
    public String password;
    public void printInfo(){
        System.out.println("Name:"+this.name);
        System.out.println("Email:"+this.email);
        System.out.println("Password:"+this.password);
    }
} */


//2.Protected(Accessible within the same package(any class)and also subclasses in other packages)
    /* public class Bank{
    public static void main(String[] args) {
        Account acc1=new Account();
        acc1.name="Faheema";
        acc1.password=2228;
        acc1.printInfo();
    }
}
class Account{
    protected String name;
    protected int password;
    public void printInfo(){
        System.out.println("Name:"+this.name);
        System.out.println("Password:"+this.password);
    }
} */


//3.Default(Accessible only within the same package but not accessible in subclasses of other packages)


//4.Private(Accessible only in the respective class(Also not within the same package))
    /* public class Bank{
    public static void main(String[] args) {
        Account acc1=new Account();
        acc1.name="Faheema";
        acc1.email="faheemashaik328@gmail.com";
        acc1.printInfo();
        acc1.setPassword("abcd");//private password set through setter
        System.out.println("Password:"+acc1.getPassword());//private password read through getter
    }
}
class Account{
    public String name;
    public String email;
    private String password;
    //To access the private members of a class we use getters&setters

    // Setter:only way to assign a value to private password from outside
    public void setPassword(String pass){
        this.password=pass;
    }
    // Getter:only way to retrieve private password from outside
    public String getPassword(){
        return this.password;
    }
    public void printInfo(){
        System.out.println("Name:"+this.name);
        System.out.println("Email:"+this.email);
    }
} */


//5.Setter is private — only the class can set its own password, not the outside code
//Getters & Setters are public methods that act as a controlled gateway to private fields.
    /* public class Bank{
    public static void main(String[] args) {
        Account acc1=new Account();
        System.out.println("Password is:"+acc1.getPassword());
    }
}
class Account{
    private String password;
    private void setPassword(String pass){ //setPassword() is called inside getPassword(), so 'this' remains acc1 for both
    this.password=pass;
    }
    public String getPassword(){
        this.setPassword("abcd");
        return this.password;
    }
} */




