(Implementation of NavigableMap in TreeMap Class)

import java.util.NavigableMap;
import java.util.TreeMap;

class Main {

    public static void main(String[] args) {
        NavigableMap<String, Integer> numbers = new TreeMap<>();

        numbers.put("Two", 2);
        numbers.put("One", 1);
        numbers.put("Three", 3);
        System.out.println("NavigableMap: " + numbers);

        System.out.println("First Entry: " + numbers.firstEntry());

        System.out.println("Last Entry: " + numbers.lastEntry());

        System.out.println("Removed First Entry: " + numbers.pollFirstEntry());

        System.out.println("Removed Last Entry: " + numbers.pollLastEntry());
    }
}
output:
NavigableMap: {One=1, Three=3, Two=2}
First Entry: One=1
Last Entry: Two=2
Removed First Entry: One=1
Removed Last Entry: Two=2