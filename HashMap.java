Map - hashmap (Add elements to a HashMap)

import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    HashMap<String, Integer> numbers = new HashMap<>();

    System.out.println("Initial HashMap: " + numbers);
    numbers.put("note", 45);
    numbers.put("pencil", 10);
    numbers.put("pen", 20);
    System.out.println("HashMap after put(): " + numbers);
  }
}
output:
Initial HashMap: {}
HashMap after put(): {note=45, pencil=10, pen=20}

(Access HashMap Elements)

import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    HashMap<Integer, String> languages = new HashMap<>();

    languages.put(1, "Java");
    languages.put(2, "c");
    languages.put(3, "c++");
    System.out.println("HashMap: " + languages);
    System.out.println("Keys: " + languages.keySet());
    System.out.println("Values: " + languages.values());

    System.out.println("Key/Value mappings: " + languages.entrySet());
  }
}
output:
HashMap: {1=Java, 2=c, 3=c++}
Keys: [1, 2, 3]
Values: [Java, c, c++]
Key/Value mappings: [1=Java, 2=c, 3=c++]

(Change HashMap Value)

import java.util.HashMap;

public class Main {
  public static void main(String[] args) {

    HashMap<Integer, String> languages = new HashMap<>();
    languages.put(1, "Java");
    languages.put(2, "Python");
    languages.put(3, "JavaScript");
    System.out.println("Original HashMap: " + languages);

    languages.replace(2, "C++");
    System.out.println("HashMap using replace(): " + languages);
  }
}
output:
Original HashMap: {1=Java, 2=Python, 3=JavaScript}
HashMap using replace(): {1=Java, 2=C++, 3=JavaScript}

(Remove HashMap Elements)

import java.util.HashMap;

public class Main {
  public static void main(String[] args) {

    HashMap<Integer, String> languages = new HashMap<>();
    languages.put(1, "Java");
    languages.put(2, "Python");
    languages.put(3, "JavaScript");
    System.out.println("HashMap: " + languages);
    String value = languages.remove(2);
    System.out.println("Removed value: " + value);
    System.out.println("Updated HashMap: " + languages);
  }
}
output:
HashMap: {1=Java, 2=Python, 3=JavaScript}
Removed value: Python
Updated HashMap: {1=Java, 3=JavaScript}