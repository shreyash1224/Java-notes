import java.util.*;
class One
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      System.out.println("Enter your number:");
      String number = sc.nextLine();

      if(number.matches("[01]+"))
      {
          System.out.println("The radix is 2.");
      }
      else if(number.matches("[0-7]+"))
      {
          System.out.println("The radix is 8.");
      }
      else if(number.matches("[0-9]+"))
      {
          System.out.println("The radix is 10.");
      }
      else if(number.matches("[0-9A-Z]+")) {
          System.out.println("The radix is 16. ");
      }
      else{
          System.out.println("Invalid number!");
      }
    }
}