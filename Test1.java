import org.w3c.dom.ls.LSOutput;

class Test1 {
    public static void main(String[] args) {
        int x = 10;
        int y = x++;
        System.out.println(y);

        int b1 = 128;
        byte b2 = (byte) b1;
        System.out.println(b2);

       // byte b0 = 128;
        byte b0 = (byte) 128;
        System.out.println(b0);

        int b3 = 128;
        byte b4 = (byte) (b3*3);
        System.out.println(b4);

        int i = 0X20;
        System.out.println(i);


        int k = 10;
        int j = k++ + ++k;                 // 10 + 12
        System.out.println(k); //12
        System.out.println(j); //22


       // Solve below issue

        int i1 = 10;
        int j1 = 7;
        double db1 = i1/j1;
        double db2 = (double)i1/j1;
        double db3 = i1/(double)j1;
        System.out.println(db1);
        System.out.println(db2);
        System.out.println(db3);
    }
}

