/**
   This program uses nested loops to simulate a clock.
*/

public class Clock
{
   public static void main(String[] args)
   {
      // Simulate the clock.
  for (int dayTime = 1; dayTime <= 2; dayTime++)
  {
      for (int hours = 1; hours <= 12; hours++)
      {
          for (int minutes = 0; minutes <= 59; minutes++)
          {
             for (int seconds = 0; seconds <= 59; seconds++)
             {
                if (hours == 7 && minutes == 30 && seconds == 0 && dayTime == 1) {
                	System.out.printf("Breakfast Time :%02d:%02d:%02d\n", hours, minutes, seconds);              
                }
                if (hours == 12 && minutes == 0 && seconds == 0 && dayTime == 1) {
                	System.out.printf("Midday :%02d:%02d:%02d\n", hours, minutes, seconds);
                }
                if (hours == 1 && minutes == 15 && seconds == 30 && dayTime == 2) {
                	System.out.printf("Lunch Time :%02d:%02d:%02d\n", hours, minutes, seconds);
                }
                if (hours == 5 && minutes == 15 && seconds == 6 && dayTime == 2) {
                	System.out.printf("Dinner Time :%02d:%02d:%02d\n", hours, minutes, seconds);
                }
                if (hours == 12 && minutes == 0 && seconds == 0 && dayTime == 2) {
                	System.out.printf("Midnight :%02d:%02d:%02d\n", hours, minutes, seconds);
                }
             }
          }
       }
     }
   }
}