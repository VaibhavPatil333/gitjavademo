import java.io.*;
import java.util.*;

 class Person
{
    int age,id;
    String name;
    Person()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter name");
        name=sc.nextLine();
        System.out.println("Enter age");
        age=sc.nextInt();
        System.out.println("Enter Id");
        id=sc.nextInt();
        
    }
    void check()
    {
        System.out.println("Name:"+name+"\n"+"Id  :"+id+"\n"+"Age :"+age);
        try
        {
            if(age<18)
            {
                throw new AgeNotValidException();
            }
            else
            {
                throw new AgeIsValidException();
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
class AgeNotValidException extends Exception
 {
   public String toString()
   {
       return "You are not eligible to vote";
   }
 }

class AgeIsValidException extends Exception
 {
   public String toString()
   {
       return "You are eligible to vote";
   }
 }


public class ExceptionAge
{
	public static void main(String[] args) {
		Person obj = new Person();
		obj.check();
	}
}