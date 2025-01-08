import java.util.Scanner;
     class SimpleInterest{
	       public static void main(String[]args){
		      int principal = 0;
			  float rate = 0.0;
			  int time = 0;
			  double SI = 0.0;
			  Scanner sc = new Scanner(System.in);
			  principal = sc.nextInt();
			  rate = sc.nextFloat();
			  time = sc.nextInt();
			  SI = (principal*rate*time)/100;
			System.out.print("SIMPLE INTEREST is:"+SI);
			sc.close();
			}
		}
		
			  