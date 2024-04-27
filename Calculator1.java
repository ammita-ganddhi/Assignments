public class Calculator1 {
    public static void main(String[] args) {
   double y = Calculator1.add(1.5, 2.5, 0.5);
        System.out.println(y);
    }

    static int add(int a, int b){

        return a + b;
    }

    static double add(double p, double q, double r){

        return p + q + r;
    }

    static float add(float x, float y ){
        return x + y;
    }
}
