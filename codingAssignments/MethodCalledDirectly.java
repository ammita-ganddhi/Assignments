package codingAssignments;

public class MethodCalledDirectly {

    public int add(int i, int j){
        return i+j;

    }
}

class B{
    public static void main(String[] args) {
        MethodCalledDirectly md = new MethodCalledDirectly();
        int result = md.add(md.add(10,20), md.add(30,40) );
        System.out.println("Result = "+ result);
    }
}

/*
"C:\Program Files\Java\jdk-11\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=59703:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\ammit\IdeaProjects\Assignments\out\production\Assignments codingAssignments.B
Result = 100

Process finished with exit code 0

 */