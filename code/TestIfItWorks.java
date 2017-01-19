import javax.swing.JOptionPane;

public class TestIfItWorks
{
   public static void main(String[] args)
   {	
      // We jump-start to have a little fun and see what we can do 
      // AND understand in a little while.
   	  // Most or all of this code might not make sense right now. 
      // That is ok. You will understand this later.
   
      //show a dialog where user can enter text, and save the text in a variable
      String name = JOptionPane.showInputDialog("What is your name");
       
   	  // show a Yes, No, Cancel dialog, and save the answer in a variable
      int likeCake = JOptionPane.showConfirmDialog(null, "Do you like cake " + name); 
   	
      // print out in console the name
      System.out.println("Your name is: " + name);
      
      // check if if person like cake
      if(likeCake == 1)
      {
         // if yes, show a message with OK button
         JOptionPane.showMessageDialog(null, name + "!! You must be crazy if you don't like cake"); 		   
         // print msg in console
         System.out.println("And you do not like cake?");
      }
      else
      {
         // if no, show a message with OK button
         JOptionPane.showMessageDialog(null, "Of cause you like cake " + name);          
         // print msg in console
         System.out.println("And you like cake :)");
      }
   	    
   } 
}
