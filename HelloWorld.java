public class HelloWorld {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;
        if (x++ > ++y){
            System.out.print("Hello");
        }else {
            System.out.print("Welcome");
        }
        System.out.println("Log " +x+ ":" +y);

        int j = 10 * 4 + 2;
        System.out.println(j);

        int k = 10 + 4 * 2;
        System.out.println(k);

        int m = 10 + 4 * 2 % 2;
        System.out.println(m);

        int g = 10 / 5 * 6 / 2;
        System.out.println(g);

    }
}
