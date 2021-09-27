using constructor:

interface Messageable{​
Message getMessage(String msg);
}​
class Message{​
Message(String msg){​
System.out.print(msg);
}​
}​
public class ConstructorReference {​
public static void main(String[] args) {​
Messageable hello = Message::new;
hello.getMessage("Hello");
}​
}​
Output:
Hello




Reference to an Instance Method:

interface Sayable{​
void say();
}​
public class InstanceMethodReference {​
public void saySomething(){​
System.out.println("Hello, this is non-static method.");
}​
public static void main(String[] args) {​
InstanceMethodReference methodReference = new InstanceMethodReference();
Sayable sayable = methodReference::saySomething;
sayable.say();
Sayable sayable2 = new InstanceMethodReference()::saySomething;
sayable2.say();
}​
}​
Output:
Hello, this is non-static method.
Hello, this is non-static method.




override static methods by referring methods:

import java.util.function.BiFunction;
class Arithmetic{​
public static int add(int a, int b){​
return a+b;
}​
public static float multiplication(int a, float b){​
return a*b;
}​
public static float sub(float a, float b){​
return a-b;
}​
}​
public class MethodReference4 {​
public static void main(String[] args) {​
BiFunction<Integer, Integer, Integer>adder = Arithmetic::add;
BiFunction<Integer, Float, Float>multiplier = Arithmetic::multiplication;
BiFunction<Float, Float, Float>sub = Arithmetic::sub;
int result1 = adder.apply(10, 20);
float result2 = multiplier.apply(10, 20.0f);
float result3 = sub.apply(100.0f, 20.0f);
System.out.println(result1);
System.out.println(result2);
System.out.println(result3);
}​
}​
Output:
30
200.0
80.0




MethodReference:Using BiFunction

import java.util.function.BiFunction;
class Arithmetic{​
public static int add(int a, int b){​
return a+b;
}​
}​
public class MethodReference3 {​
public static void main(String[] args) {​
BiFunction<Integer, Integer, Integer>adder = Arithmetic::add;
int result = adder.apply(10, 20);
System.out.println(result);
}​
}​
Output:
30
