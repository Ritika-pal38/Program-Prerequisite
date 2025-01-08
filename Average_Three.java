import java.util.Scanner;
      class Average{
	     public static void main(String[]args){
		      int num1;
			  int num2;
			  int num3;
			  double average;
			  Scanner sc = new Scanner(System.in);
			  num1 = sc.nextInt();
			  num2 = sc.nextInt();
			  num3 = sc.nextInt();
			  average = (num1+num2+num3)/3;
			  
			  System.out.println("The average of three number is:"+average);
			  
			  }
			}
			  