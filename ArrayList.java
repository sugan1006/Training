(ArrayListClass)

import java.util.ArrayList;

public class Main {
  public static void main(String[] args){
    ArrayList<String> languages = new ArrayList<>();

    languages.add("Java");
    languages.add("C");
    languages.add("Python");
    System.out.println("ArrayList: " + languages);
	
    String str = languages.get(1);
    System.out.print("Element at index 1: " + str);
	
    languages.set(2, "JavaScript");
    System.out.println("\n" + "Modified ArrayList: " + languages);
	
    String sty = languages.remove(1);
    System.out.println("Removed Element: " + sty);
    System.out.println("Updated ArrayList: " + languages);

  }
}

output:
ArrayList: [Java, C, Python]
Element at index 1: C
Modified ArrayList: [Java, C, JavaScript]
Removed Element: C
Updated ArrayList: [Java, JavaScript]