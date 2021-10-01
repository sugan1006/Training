New DateTime

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;

public class Java8Tester {

   public static void main(String args[]) {
      Java8Tester java8tester = new Java8Tester();
      java8tester.testLocalDateTime();
   }
	
   public void testLocalDateTime() {

      LocalDateTime currentTime = LocalDateTime.now();
      System.out.println("Current DateTime: " + currentTime);
      
      Month month = currentTime.getMonth();
      System.out.println("Month: " + month);
		
      LocalDate date1 = currentTime.toLocalDate();
      System.out.println("date1: " + date1);

      LocalDate date2 = LocalDate.of(2014, Month.DECEMBER, 12);
      System.out.println("date2: " + date2);

      LocalTime date3 = LocalTime.of(22, 15);
      System.out.println("date3: " + date3);

      LocalTime date5 = LocalTime.parse("20:15:30");
      System.out.println("Time: " + date5);
   }
}

output:
Current DateTime: 2021-10-01T07:17:36.154
Month: OCTOBER
date1: 2021-10-01
date2: 2014-12-12
date3: 22:15
Time: 20:15:30