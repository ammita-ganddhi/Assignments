package assignmentarray;

public class StringMtd {
    public static void main(String[] args) {
        String inp = "This is my Java Class..";
        //
        System.out.println(inp.length());
        System.out.println(inp.toUpperCase());
        System.out.println(inp.toLowerCase());
        System.out.println(inp.charAt(11));
        System.out.println(inp.indexOf('.'));
        System.out.println(inp.indexOf('a',15));

        System.out.println(inp.replace(" ","").length());

        String[] str = inp.split(" ");
        System.out.println(str.length);

        for(String s:str){
            System.out.println(s);
        }

        //Sub-String
        String substr = inp.substring(11);
        System.out.println(substr);

        System.out.println(inp.substring(11));


        // Program to display the count of occurrence of an alphabet 'a' from the given string

        String s1 = "abcdab";
        char[] s = s1.toCharArray();
        int count=0;
        for( char amita:s){
            if(amita =='a'){
                count++;
            }
        }
        System.out.println(count);
    }
}
