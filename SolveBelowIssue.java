public class SolveBelowIssue {
    public static void main(String[] args) {
        int i = 10;
        int j = i++ + i++ + --i + ++i + ++i;
              // 10 + 11  + 11  + 12  + 13
        System.out.println(i); // 13
        System.out.println(j); //57
        int k = 15 % 4*7; // (15 % 4) * 7 would first perform the modulo operation and then the multiplication, resulting in 3 * 7 = 21.
        System.out.println(k);

        int l = 18/3 * 3%4; // 6 * 3 % 4 = 18 % 4 = 2 [/ & * have same precedence hence solve from L to R]
        System.out.println(l);

        //increment, decrement operators
        int i1 = 10;
        int j1 = i1++ + ++i1; // 10 + 12= 22
        System.out.println(j1);

        int i2 = 10;
        int k1 = ++i2 + ++i2 + ++i2 + i2++;
        System.out.println(k1);

        int i3 =10;
        int m1 = ++i3 + i3++ +i3++ + i3++ + i3-- + i3-- + --i3;
        System.out.println(m1);


        double db1 = 14.5d;
        db1++;
        System.out.println(db1);

        int x = -10;
        System.out.println(x>>>2);
        System.out.println(x>>>30); // output: 3
        System.out.println(x>>>32);  // output: -10

    }
}
