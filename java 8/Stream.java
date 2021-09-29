Intermediate Operations

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Stream {
  
	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(15);
		list.add(10);
		list.add(5);
		
		//normal 
		Collections.sort(list);//Ascending
		Collections.reverse(list);//Descending
		System.out.println(list);
		
		// using stream
		list.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s));//des
		list.stream().sorted().forEach(s->System.out.println(s));//asc
		
		List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("Pencil");
		listOfStrings.add("Tiger");
		listOfStrings.add("Tree");
		listOfStrings.add("Pencil");
		listOfStrings.add("Pen");
		listOfStrings.stream().forEach(System.out::println);//using method ref
		
		//using filter()
		listOfStrings.stream().filter((String name) -> name.length() > 4).forEach(System.out::println);
		
		//for unique value distinct()
		listOfStrings.stream().distinct().forEach(System.out::println);
		
		//using limit()
		listOfStrings.stream().limit(3).forEach(System.out::println);
		
		//using skip()
		listOfStrings.stream().skip(3).forEach(System.out::println);
		
		// finding length of strings 
		listOfStrings.stream().map(String::length).forEach(System.out::println);
		
		//Sorting the names according to natural order
		listOfStrings.stream().sorted().forEach(System.out::println);
				         
}
}
}
output:
[15, 12, 10, 5]
15
12
10
5
5
10
12
15
Pencil
Tiger
Tree
Pencil
Pen
Pencil
Tiger
Pencil
Pencil
Tiger
Tree
Pen
Pencil
Tiger
Tree
Pencil
Pen
6
5
4
6
3
Pen
Pencil
Pencil
Tiger
Tree
