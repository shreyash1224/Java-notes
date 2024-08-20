import java.util.*;
class Three
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");

        int number = 7;
        int fact = 1;
        for(int i = 1; i <= number; i++)
        {
            fact = fact * i;
        }
        String n = String.valueOf(fact);
        System.out.println("The character at:"+n.charAt(0));
        System.out.println("The factorial: "+fact);
    }
}