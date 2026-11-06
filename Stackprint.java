import java.util.Stack;

public class Stackprint {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Ayanshu Saxena");
        stack.push("Damn");
        stack.push("Java");

        

        stack.add(0, "Bottom");

        System.out.println(stack);
    }
}