(StackClass)

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> animals= new Stack<>();

        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println("Stack: " + animals);
        
        String element = animals.pop();
        System.out.println("Removed Element: " + element);
        
        String ele = animals.peek();
        System.out.println("Element at top: " + ele);
        
        int position = animals.search("Dog");
        System.out.println("Position of Dog: " + position);
        
        boolean result = animals.empty();
        System.out.println("Is the stack empty? " + result);
    }
}
output:
Stack: [Dog, Horse, Cat]
Removed Element: Cat
Element at top: Horse
Position of Dog: 2
Is the stack empty? false