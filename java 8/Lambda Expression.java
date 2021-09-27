Java Lambda Expression Example:

interface Drawable{​
public void draw();
}​
public class LambdaExpressionExample2 {​
public static void main(String[] args) {​
int width=10;
//with lambda
Drawable d2=()->{​
System.out.println("Drawing "+width);
}​;
d2.draw();
}​
}​
Output:
Drawing 10




Create a method which takes a lambda expression as a parameter:

interface StringFunction {​
String run(String str);
}​
public class Main {​
public static void main(String[] args) {​
StringFunction exclaim = (s) -> s + "!";
StringFunction ask = (s) -> s + "?";
printFormatted("Hello", exclaim);
printFormatted("Hello", ask);
}​
public static void printFormatted(String str, StringFunction format) {​
String result = format.run(str);
System.out.println(result);
}​
}​
Output:
Hello!
Hello?
​
    



Use Java's Consumer interface to store a lambda expression in a variable:

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {​
public static void main(String[] args) {​
ArrayList<Integer> numbers = new ArrayList<Integer>();
numbers.add(5);
numbers.add(9);
numbers.add(8);
numbers.add(1);
Consumer<Integer> method = (n) -> {​ System.out.println(n); }​;
numbers.forEach( method );
}​
}​
Output:
5
9
8
1




Using lambda expresion in arraylist :

import java.util.ArrayList;
public class Main {​
public static void main(String[] args) {​
ArrayList<Integer> numbers = new ArrayList<Integer>();
numbers.add(5);
numbers.add(9);
numbers.add(8);
numbers.add(1);
numbers.forEach( (n) -> {​ System.out.println(n); }​ );
}​
}​
Output:
5
9
8
1
