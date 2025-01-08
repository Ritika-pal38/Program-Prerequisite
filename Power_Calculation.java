import java.util.*
     class Power{
	     public static void main(String[]args){
		    int base = 0;
			int exponent = 0;
			double power = 0.0;
			Scanner sc = new Scanner(System.in);
			base = sc.nextInt();
			exponent = sc.nextInt();
			power = base^exponent;
			
			System.out.println("Calculated power is:"+power);
			
			sc.close();
			}
		}