import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Tester {

   public static void main(String args[]) {
      List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
      System.out.println("Print all numbers:");

      eval(list, n->true);
		
      System.out.println("Print even numbers:");
      eval(list, n-> n%2 == 0 );
		
      System.out.println("Print numbers greater than 3:");
      eval(list, n-> n > 3 );
   }
	
   public static void eval(List<Integer> list, Predicate<Integer> predicate) {

      for(Integer n: list) {

         if(predicate.test(n)) {
            System.out.println(n + " ");
         }
      }
   }
}
output:
Print all numbers:
1 
2 
3 
4 
5 
Print even numbers:
2 
4 
Print numbers greater than 3:
4 
5 