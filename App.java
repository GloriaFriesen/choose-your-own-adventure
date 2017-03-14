import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    boolean programRunning = true;

    while(programRunning) {
      System.out.println("_____________________________________");
      System.out.println("One hot, August day, you find yourself stopped in freeway traffic. Cars ahead of you are not moving. People around you are getting out of their cars. What would you like to do?" + "\n" + "1: Stay in your car" + "\n" + "2: Get out and investigate");
      String navigationChoice1 = myConsole.readLine();

      if (navigationChoice1.equals("1")) {
       System.out.println("You have chosen to stay in the car." + "\n" + "The sun continues to beat down, your windows are jammed and won't roll down." + "\n" + "Unfortunately, you don't have any food or water." + "\n" + "This seems to have been a bad choice and you have suffered the consequences." + "\n" + "Game over." + "\n" + "-----------" + "\n" + "Would you like to play again (yes or no)?");
       String navigationChoice2 = myConsole.readLine();
        if (navigationChoice2.equals("no")) {
          programRunning = false;
        }
     } else if (navigationChoice1.equals("2")) {
       System.out.println("As you get out of your car, you notice that everyone is stopped due to an overturned ice cream truck." + "\n" + "You join the line for refreshment." + "\n" + "Wise choice." + "\n" + "You win." + "\n" + "-----------" + "\n" + "Would you like to play again (yes or no)?");
       String navigationChoice2 = myConsole.readLine();
        if (navigationChoice2.equals("no")) {
          programRunning = false;
        }
      }
     }
    }
  }
