import java.util.Scanner;
public class BodyMassIndex
{
   public static void main(String[] args)
   {  
     Scanner keyboard = new Scanner(System.in);
     
  
      System.out.println("Enter your height in inches:");
      double height = keyboard.nextDouble();
      System.out.println("Enter your weight in pounds:");
      double weight = keyboard.nextDouble();
      double BMI = weight * (703 / Math.pow(height, 2));
      if(BMI<18.5)
      {
         System.out.println("You are underweight");
      }
      else if(BMI>25)
      {
         System.out.println("You are overweight");
      }
      else
      {
         System.out.println("Your BMI is optimal");
      }
      
      
      
      
      
   }
}