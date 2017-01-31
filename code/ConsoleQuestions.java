import java.util.*;

public class ConsoleQuestions
{
   public static void main(String[] args)
   {	
      Scanner console = new Scanner(System.in);
      System.out.println();
      System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
      System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
      System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
      System.out.println();
      System.out.print("What is your name? : ");
      String name = console.nextLine();

      System.out.print("Do you like cake " + name + "? (y/n)");

      String likeCake = console.nextLine();
    
      System.out.println();

      // check if if person like cake
      if(likeCake.equals("n"))
      {
          
          System.out.println(name + "!! You must be crazy if you don't like cake");
      }
      else
      {
           System.out.println("Of cause you like cake " + name);
      }

        System.out.println();
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println();
   	    
   } 
}
