package objects;

public class ChatApp {
    public static void main(String[] args) {
        System.out.println("Welcome to ChatApplication");

        Human h1 = new Human();
        h1.name = "amita";
        h1.age = 25;
        h1.country = "India";

        h1.talk("Hello All");
        h1.birthday();
        System.out.println(h1.age);

    }
}
