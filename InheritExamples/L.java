// Hybrid Inheritance Example
// Parent Class L (Daughter) inherits Father class J


package InheritExamples;

public class L extends J {
    public void daughter() {
        System.out.println("I am daughter");
    }


    public static void main(String[] args) {

        K son = new K();
        L daughter = new L();

        son.son();              // Accessing Son class method
        son.father();           // Accessing Father class method
        son.grandFather();      // Accessing Grandfather class method

        daughter.daughter();    // Accessing Daughter class method
        daughter.father();      // Accessing Father class method
        daughter.grandFather(); // Accessing Grandfather class method
    }

}
