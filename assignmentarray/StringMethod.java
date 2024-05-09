package assignmentarray;

public class StringMethod {
    public static void main(String[] args) {
        String str = "this is a string";

        // Program to convert last alphabet of each word to Upper case

        String[] s = str.split(" ");
        String var = "";
        for (String a : s) {
            // System.out.println(a);
            String lastchar = a.substring(a.length() - 1, a.length());
            String reststring = a.substring(0, a.length() - 1);
            var = var + reststring + lastchar.toUpperCase() + " ";

            System.out.println(var);

            // Program to convert first alphabet of each word to Upper case

            String resultstring = "";
            String[] allwords = str.split(" ");
            for (String word : allwords) {
                String firstletter = word.substring(0, 1);
                //String reststring = word.substring(1);
                resultstring = resultstring + firstletter.toUpperCase() + reststring + " ";
            }
            System.out.println(resultstring);


        }

    }

}