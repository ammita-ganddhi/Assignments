package assignmentarray;

import java.util.ArrayList;
import java.util.List;

public class Tech {
    public static void main(String[] args) {
        List<Integer> ls1 = new ArrayList<>();
        ls1.add(10);
        ls1.add(30);
        ls1.add(20);
        ls1.add(45);

       // System.out.println(ls1);

        // ls1.remove(Integer.valueOf(30));

        ls1.remove(new Integer(30));
        System.out.println(ls1);
    }
}
