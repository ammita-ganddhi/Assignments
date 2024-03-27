package objects;

public class Human {
    int height;     //Attributes
    int age;
    String name;
    String country;

//behaviour
    void talk(String content){
        System.out.println(name + ":" +content);
    }

    void birthday(){
        age++;
    }

}
