import java.util.*;
     class Perimeter_Of_Rectangle{
	  public static void main(String[]args){
	        int length = 0;
			int width = 0;
			int perimeter = 0;
			Scanner sc = new Scanner(System.in);
			length = sc.nextInt();
			width = sc.nextInt();
			perimeter = 2*(length+width);
			System.out.println("The perimeter of rectangle is:"+perimeter);
			
			sc.close();
			
			}
	    }
			
	        
