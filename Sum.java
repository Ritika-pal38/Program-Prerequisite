 import java.util.Scanner;
 
 public class Sum
        {
               public static void main(String[]args)
			   {
			   int first,second,add;
			   Scanner sc = new Scanner(System.in);
			   
			   System.out.print("Enter first number:");
			   a = sc.nextlnt();
			   System.out.print("Enter second number:");
			   b = sc.nextlnt();
			   add = add(a,b);
			   System.out.println("The sum of two numbers is:"+add);
			   }
			   
			   public static int add(int first,int second){
			   int add = first+second;
			   return add;
			   }
		} 
               			   