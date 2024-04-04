public class Calculator {
    public static void main(String[] args) {

        int i = Calculator.addition(10,20);
        System.out.println(i);

        float j = Calculator.subtraction(10.5F,5.5F);
        System.out.println(j);

        Calculator cal = new Calculator();
        int k = cal.multiply(50,50);
        System.out.println(k);

        double l = cal.division(100, 50);
        System.out.println(l);

        System.out.println(cal.ValueOfPI());


    }

    static int addition(int a, int b){
        int ans1 = a + b;
        return ans1;
    }

    static float subtraction(float sub1, float sub2){
        float ans2 = sub1 - sub2;
        return ans2;
    }

    int multiply(int m1, int m2){
        int ans3 = m1 * m2;
        return ans3;
    }

    double division(double div1, double div2){
        double ans4 = div1 / div2;
        return ans4;
    }

        double ValueOfPI(){
        return 3.14d;
        }

        void text(String txt){
            System.out.println(txt);
            return;
        }

}
