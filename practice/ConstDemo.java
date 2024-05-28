package practice;

public class ConstDemo {
    public static void main(String[] args) {

            Bank b = new Bank("RBI", 1080);
           System.out.println(b.name);
        System.out.println(b.code);
    }
}

class Bank{
    static String name1 = "HDFC";
    String name = "ICICI";
    int code;

    Bank(String name, int code){
        System.out.println("Local Variable : " + name); //locale variable
        System.out.println("Instance Variable : " + this.name); //this keyword to accesses instance variable value
        System.out.println("Static Variable : " + Bank.name1); //to access static variable value

        this.name = name;
        this.code = code;


    }

}
